
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
public class Burgers extends javax.swing.JFrame {

    /**
     * Creates new form burgers
     */
    public Burgers() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jt6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ch1 = new javax.swing.JCheckBox();
        ch2 = new javax.swing.JCheckBox();
        ch3 = new javax.swing.JCheckBox();
        ch4 = new javax.swing.JCheckBox();
        ch5 = new javax.swing.JCheckBox();
        jt1 = new javax.swing.JTextField();
        jt2 = new javax.swing.JTextField();
        jt3 = new javax.swing.JTextField();
        jt4 = new javax.swing.JTextField();
        jt5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton6.setText("MENU");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 401, 170, 50));

        jButton4.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton4.setText("GENERATE BILL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 170, 50));

        jButton2.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton2.setText("SOFT  DRINK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 170, -1));

        jButton3.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton3.setText("HOT BEVERAGES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 170, -1));

        jButton7.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton7.setText("DESERTS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 120, 30));

        jt6.setEditable(false);
        getContentPane().add(jt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 120, 30));

        jButton1.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton1.setText("Add To Cart");
        jButton1.setHideActionText(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 140, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 350));

        ch1.setBackground(new java.awt.Color(255, 255, 255));
        ch1.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        ch1.setForeground(new java.awt.Color(255, 255, 255));
        ch1.setText("Veggiee Burger");
        ch1.setContentAreaFilled(false);
        ch1.setIconTextGap(6);
        ch1.setInheritsPopupMenu(true);
        ch1.setMaximumSize(null);
        getContentPane().add(ch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 190, -1));

        ch2.setBackground(new java.awt.Color(255, 255, 255));
        ch2.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        ch2.setForeground(new java.awt.Color(255, 255, 255));
        ch2.setText("BBQ BURGER");
        ch2.setContentAreaFilled(false);
        ch2.setIconTextGap(6);
        ch2.setInheritsPopupMenu(true);
        ch2.setMaximumSize(null);
        ch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch2ActionPerformed(evt);
            }
        });
        getContentPane().add(ch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 190, -1));

        ch3.setBackground(new java.awt.Color(255, 255, 255));
        ch3.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        ch3.setForeground(new java.awt.Color(255, 255, 255));
        ch3.setText("CHEESE BURGER");
        ch3.setContentAreaFilled(false);
        ch3.setIconTextGap(6);
        ch3.setInheritsPopupMenu(true);
        ch3.setMaximumSize(null);
        ch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch3ActionPerformed(evt);
            }
        });
        getContentPane().add(ch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 210, -1));

        ch4.setBackground(new java.awt.Color(255, 255, 255));
        ch4.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        ch4.setForeground(new java.awt.Color(255, 255, 255));
        ch4.setText("BLT BURGER");
        ch4.setContentAreaFilled(false);
        ch4.setIconTextGap(6);
        ch4.setInheritsPopupMenu(true);
        ch4.setMaximumSize(null);
        getContentPane().add(ch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, -1));

        ch5.setBackground(new java.awt.Color(255, 255, 255));
        ch5.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        ch5.setForeground(new java.awt.Color(255, 255, 255));
        ch5.setText("GRILLED CHEESE");
        ch5.setContentAreaFilled(false);
        ch5.setIconTextGap(6);
        ch5.setInheritsPopupMenu(true);
        ch5.setMaximumSize(null);
        getContentPane().add(ch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 190, -1));
        getContentPane().add(jt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 50, -1));

        jt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt2ActionPerformed(evt);
            }
        });
        getContentPane().add(jt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 50, -1));

        jt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt3ActionPerformed(evt);
            }
        });
        getContentPane().add(jt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 50, -1));
        getContentPane().add(jt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 50, -1));
        getContentPane().add(jt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 50, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resize/9) (1).png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 640, 410));
        jLabel4.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(239, 239, 239));
        jLabel6.setText("QTY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 4, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Finalbill f=new Finalbill();
        f.setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Softdrink f=new Softdrink();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Hotbeverages f=new Hotbeverages();
        f.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Desserts f=new Desserts();
        f.setVisible(true);
        this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         int item=0;
        String cat="Burgers";
        int q1=0,q2=0,q3=0,q4=0,q5=0,amt1=0,amt2=0,amt3=0,amt4=0,amt5=0;
        double total=0.0;
          String v1, v2, v3, v4, v5;

        v1 = jt1.getText();
        v2 = jt2.getText();
        v3 = jt3.getText();
        v4 = jt4.getText();
        v5 = jt5.getText();

        if (v1.isEmpty()) {
            q1 = 0;
        } else {
            q1 = Integer.parseInt(v1);
        }
        if (v2.isEmpty()) {
            q2 = 0;
        } else {
            q2 = Integer.parseInt(v2);
        }
        if (v3.isEmpty()) {
            q3 = 0;
        } else {
            q3 = Integer.parseInt(v3);
        }
        if (v4.isEmpty()) {
            q4 = 0;
        } else {
            q4 = Integer.parseInt(v4);
        }
        if (v5.isEmpty()) {
            q5 = 0;
        } else {
            q5 = Integer.parseInt(v5);
        }
        if(ch2.isSelected())
        {
        amt2=q2*120;}
        if(ch1.isSelected()){
        amt1=q1*120;}
        if(ch3.isSelected()){
        amt3=q3*120;}
        if(ch4.isSelected()){
        amt4=q4*140;}
        if(ch5.isSelected()){
        amt5=q5*250;}

        total=amt1+amt2+amt3+amt4+amt5;
        jt6.setText(" "+total);
        if(ch1.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="Veggiee Burger";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q1+"',"+amt1+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Veggiee Burger added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        if(ch2.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="BBQ BURGER";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q2+"',"+amt2+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"BBQ BURGER added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        if(ch3.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="CHEESE BURGER";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q3+"',"+amt3+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"CHEESE BURGER added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        if(ch4.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="BLT BURGER";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q4+"',"+amt4+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"BLT BURGER added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }

        if(ch5.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="GRILLED CHEESE";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q5+"',"+amt5+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"GRILLED CHEESE added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     Menu f=new Menu();
        f.setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt3ActionPerformed

    private void jt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt2ActionPerformed

    private void ch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch2ActionPerformed

    private void ch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch3ActionPerformed

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
            java.util.logging.Logger.getLogger(Burgers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Burgers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Burgers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Burgers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Burgers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ch1;
    private javax.swing.JCheckBox ch2;
    private javax.swing.JCheckBox ch3;
    private javax.swing.JCheckBox ch4;
    private javax.swing.JCheckBox ch5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    private javax.swing.JTextField jt4;
    private javax.swing.JTextField jt5;
    private javax.swing.JTextField jt6;
    // End of variables declaration//GEN-END:variables
}