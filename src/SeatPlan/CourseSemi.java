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
public class CourseSemi extends javax.swing.JFrame {

    /**
     * Creates new form Semester
     */

    
    public CourseSemi(String year,String sem,String exam) {

        initComponents();
                  int i;
          for(i=2017;i<=2040;i++){
          jComboBox2.addItem(""+i);
        }
        jC2.setSelectedItem(sem);
        jComboBox2.setSelectedItem(year);
        jComboBox4.setSelectedItem(exam);
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
        jC2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Year");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 100, 42, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Semester ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 100, 100, 19);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel10.setText("New Course of Semester");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(79, 26, 460, 51);

        jC2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jC2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Spring", "Summer", "Fall" }));
        getContentPane().add(jC2);
        jC2.setBounds(150, 90, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 220, 110, 30);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(320, 100, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Exam");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 100, 50, 22);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Mid", "Final" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(480, 100, 100, 30);

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(160, 150, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Course_Code");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 150, 130, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Title");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 150, 60, 22);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(330, 150, 330, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SeatPlan/Cool_Trendy_Attitude_Colorful_fb_Timeline_Covers_girls_Trendy_Attitude_Cover_Photos_for_Facebook_Timeline-211.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -5, 740, 315);
        getContentPane().add(jXDatePicker1);
        jXDatePicker1.setBounds(0, 0, 112, 22);

        jMenu1.setText("Entry");

        jMenuItem2.setText("New_Course");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Update");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Arrangement");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Report");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name =(String)jC2.getSelectedItem();
        String Title=jTextField1.getText();
        //String Department =jTextField4.getText();
        String Year=(String)jComboBox2.getSelectedItem();
        String Exam=(String)jComboBox4.getSelectedItem();
        String Course_Code=(String)jComboBox5.getSelectedItem();

        if(Course_Code.equalsIgnoreCase("Select")){
            JOptionPane.showMessageDialog(this, "Course_Code is mandatory.");
            return;
       }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here
       try{
        
        Connection con=DBConnection.connect();
        Statement st=con.createStatement();
        String msql="Select course_code from course_table ";
        ResultSet rs=st.executeQuery(msql);
        while(rs.next()){
           String t=rs.getString(1);
           jComboBox5.addItem(t);
        }
        rs.close();
        st.close();
        con.close();
       }
       catch(Exception e){
           e.printStackTrace();
           
       }
      
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
       try{
           Connection con=DBConnection.connect();
           Statement st=con.createStatement();
           String course_code=(String)jComboBox5.getSelectedItem();
           String msql="Select course_title from course_table where course_code='"+course_code+"'";
           ResultSet rs=st.executeQuery(msql);
           while(rs.next()){
               String t=rs.getString(1);
               jTextField1.setText(t);
           }rs.close();
           st.close();
           con.close();
           
            }
       catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_jComboBox5ActionPerformed
                                    

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        // TODO add your handling code here:
        new Arrangement_Student();
        this.dispose();
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        new CourseStd();
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(CourseSemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseSemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseSemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseSemi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //Semester cst=new Semester();
        //cst.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CourseSemi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JComboBox jC2;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
