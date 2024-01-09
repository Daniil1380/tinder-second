package de.telran.tindersecond.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;
import java.util.Arrays;

@ControllerAdvice(basePackages = {"de.telran.tindersecond"})
@Slf4j
public class ExceptionCatcher {

    @ExceptionHandler(SQLException.class)
    public ResponseEntity<String> handleSQLException(Exception e) {
        log.error("exception handled");
        return new ResponseEntity<>("Что-то странное произошло в момент выполнения", HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        log.error("exception handled {} {}", e.toString(), "123");
        log.error(e.toString());
        return new ResponseEntity<>("Что-то странное произошло в момент выполнения", HttpStatus.CONFLICT);
    }
}
