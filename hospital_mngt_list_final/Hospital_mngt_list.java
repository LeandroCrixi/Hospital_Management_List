/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_mngt_list_final;

/**
 *
 * @author leand
 */
public class Hospital_mngt_list extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public Hospital_mngt_list() {
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

        jLabel4 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        readMe = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ReadMe = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        tMenuReg = new javax.swing.JMenuItem();
        tMenuList = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        cMenuReg = new javax.swing.JMenuItem();
        cMenuMod = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital System");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DoctorEmoji.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        readMe.setText("File");
        readMe.add(jSeparator1);

        ReadMe.setText("README");
        ReadMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadMeActionPerformed(evt);
            }
        });
        readMe.add(ReadMe);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        readMe.add(menuExit);

        jMenuBar1.add(readMe);

        jMenu2.setText("Tickets");
        jMenu2.add(jSeparator2);

        tMenuReg.setText("Generator");
        tMenuReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMenuRegActionPerformed(evt);
            }
        });
        jMenu2.add(tMenuReg);

        tMenuList.setText("List");
        tMenuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMenuListActionPerformed(evt);
            }
        });
        jMenu2.add(tMenuList);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Patients");

        cMenuReg.setText("Register");
        cMenuReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMenuRegActionPerformed(evt);
            }
        });
        jMenu3.add(cMenuReg);

        cMenuMod.setText("Modify");
        cMenuMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMenuModActionPerformed(evt);
            }
        });
        jMenu3.add(cMenuMod);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void cMenuRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMenuRegActionPerformed
        // TODO add your handling code here:
        RegisterPatient rC = new RegisterPatient();
        desktop.add(rC);
        rC.setVisible(true);
    }//GEN-LAST:event_cMenuRegActionPerformed

    private void cMenuModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMenuModActionPerformed
        // TODO add your handling code here:
        ModifyPatient mC = new ModifyPatient();
        desktop.add(mC);
        mC.setVisible(true);
    }//GEN-LAST:event_cMenuModActionPerformed

    private void tMenuRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMenuRegActionPerformed
        // TODO add your handling code here:
        TicketGenerator tG = new TicketGenerator();
        desktop.add(tG);
        tG.setVisible(true);
    }//GEN-LAST:event_tMenuRegActionPerformed

    private void tMenuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMenuListActionPerformed
        // TODO add your handling code here:
        TicketList tL = new TicketList();
        desktop.add(tL);
        tL.setVisible(true);
    }//GEN-LAST:event_tMenuListActionPerformed

    private void ReadMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadMeActionPerformed
        // TODO add your handling code here:
        
        README readme = new README();
        desktop.add(readme);
        readme.setVisible(true);
    }//GEN-LAST:event_ReadMeActionPerformed

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
            java.util.logging.Logger.getLogger(Hospital_mngt_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital_mngt_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital_mngt_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital_mngt_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital_mngt_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ReadMe;
    private javax.swing.JMenuItem cMenuMod;
    private javax.swing.JMenuItem cMenuReg;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu readMe;
    private javax.swing.JMenuItem tMenuList;
    private javax.swing.JMenuItem tMenuReg;
    // End of variables declaration//GEN-END:variables
}
