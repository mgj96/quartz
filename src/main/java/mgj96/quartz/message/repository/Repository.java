package mgj96.quartz.message.repository;

import mgj96.quartz.message.MessageVO;

@org.springframework.stereotype.Repository
public interface Repository {

    public int insert(MessageVO vo);

    public int countByMessage();

}
