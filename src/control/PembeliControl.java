
package control;
import java.util.List;
import dao.PembeliDao;
import model.Pembeli;

public class PembeliControl {
 private PembeliDao p2Dao = new PembeliDao();
    
    public List<Pembeli> showListPembeli(){
        List<Pembeli> pembeli = p2Dao.showPembeli();
        return pembeli;
    }
}
