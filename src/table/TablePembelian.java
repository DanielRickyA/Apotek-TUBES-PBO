
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pembelian;

public class TablePembelian extends AbstractTableModel{
    private List<Pembelian> list;
    
    public TablePembelian(List<Pembelian> list){
        this.list=list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 8;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getObat().getNama();
            case 1:
                return list.get(rowIndex).getObat().getTipe_obat();
            case 2:
                return list.get(rowIndex).getPembeli().getNama();
            case 3:
                return list.get(rowIndex).getTanggal_pembelian();
            case 4:
                return list.get(rowIndex).getJumlah();
            case 5:
                return list.get(rowIndex).getObat().getHarga();
            case 6:
                return list.get(rowIndex).getTotal_harga();
            case 7:
                return list.get(rowIndex).getCatatan();
            case 8:
                return list.get(rowIndex).getId();
            case 9:
                return list.get(rowIndex).getObat().getId();
            case 10:
                return list.get(rowIndex).getPembeli().getId();
            default:
                return null;
        }
    }
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nama Obat";
            case 1:
                return "Tipe Obat";
            case 2:
                return "Pembeli";
            case 3:
                return "Tanggal Pembelian";
            case 4:
                return "Jumlah";
            case 5:
                return "Harga";
            case 6:
                return "Total Harga";
            case 7:
                return "Catatan";
            default:
                return null;
        }
    } 
}
