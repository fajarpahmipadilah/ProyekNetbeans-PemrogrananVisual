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
import model.Model_Suplier;
import service.Service_Suplier;

/**
 *
 * @author Kulub Cau
 */
public class DAO_Suplier implements Service_Suplier{
    private Connection conn;
    public DAO_Suplier(){
        conn = Koneksi.getConnection();
    }
    
    @Override
    public void tambahData(Model_Suplier mod_suplier) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void perbaruiData(Model_Suplier mod_suplier) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hapusData(Model_Suplier mod_suplier) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Model_Suplier getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Model_Suplier> getData() {
       PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM suplier";

        try{
           st = conn.prepareStatement(sql);
           rs = st.executeQuery();
           while(rs.next()){
               Model_Suplier modsup = new Model_Suplier();
               
               
               modsup.setId_suplier(rs.getString("id_suplier"));
               modsup.setNama_suplier(rs.getString("nama_suplier"));
               modsup.setTelp_suplier(rs.getString("telp_suplier"));
               modsup.setAlamat_suplier(rs.getString("alamat_suplier"));
               
               list.add(modsup);
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

    @Override
    public List<Model_Suplier> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
