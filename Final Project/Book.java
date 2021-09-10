
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Farkande
 */
public class Book extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Book() {
        initComponents();
        Connect();
        Category();
        Author();
       Publisher();
       Book_Load();
    }
    
    public class CategoryItem
    {
        int id;
        String name;
        
        public CategoryItem(int id, String name)
        {
            this.id = id;
            this.name = name;
            
        }
        public String toString()
        {
            return name;
        }
         
    }
     
    
    
    public class AuthorItem
    {
        int id;
        String name;
        
        public AuthorItem(int id, String name)
        {
            this.id = id;
            this.name = name;
            
        }
        public String toString()
        {
            return name;
        }
         
    }
    
    
    
    public class PublisherItem
    {
        int id;
        String name;
        
        public PublisherItem(int id, String name)
        {
            this.id = id;
            this.name = name;
            
        }
        public String toString()
        {
            return name;
        }
         
    }
    
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:MySql://localhost/vlibrary","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
    
    public void Category()
    {
        try {
            pst = con.prepareStatement("select * from Category");
             rs = pst.executeQuery();
             txtcategory.removeAllItems();
             
           while (rs.next())
           {
               txtcategory.addItem(new CategoryItem (rs.getInt(1),rs.getString(2)));
               
           }
             
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Author()
    {
        try {
            pst = con.prepareStatement("select * from author");
             rs = pst.executeQuery();
             txtauthor.removeAllItems();
             
           while (rs.next())
           {
               txtauthor.addItem(new AuthorItem (rs.getInt(1),rs.getString(2)));
               
           }
             
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void Publisher()
    {
        try {
            pst = con.prepareStatement("select * from publisher");
             rs = pst.executeQuery();
             txtpub.removeAllItems();
             
           while (rs.next())
           {
               txtpub.addItem(new PublisherItem (rs.getInt(1),rs.getString(2)));
               
           }
             
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void Book_Load()
        {
         int c;
        try {
            pst = con.prepareStatement("select b.id,b.bname,c.catname,a.name,p.name,b.contents,b.pages,b.edition from book b JOIN category c On b.category = c.id  JOIN author a On b.author = a.id JOIN publisher p On b.publisher = p.id") ;
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            
            DefaultTableModel d = ( DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
            for(int i = 1; i<=c; i++)    
            {
                v2.add(rs.getString("b.id"));
                v2.add(rs.getString("b.bname"));
                v2.add(rs.getString("c.catname"));
                v2.add(rs.getString("a.name"));
                 v2.add(rs.getString("p.name"));
                v2.add(rs.getString("b.contents"));
                v2.add(rs.getString("b.pages"));
                v2.add(rs.getString("b.edition"));
                
                
                
                
                 }
            d.addRow(v2);
            
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtcontent = new javax.swing.JTextField();
        txtcategory = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtauthor = new javax.swing.JComboBox();
        txtpub = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtedition = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Farkande\\Pictures\\Icons\\icons8-book-64.png")); // NOI18N
        jLabel1.setText("Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 110, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Category");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 180, 40));

        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnameMouseClicked(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 240, 28));

        btnadd.setBackground(new java.awt.Color(0, 255, 255));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 140, 52));

        btnupdate.setBackground(new java.awt.Color(0, 255, 255));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 140, 52));

        btndelete.setBackground(new java.awt.Color(0, 255, 255));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 140, 53));

        btncancel.setBackground(new java.awt.Color(0, 255, 255));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 150, 53));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Name", "Category", "Author", "Publisher", "Contents", "No of Pages", "Edition"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 480, 347));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Contents");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 170, 40));

        txtcontent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtcontent, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 220, 40));

        txtcategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 240, 29));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Author");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 130, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Publisher");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 180, 40));

        txtauthor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtauthorActionPerformed(evt);
            }
        });
        jPanel1.add(txtauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 230, 32));

        txtpub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 230, 29));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("No of Pages");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 230, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Edition");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 170, 40));

        txtno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 220, 30));

        txtedition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 220, 29));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Farkande\\Pictures\\Library Management System\\books.jpg")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        
        
        this.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        
     String bname = txtname.getText();
     CategoryItem cItem = (CategoryItem)txtcategory.getSelectedItem();
     AuthorItem aItem = (AuthorItem)txtauthor.getSelectedItem();
     PublisherItem pItem = (PublisherItem)txtpub.getSelectedItem();
     
     String contents = txtcontent.getText();
     String pages = txtno.getText();
     String edition = txtedition.getText();
     
     
     
        try { 
            pst = con.prepareStatement("insert into book(bname, category , author, publisher, contents, pages, edition)values(?,?,?,?,?,?,?)");
            pst.setString(1, bname);
            pst.setInt(2, cItem.id);
            pst.setInt(3, aItem.id);
            pst.setInt(4, pItem.id);
            pst.setString(5, contents);
            pst.setString(6, pages);
            pst.setString(7, edition);
             int k = pst.executeUpdate();
             
             if(k==1)
                     {
                      JOptionPane.showMessageDialog(this,"Book Created");
                     
                    txtname.setText("");
                    txtcategory.setSelectedIndex(-1);
                    txtauthor.setSelectedIndex(-1);
                    txtpub.setSelectedIndex(-1);
                    txtcontent.setText("");
                    txtno.setText("");  
                    txtedition.setText("");
                      
                      
                    // Publisher_Load();
                     }
            else
             {
                 JOptionPane.showMessageDialog(this,"Error");
             }
           
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnaddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        
        txtname.setText(d1.getValueAt(selectIndex, 1).toString());
        txtcategory.setSelectedItem(d1.getValueAt(selectIndex, 2).toString());
        txtauthor .setSelectedItem(d1.getValueAt(selectIndex, 3).toString());
        txtpub.setSelectedItem(d1.getValueAt(selectIndex, 4).toString());
        txtcontent.setText(d1.getValueAt(selectIndex, 5).toString());
        txtno .setText(d1.getValueAt(selectIndex, 6).toString());
        txtedition .setText(d1.getValueAt(selectIndex, 7).toString());
        
        btnadd.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        
        
          DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
     
     String bname = txtname.getText();
     CategoryItem cItem = (CategoryItem)txtcategory.getSelectedItem();
     AuthorItem aItem = (AuthorItem)txtauthor.getSelectedItem();
     PublisherItem pItem = (PublisherItem)txtpub.getSelectedItem();
     String contents = txtcontent.getText();
     String pages = txtno.getText();
     String edition = txtedition.getText();
      
        try { 
            pst = con.prepareStatement("update book set bname = ? , category = ? ,author = ? ,publisher= ? ,contents = ?, pages = ?, edition = ?  where id = ? ");
           pst.setString(1, bname);
            pst.setInt(2, cItem.id);
            pst.setInt(3, aItem.id);
            pst.setInt(4, pItem.id);
            pst.setString(5, contents);
            pst.setString(6, pages);
            pst.setString(7, edition);
            pst.setInt(8, id);
             int k = pst.executeUpdate();
            
            
             if(k==1)
                     {
                      JOptionPane.showMessageDialog(this,"Book Updated");
                     
                     txtname.setText("");
                    txtcategory.setSelectedIndex(-1);
                    txtauthor.setSelectedIndex(-1);
                    txtpub.setSelectedIndex(-1);
                    txtcontent.setText("");
                    txtno.setText("");  
                    txtedition.setText("");
                    txtname.requestFocus();
                      btnadd.setVisible(true); 
                      
                   Book_Load();
                     
                     }
            else
             {
                 JOptionPane.showMessageDialog(this,"Error");
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }  
       
        
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
     
     
     
        try { 
            pst = con.prepareStatement("delete from book where id = ?");
            pst.setInt(1, id); 
             int k = pst.executeUpdate();
             
             if(k==1)
                     {
                      JOptionPane.showMessageDialog(this,"Book Deleted");
                     
                    txtname.setText("");
                    txtcategory.setSelectedIndex(-1);
                    txtauthor.setSelectedIndex(-1);
                    txtpub.setSelectedIndex(-1);
                    txtcontent.setText("");
                    txtno.setText("");  
                    txtedition.setText("");
                      btnadd.setVisible(true); 
                      
                    // Publisher_Load();
                     }
            else
             {
                 JOptionPane.showMessageDialog(this,"Error");
             }
           
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }  
       
     
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtauthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtauthorActionPerformed

    private void txtnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameMouseClicked

    
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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox txtauthor;
    private javax.swing.JComboBox txtcategory;
    private javax.swing.JTextField txtcontent;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtno;
    private javax.swing.JComboBox txtpub;
    // End of variables declaration//GEN-END:variables
}
