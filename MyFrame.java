/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6oop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;
/**
 *
 * @author mariu
 */
public class MyFrame extends JFrame implements MouseMotionListener, MouseListener {
    
    private static int clickCount = 0;
    private int color1, color2, color3;
    
    public MyFrame(){
        
        createFrame();
        
    }
    
    public void createFrame(){
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(500, 500));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {

         /*System.out.println("Mouse dragged.");
         
         
         Graphics g = this.getGraphics();
         g.setColor(new Color(color1, color2, color3));
         g.fillOval(e.getX(), e.getY(), 10, 10);*/
         

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        if( clickCount % 2 == 0 ){
            System.out.println("Mouse moved.");

            Graphics g = this.getGraphics();
            g.setColor(new Color(color1, color2, color3));
            g.fillOval(e.getX(), e.getY(), 10, 10);
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        clickCount++;
        Random r = new Random();
        color1 = r.nextInt(200);
        color2 = r.nextInt(200);
        color3 = r.nextInt(200);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
}
