
package dao;
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Obat;

public class ObatDao {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public List<Obat> showObat(){
        con = dbCon.makeConnection();
        String sql = "SELECT *FROM obat";
        System.out.println("Mengambil Data Obat...");
        List<Obat> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null){
                while(rs.next()) {
                    Obat o = new Obat(
                        rs.getString("id"),
                        rs.getString("nama"),
                        rs.getString("tipe_obat"), 
                        rs.getInt("harga")
                    );
                    list.add(o);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Eror reading Data Obat...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;

    }
}
