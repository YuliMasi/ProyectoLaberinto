/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.proyectolaberinto.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.model.Personaje;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.model.Sandias;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.GUIHistory;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.GUIInformation;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.GUIPlayGame;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.GUIStartGame;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.PanelButtonInformation;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.PanelButtonPlayGame;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.PanelButtonStart;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.PanelGame;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.PanelHistory;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.PanelHistoryButton;
import ucr.ac.cr.tm2100.g3.proyectolaberinto.view.PanelInformationGame;

/**
 *
 * @author Yuliana
 */
public class ControllerGame implements ActionListener, KeyListener {

    private GUIStartGame guiStartGame; //Tiene los paneles del inicio
    private GUIInformation guiInformation;//Tiene los paneles de las instrucciones
    private GUIHistory guiHistory;//Tiene los paneles de la historia del juego
    private GUIPlayGame guiPlayGame;
    private Personaje personaje;
    private Sandias sandias;

    private PanelButtonStart panelButtonStart; //Tiene los botones de la pagina principal
    private PanelButtonInformation panelButtonInfo;//Tiiene los botones de la opcion de instrucciones
    private PanelHistoryButton panelHistoryButton;//Tiene el botones de la opcion historia del juego
    private PanelButtonPlayGame panelButtonPlayGame;
    private PanelInformationGame panelInformation;//Tiene los textos de la opcion de las instrucciones del juego
    private PanelHistory panelHistory;// Tiene los textos de las historia del juego

    private PanelGame panelGame;
    private int arregloFrutas[][] = {{100, 100}, {400, 100}, {400, 180}, {177, 10}, {177, 465}, {23, 465}, {100, 325}, {485, 480}, {485, 230}, {177, 265}};

    public ControllerGame() {
        guiStartGame = new GUIStartGame();
        guiInformation = new GUIInformation();
        guiHistory = new GUIHistory();
        guiPlayGame = new GUIPlayGame();
        personaje = new Personaje();
        sandias = new Sandias();

        panelButtonStart = guiStartGame.getPanelButtonsStart();
        panelInformation = guiInformation.getPanelInformation();
        panelButtonInfo = guiInformation.getPanelButtonInformation();
        panelHistory = guiHistory.getPanelHistory();
        panelHistoryButton = guiHistory.getPanelHistoryButton();
        panelButtonPlayGame = guiPlayGame.getPanelButtonPlayGame();

        this.panelButtonStart.listenButton(this);
        this.panelButtonInfo.listenButton(this);
        this.panelHistoryButton.listenButton(this);
        this.panelButtonPlayGame.listenButton(this);
        this.guiPlayGame.addKeyListener(this);
        

        guiStartGame.setLocationRelativeTo(panelButtonStart);
        guiInformation.setLocationRelativeTo(panelInformation);
        guiHistory.setLocationRelativeTo(guiHistory);
        guiPlayGame.setLocationRelativeTo(guiPlayGame);
        this.panelGame = this.guiPlayGame.getPanelGame1();
        this.panelGame.setPersonaje(this.personaje);
        this.panelGame.setSandia(this.sandias);
         
        
        guiStartGame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Jugar":
                guiPlayGame.setVisible(true);
                guiPlayGame.requestFocus();
                break;
            case "Instrucciones":
                guiInformation.setVisible(true);
                break;
            case "Historia del juego":
                guiHistory.setVisible(true);
                break;
            case "Salir":
                System.exit(0);
                break;
            case "Volver":
                guiInformation.dispose();
                guiHistory.dispose();
                guiPlayGame.dispose();
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressed");
        int width = this.panelGame.getWidth();
        int height = this.panelGame.getHeight();
        int x = this.personaje.getX();
        int y = this.personaje.getY();
        System.out.println("Hello");
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (y - 10 > 0) {
                    personaje.moveUp();
                    this.panelGame.repaint();
                }
                break;
            case KeyEvent.VK_DOWN:
                if (this.personaje.getBottom() + 10 < height) {
                    personaje.moveDown();
                    this.panelGame.repaint();
                }
                break;

            case KeyEvent.VK_LEFT:
                if (x - 10 > 0) {
                    personaje.moveLeft();
                    this.panelGame.repaint();
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (this.personaje.getRight() + 10 < width) {
                    personaje.moveRight();
                    this.panelGame.repaint();
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

   // public int[] obtenerFrutaAleatoria() {
     //   int i = (int) (Math.random() * arregloFrutas.length);

       // return arregloFrutas[i];
    //}

}
