package uzbek.korean.dictionary;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class asosiyController implements Initializable {

    @FXML
    private Label label;
    @FXML
    public ListView<String> uzList;
    @FXML
    public ListView<String> korList;
    @FXML
    private TextField uzWord;
    @FXML
    private TextField korWord;
    
    void open() throws SQLException {
        uzWord.setText("");
        korWord.setText("");
        try {
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:kor_uz.db");
            uzList.getItems().clear();
            korList.getItems().clear();
            Statement stat = co.createStatement();

            ResultSet rs = stat.executeQuery("SELECT * FROM baza ");
            while (rs.next()) {
                uzList.getItems().add(rs.getString(3));
                korList.getItems().add(rs.getString(2));
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            open();
        } catch (SQLException ex) {
            System.out.println("xatooooooooooo");
        }

        uzWord.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (uzWord.getText().isEmpty()) {
                    try {
                        open();
                    } catch (SQLException e) {
                    }
                } else {
                    try {
                        uz_izla(formatlash(newValue));
                    } catch (SQLException e) {
                    }
                }
            }
        }); //uzWord izlashi tugadi.

        korWord.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (newValue.isEmpty()) {
                    try {
                        open();
                    } catch (SQLException ex) {
                    }
                } else {
                    try {
                        kor_izla(newValue);
                    } catch (SQLException ex) {
                    }
                }
            }
        });

    }

    private void uz_izla(String satr) throws SQLException {
        uzList.getItems().clear();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:kor_uz.db");
            String s = String.format("'%s", satr) + "%'";

            Statement stat = co.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM baza WHERE uzb LIKE" + s);
            while (rs.next()) {
                uzList.getItems().add(rs.getString(3));
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void kor_izla(String satr) throws SQLException {
        korList.getItems().clear();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:kor_uz.db");
            String s = String.format("'%s", satr) + "%'";

            Statement stat = co.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM baza WHERE kor LIKE" + s);
            while (rs.next()) {
                korList.getItems().add(rs.getString(2));
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private void uzTanlash(MouseEvent event) {
        String tanlandi;
        tanlandi = uzList.getSelectionModel().getSelectedItem();
        System.out.println("tanlandi : "+tanlandi);
        try {
                 uzJAVOB ( tanlandi ) ;
        } catch (SQLException ex) {  }
        NatijaKorsat () ;
    }

    @FXML
    private void korTanlash(MouseEvent event) {
        String tanlandi;
        tanlandi = korList.getSelectionModel().getSelectedItem();
        try {
           korJAVOB(tanlandi);
        } catch (SQLException e) {
        }
        NatijaKorsat () ;
    }

    private void uzJAVOB ( String satr ) throws SQLException {
        String javob = null , sorov, add = null;
        sorov = "SELECT * FROM baza WHERE uzb LIKE " + String.format("'%s'", formatlash(satr));
        try {
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:kor_uz.db");
            Statement stat = co.createStatement();
            ResultSet rs = stat.executeQuery(sorov);
            while (rs.next()) {
                javob = rs.getString(2);
                System.out.println(javob +" keldi");
                add=rs.getString(5);
                System.out.println(add+" adduzb");
            }

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        Qiymatlar qiymat = new Qiymatlar();
        qiymat.qiymatOrnat(satr, javob,add);
    }

    private void korJAVOB(String satr) throws SQLException {
        String javob = null, sorov, add=null;
        sorov = "SELECT * FROM baza WHERE kor = " + String.format("'%s'", satr);
        try {
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:kor_uz.db");
            Statement stat = co.createStatement();
            ResultSet rs = stat.executeQuery(sorov);
            while ( rs.next ( ) ) {
                javob = rs.getString ( 3 ) ;
                add=rs.getString ( 4 ) ;      }

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        Qiymatlar qiymat = new Qiymatlar();
        qiymat.qiymatOrnat ( satr , javob , add ) ;
    }

    private String formatlash(String satr) {
        char[] massiv = new char[satr.length()];
        massiv = satr.toCharArray();
        satr = "";
        for (char x : massiv) {
            if (x == '\'') {
                satr += String.format("%c", '_');
            } else {
                satr += String.format("%c", x);
            }
        }
        return satr;
    }

    @FXML
    private void d_chiq(){
        Stage stage1 = new Stage();
        Parent root=null;
        try {
            root = FXMLLoader.load(getClass().getResource("chiqishOyna.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(asosiyController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stage1.setScene(new Scene(root));
        stage1.initModality ( Modality.APPLICATION_MODAL);
        stage1.initStyle(StageStyle.TRANSPARENT);
        stage1.show();
    }
 
    @FXML
    private void about_f(){
    Stage stage2 = new Stage();
        Parent root=null;
        try {
            root = FXMLLoader.load(getClass().getResource("about.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(asosiyController.class.getName()).log(Level.SEVERE, null, ex);
        }
        stage2.setScene(new Scene(root));
        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.initStyle(StageStyle.TRANSPARENT);
        stage2.show();
    }
    
    @FXML
    private void alifbosi(){
    Stage alif = new Stage();
        Parent root=null;
        try {
            root = FXMLLoader.load(getClass().getResource("alphabet.fxml"));
        } catch (IOException ex) {
            
//Logger.getLogger(asosiyController.class.getName()).log(Level.SEVERE, null, ex);
        }
        alif.setScene ( new Scene ( root  ) ) ;
        alif.initModality(Modality.APPLICATION_MODAL);
        alif.initStyle(StageStyle.TRANSPARENT);
        alif.show();
    }
    
    @FXML
    private void madaniyati(){
    Stage mad = new Stage();
        Parent root=null;
        try {
            root = FXMLLoader.load(getClass().getResource("madan.fxml"));
        } catch (IOException ex) {
            
//Logger.getLogger(asosiyController.class.getName()).log(Level.SEVERE, null, ex);
        }
        mad.setScene ( new Scene ( root  ) ) ;
        mad.initModality(Modality.APPLICATION_MODAL);
        mad.initStyle(StageStyle.TRANSPARENT);
        mad.show();
    }
    
    private void NatijaKorsat() {
     Stage stage = new Stage ();
Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("result.fxml"));
        } catch (IOException ex) {
            System.out.println("yuklanmadi");            
        }
        stage.setScene ( new Scene ( root ) ) ;
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.TRANSPARENT);
        
        stage.show();   
    }
}
