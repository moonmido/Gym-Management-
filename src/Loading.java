/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
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

        state = new javax.swing.JLabel();
        counter = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        state.setForeground(new java.awt.Color(153, 0, 255));
        state.setText("Loading ......");
        getContentPane().add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, -1));

        counter.setFont(new java.awt.Font("Showcard Gothic", 2, 24)); // NOI18N
        counter.setForeground(new java.awt.Color(153, 0, 255));
        counter.setText("99%");
        getContentPane().add(counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 242, 59, 35));

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 283, 715, 17));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Desktop\\my projects\\projet\\Black Golden Modern Luxury Logo.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 430, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yellow_geometric_circular_shape_background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 750, 320));

        setSize(new java.awt.Dimension(715, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
Loading l = new Loading();
l.show();
Login lg = new Login();
try{
    for(int i=0;i<100;i++){
        Thread.sleep(25);
        l.counter.setText(Integer.toString(i)+"%");
        l.bar.setValue(i);
        if(i==30){
            l.state.setText("Starting soon .......");
        }
        if(i==70){
            l.state.setText("Statring .......");
        }
    }
}catch(Exception e){
}
l.dispose();
lg.show();
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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar bar;
    public javax.swing.JLabel counter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel state;
    // End of variables declaration//GEN-END:variables
}
