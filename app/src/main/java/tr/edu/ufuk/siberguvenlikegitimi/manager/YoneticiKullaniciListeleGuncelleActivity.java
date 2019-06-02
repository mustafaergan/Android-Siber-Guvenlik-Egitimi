package tr.edu.ufuk.siberguvenlikegitimi.manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import tr.edu.ufuk.siberguvenlikegitimi.R;
import tr.edu.ufuk.siberguvenlikegitimi.data.StaticList;
import tr.edu.ufuk.siberguvenlikegitimi.genericList.KullaniciGenericList;

public class YoneticiKullaniciListeleGuncelleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_kullanici_listele_guncelle);

        ListView listView = (ListView) findViewById(R.id.yoneticiKullaniciListeleGuncelleListView);

        KullaniciGenericList benimAdaptor = new KullaniciGenericList(YoneticiKullaniciListeleGuncelleActivity.this, StaticList.kullaniciList);

        listView.setAdapter(benimAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(YoneticiKullaniciListeleGuncelleActivity.this,
                        StaticList.kullaniciList.get(position).getIsimSoyad(),
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(YoneticiKullaniciListeleGuncelleActivity.this,
                        YoneticiKullaniciGuncelleActivity.class);
                intent.putExtra("dataId",StaticList.kullaniciList.get(position).getId());
                startActivity(intent);
            }
        });
    }
}
