package uzbek.korean.dictionary;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AlphabetController implements Initializable {

    @FXML
    private TextArea text ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        text.setText("Qirol Sejong yaratgan hangeul : \n"
                + "Joseonning 25-qiroli Sejong Jeong In Ji, Shin Suk Ju, Pak Peng\n" +"Nyeon kabi Jiphyeonjeon olimlari bilan birga Hangeulni yaratdi. Hali\n" +
"Hangeul yaratilmagan paytda Xitoy iyerogliflaridan foydalanilgan,\n" +"ammo iyeroglifdan foydalanuvchilar soni juda kam edi. Qirol Sejong\n" +
"barcha odamlar foydalana oladigan oson alifbo yaratmoqchi bo’lib,\n" +"undoshni odamdagi talaffuz holatini ko’rib, unlini esa osmon va yer,\n" +
"odamning ko’rinishiga qarab yaratdi. Undosh va unli jami bo’lib 28-ta\n" +"harf yaratdi.\n" +
"Ushbu alifbo1443-yili yaratilgan bo’lib, 1446-yili aholiga\n" +"Hunminjeongeum nomi ostida e’lon qilindi. Ushbu so’zning ma’nosi\n" +
"’aholi o’rganuvchi to’g’ri tovush bo’lib, u hangeulning yaratilish jarayoni\n" +"tasvirlangan kitobdir. Ayni paytda u alifboning ham nomlanishi\n" +
"hisoblanadi. Hunminjeongeum Koreya respublikasining qimmatli\n" +"yodgorliklarining 70-si hisoblanadi. Hunminjeongeum tarixda alifbo\n" +
"yaratilishi yozib qoldirilgan yagona kitob bo’lganligi sababli 1997-yil\n" +"1-oktabrda YUNESCOning jahon yozma merosi qatoriga kiritilgan.\n\n"
  + " · ASOSIY UNDOSHLAR \n"
                + " - ㄱ -> k, g\n"+ " - ㄴ -> n\n"+
                " - ㄷ -> t,d\n"+ " - ㄹ -> r,l\n"+
                " - ㅁ -> m\n"+" - ㅂ -> p,b\n"+
                " - ㅅ -> s\n"+" - ㅇ -> burun tovushi ng*\n"+" - ㅈ -> chj\n"+
                " - ㅊ -> ch\n"+" - ㅋ -> kh\n"+
                " - ㅌ -> th\n"+" - ㅍ -> ph\n"+" - ㅎ -> h\n"+
                "* Bo‘g‘inning boshida unlidan oldin talaffuz qilinmaydi, bo‘g‘inning \n" +
"oxirida burunli(n) (ng) sifatida talaffuz qilinadi.\n\n"
                + "· QO'SHMA UNDOSHLAR : \n"+ " - ㄲ -> jarangli k\n"+ " - ㄸ -> jarangli t\n"
                + " - ㅃ ->jarangli p\n"+ " - ㅆ -> jarangli s\n"+ " - ㅉ -> jarangli ch\n\n"
                + "· UNLILAR\n"+ " - ㅏ -> a\n"+ " - ㅑ -> ya\n"+ " - ㅓ -> o\n"
                + " - ㅕ -> yo\n"+ " - ㅗ -> o' \n"+ " - ㅛ -> yo' \n"
                + " - ㅜ -> u\n"+ " - ㅠ -> yu\n"+ "  \"ㅡ\" -> ы\n"
                + " - ㅣ -> i\n\n"+ "· DIFTONGLAR (qo'sh unlilar)\n"
                + " ㅐ => ㅏ+ ㅣ=ㅐ   Talaffuzi : э\n"+ " ㅒ => ㅣ+ㅐ=ㅒ  Talaffuzi : yэ\n"
                + " ㅔ => ㅓ+ㅣ=ㅔ  Talaffuzi : e\n"+ " ㅖ => ㅕ+ㅣ=ㅖ  Talaffuzi : ye\n"
                + " ㅘ => ㅗ+ㅏ=ㅘ  Talaffuzi : oa\n"+ " ㅙ => ㅗ+ㅐ=ㅙ  Talaffuzi : oэ\n"+ " ㅚ => ㅗ+ㅣ=ㅚ  Talaffuzi : oe\n"
                + " ㅝ => ㅜ+ㅓ=ㅝ  Talaffuzi : uo\n"+ " ㅞ => ㅜ+ㅔ=ㅞ  Talaffuzi : ue\n"
                + " ㅟ => ㅜ+ㅣ=ㅟ  Talaffuzi : ui\n"+ " ㅢ => ㅡ+ㅣ=ㅢ  Talaffuzi : ыy\n\n");
    }    

    @FXML
    private void yop(ActionEvent event){
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    }   
}