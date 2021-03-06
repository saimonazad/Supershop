/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalJframe;

import MainFrame.javaconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
/**
 *
 * @author saimonazad
 */
public class SaleProduct extends javax.swing.JInternalFrame {

    int CheckoutQuantity=0;
    float totalbill=0;
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form SaleProduct
     */
    public SaleProduct() {
        initComponents();
        conn=javaconnect.ConnecrDb();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SellDate = new javax.swing.JTextField();
        BarcodeSearch = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        ProductID = new javax.swing.JTextField();
        SellQuantity = new javax.swing.JTextField();
        ProductQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EmployeeID = new javax.swing.JTextField();
        MemberID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Price = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Checkout_itemNo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TotalBill = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MoneyGiven = new javax.swing.JTextField();
        Paid = new javax.swing.JButton();
        Change = new javax.swing.JButton();
        Purchase = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jButton1.setText("jButton1");

        jLabel13.setText("jLabel13");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Barcode No");

        jLabel2.setText("Product Name");

        jLabel3.setText("Product ID");

        jLabel4.setText("Date");

        jLabel5.setText("Quantity");

        jLabel6.setText("Available Quantity");

        SellDate.setText("jTextField1");

        BarcodeSearch.setText("jTextField2");
        BarcodeSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BarcodeSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BarcodeSearchKeyTyped(evt);
            }
        });

        ProductName.setText("jTextField3");

        ProductID.setText("jTextField4");

        SellQuantity.setText("jTextField5");

        ProductQuantity.setText("jTextField6");

        jLabel7.setText("Employee ID");

        EmployeeID.setText("jTextField7");

        MemberID.setText("jTextField8");

        jLabel8.setText("Member ID");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Barcode No", "Product Name", "Product ID", "Quantity", "Price", "Employee Id", "Member Id"
            }
        ));
        jScrollPane1.setViewportView(Table);

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel9.setText("Price");

        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Price.setText("jTextField1");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setText("Total Item");

        Checkout_itemNo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Checkout_itemNo.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setText("Total Bill");

        TotalBill.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        TotalBill.setText("jLabel11");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Money Given");

        MoneyGiven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MoneyGiven.setText("jTextField1");

        Paid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Paid.setText("Paid");

        Change.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Change.setText("Change If Any");

        Purchase.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Purchase.setText("Purchase");
        Purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Return");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("0.00 TAKA");

        Print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Checkout_itemNo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MoneyGiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Print))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Change, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addComponent(Paid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(TotalBill)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BarcodeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SellDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Search)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SellQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(SellDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SellQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(BarcodeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(ProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Checkout_itemNo)
                            .addComponent(jLabel12)
                            .addComponent(TotalBill))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(MoneyGiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Paid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Change))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BarcodeSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BarcodeSearchKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BarcodeSearchKeyReleased

    private void BarcodeSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BarcodeSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BarcodeSearchKeyTyped

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        try {
            String sql=" select PRODUCT.ProductID,PRODUCT.ProductTitle,PRODUCT.ProductBrand,PRODUCT.SubCategoryID,STOCK.Quantity,STOCK.SellPrice,STOCK.PurchaseNo,STOCK.BarcodeNo,STOCK.EmployeeID,STOCK.SupplierID,STOCK.ManufactureDate,STOCK.ExpDate from PRODUCT inner join  STOCK on PRODUCT.ProductID=STOCK.ProductID where STOCK.BarcodeNo=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, BarcodeSearch.getText());
            rs=pst.executeQuery();
            
            if (rs.next()) {
                 ProductName.setText(rs.getString("ProductTitle"));
                 ProductID.setText(rs.getString("ProductID"));
                ProductQuantity.setText(rs.getString("Quantity"));
                 Price.setText(rs.getString("SellPrice"));

                
            }
                           
               
            
            
                
            
            //Search_Table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:.
        int i=0;
        DefaultTableModel dtm=(DefaultTableModel)Table.getModel();
        Object[] row=new Object[8];
        
        //"Date", "Barcode No", "Product Name", "Product ID", "Quantity", "Price", "Employee Id", "Member Id"
        
        row[0]=SellDate.getText();
        row[1]=BarcodeSearch.getText();
        row[2]=ProductName.getText();
        row[3]=ProductID.getText();
        row[4]=SellQuantity.getText();
        row[5]=Price.getText();
        row[6]=EmployeeID.getText();
        row[7]=MemberID.getText();
        dtm.addRow(row);
        
        CheckoutQuantity++;
        Checkout_itemNo.setText(Integer.toString(CheckoutQuantity));
        totalbill=totalbill+(Float.parseFloat(Price.getText())*Integer.parseInt(SellQuantity.getText()));
        TotalBill.setText(Float.toString(totalbill));
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseActionPerformed
        // TODO add your handling code here:
        try {
            int row=Table.getRowCount();
            int col=Table.getColumnCount();
            String sql="Insert into SELL (ProductID,SellQuantity,SellDate,EmployeeID,MemberID) values(?,?,?,?,?)"; 
                pst=conn.prepareStatement(sql);
            for (int i = 0;  i< row; i++) {
                 
                DefaultTableModel dtm=(DefaultTableModel)Table.getModel();
                
                pst.setString(1, dtm.getValueAt(i, 3).toString());
                pst.setString(2, dtm.getValueAt(i, 4).toString());
                pst.setString(3, dtm.getValueAt(i, 0).toString());
                pst.setString(4, dtm.getValueAt(i, 6).toString());    
                pst.setString(5, dtm.getValueAt(i, 7).toString());        
                pst.execute();
                    
            
            }
            JOptionPane.showMessageDialog(null, "Purchased");
        } catch (Exception e) {
        }
        /*try {
           String sql="Insert into SELL (ProductID,SellQuantity,SellDate,EmployeeID,MemberID) values(?,?,?,?,?)"; 
           pst=conn.prepareStatement(sql);
           pst.setString(1, ProductID.getText());
           pst.setString(2, SellQuantity.getText());
           pst.setString(3, SellDate.getText());
           pst.setString(4, EmployeeID.getText());
           pst.setString(5, MemberID.getText());
           pst.execute();
           JOptionPane.showMessageDialog(null, "Purchased");
        } catch (Exception e) {
        }*/
    }//GEN-LAST:event_PurchaseActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
        try{
            Document document=new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
            document.open();
            document.add(new Paragraph("                               Super Shop",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD)));
            document.add(new Paragraph("                                           Gulshan,Dhaka-1212",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD)));
            document.add(new Paragraph("                                               Tel-88312569",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD)));
            document.add(new Paragraph("Invoice No : ",FontFactory.getFont(FontFactory.TIMES,12,Font.NORMAL)));
            document.add(new Paragraph("Sold By : ",FontFactory.getFont(FontFactory.TIMES,12,Font.NORMAL)));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            document.add(new Paragraph("Product Name                          Quantity                                          Price",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD)));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            
            
            
            int row=Table.getRowCount();
            int col=Table.getColumnCount();
            for (int i = 0;  i< row; i++) {
                 
                DefaultTableModel dtm=(DefaultTableModel)Table.getModel();
                
                document.add(new Paragraph(dtm.getValueAt(i, 2).toString()+"                                                     "+dtm.getValueAt(i, 4).toString()+"                                                          "+dtm.getValueAt(i, 5).toString()));
            }
            document.add(new Paragraph(""));
            document.add(new Paragraph(""));
            document.add(new Paragraph(""));
            document.add(new Paragraph(""));
            document.add(new Paragraph(""));
            document.add(new Paragraph(""));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            document.add(new Paragraph("                                                                                                        Total   "+totalbill+"Taka",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD)));
            
            
            
               
            document.close();
        }catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_PrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField BarcodeSearch;
    public javax.swing.JButton Change;
    public javax.swing.JLabel Checkout_itemNo;
    public javax.swing.JTextField EmployeeID;
    public javax.swing.JTextField MemberID;
    public javax.swing.JTextField MoneyGiven;
    public javax.swing.JButton Paid;
    public javax.swing.JTextField Price;
    public javax.swing.JButton Print;
    public javax.swing.JTextField ProductID;
    public javax.swing.JTextField ProductName;
    public javax.swing.JTextField ProductQuantity;
    public javax.swing.JButton Purchase;
    public javax.swing.JButton Search;
    public javax.swing.JTextField SellDate;
    public javax.swing.JTextField SellQuantity;
    public javax.swing.JTable Table;
    public javax.swing.JLabel TotalBill;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
