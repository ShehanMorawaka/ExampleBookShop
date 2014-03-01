package home.example.bookshop;

//import java.sql.*;
import javax.swing.table.DefaultTableModel.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class DisplayAllGUI_DAO extends javax.swing.JFrame {
    public DisplayAllGUI_DAO() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Data = new javax.swing.JTable();
        btn_GetData = new javax.swing.JButton();
        lbl_Heading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Display (DAO)");

        tbl_Data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_Data.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tbl_Data);

        btn_GetData.setText("Fill Data");
        btn_GetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_GetData)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_Heading, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_GetData)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GetDataActionPerformed
        
        lbl_Heading.setText("Taken by using DAO (Data Access Object)");
        
        BookDAO bdao = new BookDAO();
        ArrayList<Book> list = new ArrayList<Book>();
        
        try
        {
            for(Object object: (ArrayList)bdao.getAllBooks())
            {
                list.add((Book)object);
            }
        }
        catch(Exception e)
        {
            System.err.println("Error in importing ArrayList of Books");
        }
        
        DefaultTableModel dtModel = new DefaultTableModel();
        Object[] columnNames = new Object[5];
        
        columnNames[0] = "Book_No";
        columnNames[1] = "Book_Title";
        columnNames[2] = "ISBN";
        columnNames[3] = "Author_FirstName";
        columnNames[4] = "Author_Surname";
        
        dtModel.setColumnIdentifiers(columnNames);
        
        //We have to convert each Student type bundle into Object type, before adding to the table.
        Object[] convertedObjects = new Object[5];
        
        if (list.size() > 0)
        {
            for (int i = 0; i<list.size(); i++)
            {
                Book hashmap = list.get(i);//Take the record
                convertedObjects[0] = hashmap.getBookNo().toString();
                convertedObjects[1] = hashmap.getBookTitle().toString();
                convertedObjects[2] = hashmap.getIsbn().toString();
                convertedObjects[3] = hashmap.getAuthorFirstName().toString();
                convertedObjects[4] = hashmap.getAuthorSurname().toString();
                
                dtModel.addRow(convertedObjects);
            }
        }
        
        this.tbl_Data.setModel(dtModel);
        
    }//GEN-LAST:event_btn_GetDataActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayAllGUI_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAllGUI_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAllGUI_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAllGUI_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAllGUI_DAO().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GetData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Heading;
    private javax.swing.JTable tbl_Data;
    // End of variables declaration//GEN-END:variables
}
