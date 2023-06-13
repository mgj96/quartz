package mgj96.quartz.message;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MessageVO {
    public MessageVO(String ReceivedNumber, String senderNumber, String msg) {
    }

    String ReceivedNumber;  //수신번호
    String senderNumber;    //발신번호
    String msg;             //내용

}
