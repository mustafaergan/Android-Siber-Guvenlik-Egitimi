package tr.edu.ufuk.siberguvenlikegitimi.entity;

/**
 * Created by mustafaergan
 */

public class Rol {
    int id;
    String rolAdı;
    String rolTuru;
    String personelBirimi;

    public Rol(int id, String rolAdı, String rolTuru, String personelBirimi) {
        this.id = id;
        this.rolAdı = rolAdı;
        this.rolTuru = rolTuru;
        this.personelBirimi = personelBirimi;
    }

    public void rolGuncelle(String rolAdı, String rolTuru, String personelBirimi) {
        this.rolAdı = rolAdı;
        this.rolTuru = rolTuru;
        this.personelBirimi = personelBirimi;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getRolAdı() {
        return rolAdı;
    }

    public void setRolAdı(String rolAdı) {
        this.rolAdı = rolAdı;
    }

    public String getRolTuru() {
        return rolTuru;
    }

    public void setRolTuru(String rolTuru) {
        this.rolTuru = rolTuru;
    }

    public String getPersonelBirimi() {
        return personelBirimi;
    }

    public void setPersonelBirimi(String personelBirimi) {
        this.personelBirimi = personelBirimi;
    }
}
