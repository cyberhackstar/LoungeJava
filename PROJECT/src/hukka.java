
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class hukka extends javax.swing.JFrame {

    /**
     * Creates new form hukka
     */
    public hukka() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        c1 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JRadioButton();
        c3 = new javax.swing.JRadioButton();
        c4 = new javax.swing.JRadioButton();
        c5 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        j3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton6.setText("menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 170, -1));

        jButton4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton4.setText("Generate Bill");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, 60));

        jButton2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton2.setText("soft drinks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 170, -1));

        jButton3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton3.setText("hot beverages");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jButton7.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton7.setText("Beers");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 170, -1));

        buttonGroup1.add(c1);
        c1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c1.setText("Commisinor");
        c1.setOpaque(false);
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        buttonGroup1.add(c2);
        c2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c2.setText("paan");
        c2.setOpaque(false);
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        buttonGroup1.add(c3);
        c3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c3.setText("Titanic");
        c3.setOpaque(false);
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        buttonGroup1.add(c4);
        c4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c4.setText("dragon");
        c4.setOpaque(false);
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        buttonGroup1.add(c5);
        c5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c5.setText("rdx 11");
        c5.setOpaque(false);
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setText("Total amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 150, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 30, 20));

        j3.setEditable(false);
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 92, 40));

        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setText("Add To Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 50, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 40, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 80, 130));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 60, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 70, 90));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 120, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Desktop\\New folder (2)\\image_172f2e2b-bf68-4fca-81ad-59151ae3ca67.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 350));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Desktop\\New folder (2)\\bhau.jpg")); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 330, 160));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 340, 430));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 320, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        finalbill f=new finalbill();
        f.setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        softdrink f=new softdrink();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        hotbeverages f=new hotbeverages();
        f.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        beers f=new beers();
        f.setVisible(true);
        this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int item=0;
        String cat="Hookah";
        int q=1,amt=0;
        double total=0.0;
        
        if(c2.isSelected())
        amt=q*600;
       else if(c1.isSelected())
        amt=q*500;
       else  if(c3.isSelected())
        amt=q*700;
       else  if(c4.isSelected())
        amt=q*800;
       else if(c5.isSelected())
        amt=q*900;
        total=amt;
        j3.setText(" "+total);
        if(c1.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1234");
                String sql;
                String scat="Commissioner";

                sql="insert into menu values('"+cat+"','"+scat+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Commissioner added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
      else  if(c2.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1234");
                String sql;
                String sct="Paan";

                sql="insert into menu values('"+cat+"','"+sct+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Paan added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
      else if(c3.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1234");
                String sql;
                String sct="Titanic";

                sql="insert into menu values('"+cat+"','"+sct+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Titanic added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
      else if(c4.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1234");
                String sql;
                String sct="Dragon";

                sql="insert into menu values('"+cat+"','"+sct+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Dragon added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
      else if(c5.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1234");
                String sql;
                String sct="Rdx 11";

                sql="insert into menu values('"+cat+"','"+sct+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Rdx 11 added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     menu f=new menu();
        f.setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(hukka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hukka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hukka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hukka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hukka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton c1;
    private javax.swing.JRadioButton c2;
    private javax.swing.JRadioButton c3;
    private javax.swing.JRadioButton c4;
    private javax.swing.JRadioButton c5;
    private javax.swing.JTextField j3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
