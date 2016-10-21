/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
public class AdminMenu extends javax.swing.JFrame {



    /**
     * Creates new form AdminMenu
     */

    public AdminMenu() {
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

        editBatchBtn = new javax.swing.JButton();
        editSuppBtn = new javax.swing.JButton();
        editChemBtn = new javax.swing.JButton();
        delSuppBtn = new javax.swing.JButton();
        delChemBtn = new javax.swing.JButton();
        delBatchBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrator");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editBatchBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        editBatchBtn.setText("Edit Batch");
        editBatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBatchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editBatchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, -1));

        editSuppBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        editSuppBtn.setText("Edit Suppliers");
        editSuppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSuppBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editSuppBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, 140, -1));

        editChemBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        editChemBtn.setText("Edit Chemicals");
        editChemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editChemBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editChemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 140, -1));

        delSuppBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        delSuppBtn.setText("Delete Suppliers");
        delSuppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delSuppBtnActionPerformed(evt);
            }
        });
        getContentPane().add(delSuppBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, -1));

        delChemBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        delChemBtn.setText("Delete Chemicals");
        delChemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delChemBtnActionPerformed(evt);
            }
        });
        getContentPane().add(delChemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 140, -1));

        delBatchBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        delBatchBtn.setText("Delete Batch");
        delBatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBatchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(delBatchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 140, -1));

        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("ADMIN MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/WoodNew.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editBatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBatchBtnActionPerformed
        Pinwheel.setBounce("edit");
        Pinwheel.setSearchType("batch");
        SearchBatch s = new SearchBatch();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editBatchBtnActionPerformed

    private void delBatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBatchBtnActionPerformed
        Pinwheel.setBounce("delete");
        Pinwheel.setSearchType("batch");
        SearchBatch s = new SearchBatch();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_delBatchBtnActionPerformed

    private void delChemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delChemBtnActionPerformed
        Pinwheel.setBounce("delete");
        Pinwheel.setSearchType("chemical");
        SearchBatch s = new SearchBatch();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_delChemBtnActionPerformed

    private void delSuppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delSuppBtnActionPerformed
        Pinwheel.setBounce("delete");
        Pinwheel.setSearchType("supplier");
        SearchBatch s = new SearchBatch();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_delSuppBtnActionPerformed

    private void editChemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editChemBtnActionPerformed
       Pinwheel.setBounce("edit");
        Pinwheel.setSearchType("chemical");
        SearchBatch s = new SearchBatch();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editChemBtnActionPerformed

    private void editSuppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSuppBtnActionPerformed
        Pinwheel.setBounce("edit");
        Pinwheel.setSearchType("supplier");
        SearchBatch s = new SearchBatch();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editSuppBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delBatchBtn;
    private javax.swing.JButton delChemBtn;
    private javax.swing.JButton delSuppBtn;
    private javax.swing.JButton editBatchBtn;
    private javax.swing.JButton editChemBtn;
    private javax.swing.JButton editSuppBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
