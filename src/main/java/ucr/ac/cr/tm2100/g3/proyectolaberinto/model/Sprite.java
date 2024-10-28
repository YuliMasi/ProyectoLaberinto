/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.proyectolaberinto.model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Yuliana
 */
public class Sprite {

    private BufferedImage image;

    public Sprite(String route) {
        URL resource = getClass().getResource(route);
        try {
            this.image = ImageIO.read(resource);
        } catch (IOException ex) {
            Logger.getLogger(Personaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image getScaled(int x, int y) {
        return this.image.getScaledInstance(x, y, image.getType());

    }
    
    public BufferedImage getImage(){
        return this.image;
    }
}
