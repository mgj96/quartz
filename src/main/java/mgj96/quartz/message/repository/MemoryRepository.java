package mgj96.quartz.message.repository;

import mgj96.quartz.message.MessageVO;

import java.util.ArrayList;
import java.util.List;

public class MemoryRepository implements Repository {

    static List<MessageVO> list = new ArrayList<MessageVO>();
    
    @Override
    public int insert(MessageVO vo) {

        list.add(vo);

        return 1;
    }

    @Override
    public int countByMessage() {
        return list.size();
    }
}
