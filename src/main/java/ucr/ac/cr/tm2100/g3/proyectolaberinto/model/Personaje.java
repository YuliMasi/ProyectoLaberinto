/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.proyectolaberinto.model;

import java.awt.Graphics;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.PanelGame;

/**
 *
 * @author Yuliana
 */
public class Personaje extends Element {

    private Sprite sprite;
    private PanelGame panelGame;

    public Personaje() {
        panelGame = new PanelGame();
        setX(20);
        setY(20);

        this.sprite = new Sprite("/Hongo.png");
    }
    
    public int getRight(){
        return this.sprite.getImage().getWidth()+this.getX();
    }
    
    public int getBottom(){
        return this.sprite.getImage().getHeight()+this.getY();
    }
    
    public void moveRight() {
        setX(getX()+10);
    }

    public void moveDown() {
        setY(getY() + 10);
    }

    public void moveLeft() {
        setX(getX() - 10);
    }

    public void moveUp() {
        setY(getY() - 10);
    }

    public void draw(Graphics g) {
        g.drawImage(this.sprite.getImage(), this.getX(), this.getY(), null);
    }
}
