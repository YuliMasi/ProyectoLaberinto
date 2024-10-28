/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.proyectolaberinto.view;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Yuliana
 */
public class PanelButtonStart extends javax.swing.JPanel {
    private final ImageIcon imagePanelButton = new ImageIcon("DegradadoVerde.jpg");
    /**
     * Creates new form PanelButtonStart
     */
    public PanelButtonStart() {
        initComponents();
    }
    
     public void listenButton(ActionListener controller){
        this.btnHistory.addActionListener(controller);
        this.btnInstructions.addActionListener(controller);
        this.btnOut.addActionListener(controller);
        this.btnPlay.addActionListener(controller);
    }
     
    public void paint(Graphics g){
        g.drawImage(imagePanelButton.getImage(),0,0,null);
        setOpaque(false);
        super.paint(g);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInstructions = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();

        btnInstructions.setBackground(new java.awt.Color(0, 204, 153));
        btnInstructions.setText("Instrucciones");

        btnPlay.setBackground(new java.awt.Color(0, 204, 153));
        btnPlay.setText("Jugar");

        btnOut.setBackground(new java.awt.Color(0, 204, 153));
        btnOut.setText("Salir");

        btnHistory.setBackground(new java.awt.Color(0, 204, 153));
        btnHistory.setText("Historia del juego");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addComponent(btnOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOut, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnInstructions;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnPlay;
    // End of variables declaration//GEN-END:variables
}