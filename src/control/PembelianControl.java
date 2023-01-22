
package control;

import java.util.List;
import dao.PembelianDao;
import model.Pembelian;
import table.TablePembelian;

public class PembelianControl {
    private PembelianDao p1Dao = new PembelianDao();
    
    public void insertDataPembelian(Pembelian p1){
        p1Dao.insertPembelian(p1);
    }
    
    public TablePembelian showDataPembelian(String query){
        List<Pembelian> dataPembelian = p1Dao.showPembelian(query);
        TablePembelian tablePembelian = new TablePembelian(dataPembelian);
        
        return tablePembelian;
    }
    
    public void updateDataPembelian(Pembelian p1){
        p1Dao.updatePembelian(p1);
    }
    
    public void deleteDataPembelian(String id){
        p1Dao.deletePembelian(id);
    }
}
