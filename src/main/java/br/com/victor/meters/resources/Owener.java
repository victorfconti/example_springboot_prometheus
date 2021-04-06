package br.com.victor.meters.resources;

import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Owener {

    @Scheduled(fixedRate = 1)
    @Timed(value = "doing_something_time", longTask = true)
    public void show() throws InterruptedException {

        Thread.sleep(1000L);
        log.info("Doing something");
    }

}
