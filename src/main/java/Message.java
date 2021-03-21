
public class Message {

    long chat_id;
    String text;
    String userName;

    public Message(long chat_id, String text, String userName) {
        this.chat_id = chat_id;
        this.text = text;
        this.userName = userName;
    }
}
