package almielka.schedulingtasks;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Anna S. Almielka
 * 04.12.2020
 */

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    //specifies the interval between method invocations, measured from the start time of each invocation
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 0/14 18-20 * * *", zone = "UTC")
    //18:00, 18:30, 19:00, 19:30, 20:00 o'clock every day, time UTC
    public void scheduleTaskUsingCron() {
        log.info("Cron: do something. The time is now {}", dateFormat.format(new Date()));
    }
}
