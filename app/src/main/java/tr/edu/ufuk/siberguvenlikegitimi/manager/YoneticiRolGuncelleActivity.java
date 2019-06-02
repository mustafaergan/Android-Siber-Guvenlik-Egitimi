package tr.edu.ufuk.siberguvenlikegitimi.manager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import tr.edu.ufuk.siberguvenlikegitimi.GirisMainActivity;
import tr.edu.ufuk.siberguvenlikegitimi.R;
import tr.edu.ufuk.siberguvenlikegitimi.data.StaticList;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Rol;

/**
 * Created by mustafaergan
 */
public class YoneticiRolGuncelleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_rol_guncelle);

        String dataId = getIntent()
                .getExtras().get("dataId").toString();
        int id = Integer.parseInt(dataId);
        Rol rol = StaticList.rolList.get(id);

        ((EditText)findViewById(R.id.eTYoneticiRolGuncelleAdi)).setText(rol.getRolAdı());
        ((EditText)findViewById(R.id.eTYoneticiRolGuncelleTürü)).setText(rol.getRolTuru());
        ((EditText)findViewById(R.id.eTYoneticiRolGuncellePersonelBirimi)).setText(rol.getPersonelBirimi());
    }

    public void rolGuncelle(View view) {
        String dataId = getIntent()
                .getExtras().get("dataId").toString();
        int id = Integer.parseInt(dataId);
        Rol rol = StaticList.rolList.get(id);

        rol.rolGuncelle(
                ((EditText)findViewById(R.id.eTYoneticiRolGuncelleAdi)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiRolGuncelleTürü)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiRolGuncellePersonelBirimi)).getText().toString()
        );

        Intent intent = new Intent(YoneticiRolGuncelleActivity.this,
                GirisMainActivity.class);
        startActivity(intent);
    }
}
