
package model;

public class Dokter {
    private String id;
    private String nama;
    private String no_telepon;

    public Dokter(String id, String nama, String no_telepon){
        this.id=id;
        this.nama=nama;
        this.no_telepon=no_telepon;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

        
        
        @Override
        public String toString() {
            return nama;
        }
}
