import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;

public class Bot extends TelegramLongPollingBot {
    private long chat_id;
    String lastMessage = "";
    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

//    public String getMessage(String msg){
//        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
//        KeyboardRow keyboardFirstRow = new KeyboardRow();
//        KeyboardRow keyboardSecondRow = new KeyboardRow();
//
//        replyKeyboardMarkup.setSelective(true);
//        replyKeyboardMarkup.setResizeKeyboard(true);
//        replyKeyboardMarkup.setOneTimeKeyboard(false);
//
//        if (msg.equals())
//
//        return "Выбрать...";
//    }

    public void onUpdateReceived(Update update) {
        update.getUpdateId();

        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        chat_id = update.getMessage().getChatId();

        String msgToBot = update.getMessage().getText();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);


        if (msgToBot.equals("Hi!")) {
            sendMessage.setText("И тебе Хай!");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        if (msgToBot.equals("Алла")) {
            sendMessage.setText("Привет, Кисичек :)");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        if (msgToBot.equals("Артем")) {
            sendMessage.setText("Привет, Босс :)");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
        return "@JavaTrainingBot";
    }

    public String getBotToken() {
        return "896223507:AAHb3tBSK3bfQo9JRG_CQruosE3KyMCeNho";
    }
}
