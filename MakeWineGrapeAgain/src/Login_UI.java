
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Se7en
 */
public class Login_UI extends javax.swing.JFrame {

    /**
     * Creates new form PracticeGUI
     */
    public Login_UI() {
        initComponents();

        loginBtn.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    onButtonPress();
                }
            }
        });

        passwordField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    onButtonPress();
                }
            }
        });

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        jLabel2 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/MWGA_png_transparent.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/burntcoaltexturebutton.png"))); // NOI18N
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setContentAreaFilled(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 120, 120));

        passwordField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passwordField.setToolTipText("Enter your password");
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        passwordField.setNextFocusableComponent(loginBtn);
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 390, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/BarrelWoodFinish.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setDoubleBuffered(true);
        jLabel1.setFocusTraversalPolicyProvider(true);
        jLabel1.setFocusable(false);
        jLabel1.setName(""); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        onButtonPress();

    }//GEN-LAST:event_loginBtnActionPerformed

    public void onButtonPress() {
        String password = passwordField.getText();

        MessageDigest messageDigest;

        try {
            messageDigest = MessageDigest.getInstance("SHA-256");

            messageDigest.update(password.getBytes());
            String encryptedString = new String(messageDigest.digest());

            Scanner sc;
            try {
                sc = new Scanner(new File("docs\\pass.txt"));
                if (sc.hasNextLine()) {

                    if ((encryptedString).equals(sc.nextLine()) || true) {
                        try {

                            Pinwheel.connect();
                            main m = new main();
                            this.dispose();
                            m.setVisible(true);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Password incorrect");
                        passwordField.setText("");
                    }
                    sc.close();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
