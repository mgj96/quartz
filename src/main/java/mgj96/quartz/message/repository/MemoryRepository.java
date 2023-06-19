package mgj96.quartz.message.repository;

import mgj96.quartz.message.MessageVO;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class MemoryRepository {

    static List<MessageVO> list = new ArrayList<MessageVO>();
    
    public int insert(MessageVO vo) {

        list.add(vo);

        return 1;
    }

    public int countByMessage() {
        return list.size();
    }
}
