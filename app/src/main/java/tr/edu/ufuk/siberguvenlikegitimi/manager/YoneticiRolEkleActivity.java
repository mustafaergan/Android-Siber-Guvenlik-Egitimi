package tr.edu.ufuk.siberguvenlikegitimi.manager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import tr.edu.ufuk.siberguvenlikegitimi.R;
import tr.edu.ufuk.siberguvenlikegitimi.data.StaticList;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Rol;

/**
 * Created by mustafaergan
 */
public class YoneticiRolEkleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetici_rol_ekle);
    }

    public void rolEkle(View view) {
        StaticList.rolList.add(new Rol(StaticList.rolList.size(),
                ((EditText)findViewById(R.id.eTYoneticiRolAdi)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiRolTürü)).getText().toString(),
                ((EditText)findViewById(R.id.eTYoneticiRolPersonelBirimi)).getText().toString()
        ));
        Intent intent = new Intent(YoneticiRolEkleActivity.this,
                YoneticiRolListeleGuncelleActivity.class);
        startActivity(intent);
    }
}
