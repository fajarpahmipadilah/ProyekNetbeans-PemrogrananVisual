/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_DetBarangKeluar;
/**
 *
 * @author Kulub Cau
 */
public class TableMod_DetBarangKeluar extends AbstractTableModel {

    private List<Model_DetBarangKeluar> list = new ArrayList<>();

    public void tambahData(Model_DetBarangKeluar mod_detkeluar){
        list.add(mod_detkeluar);
        fireTableRowsInserted(list.size()-1,list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    public void perbaruiData(int row, Model_DetBarangKeluar mod_detkeluar){
        list.add(row, mod_detkeluar);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
    }
    
    public void hapusData(int index){
        list.remove(index);
        fireTableRowsDeleted(index,index);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    public void setData(List<Model_DetBarangKeluar> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_DetBarangKeluar mod_detkeluar){
        list.set(index,mod_detkeluar);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_DetBarangKeluar getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return list.get(rowIndex).getMod_keluar().getNo_keluar();
            case 1: return list.get(rowIndex).getMod_barang().getKode_barang();
            case 2: return list.get(rowIndex).getMod_barang().getNama_barang();
            case 3: return list.get(rowIndex).getMod_barang().getHarga();
            case 4: return list.get(rowIndex).getJml_keluar();
            case 5: return list.get(rowIndex).getSubtotal_keluar();
            
              
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "No Keluar";
            case 1: return "Kode Barang";
            case 2: return "Nama Barang";
            case 3: return "Harga";
            case 4: return "Jumlah Masuk";
            case 5: return "Subtotal";
            
           
                        
            default: return null;
        }
    }
    
}
