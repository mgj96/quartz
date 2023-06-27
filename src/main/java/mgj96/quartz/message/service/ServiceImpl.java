package mgj96.quartz.message.service;

import mgj96.quartz.message.MessageVO;
import mgj96.quartz.message.repository.MemoryRepository;
import mgj96.quartz.message.repository.Repository;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    //final MemoryRepository repository;
    final Repository repository;

    static String senderNumber = "010-2789-1511";

    public ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public int messageService() {

        int i = 0; //메시지 발송 건수

        List<MessageVO> list = new ArrayList<MessageVO>();

        try{
            //for(; i < Math.random() * 10; i++){
            for(; i < 1; i++){
                list.add(repository.save(new MessageVO("010-1234-123"+i, senderNumber, "test")));
            }
        }catch (Exception e){
            //예외발생시 롤백
        }

        return list.size();
    }

    @Override
    public int checkMessage() {
        return (int) repository.count();
    }
}
