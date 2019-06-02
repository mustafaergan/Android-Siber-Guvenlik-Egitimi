package tr.edu.ufuk.siberguvenlikegitimi.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by mustafa_2 on 2.6.2019.
 */

public class Test {
    private int id;
    private String soruMetini;
    private Map<String,String> siklar;
    private String dogruCevap;

    public Test(int id, String soruMetini, Map<String, String> siklar, String dogruCevap) {
        this.id = id;
        this.soruMetini = soruMetini;
        this.siklar = siklar;
        this.dogruCevap = dogruCevap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoruMetini() {
        return soruMetini;
    }

    public void setSoruMetini(String soruMetini) {
        this.soruMetini = soruMetini;
    }

    public Map<String, String> getSiklar() {
        return siklar;
    }

    public void setSiklar(Map<String, String> siklar) {
        this.siklar = siklar;
    }

    public String getDogruCevap() {
        return dogruCevap;
    }

    public void setDogruCevap(String dogruCevap) {
        this.dogruCevap = dogruCevap;
    }
}
