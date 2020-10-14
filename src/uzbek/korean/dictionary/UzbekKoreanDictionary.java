package uzbek.korean.dictionary;

import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class UzbekKoreanDictionary extends Application {
    
    private Scanner fayl ;
    @Override
    public void start ( Stage stage) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("asosiy.fxml"));
        Parent root = null;
        try { root = loader.load();
        } catch (IOException ex) {  }
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch ( args ) ;         }
    
}
