
package model;

public class Cek_tensi {
    private String id;
    private int no_antrian;
    private String hasil;
    private Dokter dokter;
    private Pembeli pembeli;

    public Cek_tensi(String id, int no_antrian, String hasil, Dokter dokter, Pembeli pembeli) {
        this.id = id;
        this.no_antrian = no_antrian;
        this.hasil = hasil;
        this.dokter = dokter;
        this.pembeli = pembeli;
    }

    public String getId() {
        return id;
    }

    public int getNo_antrian() {
        return no_antrian;
    }

    public String getHasil() {
        return hasil;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }


    
    
}
