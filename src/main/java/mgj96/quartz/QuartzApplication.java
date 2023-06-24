package mgj96.quartz;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuartzApplication {

	public static void main(String[] args) throws SchedulerException {
		SpringApplication.run(QuartzApplication.class, args);

		SchedulerFactory schFact = new org.quartz.impl.StdSchedulerFactory();
		Scheduler scheduler = schFact.getScheduler();
		scheduler.start();
	}

}
