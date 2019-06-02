package tr.edu.ufuk.siberguvenlikegitimi.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tr.edu.ufuk.siberguvenlikegitimi.entity.Kullanici;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Rol;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Test;

/**
 * Created by mustafaergan
 */

public class StaticList {
    public static List<Rol> rolList= new ArrayList<>();
    public static List<Kullanici> kullaniciList= new ArrayList<>();
    public static Map<Integer,List<Test>> testList =  new HashMap<>();

    static {
        Rol rolAdmin = new Rol(0,"Yönetici","ADMIN","Güvenlik Birimi");
        Rol rolKullanici = new Rol(1,"Personel","KULLANICI","Bilgi İşlem Birimi");
        StaticList.rolList.add(rolAdmin);
        StaticList.rolList.add(rolKullanici);
        Kullanici kullanici1 = new Kullanici(0,"mustafa","1234",rolAdmin,"Mustafa ERGAN","1010101010","İstanbul","05536101627","mustafaergan@gmail.com");
        Kullanici kullanici2 = new Kullanici(1,"murat","1234",rolAdmin,"Murat Paşa UYSAL","1010101010","Ankara","05501234567","mustafaergan@gmail.com");
        Kullanici kullanici3 = new Kullanici(2,"alaattin","1234",rolKullanici,"Alaattin PARLAKKILIÇ","1010101010","Ankara","05501234567","mustafaergan@gmail.com");
        Kullanici kullanici4 = new Kullanici(3,"mesut","1234",rolKullanici,"Mesut ÜNLÜ","1010101010","Ankara","05501234567","mustafaergan@gmail.com");
        Kullanici kullanici5 = new Kullanici(4,"hilal","1234",rolKullanici,"Hilal ERGAN","1010101010","İstanbul","05501234567","mustafaergan@gmail.com");
        StaticList.kullaniciList.add(kullanici1);
        StaticList.kullaniciList.add(kullanici2);
        StaticList.kullaniciList.add(kullanici3);
        StaticList.kullaniciList.add(kullanici4);
        StaticList.kullaniciList.add(kullanici5);

    }

    static {
        //Birinci Test
        Test soru1 = new Test(0, "Hangisi Güvenli Şifredir", new HashMap<String, String>() {{
            put("A", "123456");
            put("B", "1453");
            put("C", "merhaba");
            put("D", "965ertEDF=(%");
        }}, "D");

        Test soru2 = new Test(0, "Hangisi Malware Tehtidi Değildir", new HashMap<String, String>() {{
            put("A", "Sosyal Mühendislik");
            put("B", "Solucanlar");
            put("C", "Trojan");
            put("D", "Casus Yazılım");
        }}, "A");

        Test soru3 = new Test(0, "Sosyal Medya İle Veri Hırzılığı Hangi Saldırı Yöntemidir", new HashMap<String, String>() {{
            put("A", "Trojan");
            put("B", "Boot Saldırsı");
            put("C", "Sosyal Mühendislik");
            put("D", "Masa Denetimi");
        }}, "C");

        testList.put(0, Arrays.asList(soru1,soru2,soru3));

        //İkinci Test


        Test soru21 = new Test(0, "Personelin Yükümlülüklerinden Hangisi Yanlıştır", new HashMap<String, String>() {{
            put("A", "Gizli Evrakları Korumak");
            put("B", "Sosyal medya Paylaşmamak ");
            put("C", "Spam Mail Açmamak");
            put("D", "Mail Her Linke Tıklamak");
        }}, "D");

        Test soru22 = new Test(0, "Hangisi Malware Tehtididir", new HashMap<String, String>() {{
            put("A", "Sosyal Mühendislik");
            put("B", "Belge Göndermek");
            put("C", "Belge Okumak");
            put("D", "Casus Yazılım");
        }}, "D");

        Test soru23 = new Test(0, "Sosyal Medya İle Veri Hırzılığı Hangi Saldırı Yöntemidir", new HashMap<String, String>() {{
            put("A", "Sosyal Medya Takibi");
            put("B", "Sosyal Medya Paylaşımı");
            put("C", "Sosyal Mühendislik");
            put("D", "Sosyal Medya Mesaj");
        }}, "C");

        testList.put(1, Arrays.asList(soru21,soru22,soru23));

    }
}
