
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Dokter;

public class DokterDao {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public List<Dokter> showDokter(){
        con = dbCon.makeConnection();
        String sql = "SELECT *FROM dokter";
        System.out.println("Mengambil Data Dokter...");
        List<Dokter> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()) {
                    Dokter d = new Dokter(
                        rs.getString("id"),
                        rs.getString("nama"),
                        rs.getString("no_telepon")
                    );
                    list.add(d);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Eror reading Data Dokter...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;

    }
}
