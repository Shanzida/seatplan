/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatPlan;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author urmi
 */
public class Exam_routine extends javax.swing.JFrame {

    /**
     * Creates new form Entry
     */
    public Exam_routine() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Day", "Evening" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(460, 130, 150, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Exam Routine ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 20, 250, 51);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Upload .CSV File");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 190, 120, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Browes...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 180, 110, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 240, 63, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Shift");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 130, 50, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Year");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 90, 50, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Semester");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 90, 100, 30);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(460, 90, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exam");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 140, 50, 17);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Mid", "Final" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(200, 130, 150, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Spring", "Summer", "Fall" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(200, 90, 150, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(320, 180, 360, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SeatPlan/Nice1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 370);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(640, 110, 0, 2);

        jMenu3.setText("Home");
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu1.setText("Entry");

        jMenuItem6.setText("Exam Routine");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setText("Student Info");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenu5.setText("Delete");

        jMenuItem10.setText("Exam Routine ");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem8.setText("Student Info");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Arrangement");

        jMenuItem2.setText("Create Arrangement");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Arrangement Report");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem7.setText("Delete Arrangement");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("LogOut");
        jMenu6.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu6MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        int result = jFileChooser.showOpenDialog(new JFrame());
        File selectedFile = jFileChooser.getSelectedFile();
        String filepath=selectedFile.getAbsolutePath();
        System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        jTextField3.setText(filepath);
       //new ExcelToDb(selectedFile.getAbsolutePath());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           String Shift=(String)jComboBox2.getSelectedItem();
           String exam=(String)jComboBox4.getSelectedItem();
           String Year=(String)jComboBox3.getSelectedItem();
           String semester=(String)jComboBox1.getSelectedItem();

        if(Shift.equalsIgnoreCase("Select")){
            JOptionPane.showMessageDialog(this, "Shift is mandatory.");
            return;    
        }
        if(exam.equalsIgnoreCase("Select")){
            JOptionPane.showMessageDialog(this, "Exam is mandatory.");
            return;    
        }
        if(Year.equalsIgnoreCase("Select")){
            JOptionPane.showMessageDialog(this, "Year is mandatory.");
            return;
       }
        if(semester.equalsIgnoreCase("Select")){
            JOptionPane.showMessageDialog(this, "Semester is mandatory.");
            return;
       }
        if(jTextField3.getText() == null || jTextField3.getText().equals("") || !jTextField3.getText().contains(".csv")){
            JOptionPane.showMessageDialog(this, "Please browse the csv file.");
            return;
       }
        try{
           /*  Connection con=DBConnection.connect();
            //int id=0;
            Statement stmt=con.createStatement();
            String checkSql="Select * from Semester";
            ResultSet rs= stmt.executeQuery(checkSql);
  
            while(rs.next()){
                 String id=rs.getString(1);
            }rs.close();
            stmt.close();
            con.close();*/
   
         new ExcelToDb(jTextField3.getText(),Shift,Year,semester,exam);
        } catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu6MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuSelected
        // TODO add your handling code here:
        new HomePage();
        this.dispose();
    }//GEN-LAST:event_jMenu6MenuSelected

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        int i;
          for(i=2016;i<=2040;i++){
          jComboBox3.addItem(""+i);
          }
    }//GEN-LAST:event_formWindowOpened

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

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        new ExamRoutineUp();
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new StudentInfoUp();
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new Arrangement_Student_New();
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        // TODO add your handling code here:
        new Entry();
        this.dispose();
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new ArrangementUp();
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new ArrangementReport();
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
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
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
