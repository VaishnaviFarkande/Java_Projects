
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VLibrary;

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
public class returnBook extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public returnBook() {
        initComponents();
        Connect();
      
   Returnbook_Load();
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
            Logger.getLogger(returnBook.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(returnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
   /* public class BookItem
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
    */
    
    
    public void Returnbook_Load()
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
            Logger.getLogger(returnBook.class.getName()).log(Level.SEVERE, null, ex);
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
        txtmid = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmname = new javax.swing.JLabel();
        txtbook = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtelp = new javax.swing.JTextField();
        txtfine = new javax.swing.JTextField();
        txtrdate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Farkande\\Pictures\\Icons\\icons8-return-book-50.png")); // NOI18N
        jLabel1.setText("Return Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Member ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 220, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Member Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 32));

        txtmid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmidKeyPressed(evt);
            }
        });
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 220, 28));

        btnadd.setBackground(new java.awt.Color(0, 255, 255));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 140, 70));

        btncancel.setBackground(new java.awt.Color(0, 255, 255));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 150, 70));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 500, 240));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Return Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Book");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, 32));

        txtmname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtmname.setForeground(new java.awt.Color(255, 255, 255));
        txtmname.setText("jLabel8");
        jPanel1.add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 220, 30));

        txtbook.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtbook.setForeground(new java.awt.Color(255, 255, 255));
        txtbook.setText("jLabel7");
        jPanel1.add(txtbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 204, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Days Elap");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 210, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("Fine");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 170, 30));
        jPanel1.add(txtelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 230, 30));
        jPanel1.add(txtfine, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 240, 30));

        txtrdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtrdate.setForeground(new java.awt.Color(255, 255, 255));
        txtrdate.setText("jLabel7");
        jPanel1.add(txtrdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 264, 220, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Farkande\\Pictures\\Library Management System\\last page.jpg")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1380, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        
        
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        String mid = txtmid.getText();
        String membername = txtmname.getText();
        String bookname = txtbook.getText();
        String returndate = txtrdate.getText();
        String elpdays = txtelp.getText();
        String fine = txtfine.getText();
        
        try { 
            pst = con.prepareStatement("insert into returnbook(mid, mname ,bname, returndate,elp,fine)values(?,?,?,?,?,?)");
            pst.setString(1, mid);
            pst.setString(2,membername );
            pst.setString(3,bookname );
            pst.setString(4, returndate);
             pst.setString(5,elpdays );
              pst.setString(6, fine);
             int k = pst.executeUpdate();
             
             pst = con.prepareStatement("delete from lendbook where memberid = ?");
               pst.setString(1, mid);
             pst.executeUpdate();
             if(k==1)
                     {
                      JOptionPane.showMessageDialog(this,"Return Book Successfully!!!!!");
                     
                    txtmid.setText("");
                    txtmname.setText("");
                    txtbook.setText("");
                     txtrdate.setText("");
                    txtelp.setText("");
                    txtfine.setText("");
                     txtmid.requestFocus();
                    
                   //Returnbook_Load();
                      
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
        
        
        txtmid.setText(d1.getValueAt(selectIndex, 1).toString());
        txtmname.setText(d1.getValueAt(selectIndex, 2).toString());
       // txtbook .setSelectedItem(d1.getValueAt(selectIndex, 3).toString());
    
        btnadd.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtmidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmidKeyPressed
        // TODO add your handling code here:
        
        
           if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String id = txtmid.getText();
            try {
                pst = con.prepareStatement("select m.name,b.bname,l.returndate,DATEDIFF(now(),l.returndate) as elap from lendbook l JOIN member m ON l.memberid = m.id JOIN book b ON l.bookid = b.id and l.memberid = ?");
                pst.setString(1, id);
                rs = pst.executeQuery();
                
                if(rs.next() == false)
                {
                    JOptionPane.showMessageDialog(this, "Member ID not Found");

                }
                else
                {
                    String mname = rs.getString("m.name");
                    String bname = rs.getString("b.bname");
                    txtmname.setText(mname.trim());
                    txtbook.setText(bname.trim());
                    
                    
                    String date = rs.getString("l.returndate");
                    txtrdate.setText(date);
                    String elp = rs.getString("elap");
                    int elaped = Integer.parseInt(elp);
                    if (elaped > 0)
                    {
                        txtelp.setText(elp);
                        int fine = elaped * 100;
                        txtfine.setText(String.valueOf(fine));
                        
                    }
                    else
                    {
                        txtelp.setText("0");
                        txtelp.setText("0");
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(returnBook.class.getName()).log(Level.SEVERE, null, ex);
            }
      
            
            
            
        }
          
        
    }//GEN-LAST:event_txtmidKeyPressed

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
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new returnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtbook;
    private javax.swing.JTextField txtelp;
    private javax.swing.JTextField txtfine;
    private javax.swing.JTextField txtmid;
    private javax.swing.JLabel txtmname;
    private javax.swing.JLabel txtrdate;
    // End of variables declaration//GEN-END:variables
}