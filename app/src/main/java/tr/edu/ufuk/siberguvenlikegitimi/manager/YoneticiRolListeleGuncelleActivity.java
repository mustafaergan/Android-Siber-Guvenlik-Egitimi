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
import tr.edu.ufuk.siberguvenlikegitimi.genericList.RolGenericList;

public class YoneticiRolListeleGuncelleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_rol_listele_guncelle);

        ListView listView = (ListView) findViewById(R.id.yoneticiRolListeleGuncelleListView);

        RolGenericList benimAdaptor = new RolGenericList(YoneticiRolListeleGuncelleActivity.this, StaticList.rolList);

        listView.setAdapter(benimAdaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(YoneticiRolListeleGuncelleActivity.this,
                        StaticList.rolList.get(position).getRolAdı(),
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(YoneticiRolListeleGuncelleActivity.this,
                        YoneticiRolGuncelleActivity.class);
                intent.putExtra("dataId",StaticList.rolList.get(position).getId());
                startActivity(intent);
            }
        });
    }
}
