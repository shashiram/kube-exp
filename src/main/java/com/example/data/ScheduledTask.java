package com.example.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);

    @Scheduled(cron ="0 * * * * *" )
    void randLogs(){
        try {
            throw new Exception();
        }catch (Exception ex){
            logger.error(ex.getMessage());
        }
    }
}
