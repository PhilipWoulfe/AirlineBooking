
/*
 *  The Airline App Package
 *  The MAIN FORM
 */

/**
 * @author Christian
 */

// importing packages 
package airlineapp.GUI;


// importing libraries
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


public class HOME extends javax.swing.JFrame {
    /**
     * Creates new form Home
     */
    
    // creating new new objects 
    public MAINTENACE M;
    public BOOKING Bok;
    
    public HOME() throws FileNotFoundException {
        
         // starting the porgram 
        initComponents(); 
        
        
         // creating new new objects 
        M = new MAINTENACE();
        Bok = new BOOKING();
        
        // scanner to read from files 
        Scanner sc = new Scanner(new File("./Airports.csv"));
         
        
        
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
         lines.add(sc.nextLine());
            }
        
        
        // populating the boxes with airports list
        populateComboBoxes(lines);
    }
    
    public void populateComboBoxes(List<String> lines) {
        String[] lst = lines.toArray(new String[0]);
        MAINTENACE.jComboBox1 = new JComboBox();
        
        for (int i = 0; i < lst.length; i++) {
            Bok.CMBOXDeparture.addItem(lst[i]);
            Bok.CMBDestination.addItem(lst[i]);
            Bok.CMBDestination1.addItem(lst[i]);
            Bok.CMBOXDeparture1.addItem(lst[i]);
            
            MAINTENACE.jComboBox1.addItem(lst[i]);
            
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

        BTNBSeat = new javax.swing.JButton();
        BTNExit = new javax.swing.JButton();
        BTNMaintenace = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        BTNHelp = new javax.swing.JButton();
        btnAbout = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNBSeat.setText("BOOK SEAT");
        BTNBSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBSeatActionPerformed(evt);
            }
        });

        BTNExit.setText("EXIT");
        BTNExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNExitActionPerformed(evt);
                Exit(evt);
            }
        });

        BTNMaintenace.setText("MAINTENACE ");
        BTNMaintenace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMaintenaceActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineapp/Images/AirlineImg.png"))); // NOI18N
        jButton5.setToolTipText("");
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusTraversalKeysEnabled(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        BTNHelp.setText("HELP");
        BTNHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNHelpActionPerformed(evt);
            }
        });

        btnAbout.setLabel("ABOUT AIRLINE APPLICATION");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BTNExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNBSeat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNMaintenace, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNBSeat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(BTNMaintenace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNExit, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(BTNHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BTNExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNExitActionPerformed
        // TODO add your handling code here:       
        System.exit(0);
        
    }//GEN-LAST:event_BTNExitActionPerformed

    private void Exit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit
        // TODO add your handling code here:
        
        // exits the application and does not saves anything 
       System.exit(0);
        
    }//GEN-LAST:event_Exit

    private void BTNMaintenaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMaintenaceActionPerformed
        // TODO add your handling code here:  
        M.show();
        
       
    }//GEN-LAST:event_BTNMaintenaceActionPerformed

    private void BTNHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNHelpActionPerformed
        // TODO add your handling code here:
        
        HELP h = new HELP();
        h.show();
        this.hide();
        
    }//GEN-LAST:event_BTNHelpActionPerformed

    private void BTNBSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBSeatActionPerformed
       
       
        Bok.show();

  
     
    }//GEN-LAST:event_BTNBSeatActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        
        
 try {
            String htmlFilePath = "/Users/Christian/Desktop/AirlineApp/dist/javadoc/index.html"; // path to your new file
            File htmlFile = new File(htmlFilePath);
            
// open the default web browser for the HTML page
Desktop.getDesktop().browse(htmlFile.toURI());

// if a web browser is the default HTML handler, this might work too
Desktop.getDesktop().open(htmlFile);
        } catch (IOException ex) {
            Logger.getLogger(HELP.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        
    }//GEN-LAST:event_btnAboutActionPerformed

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
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HOME().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(HOME.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBSeat;
    private javax.swing.JButton BTNExit;
    private javax.swing.JButton BTNHelp;
    private javax.swing.JButton BTNMaintenace;
    private java.awt.Button btnAbout;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}