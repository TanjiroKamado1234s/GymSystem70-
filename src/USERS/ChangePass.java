/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USERS;

import Config.DbConnector;
import Config.PasswordHasher;
import Config.Session;
import Myapps.LoginForm;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AJ
 */
public class ChangePass extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public ChangePass() {
        initComponents();
    }
    
        Color sidecolor = new Color(102,0,0);
        Color headcolor = new Color(255,0,0);
        Color bodycolor = new Color(153,0,0);

    
    public static boolean loginAcc(String username, String password){
        DbConnector connector = new DbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
        }catch (SQLException ex) {
            return false;
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
        jPanel2 = new javax.swing.JPanel();
        acc_user = new javax.swing.JLabel();
        acc_lname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userID = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        con_pass = new javax.swing.JPasswordField();
        cur_pass = new javax.swing.JPasswordField();
        new_pass = new javax.swing.JPasswordField();
        ckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc_user.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        acc_user.setForeground(new java.awt.Color(255, 255, 255));
        acc_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(acc_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 30));

        acc_lname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        acc_lname.setForeground(new java.awt.Color(255, 255, 255));
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/fitness (2).png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 40, 160, 380);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userID.setForeground(new java.awt.Color(255, 255, 255));
        userID.setText("(UID)");
        jPanel3.add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 140, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CHANGE PASSWORD");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 40));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 560, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 90, 110, 20);

        jLabel3.setBackground(new java.awt.Color(102, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 140, 110, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 190, 130, 20);

        save.setBackground(new java.awt.Color(204, 204, 204));
        save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        save.setForeground(new java.awt.Color(102, 102, 102));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Save");
        save.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(save);
        save.setBounds(420, 280, 80, 30);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        back.setForeground(new java.awt.Color(102, 102, 102));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Back");
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(back);
        back.setBounds(310, 280, 80, 30);

        con_pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        con_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(con_pass);
        con_pass.setBounds(210, 210, 290, 30);

        cur_pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cur_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cur_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cur_passActionPerformed(evt);
            }
        });
        jPanel1.add(cur_pass);
        cur_pass.setBounds(210, 110, 290, 30);

        new_pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        new_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(new_pass);
        new_pass.setBounds(210, 160, 290, 30);

        ckbox.setBackground(new java.awt.Color(102, 102, 102));
        ckbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ckbox.setForeground(new java.awt.Color(255, 255, 255));
        ckbox.setText(" View Password");
        ckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckboxActionPerformed(evt);
            }
        });
        jPanel1.add(ckbox);
        ckbox.setBounds(390, 250, 110, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sn = Session.getInstance();  
        
        userID.setText("USER ID: "+sn.getUid());
        
    }//GEN-LAST:event_formWindowActivated

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(headcolor);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(sidecolor);
    }//GEN-LAST:event_saveMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBackground(headcolor);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBackground(sidecolor);
    }//GEN-LAST:event_backMouseExited

    private void cur_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cur_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cur_passActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        try{
            DbConnector dbc = new DbConnector();
            Session sn = Session.getInstance();
            
            String query = "SELECT * FROM tbl_user WHERE user_id ='"+sn.getUid()+"'";
            ResultSet rs = dbc.getData(query);
            if(rs.next()){
                String curpass = rs.getString("password");
                String curhash = PasswordHasher.hashPassword(cur_pass.getText());
                
                if(curpass.equals(curhash)){          
                    String password = new String(new_pass.getPassword());
                    String confirmPassword = new String(con_pass.getPassword());
                    String cpass = PasswordHasher.hashPassword(new_pass.getText());
                    if (password.equals(confirmPassword)) {
                        dbc.updateData("UPDATE tbl_user SET password = '"+cpass+"'");
                    JOptionPane.showMessageDialog(null,"Change Password Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
                    LoginForm lf = new LoginForm();
                    lf.setVisible(true);
                    this.dispose();
                    }else {
                    JOptionPane.showMessageDialog(this, "Passwords is not Match", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                }else{
                    JOptionPane.showMessageDialog(null,"Current Password is Incorrect", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(SQLException | NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
            
    }//GEN-LAST:event_saveMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AccDetails ad = new AccDetails();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void ckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckboxActionPerformed
        if(ckbox.isSelected()){
            new_pass.setEchoChar((char)0);
            con_pass.setEchoChar((char)0);
        }else{
            new_pass.setEchoChar('*');
            con_pass.setEchoChar('*');
        }
    }//GEN-LAST:event_ckboxActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel acc_user;
    private javax.swing.JPanel back;
    private javax.swing.JCheckBox ckbox;
    private javax.swing.JPasswordField con_pass;
    private javax.swing.JPasswordField cur_pass;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JPanel save;
    private javax.swing.JLabel userID;
    // End of variables declaration//GEN-END:variables
}
