/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package TalleresJavaa;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Aprendiz
 */
public class frmE012 extends javax.swing.JFrame {

    /**
     * Creates new form frmE012
     */
    public frmE012() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("       EJERCICIO 12");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 20, 200, 29);

        jLabel4.setBackground(new java.awt.Color(153, 102, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RESULTADO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 340, 110, 30);

        jLabel5.setBackground(new java.awt.Color(153, 102, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VERIFICAR CIFRA PAR Y CAPICUA");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 60, 350, 16);

        txtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero1ActionPerformed(evt);
            }
        });
        txtNumero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumero1keyPressTxtNumero(evt);
            }
        });
        jPanel1.add(txtNumero1);
        txtNumero1.setBounds(30, 190, 130, 30);

        btnCalcular.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setOpaque(true);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular);
        btnCalcular.setBounds(60, 480, 80, 23);

        lblResultado.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(lblResultado);
        lblResultado.setBounds(10, 380, 220, 80);

        jLabel6.setBackground(new java.awt.Color(153, 102, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INGRESE UN NUMERO");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 130, 200, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/E12.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-440, -380, 1550, 900);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    public boolean isNumber(String numero) {
        try {
            int Number = Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(this,
                    "El texto " + numero + " no es un numero valido",
                    "Numero Invalido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void verificar() {
        if (isNumber(txtNumero1.getText())) {
            String num = null;
            int x = 1;
            boolean desi = false;
            num = txtNumero1.getText();
            x = num.length();
            if ((x % 2) != 0) {
                JOptionPane.showMessageDialog(this, "Error, digite una cifra par", "error", JOptionPane.ERROR_MESSAGE);
                txtNumero1.setText("");
            } else {
                int[] nume;
                nume = new int[x];
                int[] nume2;
                nume2 = new int[x + 1];
                int[] numee;
                numee = new int[x];

                for (int i = 0; i < x; i++) {
                    nume[i] = ((num.charAt(i)));
                    numee[i] = (Character.getNumericValue(nume[i]));
                }
                int y = x - 1;
                for (int i = 1; i <= x; i++) {
                    nume2[i] = (Character.getNumericValue(nume[y]));
                    if (nume2[i] == numee[i - 1]) {
                        desi = true;
                    }
                    y -= 1;
                }
                if (desi == true) {
                    lblResultado.setText("Es capicúa");
                } else {
                    lblResultado.setText("No es capicúa");
                }

            }
        }
    }
    private void txtNumero1keyPressTxtNumero(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero1keyPressTxtNumero
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            verificar();

        }
    }//GEN-LAST:event_txtNumero1keyPressTxtNumero

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        verificar();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmE012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmE012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmE012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmE012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmE012().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField txtNumero1;
    // End of variables declaration//GEN-END:variables

}
