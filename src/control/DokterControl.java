
package control;
import java.util.List;
import dao.DokterDao;
import model.Dokter;

public class DokterControl {
    private DokterDao doDao = new DokterDao();
    
    public List<Dokter> showListDokter() {
        List<Dokter> dokter = doDao.showDokter();
        return dokter;
    }
}
