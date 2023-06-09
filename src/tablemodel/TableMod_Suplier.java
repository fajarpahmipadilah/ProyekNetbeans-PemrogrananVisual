/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_Suplier;

/**
 *
 * @author Kulub Cau
 */
public class TableMod_Suplier extends AbstractTableModel{
     private List<Model_Suplier> list = new ArrayList<>();

    public void tambahData(Model_Suplier mod_suplier){
        list.add(mod_suplier);
        fireTableRowsInserted(list.size()-1,list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    public void perbaruiData(int row, Model_Suplier mod_suplier){
        list.add(row, mod_suplier);
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
    public void setData(List<Model_Suplier> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, Model_Suplier mod_suplier){
        list.set(index,mod_suplier);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_Suplier getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return list.get(rowIndex).getId_suplier();
            case 1: return list.get(rowIndex).getNama_suplier();
            case 2: return list.get(rowIndex).getTelp_suplier();
            case 3: return list.get(rowIndex).getAlamat_suplier();
            
            
            
              
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "ID Suplier";
            case 1: return "Nama Suplier";
            case 2: return "Telpon Suplier";
            case 3: return "Alamat Suplier";
            
           
                        
            default: return null;
        }
    } 
}
