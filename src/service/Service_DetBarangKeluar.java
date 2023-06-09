/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_DetBarangKeluar;

/**
 *
 * @author Kulub Cau
 */
public interface Service_DetBarangKeluar {
    void tambahData(Model_DetBarangKeluar mod_detkeluar);
    void sumTotal(Model_DetBarangKeluar mod_detkeluar);
    void hapusSementara(Model_DetBarangKeluar mod_detkeluar);
    
    Model_DetBarangKeluar getByid(String id);
    List<Model_DetBarangKeluar> getData();
    List<Model_DetBarangKeluar> pencarian();
    
    boolean validasiStok(Model_DetBarangKeluar mod_detkeluar);
    
}
