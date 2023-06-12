/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniProject.Gui;


import java.io.BufferedReader;
import miniProject.Gui.Order;
import miniProject.Gui.Category;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class customer extends javax.swing.JFrame {
    
    public customer() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        CustID = new javax.swing.JLabel();
        CustName = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Import = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        categoryMenu = new javax.swing.JMenu();
        OrderMenu = new javax.swing.JMenuItem();
        CustMenu = new javax.swing.JMenuItem();
        CategoryMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Add.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 153, 153));
        Add.setText("add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 153, 153));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 153, 153));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        CustID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CustID.setForeground(new java.awt.Color(0, 153, 153));
        CustID.setText("Customer ID :");

        CustName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CustName.setForeground(new java.awt.Color(0, 153, 153));
        CustName.setText("Customer Name:");

        Email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 153, 153));
        Email.setText("Email :");

        IDField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        EmailField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Home.setForeground(new java.awt.Color(0, 153, 153));
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 51));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CUSTOMER PRODUCT");
        jLabel11.setToolTipText("");

        jLabel7.setBackground(new java.awt.Color(0, 0, 51));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INVENTORY MANAGEMENT SYSTEM");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(146, 146, 146)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Home)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        CustTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Email"
            }
        ));
        CustTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustTable);
        if (CustTable.getColumnModel().getColumnCount() > 0) {
            CustTable.getColumnModel().getColumn(0).setPreferredWidth(3);
            CustTable.getColumnModel().getColumn(1).setPreferredWidth(25);
            CustTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        Clear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Clear.setForeground(new java.awt.Color(0, 153, 153));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        SearchField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Search.setForeground(new java.awt.Color(0, 153, 153));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Save.setForeground(new java.awt.Color(0, 153, 153));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Import.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Import.setForeground(new java.awt.Color(0, 153, 153));
        Import.setText("Import");
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });

        categoryMenu.setText("File");
        categoryMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryMenuActionPerformed(evt);
            }
        });

        OrderMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        OrderMenu.setText("Order");
        OrderMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderMenuActionPerformed(evt);
            }
        });
        categoryMenu.add(OrderMenu);

        CustMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CustMenu.setText("Customer");
        CustMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustMenuActionPerformed(evt);
            }
        });
        categoryMenu.add(CustMenu);

        CategoryMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        CategoryMenu.setText("Category");
        CategoryMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryMenuActionPerformed(evt);
            }
        });
        categoryMenu.add(CategoryMenu);

        jMenuBar1.add(categoryMenu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CustID)
                                    .addComponent(CustName))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(IDField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Search)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(Save)
                                .addGap(18, 18, 18)
                                .addComponent(Import)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Import, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustID)
                            .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustName)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
     
      try { //try Catch method start
        AddCustomer();
        //Export(); tak sure yang ni
      }
         finally {
      ClearField(); //invoke ClearField Method
      }
      
     //add input to Jtable according to array order
    }//GEN-LAST:event_AddActionPerformed
    
    
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)CustTable.getModel();
        
        //If Statement
        int i = CustTable.getSelectedRow(); 
        
            if(i>=0){
              int deleteResult = JOptionPane.showConfirmDialog(this, "Delete this Data ?","Delete",JOptionPane.YES_NO_OPTION);//ask user for delete confirmation
              
                    if(deleteResult == JOptionPane.YES_OPTION){ 
                        model.removeRow(i);
                        JOptionPane.showMessageDialog(this,"Delete Successfully");
                        ClearField();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Delete Error");
                    }
                    }
            else{
              ClearField();
                    }
        //End If Statement
    }//GEN-LAST:event_DeleteActionPerformed

    private void CustTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)CustTable.getModel();
        
        //set data to text field when raw is selected
            String tblUser = model.getValueAt(CustTable.getSelectedRow(),0).toString();
            String tblProduct = model.getValueAt(CustTable.getSelectedRow(),1).toString();
            String tblQuantity = model.getValueAt(CustTable.getSelectedRow(),2).toString();
           
          
          //set the selected data to textfield in FieldText
          
          IDField.setText(tblUser);
          nameField.setText(tblProduct);
          EmailField.setText(tblQuantity);
          
    }//GEN-LAST:event_CustTableMouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        IDField.setText("");
        nameField.setText("");
        EmailField.setText("");
        SearchField.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
          HomePage hpage = new HomePage(); //jump to another Jframe
          hpage.show();
          dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
       DefaultTableModel model = (DefaultTableModel)CustTable.getModel();
       
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model); //filter and sorting table model
       CustTable.setRowSorter(tr); //arranging table 
       tr.setRowFilter(RowFilter.regexFilter(SearchField.getText().trim())); //find desired data
    }//GEN-LAST:event_SearchActionPerformed

    private void CustMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustMenuActionPerformed
        // TODO add your handling code here:
        new customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustMenuActionPerformed

    private void categoryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryMenuActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_categoryMenuActionPerformed

    private void CategoryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryMenuActionPerformed
        // TODO add your handling code here:
         new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoryMenuActionPerformed

    private void OrderMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderMenuActionPerformed
        // TODO add your handling code here:
        new Order().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OrderMenuActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        String filePath = "C:\\Users\\Netbean\\customer.txt";
        File file = new File(filePath);
        try {
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i <CustTable.getRowCount(); i++){
                for(int j=0; j< CustTable.getColumnCount(); j++){
                    bw.write(CustTable.getValueAt(i, j).toString()+" ,");
                    
                }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)CustTable.getModel();

        if(CustTable.getSelectedRowCount()==1) {
            //if single row is selected then update
            String UserID = IDField.getText();
            String Name = nameField.getText();
            String Quantity = EmailField.getText();

            //we repopulated our table
            model.setValueAt(UserID, CustTable.getSelectedRow(), 0);
            model.setValueAt(Name,CustTable.getSelectedRow(), 1);
            model.setValueAt(Quantity,CustTable.getSelectedRow(), 2);

            JOptionPane.showMessageDialog(this,"update Successfully");
            ClearField();
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
        // TODO add your handling code here:
        String filePath = "C:\\Users\\Netbean\\customer.txt";
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)CustTable.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i< lines.length; i++){
                String[] row = lines[i].toString().split(",");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
         java.awt.EventQueue.invokeLater(() -> {
            new customer().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JMenuItem CategoryMenu;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel CustID;
    private javax.swing.JMenuItem CustMenu;
    private javax.swing.JLabel CustName;
    private javax.swing.JTable CustTable;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailField;
    private javax.swing.JButton Home;
    private javax.swing.JTextField IDField;
    private javax.swing.JButton Import;
    private javax.swing.JMenuItem OrderMenu;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton Update;
    private javax.swing.JMenu categoryMenu;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
  
    public void AddCustomer(){
        //assigned JTextField to variable from java class
        int CID = Integer.parseInt(IDField.getText());
        String CName = nameField.getText();
        String CEmail = EmailField.getText();
        
        
        DefaultTableModel model = (DefaultTableModel)CustTable.getModel(); //access Jtable 
        model.addRow(new Object[]{CID,CName,CEmail});
        
    }
    
    /*  public void Export() {
            String filePath = "C:\\Users\\User\\Desktop\\NetBeansProjects\\StoreApplication\\Customer.txt"; //create path to save the txt file
            File file = new File(filePath); 
            try{
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for(int i = 0; i<CustTable.getRowCount();i++){
                    for(int j=0;j<CustTable.getColumnCount();j++){
                        bw.write(CustTable.getValueAt(i,j).toString()+" ");
                    }
                    bw.newLine();
                }
                bw.close();
                fw.close();
            }
            catch(IOException e){
            
            }
                        } */
    public void ClearField(){
      IDField.setText("");
        nameField.setText("");
        EmailField.setText("");
       
    }
    
    
}
