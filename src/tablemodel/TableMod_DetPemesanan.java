/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_DetPemesanan;

/**
 *
 * @author Kulub Cau
 */
public class TableMod_DetPemesanan extends AbstractTableModel{
    private List<Model_DetPemesanan> list = new ArrayList<>();

    public void tambahData(Model_DetPemesanan mod_detpesan){
        list.add(mod_detpesan);
        fireTableRowsInserted(list.size()-1,list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    public void perbaruiData(int row, Model_DetPemesanan mod_detpesan){
        list.add(row, mod_detpesan);
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
    public void setData(List<Model_DetPemesanan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_DetPemesanan mod_detpesan){
        list.set(index,mod_detpesan);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_DetPemesanan getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return list.get(rowIndex).getMod_pesan().getNo_pesan();
            case 1: return list.get(rowIndex).getMod_barang().getKode_barang();
            case 2: return list.get(rowIndex).getMod_barang().getNama_barang();
            case 3: return list.get(rowIndex).getMod_barang().getHarga();
            case 4: return list.get(rowIndex).getJml_pesan();
            case 5: return list.get(rowIndex).getSubtotal_pesan();
            case 6: return list.get(rowIndex).getStatus();
            
            
              
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "No Pesan";
            case 1: return "Kode Barang";
            case 2: return "Nama Barang";
            case 3: return "Harga";
            case 4: return "Jumlah Pesan";
            case 5: return "Subtotal";
            case 6: return "Status";
           
                        
            default: return null;
        }
    } 
}
