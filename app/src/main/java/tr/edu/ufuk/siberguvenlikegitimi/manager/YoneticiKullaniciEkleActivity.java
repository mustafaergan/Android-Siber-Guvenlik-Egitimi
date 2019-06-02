package tr.edu.ufuk.siberguvenlikegitimi.manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import tr.edu.ufuk.siberguvenlikegitimi.R;
import tr.edu.ufuk.siberguvenlikegitimi.data.StaticList;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Kullanici;
import tr.edu.ufuk.siberguvenlikegitimi.util.ListUtil;

/**
 * Created by mustafaergan
 */
public class YoneticiKullaniciEkleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_kullanici_ekle);
    }

    public void KullaniciEkle(View view) {
        StaticList.kullaniciList.add(new Kullanici(StaticList.kullaniciList.size(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciAdi)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciSifre)).getText().toString(),
                ListUtil.rolBul(((EditText)findViewById(R.id.eTYoneticiKullaniciRol)).getText().toString()), // Bul yap
                ((EditText)findViewById(R.id.eTYoneticiKullaniciIsimSoyad)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciTC)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciAdres)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciTelefon)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciEPosta)).getText().toString()
        ));
        Intent intent = new Intent(YoneticiKullaniciEkleActivity.this,
                YoneticiKullaniciListeleGuncelleActivity.class);
        startActivity(intent);
    }
}
