package de.telran.tindersecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TinderSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinderSecondApplication.class, args);
    }

}
