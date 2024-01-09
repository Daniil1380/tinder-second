package de.telran.tindersecond;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DropRatingService {

    //@Scheduled(fixedDelay = 1000) - доп. задержка после завершения операции (равная задержка)
    //@Scheduled(fixedRate = 1000) - разница во времени в запусках операций (равная частота)
    @Scheduled(cron = "0/5 * * * * *")
    public void test() throws InterruptedException {
        log.info("Hello");
    }

}
