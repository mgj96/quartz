package mgj96.quartz.message.service;

@org.springframework.stereotype.Service
public interface Service {

    /***
     * 분마다 돌며 메세지 확인
     * @return 발송된 메세지 건수
     */
    public int messageService();

    public int checkMessage();

}
