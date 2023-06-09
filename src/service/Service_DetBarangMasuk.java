/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_DetBarangMasuk;

/**
 *
 * @author Kulub Cau
 */
public interface Service_DetBarangMasuk {
    void tambahData(Model_DetBarangMasuk mod_detmasuk);
    void sumTotal(Model_DetBarangMasuk mod_detmasuk);
    void hapusSementara(Model_DetBarangMasuk mod_detmasuk);
    
    Model_DetBarangMasuk getByid(String id);
    List<Model_DetBarangMasuk> ambilData();
    List<Model_DetBarangMasuk> pencarian();
    
    boolean validasiStok(Model_DetBarangMasuk mod_detmasuk);
}
