
package model;


public class Pembelian {
    private String id;
    private String tanggal_pembelian;
    private String catatan;
    private int jumlah;
    private int total_harga;
    private Obat obat;
    private Pembeli pembeli;

    public Pembelian(String id, String tanggal_pembelian, String catatan, int jumlah, int total_harga, Obat obat, Pembeli pembeli) {
        this.id = id;
        this.tanggal_pembelian = tanggal_pembelian;
        this.catatan = catatan;
        this.jumlah = jumlah;
        this.total_harga = total_harga;
        this.obat = obat;
        this.pembeli = pembeli;
    }

    public String getId() {
        return id;
    }

    public String getTanggal_pembelian() {
        return tanggal_pembelian;
    }

    public String getCatatan() {
        return catatan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public Obat getObat() {
        return obat;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public int getTotal_harga() {
        return obat.getHarga() * getJumlah();
    }

}
