
package control;

import java.util.List;
import dao.CekTensiDao;
import model.Cek_tensi;
import table.TableCekTensi;

public class CekTensiControl {
    private CekTensiDao cDao = new CekTensiDao();
    
    public void insertDataCekTensi(Cek_tensi c){
        cDao.insertCekTensi(c);
    }
    
    public TableCekTensi showDataCektensi(String query){
        List<Cek_tensi> dataCekTensi = cDao.showCekTensi(query);
        TableCekTensi tableCekTensi = new TableCekTensi(dataCekTensi);
        
        return tableCekTensi;
    }
    
    public void updateDataCekTensi(Cek_tensi ct){
        cDao.updateCekTensi(ct);
    }
    
    public void deleteDataCekTensi(String id){
        cDao.deleteCekTensi(id);
    }
}
