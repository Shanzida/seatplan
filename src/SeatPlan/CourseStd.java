/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatPlan;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author urmi
 */
public class CourseStd extends javax.swing.JFrame {

    /**
     * Creates new form Semester
     */
    public CourseStd() {
        super("Examination Seating Management System");
        initComponents();
        setSize(780, 380);
                setResizable(false);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(d.width/2-getWidth()/2, d.height/2 - getHeight()/2);
                this.setVisible(true);
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
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jButton1.setText("Save");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Year");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 70, 42, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Semester ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 70, 80, 19);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setText("New Course of Semester & Student");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 10, 450, 34);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 220, 80, 25);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Spring", "Summer", "Fall" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 70, 120, 30);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(310, 70, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Exam");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 70, 50, 17);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Mid", "Final" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(450, 70, 100, 30);

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(120, 110, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Course_Code");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 100, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Title");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 110, 40, 17);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 110, 290, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 160, 40, 20);
        getContentPane().add(jXDatePicker1);
        jXDatePicker1.setBounds(460, 160, 130, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SeatPlan/Cool_Trendy_Attitude_Colorful_fb_Timeline_Covers_girls_Trendy_Attitude_Cover_Photos_for_Facebook_Timeline-211.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 740, 315);

        jMenu1.setText("Entry");

        jMenuItem3.setText("Update");
        jMenu1.add(jMenuItem3);

        jMenuItem5.setText("Student Info");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Exam Routine");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem2.setText("New_Course");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Arrangement");

        jMenuItem4.setText("New_Course");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Report");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name =(String)jComboBox1.getSelectedItem();
        //String ID_semi=jTextField1.getText();
        //String Department =jTextField4.getText();
        String Year=(String)jComboBox2.getSelectedItem();
        String Exam=(String)jComboBox4.getSelectedItem();

        if(name.equalsIgnoreCase("Select")){
            JOptionPane.showMessageDialog(this, "Name is mandatory.");
            return;
       }
       if(Year.equalsIgnoreCase("Select")){
            JOptionPane.showMessageDialog(this, "Year is mandatory.");
            return;
       }
       if(Exam.equalsIgnoreCase("Select")){
            JOptionPane.showMessageDialog(this, "Exam is mandatory.");
            return;
       }
       
        try{
            Connection con=DBConnection.connect();
            int id=0;
            Statement stmt=con.createStatement();
            String checkSql="Select Id_semi from Semester where name = '"+name+"' And year='"+Year+"'";
            ResultSet rs= stmt.executeQuery(checkSql);
            while(rs.next()){
                 id=rs.getInt(1);
            }
            stmt.close();
            if(id > 0){
                int ask=JOptionPane.showConfirmDialog(this, "Do you want to update?","Confirm",0);
                /*if(ask == 0){
                    //JOptionPane.showMessageDialog(this, "This dept already exist.");
                    /*String sql = " Update Semester set name=?,Year=? where ID_semi=?";
                    PreparedStatement pstmt=con.prepareStatement(sql);
                    pstmt.setString (1, name);
                    pstmt.setString (2, Year);
                    pstmt.setInt (3, id);
                    

                    int a =pstmt.executeUpdate();
                    if(a >0){
                        JOptionPane.showMessageDialog(this, "Updated Successfully.");       
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Could not be updated.");       
                    }
                    pstmt.close();
                }*/
            }
            else{
                int ask=JOptionPane.showConfirmDialog(this, "Do you want to save?","Confirm",0);
                if(ask == 0){
                    String sql = " insert into Semester (name,Year) values (?, ?)";
                    PreparedStatement pstmt=con.prepareStatement(sql);
                    pstmt.setString (1, name);
                    //pstmt.setString (2, ID_semi);
                    pstmt.setString (2, Year);
                    //pstmt.setString (4, Year);

                    int a =pstmt.executeUpdate();
                    if(a >0){
                        JOptionPane.showMessageDialog(this, "Inserted Successfully.");       
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Could not be inserted.");       
                    }
                    pstmt.close();
                }
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
          int i;
          for(i=2017;i<=2040;i++){
          jComboBox2.addItem(""+i);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new Student_info();
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new Exam_routine();
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(CourseStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CourseStd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
