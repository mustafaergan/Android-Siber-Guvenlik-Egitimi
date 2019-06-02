package tr.edu.ufuk.siberguvenlikegitimi.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import tr.edu.ufuk.siberguvenlikegitimi.GirisMainActivity;
import tr.edu.ufuk.siberguvenlikegitimi.R;
import tr.edu.ufuk.siberguvenlikegitimi.data.StaticList;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Kullanici;
import tr.edu.ufuk.siberguvenlikegitimi.entity.Test;

public class TestActivity extends AppCompatActivity {

    int skor = 0;
    int hangiSoru = 0;

    TextView textViewSoru;
    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;

    List<Test> testSorulari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        textViewSoru = (TextView) findViewById(R.id.testSorulari);
        buttonA = (Button) findViewById(R.id.buttonSoruA);
        buttonB = (Button) findViewById(R.id.buttonSoruB);
        buttonC = (Button) findViewById(R.id.buttonSoruC);
        buttonD = (Button) findViewById(R.id.buttonSoruD);



        String dataId = getIntent()
                .getExtras().get("dataId").toString();
        int id = Integer.parseInt(dataId);
        testSorulari = StaticList.testList.get(id);
        sorusor();
    }

    private void sorusor() {
        textViewSoru.setText(testSorulari.get(hangiSoru).getSoruMetini());
        buttonA.setText(testSorulari.get(hangiSoru).getSiklar().get("A"));
        buttonB.setText(testSorulari.get(hangiSoru).getSiklar().get("B"));
        buttonC.setText(testSorulari.get(hangiSoru).getSiklar().get("C"));
        buttonD.setText(testSorulari.get(hangiSoru).getSiklar().get("D"));
    }

    public void soruDevam(View view) {
        String dogruCevap = testSorulari.get(hangiSoru).getDogruCevap();
        hangiSoru++;
        if (hangiSoru == testSorulari.size()) {
            Intent intent = new Intent(TestActivity.this,
                    TestSonucActivity.class);
            intent.putExtra("data",skor);
            startActivity(intent);

        } else {
            Button button = (Button) view;
            if (button.getId() == R.id.buttonSoruA) {
                if (dogruCevap == "A") {
                    skor++;
                }
            } else if (button.getId() == R.id.buttonSoruB) {
                if (dogruCevap == "B") {
                    skor++;
                }
            } else if (button.getId() == R.id.buttonSoruC) {
                if (dogruCevap == "C") {
                    skor++;
                }
            } else if (button.getId() == R.id.buttonSoruD) {
                if (dogruCevap == "D") {
                    skor++;
                }
            }
            sorusor();
        }
    }
}
