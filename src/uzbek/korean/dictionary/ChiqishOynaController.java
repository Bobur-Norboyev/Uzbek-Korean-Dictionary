package uzbek.korean.dictionary;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ChiqishOynaController implements Initializable {

    @FXML
    private ImageView rasm;
    @FXML
    private Button ha;
    @FXML
    private Button yuq;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    @FXML
    private void chiq(ActionEvent ev){ System.exit(0);}
    @FXML
    private void qayt(ActionEvent ec){
    Node source = (Node) ec.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();               }
}
