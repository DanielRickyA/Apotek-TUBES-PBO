
package model;


public class Pembeli {
    private String id;
    private String nama;
    private String umur;
    private String no_telepon;

    public Pembeli(String id, String nama, String umur, String no_telepon) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.no_telepon = no_telepon;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    
    @Override
    public String toString() {
        return nama;
    }
    
    
}
