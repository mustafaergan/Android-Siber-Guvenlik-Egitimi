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
import tr.edu.ufuk.siberguvenlikegitimi.genericList.GirisGenericList;


/**
 * Created by mustafaergan
 */
public class YoneticiActivity extends AppCompatActivity {

    final List<ImageGenericList> imageGenericListList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici);

        imageGenericListList.add(new ImageGenericList("Rol Yönetimi", 0));
        imageGenericListList.add(new ImageGenericList("Kullanıcı Yönetimi", 1));

        ListView listView = (ListView) findViewById(R.id.yoneticiListView);

        GirisGenericList benimAdaptor = new GirisGenericList(YoneticiActivity.this, imageGenericListList);

        listView.setAdapter(benimAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(YoneticiActivity.this,
                        imageGenericListList.get(position).getName(),
                        Toast.LENGTH_SHORT).show();
                    if (position == 0) {
                        Intent intent = new Intent(YoneticiActivity.this,
                                YoneticiRolActivity.class);
                        startActivity(intent);
                    } else if (position == 1) {
                        Intent intent = new Intent(YoneticiActivity.this,
                                YoneticiKullaniciActivity.class);
                        startActivity(intent);
                    }
            }
        });
    }
}
