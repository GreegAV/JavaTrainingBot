import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        update.getUpdateId();

        SendMessage sendMessage=new SendMessage().setChatId(update.getMessage().getChatId());

        if (update.getMessage().getText().equals("Hi!")){
            sendMessage.setText("И тебе Хай!");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
        }

        if (update.getMessage().getText().equals("Алла")){
            sendMessage.setText("Привет, Кисичек :)");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
//        if (update.getMessage().getText().equals("Алла")){
//            sendMessage.setText("Привет, Кисичек :)");
//            try {
//                execute(sendMessage);
//            } catch (TelegramApiException e){
//                e.printStackTrace();
//            }
//        }
        if (update.getMessage().getText().equals("Артем")){
            sendMessage.setText("Привет, Босс :)");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e){
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
