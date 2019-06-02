package tr.edu.ufuk.siberguvenlikegitimi.manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import tr.edu.ufuk.siberguvenlikegitimi.R;
import tr.edu.ufuk.siberguvenlikegitimi.entity.ImageGenericList;
import tr.edu.ufuk.siberguvenlikegitimi.genericList.YoneticiKullaniciGenericList;
/**
 * Created by mustafaergan
 */
public class YoneticiKullaniciActivity extends AppCompatActivity {

    final List<ImageGenericList> imageGenericListList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_kullanici);

        imageGenericListList.add(new ImageGenericList("Kullanıcı Ekle", 0));
        imageGenericListList.add(new ImageGenericList("Kullanıcı Güncelle", 1));
        imageGenericListList.add(new ImageGenericList("Kullanıcı Sil", 2));

        ListView listView = (ListView) findViewById(R.id.yoneticiKullaniciListView);

        YoneticiKullaniciGenericList benimAdaptor = new YoneticiKullaniciGenericList(YoneticiKullaniciActivity.this, imageGenericListList);

        listView.setAdapter(benimAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(YoneticiKullaniciActivity.this,
                        imageGenericListList.get(position).getName(),
                        Toast.LENGTH_SHORT).show();
                    if (0 == position) {
                        Intent intent = new Intent(YoneticiKullaniciActivity.this,
                                YoneticiKullaniciEkleActivity.class);
                        startActivity(intent);
                    } else if (1 == position) {
                        Intent intent = new Intent(YoneticiKullaniciActivity.this,
                                YoneticiKullaniciListeleGuncelleActivity.class);
                        startActivity(intent);
                    } else if (2 == position) {
                        Intent intent = new Intent(YoneticiKullaniciActivity.this,
                                YoneticiKullaniciListeleSilActivity.class);
                        startActivity(intent);
                    }

            }
        });
    }
}
