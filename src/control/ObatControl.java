
package control;
import model.Obat;
import dao.ObatDao;
import java.util.List;

public class ObatControl {
    private ObatDao oDao = new ObatDao();
    
    // public String showDataObat() {
    //     List<Obat> dataObat = oDao.showAllBuku();
    //     String bukuString = "";
    //     for (int i=0; i<dataBuku.size(); i++){
    //         bukuString = bukuString + dataBuku.get(i).showDataBuku() + "\n";
    //     }
    //     return bukuString;
    // }
    
    public List<Obat> showListObat() {
        List<Obat> obat = oDao.showObat();
        return obat;
    }
}
