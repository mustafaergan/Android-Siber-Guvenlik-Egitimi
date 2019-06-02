package tr.edu.ufuk.siberguvenlikegitimi.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import tr.edu.ufuk.siberguvenlikegitimi.R;

public class TestSonucActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_sonuc);

        String dataId = getIntent()
                .getExtras().get("data").toString();
        int skor = Integer.parseInt(dataId);
        TextView textView = (TextView) findViewById(R.id.testSonucText);

        if (skor > 1) {
            textView.setText("Başarlı");
        } else {
            textView.setText("Başarısız");
        }
    }
}
