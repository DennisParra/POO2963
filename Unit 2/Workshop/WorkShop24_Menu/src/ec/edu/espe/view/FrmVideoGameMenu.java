/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

/**
 *
 * @author HP
 */
public class FrmVideoGameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmVideoGameMenu
     */
    public FrmVideoGameMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGameOn = new javax.swing.JMenu();
        mnuItmAbout = new javax.swing.JMenuItem();
        mnuItmExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuReport = new javax.swing.JMenu();
        mnuStorage = new javax.swing.JMenu();
        mnuInsert = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuGameOn.setText("Game On");

        mnuItmAbout.setText("Acerca de");
        mnuGameOn.add(mnuItmAbout);

        mnuItmExit.setText("Salir");
        mnuGameOn.add(mnuItmExit);

        jMenuBar1.add(mnuGameOn);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        mnuReport.setText("Accesorios");
        mnuReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuReportMouseClicked(evt);
            }
        });

        mnuStorage.setText("Bodega");

        mnuInsert.setText("Ingresar");
        mnuStorage.add(mnuInsert);

        jMenuItem2.setText("jMenuItem2");
        mnuStorage.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        mnuStorage.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        mnuStorage.add(jMenuItem4);

        mnuReport.add(mnuStorage);

        mnuReporte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuReporte.setText("Report");
        mnuReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteActionPerformed(evt);
            }
        });
        mnuReport.add(mnuReporte);

        jMenuBar1.add(mnuReport);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuReportMouseClicked
        //
    }//GEN-LAST:event_mnuReportMouseClicked

    private void mnuReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteActionPerformed
        FrmReport frmReport = new FrmReport();
        frmReport.setVisible(true);
    }//GEN-LAST:event_mnuReporteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVideoGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVideoGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVideoGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVideoGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVideoGameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu mnuGameOn;
    private javax.swing.JMenuItem mnuInsert;
    private javax.swing.JMenuItem mnuItmAbout;
    private javax.swing.JMenuItem mnuItmExit;
    private javax.swing.JMenu mnuReport;
    private javax.swing.JMenuItem mnuReporte;
    private javax.swing.JMenu mnuStorage;
    // End of variables declaration//GEN-END:variables
}
