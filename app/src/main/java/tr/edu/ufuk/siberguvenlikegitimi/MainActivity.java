package tr.edu.ufuk.siberguvenlikegitimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import tr.edu.ufuk.siberguvenlikegitimi.data.StaticList;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Kullanici;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Rol;

/**
 * Created by mustafaergan
 */

public class MainActivity extends AppCompatActivity {

    TextView tVBasari;
    EditText eTKullaniciAdi;
    EditText eTSifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        this.eTKullaniciAdi = (EditText) findViewById(R.id.eTKullaniciAdi);
        this.eTSifre = (EditText)findViewById(R.id.eTSifre);
        this.tVBasari = (TextView)findViewById(R.id.tVBasari);
        boolean control = true;
        for (Kullanici kul:StaticList.kullaniciList) {
            if(this.eTKullaniciAdi.getText().toString().equals(kul.getKullaniciAdi())&&
                    this.eTSifre.getText().toString().equals(kul.getSifre())){
                control = false;
                Intent giris = new Intent(MainActivity.this,
                        GirisMainActivity.class);
                startActivity(giris);
            }
        }

        if(control)
            this.tVBasari.setText("Giriş Başarısız");
    }

    private void veridoldur() {
        Rol rolAdmin = new Rol(0,"Yönetici","ADMIN","Güvenlik Birimi");
        Rol rolKullanici = new Rol(1,"Personel","KULLANICI","Bilgi İşlem Birimi");
        StaticList.rolList.add(rolAdmin);
        StaticList.rolList.add(rolKullanici);
        Kullanici kullanici1 = new Kullanici(0,"mustafa","1234",rolAdmin,"Mustafa ERGAN","1010101010","İstanbul","05536101627","mustafaergan@gmail.com");
        Kullanici kullanici2 = new Kullanici(1,"murat","1234",rolAdmin,"Murat Paşa UYSAL","1010101010","Ankara","05501234567","mustafaergan@gmail.com");
        Kullanici kullanici3 = new Kullanici(2,"alaattin","1234",rolKullanici,"Alaattin PARLAKKILIÇ","1010101010","Ankara","05501234567","mustafaergan@gmail.com");
        Kullanici kullanici4 = new Kullanici(3,"admin","1234",rolKullanici,"Mesut ÜNLÜ","1010101010","Ankara","05501234567","mustafaergan@gmail.com");
        StaticList.kullaniciList.add(kullanici1);
        StaticList.kullaniciList.add(kullanici2);
        StaticList.kullaniciList.add(kullanici3);
        StaticList.kullaniciList.add(kullanici4);
    }
}
