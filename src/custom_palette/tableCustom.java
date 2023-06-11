/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom_palette;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Kulub Cau
 */
public class tableCustom extends JTable{
    public tableCustom(){
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o,boolean bln, boolean bln1, int i, int i1){
                Table_Header header = new Table_Header(o+"");
                if(i1==4){
                    header.setHorizontalAlignment(JLabel.CENTER);
                    
                }
                return header;
            }
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o,boolean selected, boolean bln1, int i, int i1){
                Table_Header header = new Table_Header(o+"");
                if(i1!=4){
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if(selected){
                        com.setForeground(new Color(15,89,140));
                    }else{
                        com.setForeground(new Color(102,102,102));
                    }
                    return com;
                }else{
//                    StatusType type = (StatusType) o;
//                    CellStatus cell = new CellStatus(type);
//                    return cell;
                }
                return header;
            }
        });
    }
}
