/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Model_Pemesanan;
import model.Model_Pengguna;
import model.Model_Suplier;
import service.Service_Pemesanan;
/**
 *
 * @author Kulub Cau
 */
public class DAO_Pemesanan implements Service_Pemesanan {
    private Connection conn;
    public DAO_Pemesanan(){
        conn = Koneksi.getConnection();
    }

    @Override
    public void tambahData(Model_Pemesanan mod_pesan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void perbaruiData(Model_Pemesanan mod_pesan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hapusData(Model_Pemesanan mod_pesan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Model_Pemesanan getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Model_Pemesanan> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
         ResultSet rs = null;
       String sql = "SELECT * FROM pemesanan psn INNER JOIN suplier s ON s.id_suplier = psn.id_suplier INNER JOIN pengguna p ON p.id_pengguna = psn.id_pengguna";
       try{
           st = conn.prepareStatement(sql);
           rs = st.executeQuery();
           while(rs.next()){
               Model_Pemesanan psn = new Model_Pemesanan();
               Model_Suplier sup = new Model_Suplier();
               Model_Pengguna pgn = new Model_Pengguna();
               
               psn.setNo_pesan(rs.getString("no_pesan"));
               psn.setTgl_pesan(rs.getString("tgl_pesan"));
               psn.setTotal_pesan(rs.getString("total_pesan"));
               sup.setId_suplier(rs.getString("nama_suplier"));
               pgn.setId_pengguna(rs.getString("nama_pengguna"));
               
               psn.setMod_pengguna(pgn);
               psn.setMod_suplier(sup);
               
               list.add(psn);
           }
          return list;
       }catch(SQLException ex){
           Logger.getLogger(DAO_Pemesanan.class.getName()).log(Level.SEVERE,null,ex);
           return null;
       }finally{
           if(st!=null){
               try{
                   st.close();
               }catch(SQLException ex){
                   Logger.getLogger(DAO_Pemesanan.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
           if(rs!=null){
               try{
                   rs.close();
               }catch(SQLException ex){
                   Logger.getLogger(DAO_Pemesanan.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
       }
    }

    @Override
    public List<Model_Pemesanan> pencarian() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor() {
       PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat noformat = new SimpleDateFormat("yyMMdd");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);
        
        String sql = "SELECT RIGHT(no_pesan, 3) AS Nomor FROM pemesanan WHERE no_pesan LIKE 'PB* +no+ *%' ORDER BY no_pesan LIMIT 1";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "PB" + no + String.format("&03d", nomor);
                
            }else{
                urutan= "PB" + no + "001";
            }
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return urutan;
    }
    
    
}
