package airlineapp.GUI;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Christian Matei 
 * christian.matei@icloud.com
 * Airline Project
 * @author Christian
 */

// GUI Help Form, that will open a Word File With all the general help for the application 
// when the user requiers it.

public class HELP extends javax.swing.JFrame {

	/**
	 * Creates new form HELP
	 */
	public HELP() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		BTNExit = new javax.swing.JButton();
		BTNHelp = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		BTNExit.setText("EXIT");
		BTNExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BTNExitActionPerformed(evt);
			}
		});

		BTNHelp.setText("CLICK TO DISPLAY HELP FILES");
		BTNHelp.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BTNHelpActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(15, 15, 15)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(BTNExit, javax.swing.GroupLayout.PREFERRED_SIZE, 274,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(BTNHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 274,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(16, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout.createSequentialGroup().addGap(22, 22, 22)
										.addComponent(BTNHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(BTNExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(19, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void BTNExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BTNExitActionPerformed

		// exits the application and does not saves anything
		System.exit(0);
	}// GEN-LAST:event_BTNExitActionPerformed

	private void BTNHelpActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BTNHelpActionPerformed
		try {
			String htmlFilePath = "HelpFile.html"; // path to your new file
			File htmlFile = new File(htmlFilePath);

			// open the default web browser for the HTML page
			Desktop.getDesktop().browse(htmlFile.toURI());

			// if a web browser is the default HTML handler, this might work too
			Desktop.getDesktop().open(htmlFile);
		} catch (IOException ex) {
			Logger.getLogger(HELP.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_BTNHelpActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(HELP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new HELP().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton BTNExit;
	private javax.swing.JButton BTNHelp;
	// End of variables declaration//GEN-END:variables
}
