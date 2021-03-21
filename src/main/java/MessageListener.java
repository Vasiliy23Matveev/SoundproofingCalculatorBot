import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MessageListener {

    //ServerMessage serverMessage = new ServerMessage();


    public SendMessage createAnswerFromServer(Message message) {

        SendMessage sendMessage = new SendMessage();

        if ("/start".equals(message.text)) {
            sendMessage = ReplyMessageConstructor.start(message.chat_id);

        } else if ("Продолжить \uD83C\uDFE0".equals(message.text)) {
            sendMessage = ReplyMessageConstructor.noiseTypeSelect(message.chat_id);
        } else if ("Голос \uD83D\uDC68".equals(message.text) || "Музыка \uD83C\uDFB8".equals(message.text) || "Собачий лай \uD83D\uDC36".equals(message.text) || "Топот \uD83D\uDC63".equals(message.text)) {
            sendMessage = ReplyMessageConstructor.houseTypeSelect(message.chat_id);
        } else if ("Шум оборудования \uD83C\uDFED".equals(message.text) || "Гостиницы/отели \uD83C\uDFE8".equals(message.text) || "Панельный \uD83C\uDFE4".equals(message.text) || "Кирпичный \uD83C\uDFE2".equals(message.text) || "Монолитный \uD83C\uDFE2".equals(message.text) || "Загородный \uD83C\uDFE1".equals(message.text)) {
            sendMessage = ReplyMessageConstructor.noiseDirectionSelect(message.chat_id);
        } else if ("Пол \uD83D\uDC4E".equals(message.text) || "Потолок \uD83D\uDC46".equals(message.text) || "Стены \uD83D\uDC48".equals(message.text) || "Перегородка \uD83D\uDC49".equals(message.text)) {
            sendMessage = ReplyMessageConstructor.enterSquare(message.chat_id);
        } else if (message.text.matches("[-]?[0-9]+(.[0-9]+)?")) {
            sendMessage = ReplyMessageConstructor.calculate(message.chat_id, Integer.parseInt(message.text));
        }

        return sendMessage;
    }
}
