package tr.edu.ufuk.siberguvenlikegitimi.manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import tr.edu.ufuk.siberguvenlikegitimi.GirisMainActivity;
import tr.edu.ufuk.siberguvenlikegitimi.R;
import tr.edu.ufuk.siberguvenlikegitimi.data.StaticList;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Kullanici;
import tr.edu.ufuk.siberguvenlikegitimi.util.ListUtil;

/**
 * Created by mustafaergan
 */
public class YoneticiKullaniciGuncelleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_kullanici_guncelle);

        String dataId = getIntent()
                .getExtras().get("dataId").toString();
        int id = Integer.parseInt(dataId);
        Kullanici kullanici = StaticList.kullaniciList.get(id);

        ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleAdi)).setText(kullanici.getKullaniciAdi());
        ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleSifre)).setText(kullanici.getSifre());
        ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleRol)).setText(kullanici.getRol().getRolAdı());
        ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleIsimSoyad)).setText(kullanici.getIsimSoyad());
        ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleTC)).setText(kullanici.getTC());
        ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleAdres)).setText(kullanici.getAdres());
        ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleTelefon)).setText(kullanici.getTelefon());
        ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleEPosta)).setText(kullanici.getePosta());
    }

    public void KullaniciGuncelle(View view) {
        String dataId = getIntent()
                .getExtras().get("dataId").toString();
        int id = Integer.parseInt(dataId);
        Kullanici kullanici = StaticList.kullaniciList.get(id);
        kullanici.KullaniciGuncelle(
                ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleAdi)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleSifre)).getText().toString(),
                ListUtil.rolBul(((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleRol)).getText().toString()), // Bul yap
                ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleIsimSoyad)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleTC)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleAdres)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleTelefon)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiKullaniciGuncelleEPosta)).getText().toString()
        );
        Intent intent = new Intent(YoneticiKullaniciGuncelleActivity.this,
                GirisMainActivity.class);
        startActivity(intent);
    }
}
