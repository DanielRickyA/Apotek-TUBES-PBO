
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cek_tensi;

public class TableCekTensi extends AbstractTableModel{
    private List<Cek_tensi> list;
    
    public TableCekTensi(List<Cek_tensi> list){
        this.list=list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 4;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNo_antrian();
            case 1:
                return list.get(rowIndex).getPembeli().getNama();
            case 2:
                return list.get(rowIndex).getDokter().getNama();
            case 3:
                return list.get(rowIndex).getHasil();
            case 4:
                return list.get(rowIndex).getId();
            case 5:
                return list.get(rowIndex).getDokter().getId();
            case 6:
                return list.get(rowIndex).getPembeli().getId();
            default:
                return null;
        }
    }
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "No Antrian";
            case 1:
                return "Nama Pasien";
            case 2:
                return "Dokter";
            case 3:
                return "Hasil";
            default:
                return null;
        }
    }
}
