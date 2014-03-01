package home.example.bookshop;

import javax.swing.JOptionPane;

public class DeleteGUI extends javax.swing.JFrame {
    
    public DeleteGUI() {
        initComponents();
        BookDAO bdao = new BookDAO();
        String[] bookTitles = bdao.getBookTitles();
        for(String s: bookTitles)
        {
            if (s != null)
            {
                cmbbx_Title.addItem(s);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbbx_Title = new javax.swing.JComboBox();
        btn_ShowDetails = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_ISBN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_AuFN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_AuSN = new javax.swing.JTextField();
        btn_Delete = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Please select data record to delete");

        cmbbx_Title.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbx_TitleItemStateChanged(evt);
            }
        });
        cmbbx_Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbx_TitleActionPerformed(evt);
            }
        });

        btn_ShowDetails.setText("Show details of the Book");
        btn_ShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowDetailsActionPerformed(evt);
            }
        });

        jLabel5.setText("ISBN");

        txt_ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ISBNActionPerformed(evt);
            }
        });

        jLabel6.setText("Author Firstname");

        jLabel7.setText("Author Surname");

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ShowDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addGap(366, 366, 366))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbbx_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_ISBN)
                    .addComponent(txt_AuFN)
                    .addComponent(txt_AuSN)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(366, 366, 366))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbbx_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_ShowDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_AuFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_AuSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        new MainGUI().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void cmbbx_TitleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbx_TitleItemStateChanged
        //        JOptionPane.showMessageDialog(rootPane, "Action Happened on Combo box");
        txt_ISBN.setText("");
        txt_AuFN.setText("");
        txt_AuSN.setText("");
    }//GEN-LAST:event_cmbbx_TitleItemStateChanged

    private void cmbbx_TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbx_TitleActionPerformed
        //        JOptionPane.showMessageDialog(rootPane, "Action Happened on Combo box");
    }//GEN-LAST:event_cmbbx_TitleActionPerformed

    private void btn_ShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowDetailsActionPerformed

        if(cmbbx_Title.getSelectedItem() != null)
        {
            String selectedTitle = cmbbx_Title.getSelectedItem().toString();
            String getBookQuery = "SELECT * "
            + "FROM `book` "
            + "WHERE `Book_Title`='"+selectedTitle+"'";
            BookDAO bdao = new BookDAO();
            Book book = bdao.getBookFromTitle(getBookQuery);
            txt_ISBN.setText(book.getIsbn().toString());
            txt_AuFN.setText(book.getAuthorFirstName());
            txt_AuSN.setText(book.getAuthorSurname());
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Please select a title");
        }

    }//GEN-LAST:event_btn_ShowDetailsActionPerformed

    private void txt_ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ISBNActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

        if(cmbbx_Title.getSelectedItem() != null)
        {
            String selectedTitle = cmbbx_Title.getSelectedItem().toString();
            String getBookQuery = "SELECT * "
            + "FROM `book` "
            + "WHERE `Book_Title`='"+selectedTitle+"'";
            BookDAO bdao = new BookDAO();
            Book book = bdao.getBookFromTitle(getBookQuery);
            int bookNo = book.getBookNo();
            bdao.deleteBook(bookNo);
            
            //Refreshing the Combo Box
            cmbbx_Title.removeItem(selectedTitle);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Please select a title");
        }

    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        BookDAO bdao = new BookDAO();
        String[] bookTitles = bdao.getBookTitles();
        for(String s: bookTitles)
        {
            if (s != null)
            {
                cmbbx_Title.addItem(s);
            }
        }
        cmbbx_Title.setSelectedIndex(0);
        txt_ISBN.setText("");
        txt_AuFN.setText("");
        txt_AuSN.setText("");
    }//GEN-LAST:event_btn_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_ShowDetails;
    private javax.swing.JComboBox cmbbx_Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_AuFN;
    private javax.swing.JTextField txt_AuSN;
    private javax.swing.JTextField txt_ISBN;
    // End of variables declaration//GEN-END:variables
}
