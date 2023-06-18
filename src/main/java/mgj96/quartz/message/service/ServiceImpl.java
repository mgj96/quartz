package mgj96.quartz.message.service;

import mgj96.quartz.message.MessageVO;
import mgj96.quartz.message.repository.MemoryRepository;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    final MemoryRepository repository;

    static String senderNumber = "010-2789-1511";

    public ServiceImpl(MemoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public int messageService() {

        int i = 0; //메시지 발송 건수

        MessageVO vo = new MessageVO("010-1234-1234", senderNumber, "test");

        try{
            i = repository.insert(vo);
        }catch (Exception e){
            //예외발생시 롤백
        }

        return i;
    }

    @Override
    public int checkMessage() {
        return repository.countByMessage();
    }
}
