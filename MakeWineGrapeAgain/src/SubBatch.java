
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Se7en
 */
public class SubBatch extends javax.swing.JFrame {

    private String batch;
    private String[] data;
    private int subMass;
    private String stage;
    private String sql;

    /**
     * Creates new form SubBatch
     */
    public SubBatch() {
        initComponents();
        this.stageBox.setModel(new DefaultComboBoxModel(Pinwheel.getStages().toArray()));
        this.data = Pinwheel.getData();
        this.batch = this.data[0];
        this.selectedTxt.setText(batch);
        this.subMassSlide.getModel().setMaximum(Integer.parseInt(this.data[4]));
        subMassSlide.getValue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        selectedTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        subMassSlide = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        massTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stageBox = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Sub Batch");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Selected:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 14, -1, -1));

        selectedTxt.setEditable(false);
        selectedTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        getContentPane().add(selectedTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 11, 210, -1));

        backBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 200, -1, -1));

        subMassSlide.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        subMassSlide.setValue(0);
        subMassSlide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                subMassSlideStateChanged(evt);
            }
        });
        getContentPane().add(subMassSlide, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 52, 256, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Mass of Sub Batch");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, 20));

        okBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        getContentPane().add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 200, -1, -1));

        massTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        massTxt.setText("0");
        massTxt.setToolTipText("Sub Batch Mass");
        massTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                massTxtFocusLost(evt);
            }
        });
        massTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massTxtActionPerformed(evt);
            }
        });
        getContentPane().add(massTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 84, 72, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Stage");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, -1, -1));

        stageBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        stageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fermentation", "Pressed", "Maturation", "Blending", "Prep for Bottling", "Bottling", "Storage" }));
        getContentPane().add(stageBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 131, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("KG");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 87, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/WoodNew.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 240));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        subMass = Integer.parseInt(massTxt.getText());
        stage = stageBox.getSelectedItem() + "";
        String subID = batch + "SB";

        ResultSet rs;

        try {
            rs = Pinwheel.queryCCDB("SELECT COUNT (batchid) FROM batch WHERE batchid LIKE '" + batch + "SB%'");
            rs.next();
            int count = rs.getInt(1);

            subID += (count + 1) + "";
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }

            sql = "INSERT INTO subbatch (subbatchid, colour, type, stage, mass, supplierid ) VALUES ('" + subID + "', '" + this.data[1] + "', '" + this.data[2] + "', '" + Pinwheel.stageGetNo(stage)
                    + "', " + subMass + ", '" + this.data[5] + "')"; //prep sub batch sql
            System.out.println(sql);
            Pinwheel.updateCCDB(sql); //insert new sub batch

            //update main batch's mass
            rs = Pinwheel.queryCCDB("SELECT mass FROM batch WHERE batchid = '" + batch + "'"); //get mass of batch
            rs.next();
            double massT = Double.parseDouble(rs.getString(1));

            //calculate new mass in Kg
            sql = "UPDATE batch SET mass = " + (massT - subMass) + " WHERE batchid = '" + batch + "'";
            Pinwheel.updateCCDB(sql); //update main batch

            sql = "CREATE TABLE " + subID + " (chemical varchar(100), amount FLOAT(15))";
            Pinwheel.updateChem(sql);

            String sql = "SELECT * FROM " + batch;
            double amount;
            try {
                rs = Pinwheel.queryChem(sql);
                while (rs.next()) {
                    String chem = rs.getNString(1);
                    amount = rs.getInt(2);
                    amount = amount * (subMass / massT / 100);
                    Pinwheel.insertCustomChemicalAt(subID, chem, amount + "");
                }
                Pinwheel.createSpecGraph(subID);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Blend.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SubBatch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_okBtnActionPerformed

    private void subMassSlideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_subMassSlideStateChanged
        massTxt.setText(subMassSlide.getValue() + "");
    }//GEN-LAST:event_subMassSlideStateChanged

    private void massTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_massTxtFocusLost
        subMassSlide.setValue(Integer.parseInt(massTxt.getText()));
    }//GEN-LAST:event_massTxtFocusLost

    private void massTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massTxtActionPerformed
        subMassSlide.setValue(Integer.parseInt(massTxt.getText()));
    }//GEN-LAST:event_massTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField massTxt;
    private javax.swing.JButton okBtn;
    private javax.swing.JTextField selectedTxt;
    private javax.swing.JComboBox<String> stageBox;
    private javax.swing.JSlider subMassSlide;
    // End of variables declaration//GEN-END:variables
}
