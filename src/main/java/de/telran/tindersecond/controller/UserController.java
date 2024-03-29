package de.telran.tindersecond.controller;

import de.telran.tindersecond.ShareRatingDto;
import de.telran.tindersecond.entity.SecurityAccount;
import de.telran.tindersecond.entity.User;
import de.telran.tindersecond.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Security;
import java.util.List;

@RestController //создается контроллер и управляется спрингом
@RequiredArgsConstructor
public class UserController {

    @Value("${url.google}")
    private String url;

    private final UserService userService;

    @GetMapping(value = "/show-new-user")
    public ResponseEntity<User> showNewUser() {
        SecurityAccount securityAccount = (SecurityAccount) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userService.getNewUser();

        if (user != null) {
            return ResponseEntity.ok(user); //200
        }
        else {
            return ResponseEntity.notFound()
                    .build(); //404
        }

    }

    @GetMapping(value = "/autocomplete/{name}")
    public List<User> getByName(@PathVariable(value = "name") String name) {
        return userService.getByName(name);
    }

    

}
