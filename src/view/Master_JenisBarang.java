/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DAO.DAO_JenisBarang;
import java.util.List;
import javax.swing.JOptionPane;

import model.Model_JenisBarang;
import service.Service_JenisBarang;
import tablemodel.TableMod_JenisBarang;

/**
 *
 * @author Kulub Cau
 */
public class Master_JenisBarang extends javax.swing.JPanel {

    private Service_JenisBarang servis = new DAO_JenisBarang();
    private TableMod_JenisBarang tblModel = new TableMod_JenisBarang();
    public Master_JenisBarang() {
        initComponents();
        
        tbl_jenisBarang.setModel(tblModel);
        
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_jenisBarang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        tambahData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_tambah1 = new javax.swing.JButton();
        btn_batal1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_kodeJenisBarang = new javax.swing.JTextField();
        t_namaJenisBarang = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tambah Jenis Barang");

        tbl_jenisBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_jenisBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_jenisBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_jenisBarang);

        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tambah)
                .addGap(31, 31, 31)
                .addComponent(btn_hapus)
                .addGap(39, 39, 39)
                .addComponent(btn_batal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_hapus)
                    .addComponent(btn_batal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        mainPanel.add(tampilData, "card2");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tambah Jenis Barang");

        btn_tambah1.setText("TAMBAH");
        btn_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah1ActionPerformed(evt);
            }
        });

        btn_batal1.setText("BATAL");
        btn_batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kode Jenis Barang");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nama Jenis Barang");

        t_kodeJenisBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_namaJenisBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_kodeJenisBarang)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(t_namaJenisBarang))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_kodeJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(t_namaJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahDataLayout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(btn_tambah1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_batal1)
                .addGap(180, 180, 180))
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah1)
                    .addComponent(btn_batal1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(tambahData, "card3");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        if(btn_tambah.getText().equals("TAMBAH")){
            btn_tambah1.setText("SIMPAN");
            t_kodeJenisBarang.setText(servis.nomor());
        }else if (btn_tambah1.getText().equals("SIMPAN")){
            simpanData();
        }else if(btn_tambah1.getText().equals("PERBARUI")){
            perbaruiData();
        }
        
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        btn_tambah1.setText("SIMPAN");
        t_kodeJenisBarang.setText(servis.nomor());
        t_kodeJenisBarang.setEnabled(false);
        
        
        if(btn_tambah.getText().equals("EDIT")){
            dataTabel();
            
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void tbl_jenisBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_jenisBarangMouseClicked
        if(btn_tambah.getText().equals("TAMBAH")){
            btn_tambah.setText("UBAH");
        }
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
    }//GEN-LAST:event_tbl_jenisBarangMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        tampilPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btn_batal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batal1;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tambah1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField t_kodeJenisBarang;
    private javax.swing.JTextField t_namaJenisBarang;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tbl_jenisBarang;
    // End of variables declaration//GEN-END:variables

    private void dataTabel(){
        tampilData.setVisible(false);
        tampilData.setVisible(true);
        
        int row = tbl_jenisBarang.getSelectedRow();
        jLabel2.setText("Perbarui Data Jenis Barang");
        t_kodeJenisBarang.setEnabled(false);
        t_namaJenisBarang.setEnabled(true);
        
        t_kodeJenisBarang.setText (tbl_jenisBarang.getModel().getValueAt(row,0).toString());
        t_namaJenisBarang.setText (tbl_jenisBarang.getModel().getValueAt(row,1).toString());
        
        
        
        btn_tambah1.setText("PERBARUI");
        btn_batal1.setVisible(true);
    }
    
    private void aktif(){
        t_kodeJenisBarang.setEnabled(true);
        t_namaJenisBarang.setEnabled(true);
        
        
    }
    
    private void loadData(){
        btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        List<Model_JenisBarang> list = servis.getData();
        tblModel.setData(list);
    }
    
    private void hapusData(){
        int index = tbl_jenisBarang.getSelectedRow();
        if (index!= -1){
            Model_JenisBarang brg = tblModel.getData(tbl_jenisBarang.convertColumnIndexToModel(index));
            if(JOptionPane.showConfirmDialog( null, "Apakah yakin menghapus data ini?","Konfirmasi",JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION){
                servis.hapusData(brg);
                tblModel.hapusData(index);
                loadData();
                resetForm();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih yang akan di update");
        }
    }
    
    private void resetForm(){
        btn_tambah.requestFocus();
        btn_tambah.setText("TAMBAH");
        t_namaJenisBarang.setText("");
        t_namaJenisBarang.setText("");
        
    }
    
    private void tampilPanel(){
        mainPanel.removeAll();
        mainPanel.add(new Master_JenisBarang());
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void simpanData(){
        
        String kode = t_kodeJenisBarang.getText();
        String nama = t_namaJenisBarang.getText();
        
        Model_JenisBarang jb = new Model_JenisBarang();
        jb.setKode_jenis(kode);
        jb.setNama_jenis(nama);
        
        if (servis.validasiNamaJenisBarang(jb)==true){
            if(validasiInput()==true){
            String kode_jenis = t_kodeJenisBarang.getText();
            String nama_jenis = t_namaJenisBarang.getText();
            
            
           
            Model_JenisBarang jbg = new Model_JenisBarang();
            jbg.setKode_jenis(kode_jenis);
            jbg.setNama_jenis(nama_jenis);
            
            servis.tambahData(jb);
            tblModel.tambahData(jb);
            
            tampilPanel();
            loadData();
            resetForm();
            
            btn_tambah.setText("TAMBAH");
            }
        }else{
            t_namaJenisBarang.requestFocus();
        }
        
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if(t_kodeJenisBarang.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Kode Jenis Barang harus diisi");
        }
        else if(t_namaJenisBarang.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Jenis Barang harus diisi");
        }
        else{
            valid = true;
        }
        return valid;
    }
    
    private void perbaruiData(){
        int index = tbl_jenisBarang.getSelectedRow();
        if(index!=-1){
            Model_JenisBarang mobar= tblModel.getData(tbl_jenisBarang.convertRowIndexToModel(index));
            
            String kode = t_kodeJenisBarang.getText();
            String nama  = t_namaJenisBarang.getText();
            
            Model_JenisBarang jb = new Model_JenisBarang();
            jb.setKode_jenis(kode);
            jb.setNama_jenis(nama);
            
            if(servis.validasiNamaJenisBarang(jb)==true){
                if(validasiInput()==true){
                    String nama_jenis = t_namaJenisBarang.getText();
                    String kode_jenis = t_kodeJenisBarang.getText();

                    Model_JenisBarang jbr = new Model_JenisBarang();

                    jbr.setKode_jenis(kode_jenis);
                    jbr.setNama_jenis(nama_jenis);
                    
                    servis.perbaruiData(jbr);
                    tblModel.perbaruiData(index,jbr);
                    loadData();
                    resetForm();
                    tampilPanel();
            }
            }else{
                t_namaJenisBarang.requestFocus();
            }
            
            
        }
    }
}