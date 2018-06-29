/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t3h.doan;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class myGame extends JPanel {
    
    private Image image;
    
    public myGame(String pathImage, int x, int y) {
        this.setSize(x, y);
        this.setLayout(null);
        try {
            image = ImageIO.read(getClass().getResource(pathImage));
        } catch (IOException ex) {
            // handle exception...
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
    
}
