/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_JenisBarang;

/**
 *
 * @author Kulub Cau
 */
public interface Service_JenisBarang {
    void tambahData(Model_JenisBarang mod_jenis);
    void perbaruiData (Model_JenisBarang mod_jenis);
    void hapusData (Model_JenisBarang mod_jenis);
    
    Model_JenisBarang getByid(String id);
    
    List<Model_JenisBarang> getData();
    List<Model_JenisBarang> pencarian(String id);
        
    String nomor();
    boolean validasiNamaJenisBarang(Model_JenisBarang mod_jenis);
}
