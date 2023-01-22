
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Dokter;
import model.Pembeli;
import model.Cek_tensi;

public class CekTensiDao {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertCekTensi(Cek_tensi c){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO cek_tensi(id, id_pembeli, id_dokter, no_antrian, hasil) VALUES ('"
                + c.getId() + "','"
                + c.getPembeli().getId() + "','"
                + c.getDokter().getId() + "','"
                + c.getNo_antrian() + "','"
                + c.getHasil() + "')" ;
        
        System.out.println("Adding Cek Tensi...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Cek Tensi");
            statement.close();
        }catch (Exception e){
            System.out.println("Error adding Cek Tensi...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateCekTensi(Cek_tensi c){
        
        con = dbCon.makeConnection();
        
        String sql = "UPDATE cek_tensi SET id_dokter = '" + c.getDokter().getId()
                + "', id_pembeli = '" + c.getPembeli().getId()
                + "', no_antrian = '"+ c.getNo_antrian()
                + "', hasil = '" + c.getHasil()
                + "' WHERE id = '" + c.getId() + "'";

        System.out.println("Editing Cek Tensi...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Cek Tensi " + c.getId());
            statement.close();
        }catch (Exception e){
            System.out.println("Error editing Cek Tensi...");
            System.out.println(e);
        }
        dbCon.closeConnection();
       
    }
    public void deleteCekTensi(String id){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM cek_tensi WHERE id = '" + id + "' ";
        System.out.println("Deleting Cek Tensi...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Cek Tensi " + id);
            statement.close();
        }catch (Exception e){
            System.out.println("Error deleting Cek Tensi ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }

    public List<Cek_tensi> showCekTensi(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT c.*, p.*, d.* FROM cek_tensi as c JOIN dokter as d ON c.id_dokter = d.id JOIN pembeli as p ON c.id_pembeli = p.id WHERE ("
                + "c.no_antrian LIKE '%" + query + "%'"
                + "OR p.nama LIKE '%" + query + "%'"
                + "OR d.nama LIKE '%" + query + "%'"
                + "OR c.hasil LIKE '%" + query + "%')"
                + "ORDER BY c.id";

        System.out.println("Mengambil Cek Tensi ...");
        List<Cek_tensi> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Dokter d = new Dokter(
                            rs.getString("d.id"),
                            rs.getString("d.nama"),
                            rs.getString("d.no_telepon")
                    );
                    
                    Pembeli p = new Pembeli(
                            rs.getString("p.id"),
                            rs.getString("p.nama"),
                            rs.getString("p.umur"), 
                            rs.getString("p.no_telepon")
                    );
                    Cek_tensi c = new Cek_tensi(
                            rs.getString("c.id"),
                            rs.getInt("c.no_antrian"),
                            rs.getString("c.hasil"),
                            d,
                            p
                    );
                    list.add(c);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading Cek Tensi...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }
}
