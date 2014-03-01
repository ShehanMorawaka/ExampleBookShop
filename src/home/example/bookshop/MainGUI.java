package home.example.bookshop;

import javax.swing.JOptionPane;

public class MainGUI extends javax.swing.JFrame {
    public MainGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Insert = new javax.swing.JButton();
        btn_DisplayAllDrag = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_TestDBConnection = new javax.swing.JButton();
        btn_DisplayAllDAO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });

        btn_DisplayAllDrag.setText("Display All (Drag 'n Drop)");
        btn_DisplayAllDrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DisplayAllDragActionPerformed(evt);
            }
        });

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_TestDBConnection.setText("Test DB Connection");
        btn_TestDBConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TestDBConnectionActionPerformed(evt);
            }
        });

        btn_DisplayAllDAO.setText("Display All (Through Data Access Object [DAO])");
        btn_DisplayAllDAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DisplayAllDAOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btn_TestDBConnection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_Insert)
                    .addComponent(btn_DisplayAllDrag)
                    .addComponent(btn_Delete)
                    .addComponent(btn_Update)
                    .addComponent(btn_DisplayAllDAO))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_TestDBConnection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DisplayAllDrag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DisplayAllDAO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        InsertGUI insertGUI = new InsertGUI();
        insertGUI.setVisible(true);
        insertGUI.pack();
        this.dispose();
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void btn_DisplayAllDragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DisplayAllDragActionPerformed
        DisplayAllGUI_DragAndDrop displayAllGUI = new DisplayAllGUI_DragAndDrop();
        displayAllGUI.setVisible(true);
        displayAllGUI.pack();
        this.dispose();
    }//GEN-LAST:event_btn_DisplayAllDragActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        DeleteGUI deleteGUI = new DeleteGUI();
        deleteGUI.setVisible(true);
        deleteGUI.pack();
        this.dispose();
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        UpdateGUI updateGUI = new UpdateGUI();
        updateGUI.setVisible(true);
        updateGUI.pack();
        this.dispose();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_TestDBConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TestDBConnectionActionPerformed
        MyConnection conn = new MyConnection();
        String connection = conn.getConnection().toString();
        if (!connection.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Connection Succeed!\nConnection: "+connection);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Connection Failed!");
        }
        
    }//GEN-LAST:event_btn_TestDBConnectionActionPerformed

    private void btn_DisplayAllDAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DisplayAllDAOActionPerformed
        DisplayAllGUI_DAO displayGUI_DAO = new DisplayAllGUI_DAO();
        displayGUI_DAO.setVisible(true);
        displayGUI_DAO.pack();
    }//GEN-LAST:event_btn_DisplayAllDAOActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_DisplayAllDAO;
    private javax.swing.JButton btn_DisplayAllDrag;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_TestDBConnection;
    private javax.swing.JButton btn_Update;
    // End of variables declaration//GEN-END:variables
}
