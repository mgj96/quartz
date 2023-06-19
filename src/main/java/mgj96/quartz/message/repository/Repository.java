package mgj96.quartz.message.repository;

import mgj96.quartz.message.MessageVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<MessageVO, Long> {
}
