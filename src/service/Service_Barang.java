/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_Barang;

/**
 *
 * @author Kulub Cau
 */
public interface Service_Barang {
    void tambahData(Model_Barang mod_bar);
    void perbaruiData (Model_Barang mod_bar);
    void hapusData (Model_Barang mod_bar);
    
    Model_Barang getByid(String id);
    
    List<Model_Barang> getDataByID();
    List<Model_Barang> getData();
    
    List<Model_Barang> pencarian(String id);
    List<Model_Barang> pencarian2(String id);
    
    String nomor();
    String nomor2();
}
