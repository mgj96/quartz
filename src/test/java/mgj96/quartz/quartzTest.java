package mgj96.quartz;

import lombok.extern.slf4j.Slf4j;
import mgj96.quartz.job.messageJob;
import mgj96.quartz.message.service.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class quartzTest {

    @Test
    void test() throws SchedulerException {

        // Job 생성
        JobDetail job = JobBuilder.newJob(messageJob.class)
                .withIdentity("messageJob", "group")
                .build();

        // Trigger 생성
        Trigger trigger = (Trigger) TriggerBuilder.newTrigger()
                .withIdentity("messageTrigger", "group1")
                .startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(10)
                        .repeatForever())
                .build();

        // 스케줄러 생성 및 Job, Trigger 등록
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);

    }

}
