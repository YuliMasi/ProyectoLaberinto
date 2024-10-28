/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.proyectolaberinto.model;

import java.awt.Graphics;

/**
 *
 * @author Yuliana
 */
public class Sandias {

    private int x;
    private int y;
    private Sprite sprite;

    public Sandias() {
        x = 177;
        y = 265;
        sprite = new Sprite("/sandiaImage.png");
    }
    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(Graphics g) {
        g.drawImage(this.sprite.getImage(), this.x, this.y, null);
    }
    
    
}
