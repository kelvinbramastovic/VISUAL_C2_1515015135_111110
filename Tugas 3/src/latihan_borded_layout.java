/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class latihan_borded_layout extends javax.swing.JFrame {

    /**
     * Creates new form latihan_borded_layout
     */
    public latihan_borded_layout() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_utama = new javax.swing.JPanel();
        panelhome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelprofil = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelmisi = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnl_header = new javax.swing.JPanel();
        lbl_sistem = new javax.swing.JLabel();
        lbl_studi = new javax.swing.JLabel();
        lbl_unmul = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnl_footer = new javax.swing.JPanel();
        lbl_modul = new javax.swing.JLabel();
        lbl_copyright = new javax.swing.JLabel();
        pnl_leftbar = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnl_utama.setBackground(new java.awt.Color(0, 255, 255));
        pnl_utama.setLayout(new java.awt.CardLayout());

        panelhome.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.jpg"))); // NOI18N

        javax.swing.GroupLayout panelhomeLayout = new javax.swing.GroupLayout(panelhome);
        panelhome.setLayout(panelhomeLayout);
        panelhomeLayout.setHorizontalGroup(
            panelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelhomeLayout.setVerticalGroup(
            panelhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_utama.add(panelhome, "card2");

        panelprofil.setBackground(new java.awt.Color(255, 204, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N

        javax.swing.GroupLayout panelprofilLayout = new javax.swing.GroupLayout(panelprofil);
        panelprofil.setLayout(panelprofilLayout);
        panelprofilLayout.setHorizontalGroup(
            panelprofilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelprofilLayout.setVerticalGroup(
            panelprofilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_utama.add(panelprofil, "card3");

        panelmisi.setBackground(new java.awt.Color(204, 204, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Visi\n\nProdusen batubara terkemuka Indonesia untuk memenuhi kebutuhan dunia,\nyang memberikan nilai optimal bagi semua pemangku kepentingan.\n\nMisi\n\n+ Memupuk budaya yang mengutamakan keselamatan, kesehatan, dan lingkungan dalam segala tindakan:\n\t1. Mematuhi peraturan perundangan keselamatan, kesehatan, dan lingkungan yang berlaku..\n\t   Berupaya tanpa henti mempromosikan budaya praktik terbaik dalam pengelolaan keselamatan, kesehatan, dan lingkungan.\n\t2. Memelihara tatakelola perusahaan yang baik dan mempromosikan perusahaan sebagai warga yang baik:\n\t3. Melaksanakan prinsip-prinsip transparansi, tanggung-gugat, tanggung-jawab, integritas dan keadilan.\n+ Peka terhadap falsafah bangsa dalam kehidupan sehari-hari.\n\t1. Menyediakan lingkungan belajar untuk mencapai keunggulan dan meningkatkan kesejahteraan:\n\t2. Mendorong pemberdayaan karyawan.\n\t3. Memberikan pengakuan dan penghargaan atas kinerja yang unggul.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panelmisiLayout = new javax.swing.GroupLayout(panelmisi);
        panelmisi.setLayout(panelmisiLayout);
        panelmisiLayout.setHorizontalGroup(
            panelmisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        panelmisiLayout.setVerticalGroup(
            panelmisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        pnl_utama.add(panelmisi, "card4");

        getContentPane().add(pnl_utama, java.awt.BorderLayout.CENTER);

        pnl_header.setBackground(new java.awt.Color(255, 0, 51));

        lbl_sistem.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_sistem.setText("SISTEM INFORMASI");

        lbl_studi.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_studi.setText("PT. KALTIM PRIMA COAL");

        lbl_unmul.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_unmul.setText("KALIMANTAN TIMUR");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.jpg"))); // NOI18N

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_unmul)
                    .addComponent(lbl_studi)
                    .addComponent(lbl_sistem))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_sistem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_studi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_unmul)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(pnl_header, java.awt.BorderLayout.PAGE_START);

        pnl_footer.setBackground(new java.awt.Color(153, 0, 0));

        lbl_modul.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_modul.setText("MODUL PRAKTIKUM PEMROGRAMAN VISUAL JAVA");

        lbl_copyright.setText("Copyright@2015");

        javax.swing.GroupLayout pnl_footerLayout = new javax.swing.GroupLayout(pnl_footer);
        pnl_footer.setLayout(pnl_footerLayout);
        pnl_footerLayout.setHorizontalGroup(
            pnl_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_footerLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(pnl_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_footerLayout.createSequentialGroup()
                        .addComponent(lbl_copyright)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_footerLayout.createSequentialGroup()
                        .addComponent(lbl_modul)
                        .addGap(182, 182, 182))))
        );
        pnl_footerLayout.setVerticalGroup(
            pnl_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_modul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lbl_copyright)
                .addContainerGap())
        );

        getContentPane().add(pnl_footer, java.awt.BorderLayout.PAGE_END);

        pnl_leftbar.setBackground(new java.awt.Color(153, 0, 153));

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Profile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("VISI & MISI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_leftbarLayout = new javax.swing.GroupLayout(pnl_leftbar);
        pnl_leftbar.setLayout(pnl_leftbarLayout);
        pnl_leftbarLayout.setHorizontalGroup(
            pnl_leftbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_leftbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_leftbarLayout.setVerticalGroup(
            pnl_leftbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftbarLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_leftbar, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panelhome.setVisible(true);
        panelprofil.setVisible(false);
        panelmisi.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        panelhome.setVisible(false);
        panelprofil.setVisible(true);
        panelmisi.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        panelhome.setVisible(false);
        panelprofil.setVisible(false);
        panelmisi.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(latihan_borded_layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan_borded_layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan_borded_layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan_borded_layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan_borded_layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_copyright;
    private javax.swing.JLabel lbl_modul;
    private javax.swing.JLabel lbl_sistem;
    private javax.swing.JLabel lbl_studi;
    private javax.swing.JLabel lbl_unmul;
    private javax.swing.JPanel panelhome;
    private javax.swing.JPanel panelmisi;
    private javax.swing.JPanel panelprofil;
    private javax.swing.JPanel pnl_footer;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_leftbar;
    private javax.swing.JPanel pnl_utama;
    // End of variables declaration//GEN-END:variables
}
