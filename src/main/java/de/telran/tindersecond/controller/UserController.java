package de.telran.tindersecond.controller;

import de.telran.tindersecond.entity.User;
import de.telran.tindersecond.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //создается контроллер и управляется спрингом
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/show-new-user")
    public User showNewUser() {
        return userService.getNewUser();
    }

    @GetMapping(value = "/autocomplete/{name}")
    public List<User> getByName(@PathVariable(value = "name") String name) {
        return userService.getByName(name);
    }

}
