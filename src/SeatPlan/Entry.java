/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatPlan;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author urmi
 */
public class Entry extends javax.swing.JFrame {

    /**
     * Creates new form Entry
     */
    public Entry() {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setText("Welcome To Seatplan ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(150, 20, 270, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SeatPlan/Cool_Trendy_Attitude_Colorful_fb_Timeline_Covers_girls_Trendy_Attitude_Cover_Photos_for_Facebook_Timeline-211.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 850, 330);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(640, 110, 0, 2);

        jMenu1.setText("Entry");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenu1MouseReleased(evt);
            }
        });
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });

        jMenuItem2.setText("New Course");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

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

        jMenuItem3.setText("Update");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
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

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
       // System.out.println("Hiiii");
        new CourseUpdate();
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseReleased

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        // TODO add your handling code here:
       //new Semester();
       //  this.dispose();
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        // TODO add your handling code here:
        new Arrangement_Student();
        this.dispose();
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new Semester();
        this.dispose();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new Exam_routine();
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new Student_info();
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
