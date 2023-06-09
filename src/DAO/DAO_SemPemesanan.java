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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Model_Barang;
import model.Model_DetPemesanan;
import model.Model_SemPemesanan;
import service.Service_SemPemesanan;

/**
 *
 * @author Kulub Cau
 */
public class DAO_SemPemesanan implements Service_SemPemesanan {

    private Connection conn;
    public DAO_SemPemesanan(){
        conn = Koneksi.getConnection();
    }

    @Override
    public void tambahData(Model_SemPemesanan mod_pesan) {
        PreparedStatement st = null;
       String sql = "INSERT INTO sementara_pesan (kode_barang, nama_barang,harga,jml_pesan,subtotal_pesan,status) VALUES (?,?,?,?,?,?)";
       try{
           st = conn.prepareStatement(sql);
           st.setString(1, mod_pesan.getMod_barang().getKode_barang());
           st.setString(2, mod_pesan.getMod_barang().getNama_barang());
           st.setLong(3, mod_pesan.getMod_barang().getHarga());
           st.setLong(4,mod_pesan.getMod_detpesan().getJml_pesan());
           st.setLong(5, mod_pesan.getMod_detpesan().getSubtotal_pesan());
           st.setString(6, mod_pesan.getMod_detpesan().getStatus());
           
           st.executeUpdate();
          
       }catch(SQLException ex){
           Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE,null,ex);
       }finally{
           if(st!=null){
               try{
                   st.close();
               }catch(SQLException ex){
                   Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
       }
    }

    @Override
    public void perbaruiData(Model_SemPemesanan mod_pesan) {
        PreparedStatement st = null;
        String sql = "UPDATE sementara_pesan SET nama_barang=?,harga=?,jml_pesan=?, subtotal_pesan=? WHERE kode_barang='"+mod_pesan.getMod_barang().getKode_barang()+"'";
        
        try{
           st = conn.prepareStatement(sql);
           
           st.setString(1, mod_pesan.getMod_barang().getNama_barang());
           st.setLong(2, mod_pesan.getMod_barang().getHarga());
           st.setLong(3, mod_pesan.getMod_detpesan().getJml_pesan());
           st.setLong(4, mod_pesan.getMod_detpesan().getSubtotal_pesan());
       
           
           st.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Gagal memperbarui data");
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
           if(st!=null){
               try{
                   st.close();
               }catch(SQLException ex){
                   Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
       }
    }

    @Override
    public void hapusData(Model_SemPemesanan mod_pesan) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_pesan WHERE kode_barang=?";
        
        try{
           st = conn.prepareStatement(sql);
           
           st.setString(1, mod_pesan.getMod_barang().getKode_barang());
           
           
           st.executeUpdate();
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
    }

    @Override
    public Model_SemPemesanan getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Model_SemPemesanan> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM sementara_pesan";

        try{
           st = conn.prepareStatement(sql);
           rs = st.executeQuery();
           while(rs.next()){
               Model_SemPemesanan smt = new Model_SemPemesanan();
               Model_Barang brg = new Model_Barang();
               Model_DetPemesanan det_psn = new Model_DetPemesanan();
               
               brg.setKode_barang(rs.getString("kode_barang"));
               brg.setNama_barang(rs.getString("nama_barang"));
               brg.setHarga(rs.getLong("harga"));
               
               det_psn.setJml_pesan(rs.getLong("jml_pesan"));
               det_psn.setSubtotal_pesan(rs.getLong("subtotal_pesan"));
               
               smt.setMod_barang(brg);
               smt.setMod_detpesan(det_psn);
               list.add(smt);
           }
        return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
           if(st!=null){
               try{
                   st.close();
               }catch(SQLException ex){
                   java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
           if(rs!=null){
               try{
                   rs.close();
               }catch(SQLException ex){
                   java.util.logging.Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
       }
    }
    
    
}
