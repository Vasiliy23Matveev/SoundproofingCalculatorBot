import lombok.Getter;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {

    static private final String BOT_USERNAME = " ";
    static private final String BOT_TOKEN = " ";

    MessageListener messageListener = new MessageListener();


    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()) {
            long chat_id =update.getMessage().getChatId();
            String text = update.getMessage().getText();
            String userName = update.getMessage().getForwardSenderName();
            sendMessageFromServer(messageListener.getMessage(chat_id, text, userName));
        }
    }

    private void sendMessageFromServer(SendMessage message) {
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }
}
