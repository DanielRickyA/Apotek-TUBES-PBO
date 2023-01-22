
package model;

public class Obat {
    private String id;
    private String nama;
    private String tipe_obat;
    private int harga;

    public Obat(String id, String nama, String tipe_obat, int harga) {
        this.id = id;
        this.nama = nama;
        this.tipe_obat = tipe_obat;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getTipe_obat() {
        return tipe_obat;
    }

    public int getHarga() {
        return harga;
    }

    

    @Override
    public String toString() {
        return nama;
    }
    
    
}
