import org.checkerframework.checker.units.qual.K;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;

public class KeyboardConstructor {

    public ReplyKeyboardMarkup startKeyboard() {
        ArrayList<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow firstKeyboardRow = new KeyboardRow();
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        keyboardRows.clear();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        firstKeyboardRow.add("Продолжить \uD83C\uDFE0");

        keyboardRows.add(firstKeyboardRow);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup noiseTypeSelectKeyboard() {
        ArrayList<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow firstKeyboardRow = new KeyboardRow();
        KeyboardRow secondKeyboardRow = new KeyboardRow();
        KeyboardRow thirdKeyboardRow = new KeyboardRow();
        KeyboardRow fourthKeyboardRow = new KeyboardRow();

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        keyboardRows.clear();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        firstKeyboardRow.add("Голос \uD83D\uDC68");
        firstKeyboardRow.add("Музыка \uD83C\uDFB8");
        secondKeyboardRow.add("Собачий лай \uD83D\uDC36");
        secondKeyboardRow.add("Топот \uD83D\uDC63");
        thirdKeyboardRow.add("Шум оборудования \uD83C\uDFED");
        thirdKeyboardRow.add("Гостиницы/отели \uD83C\uDFE8");
        fourthKeyboardRow.add("Иной \uD83D\uDD15");

        keyboardRows.add(firstKeyboardRow);
        keyboardRows.add(secondKeyboardRow);
        keyboardRows.add(thirdKeyboardRow);
        keyboardRows.add(fourthKeyboardRow);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup houseTypeSelectKeyboard() {
        ArrayList<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow firstKeyboardRow = new KeyboardRow();
        KeyboardRow secondKeyboardRow = new KeyboardRow();

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        keyboardRows.clear();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        firstKeyboardRow.add("Панельный \uD83C\uDFE4");
        firstKeyboardRow.add("Кирпичный \uD83C\uDFE2");
        secondKeyboardRow.add("Монолитный \uD83C\uDFE2");
        secondKeyboardRow.add("Загородный \uD83C\uDFE1");


        keyboardRows.add(firstKeyboardRow);
        keyboardRows.add(secondKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup noiseDirectionSelectKeyboard() {
        ArrayList<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow firstKeyboardRow = new KeyboardRow();
        KeyboardRow secondKeyboardRow = new KeyboardRow();

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        keyboardRows.clear();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        firstKeyboardRow.add("Потолок \uD83D\uDC46");
        firstKeyboardRow.add("Пол \uD83D\uDC4E");
        secondKeyboardRow.add("Стены \uD83D\uDC48");
        secondKeyboardRow.add("Перегородка \uD83D\uDC49");


        keyboardRows.add(firstKeyboardRow);
        keyboardRows.add(secondKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }
}
