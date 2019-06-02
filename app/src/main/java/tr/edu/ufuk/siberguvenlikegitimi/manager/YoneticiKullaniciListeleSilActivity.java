package tr.edu.ufuk.siberguvenlikegitimi.manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import tr.edu.ufuk.siberguvenlikegitimi.GirisMainActivity;
import tr.edu.ufuk.siberguvenlikegitimi.R;
import tr.edu.ufuk.siberguvenlikegitimi.data.StaticList;
import tr.edu.ufuk.siberguvenlikegitimi.genericList.KullaniciGenericList;
import tr.edu.ufuk.siberguvenlikegitimi.util.ListUtil;

public class YoneticiKullaniciListeleSilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_kullanici_listele_sil);

        ListView listView = (ListView) findViewById(R.id.yoneticiKullaniciListeleSilListView);

        KullaniciGenericList benimAdaptor = new KullaniciGenericList(YoneticiKullaniciListeleSilActivity.this, StaticList.kullaniciList);

        listView.setAdapter(benimAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(YoneticiKullaniciListeleSilActivity.this,
                        StaticList.kullaniciList.get(position).getIsimSoyad() + " Silindi",
                        Toast.LENGTH_SHORT).show();
                ListUtil.remove(StaticList.kullaniciList,position);
                Intent intent = new Intent(YoneticiKullaniciListeleSilActivity.this,
                        GirisMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
