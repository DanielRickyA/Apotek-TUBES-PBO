
package dao;



import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Pembeli;

public class PembeliDao {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public List<Pembeli> showPembeli(){
        con = dbCon.makeConnection();
        String sql = "SELECT *FROM Pembeli";
        System.out.println("Mengambil Data Pembeli...");
        List<Pembeli> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()) {
                    Pembeli p2 = new Pembeli(
                        rs.getString("id"),
                        rs.getString("nama"),
                        rs.getString("umur"), 
                        rs.getString("no_telepon")
                    );
                    list.add(p2);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Eror reading Data Pembeli...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;

    }
}
