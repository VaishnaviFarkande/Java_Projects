
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VLibrary;

import com.main.mail.Gmail1;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Farkande
 */
public class Issuebook extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Issuebook() {
        initComponents();
        Connect();
      book();
   Issuebook_Load();
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
            Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }

  
       

 
    public class BookItem
    {
        int id;
        String name;
        public BookItem(int id,String name)
        {
            this.id = id;
            this.name = name;
        }
        public String toString()
        {
            return name;
            
        }
        
        
        
    }
    
    public void book()
    {
         try {
            pst = con.prepareStatement("select * from book");
             rs = pst.executeQuery();
             txtbook.removeAllItems();
             
           while (rs.next())
           {
               txtbook.addItem(new BookItem (rs.getInt(1),rs.getString(2)));
               
           }
             
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void Issuebook_Load()
        {
         int c;
        try {
            pst = con.prepareStatement("select l.id,m.name,b.bname,l.issuedate,l.returndate from lendbook l JOIN member m ON l.memberid = m.id JOIN book b ON l.bookid = b.id ") ;
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
                v2.add(rs.getString("l.id"));
                v2.add(rs.getString("m.name"));
                v2.add(rs.getString("b.bname"));
                v2.add(rs.getString("l.issuedate"));
                 v2.add(rs.getString("l.returndate"));
                
                
                
                
                
                 }
            d.addRow(v2);
            
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
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
        txtid = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbook = new javax.swing.JComboBox();
        txtmember = new javax.swing.JTextField();
        txtissuedate = new com.toedter.calendar.JDateChooser();
        txtrdate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Farkande\\Pictures\\Icons\\icons8-books-emoji-48.png")); // NOI18N
        jLabel1.setText("Issue Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("Member ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 220, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 102));
        jLabel3.setText("Member Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, 32));

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidKeyPressed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 250, 28));

        btnadd.setBackground(new java.awt.Color(0, 255, 255));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 102, 52));

        btnupdate.setBackground(new java.awt.Color(0, 255, 255));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 102, 52));

        btndelete.setBackground(new java.awt.Color(0, 255, 255));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 102, 53));

        btncancel.setBackground(new java.awt.Color(0, 255, 255));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 102, 53));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Book", "Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 500, 350));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 102));
        jLabel4.setText("Return Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 102));
        jLabel5.setText("Book");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 102));
        jLabel6.setText("Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 32));

        txtbook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookActionPerformed(evt);
            }
        });
        jPanel1.add(txtbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 250, 32));

        txtmember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtmember, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 250, 34));
        jPanel1.add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 250, 32));
        jPanel1.add(txtrdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 260, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Farkande\\Pictures\\Library Management System\\issue lab.jpg")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 760));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1380, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        
        
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
     
     String mid = txtid.getText();
     BookItem bitem = (BookItem) txtbook.getSelectedItem();
     SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
     String issuedate = date_format.format(txtissuedate.getDate());
     
      SimpleDateFormat date_format1 = new SimpleDateFormat("yyyy-MM-dd");
     String returndate = date_format.format(txtrdate.getDate());
     
     
     
        try { 
            pst = con.prepareStatement("insert into lendbook(memberid, bookid , issuedate, returndate)values(?,?,?,?)");
            pst.setString(1, mid);
            pst.setInt(2, bitem.id);
            pst.setString(3, issuedate);
            pst.setString(4, returndate);
            
             int k = pst.executeUpdate();
             
             if(k==1)
                     {
                      JOptionPane.showMessageDialog(this,"Book Issued!!!!!");
                     
                    txtid.setText("");
                    txtbook.setSelectedIndex(-1);
                     txtmember.setText("");
                    
                    Issuebook_Load();
                      
                    // Publisher_Load();
                     }
            else
             {
                 JOptionPane.showMessageDialog(this,"Error");
             }
           
        } catch (SQLException ex) {
            Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnaddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        
        txtid.setText(d1.getValueAt(selectIndex, 0).toString());
        txtmember.setText(d1.getValueAt(selectIndex, 1).toString());
        txtbook .setSelectedItem(d1.getValueAt(selectIndex, 2).toString());
    
        btnadd.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
         
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        
        
         String mid = txtid.getText();
     BookItem bitem = (BookItem) txtbook.getSelectedItem();
     SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
     String issuedate = date_format.format(txtissuedate.getDate());
     
      SimpleDateFormat date_format1 = new SimpleDateFormat("yyyy-MM-dd");
     String returndate = date_format.format(txtrdate.getDate());
     
     
     
        try { 
            pst = con.prepareStatement("update lendbook set memberid = ?, bookid = ? , issuedate = ?, returndate =? where id = ?");
            pst.setString(1, mid);
            pst.setInt(2, bitem.id);
            pst.setString(3, issuedate);
            pst.setString(4, returndate);
            pst.setInt(5, id);
            
             int k = pst.executeUpdate();
             
             if(k==1)
                     {
                      JOptionPane.showMessageDialog(this,"Issuebook Updated!!!!!");
                     
                    txtid.setText("");
                    txtbook.setSelectedIndex(-1);
                     txtmember.setText("");
                        
                    
                    Issuebook_Load();
                      
                    // Publisher_Load();
                     }
            else
             {
                 JOptionPane.showMessageDialog(this,"Error");
             }
           
        } catch (SQLException ex) {
            Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:

         DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        
        try { 
            pst = con.prepareStatement("delete from lendbook where id = ?");
           
             pst.setInt(1, id); 
             int k = pst.executeUpdate();
             
             
           

             
             if(k==1)
                     {
                   JOptionPane.showMessageDialog(this,"Delete Issuebook Book Successfully!!!!!");
                      txtid.setText("");
                    txtbook.setSelectedIndex(-1);
                     txtmember.setText("");
                       Issuebook_Load();
                     
                      
                     }
            else
             {
                 JOptionPane.showMessageDialog(this,"Error");
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookActionPerformed

    private void txtidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String mid = txtid.getText();
            try {
                pst = con.prepareStatement("select * from member where id = ?");
                pst.setString(1, mid);
                rs = pst.executeQuery();
                
                if(rs.next() == false)
                {
                    JOptionPane.showMessageDialog(this, "Member ID not found");

                }
                else
                {
                    String membername = rs.getString("name");
                    txtmember.setText(membername.trim());
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Issuebook.class.getName()).log(Level.SEVERE, null, ex);
            }
      
            
            
            
        }
          
        
    }//GEN-LAST:event_txtidKeyPressed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyPressed

    
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
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Issuebook().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox txtbook;
    private javax.swing.JTextField txtid;
    private com.toedter.calendar.JDateChooser txtissuedate;
    private javax.swing.JTextField txtmember;
    private com.toedter.calendar.JDateChooser txtrdate;
    // End of variables declaration//GEN-END:variables
}
