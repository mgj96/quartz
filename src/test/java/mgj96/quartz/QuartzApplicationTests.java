package mgj96.quartz;

import mgj96.quartz.message.service.ServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuartzApplicationTests {

	@Autowired
	ServiceImpl service;

	@Test
	void contextLoads() {

		System.out.println("보낸 메세지 건수: " + service.checkMessage());
		System.out.println("보낸 메세지 보내기 서비스: " + service.messageService());
		System.out.println("보낸 메세지 건수: " + service.checkMessage());

		Assertions.assertEquals(1, service.checkMessage());
	}

}
