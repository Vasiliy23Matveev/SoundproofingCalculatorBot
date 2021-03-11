import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

public class ServerMessage {
    static Keyboard keyboard = new Keyboard();
    static Calculator calculator = new Calculator();


    static SendMessage start(long chat_id) {
        return createMessage(chat_id, start_message, keyboard.startKeyboard());
    }
    public static SendMessage noiseTypeSelect(long chat_id) {
        return createMessage(chat_id, noiseTypeSelect, keyboard.noiseTypeSelectKeyboard());
    }
    public static SendMessage houseTypeSelect(long chat_id) {
        return createMessage(chat_id, houseTypeSelect,keyboard.houseTypeSelectKeyboard());
    }
    public static SendMessage noiseDirectionSelect(long chat_id) {
        return  createMessage(chat_id, noiseDirectionSelect, keyboard.noiseDirectionSelectKeyboard());
    }
    public static SendMessage enterSquare(long chat_id) {
        return createMessage(chat_id, enterSquare);
    }

    public static SendMessage error(long chat_id) {
        return createMessage(chat_id, "Неверная команда");
    }

    public static SendMessage calculate(long chat_id, int S) {
        return createMessage(chat_id, " "+ calculator.calculate(S) +" ", keyboard.startKeyboard());
    }



    private static SendMessage createMessage(long chat_id, String text, ReplyKeyboardMarkup replyKeyboardMarkup) {
        SendMessage message = new SendMessage()
                .setChatId(chat_id)
                .setText(text);
        message.setReplyMarkup(replyKeyboardMarkup);
        return message;
    }
    private static SendMessage createMessage(long chat_id, String text) {
        SendMessage message = new SendMessage()
                .setChatId(chat_id)
                .setText(text);
        return message;
    }

    private static final String start_message = "Привет! Это бот-калькулятор затрат на звукоизоляцию.";
    private static final String noiseTypeSelect = "Какой тип шума вас беспокоит?";
    private static final String houseTypeSelect = "Какой у вас дом?";
    private static final String noiseDirectionSelect = "Откуда шум?";
    private static final String enterSquare = "Введите площадь.";
}
