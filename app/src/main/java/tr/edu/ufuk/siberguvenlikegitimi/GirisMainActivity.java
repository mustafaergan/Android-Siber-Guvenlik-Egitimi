package tr.edu.ufuk.siberguvenlikegitimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import tr.edu.ufuk.siberguvenlikegitimi.education.EgitimListesiActivity;
import tr.edu.ufuk.siberguvenlikegitimi.entity.ImageGenericList;
import tr.edu.ufuk.siberguvenlikegitimi.genericList.GirisGenericList;
import tr.edu.ufuk.siberguvenlikegitimi.manager.YoneticiActivity;
import tr.edu.ufuk.siberguvenlikegitimi.test.TestListesiActivity;

/**
 * Created by mustafaergan
 */
public class GirisMainActivity extends AppCompatActivity {

    final List<ImageGenericList> imageGenericListList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_main);
        imageGenericListList.add(new ImageGenericList("Yönetici", 0));
        imageGenericListList.add(new ImageGenericList("Eğitimler", 1));
        imageGenericListList.add(new ImageGenericList("Testler", 2));

        ListView listView = (ListView) findViewById(R.id.girisListView);

        GirisGenericList benimAdaptor = new GirisGenericList(GirisMainActivity.this, imageGenericListList);

        listView.setAdapter(benimAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GirisMainActivity.this,
                        imageGenericListList.get(position).getName(),
                        Toast.LENGTH_SHORT).show();
                    if (0 == position) {
                        Intent intent = new Intent(GirisMainActivity.this,
                                YoneticiActivity.class);
                        startActivity(intent);
                    } else if (1 == position) {
                        Intent intent = new Intent(GirisMainActivity.this,
                                EgitimListesiActivity.class);
                        startActivity(intent);
                    } else if (2 == position) {
                        Intent intent = new Intent(GirisMainActivity.this,
                                TestListesiActivity.class);
                        startActivity(intent);
                    }
            }
        });
    }
}
