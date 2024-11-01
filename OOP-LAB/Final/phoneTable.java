/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.phonedirectory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Anas
 */
public class phoneTable extends javax.swing.JFrame {

    DefaultTableModel tblModel;
    String tableData [];
    String name;
    String contact;
    String email;
    /**
     * Creates new form phoneTable
     */
    public phoneTable() {
        initComponents();
        tableInfo();
    }

    public void searching(){

        try(BufferedReader reader = new BufferedReader(new FileReader("phoneDirectory.txt"))){
            tblModel = (DefaultTableModel)jTable1.getModel();

            String line;
            while ((line = reader.readLine()) != null){

                String [] TableValue = line.split(",");
                if(TableValue.length ==3){

                    name = TableValue[0].replaceAll("\"", "");
                    contact = TableValue[1].replaceAll("\"", "");
                    email = TableValue[2].replaceAll("\"", "");




                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String searchItem= searchField.getText();
        if(searchItem.equals(name)){

            JOptionPane.showMessageDialog(this, "Contact was Found: "+name+"     "+contact+"     "+email);

        }
        else{
            JOptionPane.showMessageDialog(this, "contact does not exist");
        }


    }





    private void tableInfo(){

        try(BufferedReader reader = new BufferedReader(new FileReader("phoneDirectory.txt"))){
            tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.setRowCount(0);
            String line;
            while ((line = reader.readLine()) != null){

                String [] TableValue = line.split(",");
                if(TableValue.length ==3){

                    String name = TableValue[0].replaceAll("\"", "");
                    String contact = TableValue[1].replaceAll("\"", "");
                    String email = TableValue[2].replaceAll("\"", "");

                    String tableData [] ={name,contact,email};


                    //add string arrays data to table
                    tblModel.addRow(tableData);



                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        searchField = new javax.swing.JTextField();
        addCon = new javax.swing.JButton();
        editBut = new javax.swing.JButton();
        delBut = new javax.swing.JButton();
        reloadCon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addCon.setText("Add Contact");
        addCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConActionPerformed(evt);
            }
        });

        editBut.setText("Edit");
        editBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButActionPerformed(evt);
            }
        });

        delBut.setText("Delete");

        reloadCon.setText("Reload Contacts");
        reloadCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadConActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Search Contacts");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Name", "Contact No", "Email"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(addCon)
                                                .addGap(18, 18, 18)
                                                .addComponent(editBut)
                                                .addGap(18, 18, 18)
                                                .addComponent(delBut)
                                                .addGap(18, 18, 18)
                                                .addComponent(reloadCon))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                                        .addComponent(jLabel1))))
                                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addCon)
                                        .addComponent(editBut)
                                        .addComponent(delBut)
                                        .addComponent(reloadCon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchField)
                                        .addComponent(searchButton))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void addConActionPerformed(java.awt.event.ActionEvent evt) {
        Q2phonebook addingCon = new Q2phonebook();
        addingCon.setVisible(true);
        this.dispose();

    }

    private void editButActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        searching();

    }

    private void reloadConActionPerformed(java.awt.event.ActionEvent evt) {

        phoneTable reload = new phoneTable();
        reload.setVisible(true);
        this.dispose();


    }

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
            java.util.logging.Logger.getLogger(phoneTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(phoneTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(phoneTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(phoneTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new phoneTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addCon;
    private javax.swing.JButton delBut;
    private javax.swing.JButton editBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton reloadCon;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration
}
