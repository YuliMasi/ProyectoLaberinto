/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.proyectolaberinto.view;

import java.awt.event.ActionListener;

/**
 *
 * @author Yuliana
 */
public class PanelHistoryButton extends javax.swing.JPanel {

    /**
     * Creates new form PanelHistoryButton
     */
    public PanelHistoryButton() {
        initComponents();
    }
    
    public void listenButton(ActionListener controller){
        this.btnOut.addActionListener(controller);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOut = new javax.swing.JButton();

        setBackground(new java.awt.Color(111, 191, 126));

        btnOut.setBackground(new java.awt.Color(255, 255, 204));
        btnOut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOut.setText("Volver");
        btnOut.setAlignmentY(0.0F);
        btnOut.setBorder(null);
        btnOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOut, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOut, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOut;
    // End of variables declaration//GEN-END:variables
}
