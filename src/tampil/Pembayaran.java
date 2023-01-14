/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author SHINDY OEMARDY
 */
public class Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form Pembayaran
     */
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    public Pembayaran() {
        initComponents();
        kosong();
        aktif();
        datatable();
    }
     protected void kosong(){
        txtkd.setText("");
        txtnm.setText("");        
        cbjenis.setSelectedItem(null);
        txtlok.setText("");
        txtgmail.setText("");
        txtalamat.setText("");
        txtcari.setText("");
        
    }
     protected void aktif(){
        txtkd.requestFocus();
        cbjenis.setSelectedItem(null);
    }
     protected void datatable(){
        Object[] Baris = {"id_pembayaran","nama","jenis pembayaran","lokasi","gmail","alamat" };
        tabmode = new DefaultTableModel(null, Baris);
        String cariitem = txtcari.getText();            
        try{
            String sql = "SELECT * FROM pembayaran WHERE id_pembayaran like '%"+cariitem+"%' or nama like '%"+cariitem+"%' order by id_pembayaran asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                    hasil.getString(6)
                });
            }
          tablebarang.setModel(tabmode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal di panggil"+e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtkd = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        txtlok = new javax.swing.JTextField();
        txtgmail = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox<>();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablebarang = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        backGround1 = new tampil.BackGround();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setText("PEMBAYARAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Id pembayaran");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 64, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 98, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("jenis pembayaran");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 132, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("lokasi ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 166, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("gmail");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 197, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("alamat");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 231, -1, -1));

        txtkd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtkd, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 61, 314, -1));

        txtnm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 95, 314, -1));

        txtlok.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtlok, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 163, 314, -1));

        txtgmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtgmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 197, 314, -1));

        txtalamat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 231, 314, 40));

        cbjenis.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih--", "Dana", "Trasfer Bank", "kartu kredit", "bayar tunai", "BCA OneKlik" }));
        jPanel1.add(cbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 129, 304, -1));

        bsimpan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(bsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 277, -1, -1));

        bubah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bubah.setText("EDIT");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });
        jPanel1.add(bubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 277, -1, -1));

        bhapus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bhapus.setText("HAPUS");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });
        jPanel1.add(bhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 277, -1, -1));

        bbatal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bbatal.setText("BATAL");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });
        jPanel1.add(bbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 277, -1, -1));

        bkeluar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bkeluar.setText("KEMBALI");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(bkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, 117, -1));

        tablebarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tablebarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablebarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablebarang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 308, 541, 110));

        txtcari.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 277, 128, 25));

        bcari.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bcari.setText("cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });
        jPanel1.add(bcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 277, -1, -1));

        javax.swing.GroupLayout backGround1Layout = new javax.swing.GroupLayout(backGround1);
        backGround1.setLayout(backGround1Layout);
        backGround1Layout.setHorizontalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        backGround1Layout.setVerticalGroup(
            backGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel1.add(backGround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
     String sql = "INSERT INTO pembayaran VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtkd.getText());
            stat.setString(2, txtnm.getText());
            stat.setString(3, cbjenis.getSelectedItem().toString());
            stat.setString(4, txtlok.getText());
            stat.setString(5, txtgmail.getText());            
            stat.setString(6, txtalamat.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data berhasil di simpan");
            kosong();
            txtkd.requestFocus();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal di simapan"+e);
        }
        datatable();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        String sql = "UPDATE pembayaran SET nama=?,jenis_bayaran=?,lokasi=?,gmail=?, alamat=? WHERE id_pembayaran='"+txtkd.getText()+"'";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnm.getText());
            stat.setString(2, cbjenis.getSelectedItem().toString());
            stat.setString(3, txtlok.getText());
            stat.setString(4, txtgmail.getText());            
            stat.setString(5, txtalamat.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil di ubah");
            kosong();
            txtkd.requestFocus();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal di ubah"+e);
        }
        datatable();
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin menghapus data ini?", "konfirm dialog", JOptionPane.YES_NO_OPTION);
        if(ok==0){
            String sql = "DELETE FROM pembayaran WHERE id_pembayaran='"+txtkd.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
                kosong();
                txtkd.requestFocus();
            } catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Data gagal di hapus"+e);
            }
            datatable();
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
      kosong();
        datatable();
    }//GEN-LAST:event_bbatalActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        datatable();
    }//GEN-LAST:event_bcariActionPerformed

    private void tablebarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablebarangMouseClicked
        int bar = tablebarang.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
       
        
        txtkd.setText(a);
        txtnm.setText(b);
        cbjenis.setSelectedItem(c);
        txtlok.setText(d);
        txtgmail.setText(e);
        txtalamat.setText(f);
        
    }//GEN-LAST:event_tablebarangMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tampil.BackGround backGround1;
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablebarang;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtgmail;
    private javax.swing.JTextField txtkd;
    private javax.swing.JTextField txtlok;
    private javax.swing.JTextField txtnm;
    // End of variables declaration//GEN-END:variables
}