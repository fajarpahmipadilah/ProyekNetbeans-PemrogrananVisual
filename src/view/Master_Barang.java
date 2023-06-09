/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DAO.DAO_Barang;
import java.util.List;
import javax.swing.JOptionPane;
import model.Model_Barang;
import model.Model_JenisBarang;
import service.Service_Barang;
import tablemodel.TableMod_Barang;
 

/**
 *
 * @author Kulub Cau
 */
public class Master_Barang extends javax.swing.JPanel {

    private Service_Barang servis = new DAO_Barang();
    private TableMod_Barang tblModel = new TableMod_Barang();
    public Master_Barang() {
        initComponents();
        
        tbl_barang.setModel(tblModel);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        t_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tambahData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t_kodeBarang = new javax.swing.JTextField();
        t_namaJenisBarang = new javax.swing.JTextField();
        t_namaBarang = new javax.swing.JTextField();
        t_harga = new javax.swing.JTextField();
        t_stok = new javax.swing.JTextField();
        t_kodeJenisBarang = new javax.swing.JTextField();
        cbx_satuan = new javax.swing.JComboBox<>();
        btn_jenisBarang = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_tambah1 = new javax.swing.JButton();
        btn_batal1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_barang);

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

        t_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cariActionPerformed(evt);
            }
        });

        btn_cari.setText("Cari");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tambah)
                .addGap(27, 27, 27)
                .addComponent(btn_hapus)
                .addGap(28, 28, 28)
                .addComponent(btn_batal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_hapus)
                    .addComponent(btn_batal)
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Barang");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );

        mainPanel.add(tampilData, "card2");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tambah Data Barang");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kode Barang");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jenis Barang");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nama Jenis Barang");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nama Barang");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Satuan");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Harga");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Stok");

        t_kodeBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_namaJenisBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_namaBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_harga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_stok.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_kodeJenisBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        t_kodeJenisBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_kodeJenisBarangActionPerformed(evt);
            }
        });

        cbx_satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Jenis Satuan-", "Kg", "Ons", "Set", "Buah", "Ikat", "Bungkus" }));
        cbx_satuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_satuanActionPerformed(evt);
            }
        });

        btn_jenisBarang.setText("Pilih");
        btn_jenisBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jenisBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_kodeBarang)
                    .addComponent(t_namaJenisBarang, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t_namaBarang, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t_harga)
                    .addComponent(t_stok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                    .addComponent(cbx_satuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(t_kodeJenisBarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_kodeJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jenisBarang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(t_namaJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(t_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(t_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tambah1)
                .addGap(18, 18, 18)
                .addComponent(btn_batal1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal1))
                .addContainerGap())
        );

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(tambahData, "card3");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        if(btn_tambah1.getText().equals("TAMBAH")){
            btn_tambah1.setText("SIMPAN");
            t_kodeBarang.setText(servis.nomor());
        }else if (btn_tambah1.getText().equals("SIMPAN")){
            simpanData();
        }else if(btn_tambah1.getText().equals("PERBARUI")){
            perbaruiData();
        }
        
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void cbx_satuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_satuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_satuanActionPerformed

    private void btn_jenisBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jenisBarangActionPerformed
        boolean closable = true;
        Data_JenisBarang djb;
        djb = new Data_JenisBarang(null,closable);
        djb.setVisible(true);
        
        t_kodeJenisBarang.setText(djb.jb.getKode_jenis());
        t_namaJenisBarang.setText(djb.jb.getNama_jenis());
        
        t_namaBarang.requestFocus();
        t_kodeJenisBarang.setEnabled(false);
        t_namaJenisBarang.setEnabled(false);
    }//GEN-LAST:event_btn_jenisBarangActionPerformed

    private void t_kodeJenisBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_kodeJenisBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_kodeJenisBarangActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        tampilPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();

        btn_tambah1.setText("SIMPAN");
        btn_jenisBarang.setEnabled(true);
        t_kodeBarang.setEnabled(false);
        t_kodeBarang.setText(servis.nomor());

        if(btn_tambah.getText().equals("EDIT")){
            dataTabel();

        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void t_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cariActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        if(btn_tambah.getText().equals("TAMBAH")){
            btn_tambah.setText("UBAH");
        }
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
    }//GEN-LAST:event_tbl_barangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batal1;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_jenisBarang;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tambah1;
    private javax.swing.JComboBox<String> cbx_satuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_harga;
    private javax.swing.JTextField t_kodeBarang;
    private javax.swing.JTextField t_kodeJenisBarang;
    private javax.swing.JTextField t_namaBarang;
    private javax.swing.JTextField t_namaJenisBarang;
    private javax.swing.JTextField t_stok;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tbl_barang;
    // End of variables declaration//GEN-END:variables

    private void dataTabel(){
        tampilData.setVisible(false);
        tampilData.setVisible(true);
        
        int row = tbl_barang.getSelectedRow();
        jLabel2.setText("Perbarui Data Barang");
        
        t_kodeBarang.setEnabled(false);
        t_kodeJenisBarang.setEnabled(true);
        t_namaJenisBarang.setEnabled(true);
        
        t_kodeBarang.setText (tbl_barang.getModel().getValueAt(row,1).toString());
        t_kodeJenisBarang.setText (tbl_barang.getModel().getValueAt(row,2).toString());
        t_namaJenisBarang.setText (tbl_barang.getModel().getValueAt(row,3).toString());
        t_namaBarang.setText (tbl_barang.getModel().getValueAt(row,4).toString());
        cbx_satuan.setSelectedItem(tbl_barang.getModel().getValueAt(row,5).toString());
        t_harga.setText (tbl_barang.getModel().getValueAt(row,6).toString());
        t_stok.setText (tbl_barang.getModel().getValueAt(row,7).toString());
        
        aktif();
        btn_tambah1.setText("PERBARUI");
        btn_batal.setVisible(true);
    }
    
    private void aktif(){
        t_namaBarang.setEnabled(true);
        cbx_satuan.setEnabled(true);
        t_harga.setEnabled(true);
        t_stok.setEnabled(true);
        
    }
    
    private void loadData(){
        btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        List<Model_Barang> list = servis.getData();
        tblModel.setData(list);
    }
    
    private void hapusData(){
        int index = tbl_barang.getSelectedRow();
        if (index!= -1){
            Model_Barang brg = tblModel.getData(tbl_barang.convertColumnIndexToModel(index));
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
        t_kodeBarang.setText("");
        t_kodeJenisBarang.setText("");
        t_namaJenisBarang.setText("");
        t_namaBarang.setText("");
        cbx_satuan.setSelectedItem(0);
        t_harga.setText("");
        t_stok.setText("");
    }
    
    private void tampilPanel(){
        mainPanel.removeAll();
        mainPanel.add(new Master_Barang());
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void simpanData(){
        if(validasiInput()==true){
            String kode_barang = t_kodeBarang.getText();
            String kode_jenis = t_kodeJenisBarang.getText();
            String nama_jenisBarang = t_namaJenisBarang.getText();
            String nama_barang = t_namaBarang.getText();
            String satuan = cbx_satuan.getSelectedItem().toString();
            Long harga = Long.parseLong(t_harga.getText());
            int stok = Integer.parseInt(t_stok.getText());
            
            Model_Barang brg = new Model_Barang();
            Model_JenisBarang jbr = new Model_JenisBarang();
            
            brg.setKode_barang(kode_barang);
            jbr.setKode_jenis(kode_jenis);
            jbr.setNama_jenis(nama_jenisBarang);
            brg.setNama_barang(nama_barang);
            brg.setSatuan(satuan);
            brg.setHarga(harga);
            brg.setStok(stok);
            
            brg.setJns_barang(jbr);
            
            servis.tambahData(brg);
            tblModel.tambahData(brg);
            loadData();
            resetForm();
            tampilPanel();
            btn_tambah1.setText("TAMBAH");
        }
    }
    
    private boolean validasiInput(){
         boolean valid = false;
        if(t_kodeBarang.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Kode Barang harus diisi");
        }
        else if(t_kodeJenisBarang.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Kode Jenis Barang harus diisi");
        }
        else if(t_namaJenisBarang.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Jenis Barang harus diisi");
        }
        else if(t_namaBarang.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Barang harus diisi");
        }
        else if(cbx_satuan.getSelectedItem().equals(null)){
            JOptionPane.showMessageDialog(null, "Satuan harus diisi");
        }
        else if(t_harga.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga harus diisi");
        }
        else if(t_stok.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Stok harus diisi");
        }else{
            valid = true;
        }
        return valid;
    }
    
    private void perbaruiData(){
        int index = tbl_barang.getSelectedRow();
        if(index!=-1){
            Model_Barang mobar = tblModel.getData(tbl_barang.convertRowIndexToModel(index));
            
            if(validasiInput()==true){
            String kode_barang = t_kodeBarang.getText();
            String kode_jenis = t_kodeJenisBarang.getText();
            //String nama_jenisBarang = t_namaJenisBarang.getText();
            String nama_barang = t_namaBarang.getText();
            String satuan = cbx_satuan.getSelectedItem().toString();
            Long harga = Long.parseLong(t_harga.getText());
            int stok = Integer.parseInt(t_stok.getText());
            
            Model_Barang brg = new Model_Barang();
            Model_JenisBarang jbr = new Model_JenisBarang();
            
            brg.setKode_barang(kode_barang);
            jbr.setKode_jenis(kode_jenis);
            //jbr.setNama_jenis(nama_jenisBarang);
            brg.setNama_barang(nama_barang);
            brg.setSatuan(satuan);
            brg.setHarga(harga);
            brg.setStok(stok);
            
            brg.setJns_barang(jbr);
            servis.tambahData(brg);
            tblModel.perbaruiData(index,brg);
            loadData();
            resetForm();
            tampilPanel();
            }
        }
    }
    
    
}