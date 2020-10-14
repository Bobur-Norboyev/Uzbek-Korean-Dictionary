package uzbek.korean.dictionary;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MadanController implements Initializable {

    @FXML
    private TextArea text ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        text.setText("태극기   Taegeukggi\n" +
"Koreya davlat bayrog’i Taegeukggi deb ataladi. Taegeuk\n" +
"qizil va ko’k rangdan iborat bo’lib, qizil rang yorug’lik, ko’k\n" +
"rang qorong’ulik ma’nosini beradi. U geon, gon, gam, lee kabi\n" +
"qismdan iborat bo’lib, geon-osmon, gon-yer, gam-oy,  leequyosh timsolidir.\n\n"
                + "무궁화   Mugunghwa\n" +
"Mugunghwa koreyaning milliy guli. Bu gul bir marta ochilsa doimo\n" +
"ochilaveradigan guldir. U qanday joyda o’sishiga qaramay, uzoq umr\n" +
"ko’radi. Shuning uchun ushbu gul koreys millatining qatiyati timsolidir.\n\n"
                + "한옥과 온돌   Hanok va Ondol\n" +
"Koreyaliklar uyga kirishdan avval oyoq kiyimini yechib kiradilar.\n" +
"Buning sababi xonaning ostki qismi ondol orqali isitilgani tufayli\n" +
"issiq bo’lganligidadir. Yozda salqin Maru bo’lgani uchun bu yerda\n" +
"yashashadi.Eshik va derazalarga maxsus qog’oz yopishtirilgan bo’lib, u\n" +
"xona havosi almashinuvini me’yorlashtiradi va quyosh nurlarini xonaga\n" +
"bir maromda kirishini ta’minlaydi. Yana qishda sovuq kirgizmaydi.\n\n"
                + "한복   Hanbok\n" +
"Qadimdan bizgacha yetib kelgan va faqat\n" +
"koreyaliklar kiyadigan kiyim to’g’ri va biroz\n" +
"bukilgan holda tikilganligi bilan chiroylidir.\n\n"
                + "한국인의 밥상   Koreyslarning dasturxoni\n" +
"Koreyslarning dasturxoni bab,sho’rva va salatlardan iborat.\n" +
"Eng ko’p yeyiladigan ovqat guruchdan tayyorlanadigan bab\n" +
"va karamdan tayyorlanadigan kimchi. Yana ovqatlanishda\n" +
"koreyslar qoshiq va tayoqchalardan foydalanadilar.\n\n"
                + "Koreys telefon raqamlari\n" +
"Koreyada qo’l telefon raqamlari odatda uchta son bilan boshlanadi.\n" +
"Dastlab, telefon kompaniyalarga qarab har xil bo’lgan boshidagi nomer, lekin hozirgi\n" +
"kunda barcha kompaniyalar ‘010’ raqamidan foydalanmoqdalar.\n" +
"Masalan, 010-3286-5005, 016-809-3290, 019-3009-2109.\n" +
"Uy yoki ofis telefon  raqamlari esa odatda quyidagicha bo’ladi.\n" +
"Masalan, 350-9001, 233-8765. Har bir viloyat va katta shahar o’zining maxsus kodiga ega.\n" +
"Shahar yoki viloyat ichiga telefon qilinsa kod nomer kerak emas, lekin boshqa shahar yoki\n" +
"viloyatga qo’ng’iroq qilmoqchi bo’linganda shahar  kod raqami yozilishi kerak.\n\n"
                + "Koreyada kishilarga murojaat qilish usuli\n" +
"Koreyada kishilarga murojaat qilganda ko’pincha ism bilan chaqiriladi. Suhbat orasida\n" +
"boshqa kishiga murojaat etganda inglizchada ‘you’ va o’zbekchada ‘siz’ deb aytiladi.\n" +
"Koreyschada ham ‘siz’ ma’noli so’z, ‘당신’ bo’ladi. Lekin Koreyada ‘당신’ deb murojaat\n" +
"etilmaydi, ism bilan chaqiriladi. Masalan, ‘유리 씨, 승우 씨, h.k.’ deb chaqiriladi. Bu yerda\n" +
"‘-씨‘ ma’nosi inglizchada ‘Mr, Miss, Ms, h.k.’, o’zbekchada ‘Janob, Xonim, h.k.’ bo’ladi.\n" +
"Ish joy yoki o’quv dargohlarda lavozim bilan chaqiriladi. Masalan, 사장님(boshliq),\n" +
"선생님(o’qituvchi) h.k. chaqiriladi. ‘Siz’ ma’noli so’z ‘당신’ esa er-xotin bir-birini chaqirganda\n" +
"yoki begona odam bilan urushganda, to’g’risidagi shaxs xurmatsizlik bilan chaqirilganda\n" +
"aytiladi. Shu sababli, koreys odamlariga murojaat qilganda ‘당신’ deb murojaat qilinganda\n" +
"ehtiyot bo’lish lozim.\n\n"
                + "Koreya ta’lim tizimi\n" +
"유치원 Bog’cha  → 초등학교 6 yil → 중학교 3 yil → 고등학교 3 yil\n" +
"대학교 3 yil ~ (ko’pincha) 4 yil → 대학원 (석사 Magistratura + 박사 Doktorantura) \n" +
"Koreyada o’quv tizimi 초등학교 bilan boshlanadi va keyin 중학교, 고등학교 ga tartib bilan\n" +
"o’tadilar. Ularning o’quv muddati esa 초등학교 6 yil, 중학교, 고등학교 esa har biri 3 yildan\n" +
"bo’ladi. 초등학교 ga kirishdan oldin odatda 유치원 ga borishadi.\n" +
"고등학교ni bitirgandan keyin ko’pchilik o’quvchilar 대학교 ga kiradilar.\n" +
"Undan keyin 대학원(석사 Magistratura, 박사 Doktorantura)ga o’qishni davom ettiradilar.\n" +
"O’zbekistondan farqli, Koreyada yangi kurs bahorda, martda boshlanadi va odatda kirish\n" +
"imtihonlar kuz yoki qishda bo’ladi. Semestr esa bahorgi semestr va kuzgi semestrga bo’linadi.\n" +
"Ta’til esa yozgi ta’til va qishgi ta’til bo’lib, bir yilda ikki marta bo’ladi. 유치원 dan tashqari\n" +
"yuqorida aytilgan barcha o’quv dargohlarini 학교deb atasa bo’ladi.\n\n"
                + "Vaqt va sana o’qilish usuli\n" +
"Koreyada vaqt yoki sana aytilganda katta birlikdan boshlab aytiladi. Masalan, ertaga\n" +
"tushlikdan oldin soat 8ni aytsa 내일 오전 8시 bo’ladi. Kelasi hafta payshanba kechqurun\n" +
"soat 9ni aytsa 다음 주 목요일 저녁 9시 bo’ladi. Bu O’zbekiston bilan bir xil. Farqli tomoni\n" +
"O’zbekistonda kundan yilga qarab tartib bilan aytiladi, Koreyada esa yildan kunga\n" +
"qarab tartib bilan aytiladi. Masalan, 25-Fevral, 2011 yil bo’lsa 2011년 2월 25일 bo’ladi\n" +
"va 1-Sentyabr 1991 yil bo’lsa 1991년 9월 1일 deb aytiladi. Manzil ham ayni shu tartibda\n" +
"aytiladi. Manzil yozilganda birinchi davlat, keyin viloyat, shahar…, shunday tartib bilan\n" +
"kattasidan kichkinasiga tomon yoziladi.\n\n"
                + "Koreya pul birligi\n" +
"Koreya pul birligi Von(원). Bugungi kunda Koreyada 4 xil qog’oz pul va 4 xil tangadan\n" +
"foydalaniladi.\n" +
"Pullarda Koreyani yoki Joseon sulolasi vakillarining va qadimiy narsalarning  rasmlari\n" +
"bor. Eng katta pul birligi ellik ming vonlik qog’oz pulda Joseon sulolasi adabiyotchisi va\n" +
"rassomi bo’lgan Sinsaimdangning rasmi bor. O’n minglik qog’oz pulda Hangeulni yaratgan\n" +
"Joseon sulolasi Qiroli Sejongning rasmi bor. Besh minglik va ming vonlik qog’oz pulda\n" +
"Joseon olimlari bo’lgan Yulgok Yi I va Twegye Yi Hwanglarning rasmlari bor. Yuz vonlik\n" +
"tangada Joseon sulolasi harbiy generali, Yi Sunsinning rasmi bor.\n\n"
                + "Koreya yo’l harakati haqida\n" +
"Koreyada ko’pincha shahar ichida yuradigan asosiy transport vositasi avtobus va taksidir.\n" +
"Avtobusga chiqqanda to’lov chipta, yo’l harakat kartochkasi yoki pul bilan to’lanadi.\n" +
"Taksida esa kartochka yoki pul bilan to’lanadi. Minishdan oldin taksi haydovchi bilan\n" +
"savdolashish kerak bo’ladigan O’zbekitondan farqli, Koreyada taksi ichida uzoqlikni\n" +
"ko’rsatadigan apparat o’rnatilib, yo’lovchi boradigan joyning uzoqligiga qarab pul to’lanadi.\n" +
"Katta shaharlar orasidan faqat beshta shaharlar(서울, 부산, 대구, 광주 va 대전)da metro\n" +
"yuradi. Seulda to’qqizta yo’nalishda metro yuradi. Metroda ham yo’l harakat kartochkasidan\n" +
"foydalaniladi. Boshqa shaharga borayotganda ko’pincha tezkor avtobus yoki poezdga\n" +
"chiqadilar. Bir necha katta shaharlarga yoki Jeju oroliga uchadigan samolyot ham bor.\n" +
"Taksida ham borsa bo’ladi, lekin boshqa shaharga borganda taksi haydovchi xohlaydigan\n" +
"to’lovni aytgani uchun qimmat bo’ladi.\n" +
"Shahar ichida yuradigan avtobus raqamini aytishda xitoy raqami bilan 1번(일번),\n" +
"12번(십이번) h.k. aytiladi. Metro raqami ham xitoy raqami bilan 1호선(일호선),\n" +
"2호선(이호선) h.k. aytiladi.\n\n"
                + "Koreys odamlarining odatdagi salomlashishi\n" +
"Koreyada ovqatlanayotgan paytda tanish odamni uchratib salomlashganda, ko’pincha\n" +
"“식사하셨어요?” deb ovqatlanganligini so’raladi. Ko’chada yurganda uchratsa “어디에\n" +
"가세요?”deb ham so’raydi. Uchrashganiga ancha vaqt bo’lgan odamni uchratsa,\n" +
"xayrlashayotganda “우리 언제 같이 식사해요.” deb xayrlashadilar.\n" +
"Shunday deb xayrlashilgan dan so’ng aytgan koreys kishi yana xabar bermasa\n" +
"chet elliklar hayron qolishlari mumkin. Lekin shunaqa savollar Koreyada odatdagi\n" +
"so’raydigan salomlashish gaplari bo’lgani sababli nimaga ovqatlanganligini yoki qayerga\n" +
"borayotganligini so’rashni, birga ovqatlanishga taklif qilgandan keyin yana xabar\n" +
"bermasligini g’alati deb o’ylamang.\n"
                + "");
        
    }    

    @FXML
    private void yop(ActionEvent event){
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    }
    
}
