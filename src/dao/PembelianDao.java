
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Obat;
import model.Pembeli;
import model.Pembelian;

public class PembelianDao {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPembelian(Pembelian p1){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO pembelian(id,id_obat, id_pembeli, tanggal_pembelian, catatan, jumlah, total_harga) VALUES ('"
                + p1.getId() + "','"
                + p1.getObat().getId() + "','"
                + p1.getPembeli().getId() + "','"
                + p1.getTanggal_pembelian() + "','"
                + p1.getCatatan() + "','"
                + p1.getJumlah()+ "','"
                + p1.getTotal_harga()+ "')" ;
        
        System.out.println("Adding Pembelian...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Pembelian");
            statement.close();
        }catch (Exception e){
            System.out.println("Error adding Pembelian...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }

    public void updatePembelian(Pembelian p1){
        
        con = dbCon.makeConnection();
        
        String sql = "UPDATE pembelian SET id_obat = '" + p1.getObat().getId()
                + "', id_pembeli = '" + p1.getPembeli().getId()
                + "', tanggal_pembelian = '"+ p1.getTanggal_pembelian()
                + "', catatan = '" + p1.getCatatan()
                + "', jumlah = '" + p1.getJumlah()
                + "' WHERE id = '" + p1.getId() + "'";

        System.out.println("Editing Pembelian...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Pembelian " + p1.getId());
            statement.close();
        }catch (Exception e){
            System.out.println("Error editing Pembelian...");
            System.out.println(e);
        }
        dbCon.closeConnection();
       
    }

    public void deletePembelian(String id){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM pembelian WHERE id = '" + id + "' ";
        System.out.println("Deleting pembelian...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Pembelian " + id);
            statement.close();
        }catch (Exception e){
            System.out.println("Error deleting Pembelian ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }

    public List<Pembelian> showPembelian(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT p1.*, p2.*, o.* FROM pembelian as p1 JOIN obat as o ON p1.id_obat = o.id JOIN pembeli as p2 ON p1.id_pembeli = p2.id WHERE ("
                + "o.nama LIKE" + "'%" + query + "%'"
                + "OR o.tipe_obat LIKE '%" + query + "%'"
                + "OR p2.nama LIKE '%" + query + "%'"
                + "OR p1.tanggal_pembelian LIKE '%" + query + "%'"
                + "OR p1.jumlah LIKE '%" + query + "%'"
                + "OR o.harga LIKE '%" + query + "%'"
                + "OR p1.total_harga LIKE '%" + query + "%'"
                + "OR p1.catatan LIKE '%" + query + "%')"
                + "ORDER BY p1.id";

        System.out.println("Mengambil data Pembelian ...");
        List<Pembelian> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Obat o = new Obat(
                            rs.getString("o.id"),
                            rs.getString("o.nama"),
                            rs.getString("o.tipe_obat"),
                            rs.getInt("o.harga")
                    );
                    Pembeli p2 = new Pembeli(
                            rs.getString("p2.id"),
                            rs.getString("p2.nama"),
                            rs.getString("p2.umur"), 
                            rs.getString("p2.no_telepon")
                    );
                    Pembelian p1 = new Pembelian(
                            rs.getString("p1.id"),
                            rs.getString("p1.tanggal_pembelian"),
                            rs.getString("p1.catatan"),
                            rs.getInt("p1.jumlah"),
                            rs.getInt("p1.total_harga"),
                            o,
                            p2
                    );
                    list.add(p1);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }
}
