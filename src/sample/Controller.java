package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea chat;
    @FXML
    private TextField message;
    //TextField выглядит некрасиво, курсор по центру, новых строк нет, но у меня не вышло к TextArea прикрепить отправку по пробелу :(
    @FXML
    private Button send;



    @FXML
    public void sendMessage(ActionEvent actionEvent) {
        chat.appendText("I: " + message.getText() + "\n");
        message.clear();
        message.requestFocus();
    }


}
