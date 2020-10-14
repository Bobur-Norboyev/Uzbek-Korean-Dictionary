package uzbek.korean.dictionary;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class AboutController implements Initializable {

    @FXML
    private TextArea info ; 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        info.setText("O'zbekcha - Koreyscha lug'at dasturi\nmutlaqo bepul dastur hisoblanadi."
                + "\nUshbu lug'atni tuzishdan maqsad yurtimizda \noxirgi paytlarda koreys tilini o'rganish\n"
                + "istagida bo'lgan insonlarning ko'payganidir.\nLug'at shunday kishilarga yordam \nberish maqsadida yaratilgan.\n\nDasturda internet materiallaridan foydalanilgan."
                + "\n\nDasturchi : Boburbek Norboyev\nTelegram : @Oq_yolbars\nG-mail : boburbek.norboyev.19@gmail.com"
                + "\nManzil : \nQashqadaryo vil, Nishon t, Tallimarjon shahri.\nFikr va mulohazalaringizni yuqoridagi manzillar \norqali bemalol yuborishingiz mumkin. \n\nTATU Qarshi filiali.\n2018-2019 - yil...");
    }    
    
    @FXML
    private  void orqaga(ActionEvent event){
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    }
    
}
