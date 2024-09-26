package project1;

import Koneksi.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class FormBarang extends javax.swing.JFrame {
    Connection conn;
    Statement st;
    ResultSet rs;
    Koneksi koneksi;
     
    DefaultTableModel dtm;
    
    String Kd_Brg,Nm_Brg;
    int Hrg, Jml;
    
    public FormBarang() {
        initComponents();
        koneksi = new Koneksi();
        conn = koneksi.getConnection();
        tampilanTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        KdBrg = new javax.swing.JTextField();
        NameBrg = new javax.swing.JTextField();
        Jumlah = new javax.swing.JTextField();
        Harga = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("FROM DATA BARANG");

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Jumlah");

        jLabel5.setText("Harga");

        KdBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KdBrgActionPerformed(evt);
            }
        });

        Jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahActionPerformed(evt);
            }
        });

        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jumlah", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameBrg, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(KdBrg)
                            .addComponent(Jumlah)
                            .addComponent(Harga))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5))))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(KdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KdBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KdBrgActionPerformed
     
    }//GEN-LAST:event_KdBrgActionPerformed

    private void JumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahActionPerformed
        
    }//GEN-LAST:event_JumlahActionPerformed

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
        
    }//GEN-LAST:event_HargaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String kodeBarangCari = KdBrg.getText();
        cariData(kodeBarangCari);
    }//GEN-LAST:event_jButton1ActionPerformed
        private void cariData(String kodeBarangCari) {
            String sql = "SELECT * FROM produk WHERE id_produk = ?";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, kodeBarangCari);
                ResultSet hasil = ps.executeQuery();
        
                if (hasil.next()) {
                    KdBrg.setText(hasil.getString("id_produk"));
                    NameBrg.setText(hasil.getString("nm_produk"));
                    Jumlah.setText(hasil.getString("Jumlah"));
                    Harga.setText(hasil.getString("Harga"));
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Data tidak ditemukan");
                }   
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String kodeBarangEdit = jTable1.getValueAt(selectedRow, 0).toString();
            String namaBarangEdit = NameBrg.getText();  
            String jumlahEdit = Jumlah.getText();      
            String hargaEdit = Harga.getText();      

            jTable1.setValueAt(namaBarangEdit, selectedRow, 1);
            jTable1.setValueAt(jumlahEdit, selectedRow, 2);
            jTable1.setValueAt(hargaEdit, selectedRow, 3);
            
            updateData(kodeBarangEdit, namaBarangEdit, jumlahEdit, hargaEdit);
        
            clearForm();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Pilih data yang akan diedit.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void updateData(String kodeBarang, String namaBarang, String jumlah, String harga) {
       String sql = "UPDATE produk SET nm_produk=?, Jumlah=?, Harga=? WHERE id_produk=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, namaBarang);
            ps.setString(2, jumlah);
            ps.setString(3, harga);
            ps.setString(4, kodeBarang);
            int result = ps.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(rootPane, "Data berhasil diupdate.");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Gagal mengupdate data.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Kd_Brg = KdBrg.getText();
        Nm_Brg = NameBrg.getText();
        Jml = Integer.parseInt(Jumlah.getText());
        Hrg = Integer.parseInt(Harga.getText());
        
        simpanData();
        clearForm();
        tampilanTabel();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            int option = JOptionPane.showConfirmDialog(rootPane, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                String kodeBarangHapus = jTable1.getValueAt(selectedRow, 0).toString();

                deleteData(kodeBarangHapus);

                model.removeRow(selectedRow);

                clearForm();
            }
        } else {
           JOptionPane.showMessageDialog(rootPane, "Pilih data yang akan dihapus.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
           try {
                if (conn != null) {
                    conn.close();
                }
            }catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error closing database connection: " + e.getMessage());
            }
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void deleteData(String kodeBarang) {
    String sql = "DELETE FROM produk WHERE id_produk=?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, kodeBarang);
        int result = ps.executeUpdate();

        if (result > 0) {
            JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus.");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Gagal menghapus data.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
    
    private boolean simpanData(){
        try{
            st = conn.createStatement();
            int simpan = st.executeUpdate("insert into produk" + "(id_produk,nm_produk,jumlah,harga)" + "values('"+Kd_Brg+"','"+Nm_Brg+"','"+Jml+"','"+Hrg+"')");
            if (simpan == 1){
                JOptionPane.showMessageDialog(rootPane, "Data Tersimpan");
            }
            return true;
        }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "error 2 : " +e.getMessage());
            
        }
        return false;
    }
    
    
    private void clearForm(){
        KdBrg.setText("");
        NameBrg.setText("");
        Harga.setText("");
        Jumlah.setText("");
    }
    
    private void tampilanTabel(){
        String sql = "select * from produk";
        dtm = new DefaultTableModel();
        dtm.addColumn("Kode Barang");
        dtm.addColumn("Nama Barang");
        dtm.addColumn("Jumlah");
        dtm.addColumn("Harga");
        jTable1.setModel(dtm);
        try{
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           while(rs.next()){
                dtm.addRow(new Object[]{
                   rs.getString("id_produk"),
                   rs.getString("nm_produk"),
                   rs.getString("Jumlah"),
                   rs.getString("Harga"),
                });
           }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error 2 : " +e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JTextField KdBrg;
    private javax.swing.JTextField NameBrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}