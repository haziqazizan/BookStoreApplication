 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniProject.Gui;

import java.io.BufferedReader;
import miniProject.Gui.customer;
import miniProject.Gui.Category;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Order() {
        initComponents();
    
    }

    private Order(int OrderID, String OName, int Qty, double Price) {}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        OrderIDField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        QuantitylField = new javax.swing.JTextField();
        Quantity = new javax.swing.JLabel();
        CustomerName = new javax.swing.JLabel();
        OrderID = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        Import = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        categoryMenu = new javax.swing.JMenu();
        OrderMenu = new javax.swing.JMenuItem();
        CustMenu = new javax.swing.JMenuItem();
        CategoryMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
        jLabel11.setText("ORDER");
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
                .addContainerGap(397, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(280, 280, 280)))
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Home))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Cust Name", "Quantity", "Price"
            }
        ));
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrderTable);

        OrderIDField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        QuantitylField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Quantity.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Quantity.setForeground(new java.awt.Color(0, 153, 153));
        Quantity.setText("Quantity : ");

        CustomerName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CustomerName.setForeground(new java.awt.Color(0, 153, 153));
        CustomerName.setText("CustName : ");

        OrderID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        OrderID.setForeground(new java.awt.Color(0, 153, 153));
        OrderID.setText("OrderID   :");

        Add.setBackground(new java.awt.Color(255, 255, 255));
        Add.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 153, 153));
        Add.setText("add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(255, 255, 255));
        Update.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 153, 153));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Clear.setForeground(new java.awt.Color(0, 153, 153));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
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

        Search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Search.setForeground(new java.awt.Color(0, 153, 153));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Price.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Price.setForeground(new java.awt.Color(0, 153, 153));
        Price.setText("Price :");

        PriceField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Total : ");

        TotalLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TotalLabel.setForeground(new java.awt.Color(0, 0, 255));
        TotalLabel.setText("0");

        Save.setBackground(new java.awt.Color(255, 255, 255));
        Save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Save.setForeground(new java.awt.Color(0, 153, 153));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Import.setBackground(new java.awt.Color(255, 255, 255));
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
        OrderMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OrderMenu.setText("Order");
        OrderMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderMenuActionPerformed(evt);
            }
        });
        categoryMenu.add(OrderMenu);

        CustMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CustMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CustMenu.setText("Customer");
        CustMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustMenuActionPerformed(evt);
            }
        });
        categoryMenu.add(CustMenu);

        CategoryMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        CategoryMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalLabel)
                        .addGap(401, 401, 401))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CustomerName)
                                    .addComponent(Quantity)
                                    .addComponent(Price)
                                    .addComponent(OrderID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OrderIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(nameField)
                                    .addComponent(PriceField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(QuantitylField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Search)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Update)
                                            .addComponent(Delete))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Import, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(99, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OrderID)
                            .addComponent(OrderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerName)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Quantity)
                            .addComponent(QuantitylField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Update)
                            .addComponent(Save))
                        .addGap(19, 19, 19))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalLabel)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clear)
                            .addComponent(Delete)
                            .addComponent(Import))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustMenuActionPerformed
        // TODO add your handling code here:
        new customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustMenuActionPerformed

    private void CategoryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryMenuActionPerformed
        // TODO add your handling code here:
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoryMenuActionPerformed

    private void categoryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryMenuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_categoryMenuActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
          HomePage hpage = new HomePage(); //jump to another Jframe
          hpage.show();
          dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)OrderTable.getModel();
        //set data to text field when raw is selected
        String tblOrderID = model.getValueAt(OrderTable.getSelectedRow(),0).toString();
        String tblName = model.getValueAt(OrderTable.getSelectedRow(),1).toString();
        int tblQty = (int) model.getValueAt(OrderTable.getSelectedRow(),2);
        Double tblPrice = (Double) model.getValueAt(OrderTable.getSelectedRow(),3);
        
        Double TP = tblQty * tblPrice;
        
         

        //set the selected data to textfield in FieldText

        OrderIDField.setText(tblOrderID);
        nameField.setText(tblName);
        QuantitylField.setText(String.valueOf(tblQty));
        PriceField.setText(String.valueOf(tblPrice));
        TotalLabel.setText(String.valueOf("RM "+TP));
       // ProductCombo.set

    }//GEN-LAST:event_OrderTableMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        try { //try Catch method start
            AddOrder();
           // Export();
            Total();
        }
        finally {
            ClearField(); //invoke ClearField Method
        }
        //add input to Jtable according to array order
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)OrderTable.getModel();

        if(OrderTable.getSelectedRowCount()==1) {
            //if single row is selected then update
             int OrderID = Integer.parseInt(OrderIDField.getText());
            String OName = nameField.getText();
            int Qty = Integer.parseInt(QuantitylField.getText());
            double Price = Double.parseDouble(PriceField.getText());
            
            
            Double Total = Qty * Price;
            TotalLabel.setText(String.valueOf("RM "+Total));
            //we repopulated our table
            model.setValueAt(OrderID, OrderTable.getSelectedRow(), 0);
            model.setValueAt(OName,OrderTable.getSelectedRow(), 1);
            model.setValueAt(Qty,OrderTable.getSelectedRow(), 2);
            model.setValueAt(Price,OrderTable.getSelectedRow(),3);
            
            JOptionPane.showMessageDialog(this,"update Successfully");
            ClearField();
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        OrderIDField.setText("");
        nameField.setText("");
        QuantitylField.setText("");
        SearchField.setText("");
        PriceField.setText("");
        TotalLabel.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)OrderTable.getModel();

        //If Statement
        int i = OrderTable.getSelectedRow();

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

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)OrderTable.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model); //filter and sorting table model
        OrderTable.setRowSorter(tr); //arranging table
        tr.setRowFilter(RowFilter.regexFilter(SearchField.getText().trim())); //find desired data
    }//GEN-LAST:event_SearchActionPerformed

    private void JDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JDateMouseClicked

    }//GEN-LAST:event_JDateMouseClicked

    private void OrderMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderMenuActionPerformed
        new customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OrderMenuActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        String filePath = "C:\\Users\\Netbean\\Order.txt";
        File file = new File(filePath);
        try {
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i <OrderTable.getRowCount(); i++){
                for(int j=0; j< OrderTable.getColumnCount(); j++){
                    bw.write(OrderTable.getValueAt(i, j).toString()+" ,");
                    
                }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
        // TODO add your handling code here:
        String filePath = "C:\\Users\\Netbean\\Order.txt";
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)OrderTable.getModel();
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JMenuItem CategoryMenu;
    private javax.swing.JButton Clear;
    private javax.swing.JMenuItem CustMenu;
    private javax.swing.JLabel CustomerName;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Home;
    private javax.swing.JButton Import;
    private javax.swing.JLabel OrderID;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JMenuItem OrderMenu;
    private javax.swing.JTable OrderTable;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField PriceField;
    private javax.swing.JLabel Quantity;
    private javax.swing.JTextField QuantitylField;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JButton Update;
    private javax.swing.JMenu categoryMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables

    public void AddOrder(){
        DefaultTableModel model = (DefaultTableModel)OrderTable.getModel();//access Jtable 

        //assigned JTextField to variable from java class
        int OrderID = Integer.parseInt(OrderIDField.getText());
        String OName = nameField.getText();
        int Qty = Integer.parseInt(QuantitylField.getText());
        double Price = Double.parseDouble(PriceField.getText());
 

        Order C = new Order(OrderID,OName,Qty,Price); //invoke javaclass Cust with parameter 
        model.addRow(new Object[]{OrderID,OName,Qty,Price}); //insert data to JTable 
 
        
    }
    
    public void Total(){
    
     int Qty = Integer.parseInt(QuantitylField.getText());
        double Price = Double.parseDouble(PriceField.getText());
        Double Total = Qty * Price;
         TotalLabel.setText(String.valueOf("RM "+Total));
    }
    
   /* public void Export() {
            String filePath = "C:\\Users\\User\\Desktop\\NetBeansProjects\\StoreApplication\\Order.txt"; //create path to save the txt file
            File file = new File(filePath); 
            try{
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                
                for(int i = 0; i<OrderTable.getRowCount();i++){
                    for(int j=0;j<OrderTable.getColumnCount();j++){
                        bw.write(OrderTable.getValueAt(i,j).toString()+" ");
                    }
                    bw.newLine();
                }
                bw.close();
                fw.close();
            }
            catch(IOException e){
            
            }
                        }  */
    
    private void ClearField() {
         OrderIDField.setText("");
        nameField.setText("");
        QuantitylField.setText("");
        SearchField.setText("");
        PriceField.setText("");
       
    }
}
