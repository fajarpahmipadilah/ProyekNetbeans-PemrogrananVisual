/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_Pengguna;

/**
 *
 * @author Kulub Cau
 */
public interface Service_Pengguna {
    void tambahData(Model_Pengguna mod_pengguna);
    void perbaruiData(Model_Pengguna mod_pengguna);
    void hapusData(Model_Pengguna mod_pengguna);
    
    
    Model_Pengguna getByid(String id);
    
    List<Model_Pengguna> getData();
    List<Model_Pengguna> pencarian(String id);
    String nomor();
}
