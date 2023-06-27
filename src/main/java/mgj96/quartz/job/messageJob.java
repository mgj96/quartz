package mgj96.quartz.job;

import mgj96.quartz.message.service.Service;
import org.hibernate.annotations.Comment;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
public class messageJob extends QuartzJobBean {

    @Autowired
    Service service;

    @Override
    protected void executeInternal(JobExecutionContext context) {
        //service.messageService();
        System.out.println("messageJob Quartz!");
    }
}
