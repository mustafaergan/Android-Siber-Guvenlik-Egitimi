package tr.edu.ufuk.siberguvenlikegitimi.education;

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
import tr.edu.ufuk.siberguvenlikegitimi.genericList.EgitimGenericList;
import tr.edu.ufuk.siberguvenlikegitimi.genericList.GirisGenericList;

public class EgitimListesiActivity extends AppCompatActivity {

    final List<ImageGenericList> imageGenericListList =new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egitim_listesi);

        imageGenericListList.add(new ImageGenericList("Siber Güvenlik Eğitimi Giriş", 0));
        imageGenericListList.add(new ImageGenericList("Siber Güvenlik Eğitimi Yönetmelik", 1));

        ListView listView = (ListView) findViewById(R.id.egitimListView);

        EgitimGenericList benimAdaptor = new EgitimGenericList(EgitimListesiActivity.this, imageGenericListList);

        listView.setAdapter(benimAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(EgitimListesiActivity.this,
                        imageGenericListList.get(position).getName(),
                        Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    Intent intent = new Intent(EgitimListesiActivity.this,
                            EgitimVideoActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(EgitimListesiActivity.this,
                            EgitimDokumanActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
