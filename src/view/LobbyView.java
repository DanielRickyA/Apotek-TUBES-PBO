/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author ASUS
 */
public class LobbyView extends javax.swing.JFrame {

    /**
     * Creates new form LobbyView
     */
    public LobbyView() {
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

        jPanel1 = new javax.swing.JPanel();
        LogoPanel = new javax.swing.JPanel();
        iconApotek = new javax.swing.JLabel();
        lblNamaApotek = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCekTensi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCekTensi = new javax.swing.JLabel();
        panelPembelian = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblPembelian = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(9, 153, 19));

        LogoPanel.setBackground(new java.awt.Color(9, 153, 19));

        iconApotek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconApotek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo 1.png"))); // NOI18N

        lblNamaApotek.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 18)); // NOI18N
        lblNamaApotek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNamaApotek.setText("Aptotek Doni Wijaya");

        jLabel2.setText("Created by:");

        javax.swing.GroupLayout LogoPanelLayout = new javax.swing.GroupLayout(LogoPanel);
        LogoPanel.setLayout(LogoPanelLayout);
        LogoPanelLayout.setHorizontalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(iconApotek, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNamaApotek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(LogoPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogoPanelLayout.setVerticalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconApotek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamaApotek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        panelCekTensi.setBackground(new java.awt.Color(9, 153, 19));
        panelCekTensi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCekTensi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCekTensiMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo tensi.png"))); // NOI18N
        jLabel1.setToolTipText("");

        lblCekTensi.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        lblCekTensi.setText("Cek Tensi");

        javax.swing.GroupLayout panelCekTensiLayout = new javax.swing.GroupLayout(panelCekTensi);
        panelCekTensi.setLayout(panelCekTensiLayout);
        panelCekTensiLayout.setHorizontalGroup(
            panelCekTensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCekTensiLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(panelCekTensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblCekTensi))
                .addGap(26, 26, 26))
        );
        panelCekTensiLayout.setVerticalGroup(
            panelCekTensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCekTensiLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCekTensi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPembelian.setBackground(new java.awt.Color(9, 153, 19));
        panelPembelian.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPembelianMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo Pembelian 2.png"))); // NOI18N

        lblPembelian.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        lblPembelian.setText("Pembelian");

        javax.swing.GroupLayout panelPembelianLayout = new javax.swing.GroupLayout(panelPembelian);
        panelPembelian.setLayout(panelPembelianLayout);
        panelPembelianLayout.setHorizontalGroup(
            panelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPembelianLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(panelPembelianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        panelPembelianLayout.setVerticalGroup(
            panelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPembelianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPembelian)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Agung Raynaldi Mangiri");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Doni Wijaya");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Alfares Yusi Tandilolo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Daniel Ricky Alexander");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("F. Hanindya Fernandito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelCekTensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(166, 166, 166)
                        .addComponent(panelPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7)
                                .addContainerGap(56, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(223, 223, 223))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCekTensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelCekTensiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCekTensiMouseClicked
        // TODO add your handling code here:
        CekTensiView ctv = new CekTensiView();
        this.dispose();
        ctv.setVisible(true);
    }//GEN-LAST:event_panelCekTensiMouseClicked

    private void panelPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPembelianMouseClicked
        // TODO add your handling code here:
        PembelianView pv = new PembelianView();
        this.dispose();
        pv.setVisible(true);
    }//GEN-LAST:event_panelPembelianMouseClicked

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
            java.util.logging.Logger.getLogger(LobbyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LobbyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LobbyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LobbyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LobbyView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JLabel iconApotek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCekTensi;
    private javax.swing.JLabel lblNamaApotek;
    private javax.swing.JLabel lblPembelian;
    private javax.swing.JPanel panelCekTensi;
    private javax.swing.JPanel panelPembelian;
    // End of variables declaration//GEN-END:variables
}
