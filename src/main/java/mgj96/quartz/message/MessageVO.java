package mgj96.quartz.message;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Data
@Table(name = "MESSAGE")
@Entity
public class MessageVO {
    public MessageVO(String ReceivedNumber, String senderNumber, String msg) {
    }

    @Id
    Long id;
    @Column(name = "RECEIVED_NUMBER")
    String ReceivedNumber;  //수신번호

    @Column(name = "SENDER_NUMBER")
    String senderNumber;    //발신번호

    @Column(name = "MSG")
    String msg;             //내용

}
