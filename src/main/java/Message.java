import lombok.Getter;
import lombok.Setter;

public class Message {
    
    @Getter
    @Setter
    long chat_id;
    
    @Getter
    @Setter
    String text;

    @Getter
    @Setter
    String userName;

    public Message(long chat_id, String text, String userName) {
    }
}
