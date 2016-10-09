/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica02.view;

import Practica02.model.capitalModel;
import Practica02.service.capitalService;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class capitalView extends javax.swing.JFrame {

    /**
     * Creates new form viewCapital
     */
    public capitalView() {
        initComponents();
    }

    private void proceso(){
        //Datos
        capitalModel model = new capitalModel();
        model.setCapital(Double.parseDouble(txtCapital.getText()));
        model.setPeriodos(Integer.parseInt(txtPeriodo.getText()));
        model.setTasaInteres(Double.parseDouble(txtInteres.getText()));
        //Proceso
        capitalService service = new capitalService();
        service.procesar(model);
        
        String repo = "";
        repo += "Capital   :   " + model.getCapital()+ "\n";
        repo += "Periodos :   " + model.getPeriodos()+ "\n";
        repo += "Tasa de Interes  :   " + model.getTasaInteres()+ "\n";
        repo += "Importe x Periodo :   " + model.getImporteAcumulado()+ "\n";
        
        JOptionPane.showMessageDialog(rootPane, repo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtProcesar = new javax.swing.JButton();
        txtCapital = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        txtInteres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtProcesar.setText("Procesar");
        txtProcesar.setName("btnProcesar"); // NOI18N
        txtProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcesarActionPerformed(evt);
            }
        });

        txtCapital.setName("txtCapital"); // NOI18N
        txtCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapitalActionPerformed(evt);
            }
        });

        txtPeriodo.setName("txtPeriodos"); // NOI18N

        txtInteres.setName("txtInteres"); // NOI18N

        jLabel1.setText("Capital: ");

        jLabel2.setText("Periodos:");

        jLabel3.setText("Tasa de Interes: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtInteres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeriodo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCapital, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(txtProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addComponent(txtProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        txtProcesar.getAccessibleContext().setAccessibleName("");
        txtProcesar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcesarActionPerformed
        proceso();
    }//GEN-LAST:event_txtProcesarActionPerformed

    private void txtCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapitalActionPerformed

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
            java.util.logging.Logger.getLogger(capitalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capitalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capitalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capitalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capitalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCapital;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JButton txtProcesar;
    // End of variables declaration//GEN-END:variables
}
