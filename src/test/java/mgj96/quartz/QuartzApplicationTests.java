package mgj96.quartz;

import lombok.extern.slf4j.Slf4j;
import mgj96.quartz.message.service.Service;
import mgj96.quartz.message.service.ServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class QuartzApplicationTests {

	@Autowired
	Service service;

	@Test
	void contextLoads() {

		service.messageService();

		Assertions.assertEquals(1, service.checkMessage());
	}

}
