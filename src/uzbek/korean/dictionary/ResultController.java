package uzbek.korean.dictionary;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ResultController implements Initializable {

    @FXML
    private Label soz;
    @FXML
    private Label tarjima;
    @FXML
    private Label add;
    @FXML
    private Button ortga ;
    private Qiymatlar q = new Qiymatlar();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        soz.setText ( q.asosiy() +" : ") ;
        tarjima.setText(q.tarjima());
        add.setText("( "+q.addit()+" )");
    }    
    
    @FXML
    public void exit(ActionEvent event){
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();                                    }
}
