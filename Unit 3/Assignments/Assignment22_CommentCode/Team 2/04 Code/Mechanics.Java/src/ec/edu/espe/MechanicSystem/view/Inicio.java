
package ec.edu.espe.MechanicSystem.view;
import ec.edu.espe.FastPay.model.Cargar;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import static javax.swing.UIManager.get;

/**
 *
 * @author Freddy Páez
 */



public final class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    Cargar hilo;

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Images/logo.png")).getImage());
        iniciar();

    }
    
    
    
   

    public void iniciar() {
        setLocationRelativeTo(null);
        hilo = new Cargar(getProgress());
        hilo.start();
        hilo = null;
        this.setLocationRelativeTo(null);

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prgssLoadingBar = new javax.swing.JProgressBar();
        blbWelcome = new javax.swing.JLabel();
        labBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(600, 376));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prgssLoadingBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                prgssLoadingBarStateChanged(evt);
            }
        });
        getContentPane().add(prgssLoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 494, 25));

        blbWelcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        blbWelcome.setText("WELCOME ");
        getContentPane().add(blbWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, 50));

        labBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        labBack.setText("¡WELCOME!");
        getContentPane().add(labBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 850, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prgssLoadingBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prgssLoadingBarStateChanged
        if (prgssLoadingBar.getValue() == 100) {
            
            frmLogin vp = new frmLogin();
            vp.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_prgssLoadingBarStateChanged

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blbWelcome;
    private javax.swing.JLabel labBack;
    private javax.swing.JProgressBar prgssLoadingBar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the progress
     */
    public javax.swing.JProgressBar getProgress() {
        return prgssLoadingBar;
    }

    
   
}