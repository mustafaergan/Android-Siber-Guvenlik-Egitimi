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
import tr.edu.ufuk.siberguvenlikegitimi.genericList.YoneticiRolGenericList;
/**
 * Created by mustafaergan
 */
public class YoneticiRolActivity extends AppCompatActivity {

    final List<ImageGenericList> imageGenericListList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_rol);
        imageGenericListList.add(new ImageGenericList("Rol Ekle", 0));
        imageGenericListList.add(new ImageGenericList("Rol Güncelle", 1));
        imageGenericListList.add(new ImageGenericList("Rol Sil", 2));
        ListView listView = (ListView) findViewById(R.id.yoneticiRolListView);
        YoneticiRolGenericList benimAdaptor = new YoneticiRolGenericList(YoneticiRolActivity.this, imageGenericListList);
        listView.setAdapter(benimAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(YoneticiRolActivity.this,
                        imageGenericListList.get(position).getName(),
                        Toast.LENGTH_SHORT).show();

                    if (0 == position) {
                        Intent intent = new Intent(YoneticiRolActivity.this,
                                YoneticiRolEkleActivity.class);
                        startActivity(intent);
                    } else if (1 == position) {
                        Intent intent = new Intent(YoneticiRolActivity.this,
                                YoneticiRolListeleGuncelleActivity.class);
                        startActivity(intent);
                    } else if (2 == position) {
                        Intent intent = new Intent(YoneticiRolActivity.this,
                                YoneticiRolListeleSilActivity.class);
                        startActivity(intent);
                    }

            }
        });
    }
}
