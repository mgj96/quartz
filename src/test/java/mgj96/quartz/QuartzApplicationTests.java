package mgj96.quartz;

import lombok.extern.slf4j.Slf4j;
import mgj96.quartz.message.service.ServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class QuartzApplicationTests {

	@Autowired
	ServiceImpl service;

	@Test
	void contextLoads() {

		log.debug("보낸 메세지 건수: {}", service.checkMessage());
		log.debug("보낸 메세지 보내기 서비스: {}", service.messageService());
		log.info("보낸 메세지 건수: {}", service.checkMessage());

		Assertions.assertEquals(1, service.checkMessage());
	}

}
