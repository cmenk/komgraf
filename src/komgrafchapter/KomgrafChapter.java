/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package komgrafchapter;

/**
 *
 * @author Newbie
 */
import java.awt.*;

import javax.swing.*;

import java.awt.Graphics.*;

import java.awt.Graphics2D.*;

import javax.swing.JFrame;

import javax.swing.JPanel;

import java.awt.BasicStroke;

import java.awt.Event.*;

import java.awt.Component.*;

import javax.swing.SwingUtilities;


/**
 *
 * @author junaid
 */
public class KomgrafChapter extends JPanel{


//private Graphics Graphics;

private void doDrawing(Graphics g){

Graphics2D g2d=(Graphics2D) g;

float[] dash1 = {2f,0f,2f};

g2d.drawLine(20, 40, 250, 40);

BasicStroke bs1 = new BasicStroke(1,BasicStroke.CAP_BUTT,

                    BasicStroke.JOIN_ROUND,1.0f,dash1,2f);

g2d.setStroke(bs1);

g2d.drawLine(20, 80, 250, 80);

    }

@Override

public void paintComponent(Graphics g){

super.paintComponent( g);

doDrawing(g);

}


}

class BasicStrokes extends JFrame{

public  BasicStrokes(){

initUI();

}

private void initUI(){

setTitle("line");

setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

add(new KomgrafChapter());

setSize(280,270);

setLocationRelativeTo(null);

}

/**

* @param args the command line arguments

*/

public static void main(String[] args) {


SwingUtilities.invokeLater(new Runnable(){   

@Override

public void run(){

BasicStrokes bs = new BasicStrokes();

bs.setVisible(true);

}                

});

}


}