package tr.edu.ufuk.siberguvenlikegitimi.test;

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
import tr.edu.ufuk.siberguvenlikegitimi.education.EgitimDokumanActivity;
import tr.edu.ufuk.siberguvenlikegitimi.education.EgitimListesiActivity;
import tr.edu.ufuk.siberguvenlikegitimi.education.EgitimVideoActivity;
import tr.edu.ufuk.siberguvenlikegitimi.entity.ImageGenericList;
import tr.edu.ufuk.siberguvenlikegitimi.genericList.EgitimGenericList;
import tr.edu.ufuk.siberguvenlikegitimi.genericList.TestGenericList;

public class TestListesiActivity extends AppCompatActivity {

    final List<ImageGenericList> imageGenericListList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_listesi);

        imageGenericListList.add(new ImageGenericList("Giriş Testi", 0));
        imageGenericListList.add(new ImageGenericList("Yönetmelik Testi", 1));

        ListView listView = (ListView) findViewById(R.id.egitimListView);

        TestGenericList benimAdaptor = new TestGenericList(TestListesiActivity.this, imageGenericListList);

        listView.setAdapter(benimAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TestListesiActivity.this,
                        imageGenericListList.get(position).getName(),
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TestListesiActivity.this,
                        TestActivity.class);
                if (position == 0) {
                    intent.putExtra("dataId",0);
                    startActivity(intent);
                } else if (position == 1) {
                    intent.putExtra("dataId",1);
                    startActivity(intent);
                }
            }
        });
    }
}
