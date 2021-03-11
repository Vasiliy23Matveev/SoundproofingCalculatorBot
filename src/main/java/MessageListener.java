import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MessageListener {

    //ServerMessage serverMessage = new ServerMessage();


    public SendMessage getMessage(long chat_id, String text, String userName) {

        SendMessage sendMessage = new SendMessage();

        if ("/start".equals(text)) {
            sendMessage = ServerMessage.start(chat_id);
        } else if ("Продолжить \uD83C\uDFE0".equals(text)) {
            sendMessage = ServerMessage.noiseTypeSelect(chat_id);
        } else if ("Голос \uD83D\uDC68".equals(text) || "Музыка \uD83C\uDFB8".equals(text) || "Собачий лай \uD83D\uDC36".equals(text) || "Топот \uD83D\uDC63".equals(text)) {
            sendMessage = ServerMessage.houseTypeSelect(chat_id);
        } else if ("Шум оборудования \uD83C\uDFED".equals(text) || "Гостиницы/отели \uD83C\uDFE8".equals(text) || "Панельный \uD83C\uDFE4".equals(text) || "Кирпичный \uD83C\uDFE2".equals(text) || "Монолитный \uD83C\uDFE2".equals(text) || "Загородный \uD83C\uDFE1".equals(text)) {
            sendMessage = ServerMessage.noiseDirectionSelect(chat_id);
        } else if ("Пол \uD83D\uDC4E".equals(text) || "Потолок \uD83D\uDC46".equals(text) || "Стены \uD83D\uDC48".equals(text) || "Перегородка \uD83D\uDC49".equals(text)) {
            sendMessage = ServerMessage.enterSquare(chat_id);
        } else if (text.matches("[-]?[0-9]+(.[0-9]+)?")) {
            sendMessage = ServerMessage.calculate(chat_id, Integer.parseInt(text));
        }

        return sendMessage;
    }
}
