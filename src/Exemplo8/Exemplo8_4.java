/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Exemplo8;

import javax.swing.JOptionPane;

/**
 *
 * @author clebe
 */
public class Exemplo8_4 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo8_4
     */
    public Exemplo8_4() {
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

        jCkBoxIngles = new javax.swing.JCheckBox();
        jCkBoxInformática = new javax.swing.JCheckBox();
        jBtnVerificar = new javax.swing.JButton();
        jBtnMarcar = new javax.swing.JButton();
        jBtnDesmarcar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exemplo 8.4");

        jCkBoxIngles.setText("Java SE");

        jCkBoxInformática.setText("Banco de Dados");

        jBtnVerificar.setMnemonic('v');
        jBtnVerificar.setText("Verificar");
        jBtnVerificar.setToolTipText("Verificar quais cursos foram selecionados acima");
        jBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarActionPerformed(evt);
            }
        });

        jBtnMarcar.setMnemonic('m');
        jBtnMarcar.setText("Marcar");
        jBtnMarcar.setToolTipText("Marca todos os cursos acima");
        jBtnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMarcarActionPerformed(evt);
            }
        });

        jBtnDesmarcar.setMnemonic('d');
        jBtnDesmarcar.setText("Desmarcar");
        jBtnDesmarcar.setToolTipText("Desmarca todas as opções acima");
        jBtnDesmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDesmarcarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnDesmarcar)
                    .addComponent(jBtnMarcar)
                    .addComponent(jBtnVerificar)
                    .addComponent(jCkBoxInformática)
                    .addComponent(jCkBoxIngles))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jCkBoxIngles)
                .addGap(18, 18, 18)
                .addComponent(jCkBoxInformática)
                .addGap(29, 29, 29)
                .addComponent(jBtnVerificar)
                .addGap(18, 18, 18)
                .addComponent(jBtnMarcar)
                .addGap(28, 28, 28)
                .addComponent(jBtnDesmarcar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMarcarActionPerformed
        jCkBoxInformática.setSelected(true);
        jCkBoxIngles.setSelected(true);
    }//GEN-LAST:event_jBtnMarcarActionPerformed

    private void jBtnDesmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDesmarcarActionPerformed
        jCkBoxInformática.setSelected(false);
        jCkBoxIngles.setSelected(false);
    }//GEN-LAST:event_jBtnDesmarcarActionPerformed

    private void jBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarActionPerformed
        String selecao = "Selecionados: ";
        if(jCkBoxIngles.isSelected()){
            selecao += "\n"+jCkBoxIngles.getText();
        }
        if(jCkBoxInformática.isSelected()){
            selecao += "\n"+jCkBoxInformática.getText();
        }
        
        if(!jCkBoxIngles.isSelected() && !jCkBoxInformática.isSelected()){
            JOptionPane.showMessageDialog(null, "Nenhum curso Selecionado!!!");
        }else{
           JOptionPane.showMessageDialog(null, selecao); 
        }
           
       
    }//GEN-LAST:event_jBtnVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo8_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo8_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo8_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDesmarcar;
    private javax.swing.JButton jBtnMarcar;
    private javax.swing.JButton jBtnVerificar;
    private javax.swing.JCheckBox jCkBoxInformática;
    private javax.swing.JCheckBox jCkBoxIngles;
    // End of variables declaration//GEN-END:variables
}