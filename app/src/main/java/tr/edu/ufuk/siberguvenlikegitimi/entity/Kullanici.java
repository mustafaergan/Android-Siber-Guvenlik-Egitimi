package tr.edu.ufuk.siberguvenlikegitimi.entity;

/**
 * Created by mustafaergan
 */

public class Kullanici {
    int id;
    String kullaniciAdi;
    String sifre;
    Rol rol;
    String isimSoyad;
    String TC;
    String adres;
    String telefon;
    String ePosta;

    public Kullanici(int id, String kullaniciAdi, String sifre, Rol rol, String isimSoyad, String TC, String adres, String telefon, String ePosta) {
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.rol = rol;
        this.isimSoyad = isimSoyad;
        this.TC = TC;
        this.adres = adres;
        this.telefon = telefon;
        this.ePosta = ePosta;
    }


    public void KullaniciGuncelle(String kullaniciAdi, String sifre, Rol rol, String isimSoyad, String TC, String adres, String telefon, String ePosta) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.rol = rol;
        this.isimSoyad = isimSoyad;
        this.TC = TC;
        this.adres = adres;
        this.telefon = telefon;
        this.ePosta = ePosta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getIsimSoyad() {
        return isimSoyad;
    }

    public void setIsimSoyad(String isimSoyad) {
        this.isimSoyad = isimSoyad;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }
}
