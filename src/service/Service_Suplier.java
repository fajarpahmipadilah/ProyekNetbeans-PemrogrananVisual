/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_Suplier;

/**
 *
 * @author Kulub Cau
 */
public interface Service_Suplier {
    void tambahData(Model_Suplier mod_suplier);
    void perbaruiData (Model_Suplier mod_suplier);
    void hapusData (Model_Suplier mod_suplier);
    
    Model_Suplier getByid(String id);
    
    List<Model_Suplier> getData();
    List<Model_Suplier> pencarian(String id);
    
    String nomor();
}
