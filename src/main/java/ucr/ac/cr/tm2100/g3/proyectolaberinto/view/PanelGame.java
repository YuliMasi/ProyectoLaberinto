/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.proyectolaberinto.view;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.model.Personaje;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.model.Sandias;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.model.Sprite;

/**
 *
 * @author Yuliana
 */
public class PanelGame extends javax.swing.JPanel {
   private Personaje personaje=null;
   private Sandias sandias=null;
   private Sprite fondo;
    /**
     * Creates new form PanelGame
     */
    public PanelGame() {
        initComponents();  
       this.fondo = new Sprite("/Camino.jpg");
    }

   
    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
    
    public void setSandia(Sandias sandias){
        this.sandias = sandias;
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int width=this.getWidth();
        int height=this.getHeight();
        
        g.drawImage(this.fondo.getScaled(width, height), 0, 0, this);
        
        if(this.personaje==null){
            return;
        }
        this.personaje.draw(g);
        
        if(this.sandias==null){
            return;
        }
        this.sandias.draw(g);
    }
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}