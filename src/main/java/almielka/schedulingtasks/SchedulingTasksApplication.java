package almielka.schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // annotation ensures that a background task executor is created
public class SchedulingTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingTasksApplication.class, args);
    }

}
