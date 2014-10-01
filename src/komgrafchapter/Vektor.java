/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komgrafchapter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.math.BigDecimal;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Vektor extends javax.swing.JFrame {

    /**
     * Creates new form Vektor
     */
    public Vektor() {
        initComponents();
        jPanel2.setBackground(Color.white);
        jPanel2.setOpaque(true);
        x1.setVisible(false);
        x2.setVisible(false);
        x3.setVisible(false);
        x4.setVisible(false);
        y1.setVisible(false);
        y2.setVisible(false);
        y3.setVisible(false);
        y4.setVisible(false);
        LabelX1.setVisible(false);
        LabelX2.setVisible(false);
        LabelX3.setVisible(false);
        LabelX4.setVisible(false);
        LabelY1.setVisible(false);
        LabelY2.setVisible(false);
        LabelY3.setVisible(false);
        LabelY4.setVisible(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton5.setEnabled(false);
        titik.setVisible(false);
        garis.setVisible(false);
        geometri.setVisible(false);
    }
    
    public class arrow{
        public void paintComponent(Graphics g){
            AffineTransform tx=new AffineTransform();
           Graphics2D ga=(Graphics2D) g;
        jPanel2.paintComponents(g);
         Polygon arrow =new Polygon();
         if(Integer.parseInt(x2.getText())>Integer.parseInt(x1.getText())){
            arrow.addPoint(0, 0);
            arrow.addPoint(9, 0);
            arrow.addPoint(9, 10);
         }
         else if(Integer.parseInt(x2.getText())<Integer.parseInt(x1.getText())){
            arrow.addPoint(0, 0);
            arrow.addPoint(9, 9);
            arrow.addPoint(0, 10);
         }
          else if(Integer.parseInt(x2.getText())==Integer.parseInt(x1.getText())&& Integer.parseInt(y1.getText())<Integer.parseInt(y2.getText())){
            arrow.addPoint(0, 10);
            arrow.addPoint(5, 0);
            arrow.addPoint(10, 10);
         }
          else{
            arrow.addPoint(0, 0);
            arrow.addPoint(0, 10);
            arrow.addPoint(5, 5);
          }
            tx.translate(296+30*Double.parseDouble(x2.getText()),296-30*Double.parseDouble(y2.getText()));
           ga.setTransform(tx);
            ga.setColor(Color.BLUE);
            ga.fill(arrow);
            
        }
        
        
    }

   public class sumbu{
    
        public void paintComponent(Graphics g){
           
        jPanel2.paintComponents(g);
     
  
        for(int a=0;a<=570; a+=30){
            
               if(a==300) { 
                   g.setColor(Color.BLACK);
                g.drawLine(30, 300, 600, 300);
                g.drawLine(300, 60, 300, 600);
             }
             
               g.setColor(Color.BLACK);
                g.drawString(Integer.toString((a-300)/30),a, 300);
                g.drawString(Integer.toString((300-a)/30),300, a);
           
           
        }
       
  
      }
        public void grid(Graphics g){
            for(int a=0;a<=570; a+=30){
                if(a==570){
              g.drawLine(30, 60,30, 600);
             }
               else{
             g.setColor(Color.LIGHT_GRAY);
             g.drawLine(30, 600-a, 600, 600-a);
             g.drawLine(600-a, 60,600-a, 600);
               }
            }
   }
   }
   public class titik{
        public void paintComponent(Graphics g){
           
        jPanel2.paintComponents(g);
        g.setColor(Color.BLUE);
        g.drawLine(300+(30*Integer.parseInt(x1.getText())), 300-(30*Integer.parseInt(y1.getText())), 300+(30*Integer.parseInt(x1.getText())), 300-(30*Integer.parseInt(y1.getText())));
   
        g.setColor(Color.red);
        g.drawString("A("+x1.getText()+","+y1.getText()+")",300+(30*Integer.parseInt(x1.getText())), 300-(30*Integer.parseInt(y1.getText())));
        
        
        }
   }
   public class adisiTitik{
        public void paintComponent(Graphics g){
        int xAdisi,yAdisi;   
        jPanel2.paintComponents(g);
        xAdisi=Integer.parseInt(x1.getText())+Integer.parseInt(xTitik.getText());
        yAdisi=Integer.parseInt(y1.getText())+Integer.parseInt(yTitik.getText());
        g.setColor(Color.BLUE);
        g.drawLine(300+(30*xAdisi), 300-(30*yAdisi), 300+(30*xAdisi), 300-(30*yAdisi));
   
        g.setColor(Color.BLUE);
        g.drawString("B("+xAdisi+","+yAdisi+")",300+(30*xAdisi), 300-(30*yAdisi));
        
        jTextArea1.setText(
                "Adisi titik \n (X+X1,Y+Y1)=("+x1.getText()+"+"+xTitik.getText()+","+y1.getText()+"+"+yTitik.getText()+")"
                 +"\n = ("+Integer.toString(xAdisi)+","+Integer.toString(yAdisi)+")"
              
                );
        
        }
   }
   public class subtraksiTitik{
        public void paintComponent(Graphics g){
        int xSubtraksi,ySubtraksi;   
        jPanel2.paintComponents(g);
        xSubtraksi=Integer.parseInt(x1.getText())-Integer.parseInt(xTitik.getText());
        ySubtraksi=Integer.parseInt(y1.getText())-Integer.parseInt(yTitik.getText());
        g.setColor(Color.BLUE);
        g.drawLine(300+(30*xSubtraksi), 300-(30*ySubtraksi), 300+(30*xSubtraksi), 300-(30*ySubtraksi));
   
        g.setColor(Color.BLUE);
        g.drawString("B("+xSubtraksi+","+ySubtraksi+")",300+(30*xSubtraksi), 300-(30*ySubtraksi));
         jTextArea1.setText(
                "Subtraksi titik \n (X-X1,Y-Y1)=("+x1.getText()+"-"+xTitik.getText()+","+y1.getText()+"-"+yTitik.getText()+")"
                 +"\n = ("+Integer.toString(xSubtraksi)+","+Integer.toString(ySubtraksi)+")"
                );
        
        
        }
   }
   public class dotTitik{
        public void paintComponent(Graphics g){
        int X1,Y1,X2,Y2,dotProduct;   
        jPanel2.paintComponents(g);
        X1=Integer.parseInt(x1.getText());
        Y1=Integer.parseInt(y1.getText());
        X2=Integer.parseInt(xTitik.getText());
        Y2=Integer.parseInt(yTitik.getText());
        
        dotProduct=(X1*X2)+(Y1*Y2);
        
        jTextArea1.setText(
                "Dot Product = x1.x2 + y1.y2=("+X1+"*"+X2+")+("+Y1+"*"+Y2+")"
                 +"\n = "+ dotProduct
                );
        
        
        }
   }
   
   
  
   public class garis{
   public void paintComponent(Graphics g){
         int xa,xb,ya,yb;  
         String arah;
        jPanel2.paintComponents(g);
        g.setColor(Color.BLUE);
        g.drawLine(300+(30*Integer.parseInt(x1.getText())), 300-(30*Integer.parseInt(y1.getText())), 300+(30*Integer.parseInt(x2.getText())), 300-(30*Integer.parseInt(y2.getText())));
        xa =Integer.parseInt(x1.getText());
        ya=Integer.parseInt(y1.getText());
        xb=Integer.parseInt(x2.getText());
        yb=Integer.parseInt(y2.getText());
      
        g.setColor(Color.red);
        g.drawString("A("+x1.getText()+","+y1.getText()+")",300+(30*Integer.parseInt(x1.getText())), 300-(30*Integer.parseInt(y1.getText())));
         g.drawString("B("+x2.getText()+","+y2.getText()+")",300+(30*Integer.parseInt(x2.getText())), 300-(30*Integer.parseInt(y2.getText())));
         double panjang=Math.sqrt(((xb-xa)*(xb-xa))+((yb-ya)*(yb-ya)));
           BigDecimal h = new BigDecimal(panjang);
           h = h.setScale(3,BigDecimal.ROUND_UP);
           jTextArea1.setText("Panjang Vektor =" + h
                  
                   );
   }
   }
   
    public class adisiGaris{
   public void paintComponent(Graphics g){
        int x11,x21,y11,y21,x12,x22,y12,y22,x1Adisi,y1Adisi,x2Adisi,y2Adisi;
        jPanel2.paintComponents(g);
      
//        g.setColor(Color.red);
//        g.drawString("C("+x1Garis2.getText()+","+y1Garis2.getText()+")",300+(30*Integer.parseInt(x1Garis2.getText())), 300-(30*Integer.parseInt(y1Garis2.getText())));
//        g.drawString("D("+x2Garis2.getText()+","+y2Garis2.getText()+")",300+(30*Integer.parseInt(x2Garis2.getText())), 300-(30*Integer.parseInt(y2Garis2.getText())));
        x11= Integer.parseInt(x1.getText());
        y11= Integer.parseInt(y1.getText());
        x21= Integer.parseInt(x2.getText());
        y21= Integer.parseInt(y2.getText());
        
//        x12= Integer.parseInt(x1Garis2.getText());
//        y12= Integer.parseInt(y1Garis2.getText());
//        x22= Integer.parseInt(x2Garis2.getText());
//        y22= Integer.parseInt(y2Garis2.getText());
//        
        x1Adisi=x11+x21;
        y1Adisi=y11+y21;
//        x2Adisi=x21+x22;
//        y2Adisi=y21+y22;
         g.setColor(Color.red);
        g.drawString("A+B("+x1Adisi+","+y1Adisi+")",300+(30*x1Adisi), 300-(30*y1Adisi));
       
        g.setColor(Color.GREEN);
         g.drawLine(300+(30*x11), 300-(30*y11), 300+(30*x1Adisi), 300-(30*y1Adisi));
          g.setColor(Color.ORANGE);
          g.drawLine(300+(30*x21), 300-(30*y21), 300+(30*x1Adisi), 300-(30*y1Adisi));
         
         jTextArea1.setText(
                 "Adisi garis AB adalah \n"
                 + "X1 + X2 = "+ Integer.toString(x1Adisi)
                 +"\nY1 + Y2 = "+  Integer.toString(y1Adisi)
                  +"\n\n (X',Y')  = ("+Integer.toString(x1Adisi)+","+Integer.toString(y1Adisi)+") "
                                 );
   
   }
   }
  
  public class subtraksiGaris{
   public void paintComponent(Graphics g){
        int x11,x21,y11,y21,x12,x22,y12,y22,x1Subtraksi,y1Subtraksi,x2Subtraksi,y2Subtraksi;
        jPanel2.paintComponents(g);
       
//        g.setColor(Color.red);
//        g.drawString("C("+x1Garis2.getText()+","+y1Garis2.getText()+")",300+(30*Integer.parseInt(x1Garis2.getText())), 300-(30*Integer.parseInt(y1Garis2.getText())));
//        g.drawString("D("+x2Garis2.getText()+","+y2Garis2.getText()+")",300+(30*Integer.parseInt(x2Garis2.getText())), 300-(30*Integer.parseInt(y2Garis2.getText())));
        x11= Integer.parseInt(x1.getText());
        y11= Integer.parseInt(y1.getText());
        x21= Integer.parseInt(x2.getText());
        y21= Integer.parseInt(y2.getText());
        
//        x12= Integer.parseInt(x1Garis2.getText());
//        y12= Integer.parseInt(y1Garis2.getText());
//        x22= Integer.parseInt(x2Garis2.getText());
//        y22= Integer.parseInt(y2Garis2.getText());
        
        x1Subtraksi=x11-x21;
        y1Subtraksi=y11-y21;
//        x2Subtraksi=x21-x22;
//        y2Subtraksi=y21+y22;
        g.setColor(Color.red);
        g.drawString("A-B("+x1Subtraksi+","+y1Subtraksi+")",300+(30*x1Subtraksi), 300-(30*y1Subtraksi));
       
        g.setColor(Color.GREEN);
         g.drawLine(300+(30*x11), 300-(30*y11), 300+(30*x1Subtraksi), 300-(30*y1Subtraksi));
          g.setColor(Color.ORANGE);
          g.drawLine(300+(30*x21), 300-(30*y21), 300+(30*x1Subtraksi), 300-(30*y1Subtraksi));
        
     //   g.drawLine(300+(30*x1Subtraksi), 300-(30*y1Subtraksi), 300+(30*x2Subtraksi), 300-(30*y2Subtraksi));
         jTextArea1.setText(
                 "Subtraksi garis AB  adalah \n "
                 + "X1 (Titik A) - X2 (Titik B) = "+ Integer.toString(x1Subtraksi)
                 +"\nY1 (Titik A) - Y2 (Titik B) = "+  Integer.toString(y1Subtraksi)
                 
                 +"\n\n (X1,Y1) = ("+Integer.toString(x1Subtraksi)+","+Integer.toString(y1Subtraksi)+") "
                 );
   
   }
   }
  public class dotGaris{
        public void paintComponent(Graphics g){
        int X1,Y1,X2,Y2,dotProduct;   
        jPanel2.paintComponents(g);
        X1=Integer.parseInt(x1.getText());
        Y1=Integer.parseInt(y1.getText());
        X2=Integer.parseInt(x2.getText());
        Y2=Integer.parseInt(y2.getText());
        
        dotProduct=(X1*X2)+(Y1*Y2);
        
        jTextArea1.setText(
                "Dot Product = x1.x2 + y1.y2=("+X1+"*"+X2+")+("+Y1+"*"+Y2+")"
                 +"\n = "+ dotProduct
                );
       }
   }
  
   public class bidang{
        public void segitiga(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3){
        Graphics2D ga=(Graphics2D) g;
      
        
      Polygon segiTiga = new Polygon();
      segiTiga.addPoint(300+30*x1, 300-30*y1);
       g.setColor(Color.red);
      g.drawString("A("+x1+","+y1+")",300+(30*x1), 300-(30*y1));
      segiTiga.addPoint(300+30*x2, 300-30*y2);
      g.drawString("B("+x2+","+y2+")",300+(30*x2), 300-(30*y2));
     
      segiTiga.addPoint(300+30*x3, 300-30*y3);
      g.drawString("C("+x3+","+y3+")",300+(30*x3), 300-(30*y3));
     
      ga.setColor(Color.BLUE);
     ga.draw(segiTiga);
       }
        public void paintComponent(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        Graphics2D ga=(Graphics2D) g;
       
        jPanel2.paintComponents(g);
      Polygon segiEmpat = new Polygon();
       ga.setColor(Color.BLUE);
      if(x1==x2||y1==y2){
          g.drawLine(300+30*x1,300-30* y1,300+30* x2,300-30* y2);
          if(x1==x3||y1==y3){
              g.drawLine(300+30*x1,300-30* y1, 300+30*x3,300-30* y3);
              g.drawLine(300+30*x2, 300-30* y2,300+30* x4, 300-30* y4);
              g.drawLine(300+30*x3, 300-30* y3,300+30* x4, 300-30* y4);
          }
          else if(x1==x4||y1==y4){
              g.drawLine(300+30*x1, 300-30*y1, 300+30*x4, 300-30*y4);
               g.drawLine(300+30*x2, 300-30* y2,300+30* x4, 300-30* y4);
              g.drawLine(300+30*x3, 300-30* y3,300+30* x4, 300-30* y4);
          }
        
      }
      else if(x1==x4||y1==y4){
          g.drawLine(300+30*x1,300-30* y1,300+30* x4,300-30* y4);
          if(x1==x3||y1==y3){
              g.drawLine(300+30*x1,300-30* y1, 300+30*x3,300-30* y3);
              g.drawLine(300+30*x2, 300-30* y2,300+30* x4, 300-30* y4);
              g.drawLine(300+30*x3, 300-30* y3,300+30* x4, 300-30* y4);
          }
          else if(x1==x2||y1==y2){
              g.drawLine(300+30*x1, 300-30*y1, 300+30*x2, 300-30*y2);
               g.drawLine(300+30*x2, 300-30* y2,300+30* x4, 300-30* y4);
              g.drawLine(300+30*x3, 300-30* y3,300+30* x4, 300-30* y4);
          }
        
      }
     
     g.setColor(Color.red);
     g.drawString("A("+x1+","+y1+")",300+(30*x1), 300-(30*y1));

      g.drawString("B("+x2+","+y2+")",300+(30*x2), 300-(30*y2));

     g.drawString("C("+x3+","+y3+")",300+(30*x3), 300-(30*y3));

     g.drawString("D("+x4+","+y4+")",300+(30*x4), 300-(30*y4));

       }
   }
   public class transformasi{
        public void translasiSegi3(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int tx,int ty){
        Graphics2D ga=(Graphics2D) g;
        int X1,Y1,X2,Y2,X3,Y3;
        X1= x1+tx;
        Y1= y1+ty;
        
        X2= x2+tx;
        Y2= y2+ty;
        
        X3= x3+tx;
        Y3= y3+ty;
      
      Polygon segiTiga = new Polygon();
      segiTiga.addPoint(300+30*X1, 300-30*Y1);
      g.setColor(Color.magenta);
      g.drawString("A'("+X1+","+Y1+")",300+(30*X1), 300-(30*Y1));
      segiTiga.addPoint(300+30*X2, 300-30*Y2);
      g.drawString("B'("+X2+","+Y2+")",300+(30*X2), 300-(30*Y2));
      segiTiga.addPoint(300+30*X3, 300-30*Y3);
      g.drawString("C'("+X3+","+Y3+")",300+(30*X3), 300-(30*Y3));
     
      ga.setColor(Color.RED);
     ga.draw(segiTiga);
       jTextArea1.setText(
                "Translasi berarti memindahkan objek sepanjang garis lurus \n dari suatu lokasi koordinat tertentu kelokasi yang lain tanpa mengubah bentuk objek"
                 +"\n Untuk melakukan translasi dapat menggunakan rumus: \nx’ = x + tx \ny’ = y + ty"
                 +"\n Ax'="+x1+"+"+tx+"Ay'="+y1+"+"+ty+"\n A'("+X1+","+Y1+")"
                +"\n Bx'="+x2+"+"+tx+"By'="+y2+"+"+ty+"\n B'("+X2+","+Y2+")"
                +"\n Cx'="+x3+"+"+tx+"Cy'="+y1+"+"+ty+"\n C'("+X3+","+Y3+")"
                );
       }
        
      public void skalaSegi3(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int tx,int ty){
        Graphics2D ga=(Graphics2D) g;
        int X1,Y1,X2,Y2,X3,Y3;
        X1= x1*tx;
        Y1= y1*ty;
        
        X2= x2*tx;
        Y2= y2*ty;
        
        X3= x3*tx;
        Y3= y3*ty;
      
      Polygon segiTiga = new Polygon();
      segiTiga.addPoint(300+30*X1, 300-30*Y1);
       g.setColor(Color.magenta);
       g.drawString("A'("+X1+","+Y1+")",300+(30*X1), 300-(30*Y1));
     
      segiTiga.addPoint(300+30*X2, 300-30*Y2);
       g.drawString("B'("+X2+","+Y2+")",300+(30*X2), 300-(30*Y2));
      segiTiga.addPoint(300+30*X3, 300-30*Y3);
       g.drawString("C'("+X3+","+Y3+")",300+(30*X3), 300-(30*Y3));
     ga.setColor(Color.BLACK); ga.draw(segiTiga);
     
      //ga.fill(segiTiga);
      jTextArea1.setText(
                "Skala digunakan untuk mengubah ukuran suatu objek, bila pada translasi operasi yang digunakan adalah penjumlahan\n sedangkan pada skala operasi yang digunakan adalah perkalian."
                +"\n Untuk melakukan skala dapat menggunakan rumus: \nx’ = x * tx \ny’ = y * ty"
                 +"\n Ax'="+x1+"*"+tx+"Ay'="+y1+"*"+ty+"\n A'("+X1+","+Y1+")"
                +"\n Bx'="+x2+"*"+tx+"By'="+y2+"*"+ty+"\n B'("+X2+","+Y2+")"
                +"\n Cx'="+x3+"*"+tx+"Cy'="+y1+"*"+ty+"\n C'("+X3+","+Y3+")"
                );
       }
        public void shearSegi3(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int tx,int ty){
        Graphics2D ga=(Graphics2D) g;
        int X1,Y1,X2,Y2,X3,Y3;
        X1= x1+(tx*y1);
        Y1= y1+(ty*x1);
        
        X2= x2+(tx*y2);
        Y2= y2+(ty*x2);
        
        X3= x3+(tx*y3);
        Y3= y3+(ty*x3);
      
      Polygon segiTiga = new Polygon();
      segiTiga.addPoint(300+30*X1, 300-30*Y1);
      g.setColor(Color.magenta);
       g.drawString("A'("+X1+","+Y1+")",300+(30*X1), 300-(30*Y1));
     
      segiTiga.addPoint(300+30*X2, 300-30*Y2);
       g.drawString("B'("+X2+","+Y2+")",300+(30*X2), 300-(30*Y2));
     
      segiTiga.addPoint(300+30*X3, 300-30*Y3);
       g.drawString("C'("+X3+","+Y3+")",300+(30*X3), 300-(30*Y3));
     
      ga.setColor(Color.GREEN);
      ga.draw(segiTiga);
      jTextArea1.setText(
                "Shear adalah bentuk transformasi yang membuat distorsi dari bentuk suatu objek, seperti menggeser sisi tertentu."
                 +"\n Untuk melakukan shearing dapat menggunakan rumus: \nx’ = x + tx*y \ny’ = ty*x + y"
                 +"\n Ax'="+x1+"+"+tx+"*"+y1+"Ay'="+ty+"*"+x1+"+"+y1+"\n A'("+X1+","+Y1+")"
                 +"\n Bx'="+x2+"+"+tx+"*"+y2+"Ay'="+ty+"*"+x2+"+"+y2+"\n B'("+X2+","+Y2+")"
                +"\n Cx'="+x3+"+"+tx+"*"+y3+"Ay'="+ty+"*"+x3+"+"+y3+"\n C'("+X3+","+Y3+")"
                 );
       }
       public void rotasiSegi3(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,double sudut){
        Graphics2D ga=(Graphics2D) g;
       int X1,Y1,X2,Y2,X3,Y3;
        double a=  Math.cos(sudut);
    double b=  Math.sin(sudut);
   

       X1=  (int) ((int) (0+(x1-0)*a)-((y1-0)*b));
       Y1= (int) ((int) (0+(x1-0)*b)+((y1-0)*a));
       X2= (int) ((int) (0+(x2-0)*a)-((y2-0)*b));
       Y2= (int)((int) (0+(x2-0)*b)+((y2-0)*a));
       X3= (int)((int)(0+(x3-0)*a)-((y3-0)*b));
       Y3= (int)((int)(0+(x3-0)*b)+((y3-0)*a));
      
      Polygon segiTiga = new Polygon();
      segiTiga.addPoint(300+30*X1, 300-30*Y1);
        g.setColor(Color.magenta);
       g.drawString("A'("+X1+","+Y1+")",300+(30*X1), 300-(30*Y1));
      segiTiga.addPoint(300+30*X2, 300-30*Y2);
      g.drawString("B'("+X2+","+Y2+")",300+(30*X2), 300-(30*Y2));
      segiTiga.addPoint(300+30*X3, 300-30*Y3);
        g.drawString("C'("+X3+","+Y3+")",300+(30*X3), 300-(30*Y3));
      ga.setColor(Color.YELLOW);
     ga.draw(segiTiga);
       jTextArea1.setText(
                "Rotasi merupakan pemutaran terhadap suatu objek,"
                +"\n Untuk melakukan Rotasi dapat menggunakan rumus: \nX’A = Xp + (XA – Xp)Cos Theta – (YA- YP)Sin Theta\nY’A = YP + (XA – XP)Sin Theta + (YA – YP)Cos Theta"
                 +"\n  A'("+X1+","+Y1+")"
                 +"\n  B'("+X2+","+Y2+")"
                +"\n  C'("+X3+","+Y3+")"
                 );
       }
      
        public void translasiSegi4(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int tx,int ty){
        Graphics2D ga=(Graphics2D) g;
       int X1,Y1,X2,Y2,X3,Y3,X4,Y4;
        X1= x1+tx;
        Y1= y1+ty;
        
        X2= x2+tx;
        Y2= y2+ty;
        
        X3= x3+tx;
        Y3= y3+ty;
        
        X4= x4+tx;
        Y4= y4+ty;
       
          ga.setColor(Color.GREEN);
      if(X1==X2||Y1==Y2){
          g.drawLine(300+30*X1,300-30* Y1,300+30* X2,300-30* Y2);
          if(X1==X3||Y1==Y3){
              g.drawLine(300+30*X1,300-30* Y1, 300+30*X3,300-30* Y3);
              g.drawLine(300+30*X2, 300-30* Y2,300+30* X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* Y3,300+30* X4, 300-30* Y4);
          }
          else if(X1==X4||Y1==Y4){
              g.drawLine(300+30*X1, 300-30*Y1, 300+30*X4, 300-30*Y4);
               g.drawLine(300+30*X2, 300-30* y2,300+30*X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* y3,300+30* X4, 300-30* Y4);
          }
       
      }
        else if(X1==X4||Y1==Y4){
          g.drawLine(300+30*X1,300-30* Y1,300+30* X4,300-30* Y4);
          if(X1==X3||Y1==Y3){
              g.drawLine(300+30*X1,300-30* Y1, 300+30*X3,300-30* Y3);
              g.drawLine(300+30*X2, 300-30* Y2,300+30* X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* Y3,300+30* X4, 300-30* Y4);
          }
          else if(X1==X2||Y1==Y2){
              g.drawLine(300+30*X1, 300-30*Y1, 300+30*X2, 300-30*Y2);
               g.drawLine(300+30*X2, 300-30* Y2,300+30* X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* Y3,300+30* X4, 300-30* Y4);
          }
        }
     
      g.setColor(Color.magenta);
     g.drawString("A'("+X1+","+Y1+")",300+(30*X1), 300-(30*Y1));

      g.drawString("B'("+X2+","+Y2+")",300+(30*X2), 300-(30*Y2));

     g.drawString("C'("+X3+","+Y3+")",300+(30*X3), 300-(30*Y3));

     g.drawString("D'("+X4+","+Y4+")",300+(30*X4), 300-(30*Y4));
      jTextArea1.setText(
                "Translasi berarti memindahkan objek sepanjang garis lurus \n dari suatu lokasi koordinat tertentu kelokasi yang lain tanpa mengubah bentuk objek"
                 +"\n Untuk melakukan translasi dapat menggunakan rumus: \nx’ = x + tx \ny’ = y + ty"
                 +"\n Ax'="+x1+"+"+tx+" Ay'="+y1+"+"+ty+"\n A'("+X1+","+Y1+")"
                +"\n Bx'="+x2+"+"+tx+" By'="+y2+"+"+ty+"\n B'("+X2+","+Y2+")"
                +"\n Cx'="+x3+"+"+tx+" Cy'="+y3+"+"+ty+"\n C'("+X3+","+Y3+")"
                 +"\n Dx'="+x4+"+"+tx+" Dy'="+y4+"+"+ty+"\n D'("+X4+","+Y4+")"
                );
       
        }
        
        public void skalaSegi4(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int tx,int ty){
        Graphics2D ga=(Graphics2D) g;
       int X1,Y1,X2,Y2,X3,Y3,X4,Y4;
        X1= x1*tx;
        Y1= y1*ty;
        
        X2= x2*tx;
        Y2= y2*ty;
        
        X3= x3*tx;
        Y3= y3*ty;
        
        X4= x4*tx;
        Y4= y4*ty;
       
      ga.setColor(Color.yellow);
      if(X1==X2||Y1==Y2){
          g.drawLine(300+30*X1,300-30* Y1,300+30* X2,300-30* Y2);
          if(X1==X3||Y1==Y3){
              g.drawLine(300+30*X1,300-30* Y1, 300+30*X3,300-30* Y3);
              g.drawLine(300+30*X2, 300-30* Y2,300+30* X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* Y3,300+30* X4, 300-30* Y4);
          }
          else if(X1==X4||Y1==Y4){
              g.drawLine(300+30*X1, 300-30*Y1, 300+30*X4, 300-30*Y4);
               g.drawLine(300+30*X2, 300-30* y2,300+30*X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* y3,300+30* X4, 300-30* Y4);
          }
       
      }
         else if(X1==X4||Y1==Y4){
          g.drawLine(300+30*X1,300-30* Y1,300+30* X4,300-30* Y4);
          if(X1==X3||Y1==Y3){
              g.drawLine(300+30*X1,300-30* Y1, 300+30*X3,300-30* Y3);
              g.drawLine(300+30*X2, 300-30* Y2,300+30* X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* Y3,300+30* X4, 300-30* Y4);
          }
          else if(X1==X2||Y1==Y2){
              g.drawLine(300+30*X1, 300-30*Y1, 300+30*X2, 300-30*Y2);
               g.drawLine(300+30*X2, 300-30* Y2,300+30* X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* Y3,300+30* X4, 300-30* Y4);
          }
        }
     
      g.setColor(Color.magenta);
     g.drawString("A'("+X1+","+Y1+")",300+(30*X1), 300-(30*Y1));

      g.drawString("B'("+X2+","+Y2+")",300+(30*X2), 300-(30*Y2));

     g.drawString("C'("+X3+","+Y3+")",300+(30*X3), 300-(30*Y3));

     g.drawString("D'("+X4+","+Y4+")",300+(30*X4), 300-(30*Y4));
       jTextArea1.setText(
                "Skala digunakan untuk mengubah ukuran suatu objek, bila pada translasi operasi yang digunakan adalah penjumlahan\n sedangkan pada skala operasi yang digunakan adalah perkalian."
                +"\n Untuk melakukan skala dapat menggunakan rumus: \nx’ = x * tx \ny’ = y * ty"
                 +"\n Ax'="+x1+"*"+tx+" Ay'="+y1+"*"+ty+"\n A'("+X1+","+Y1+")"
                +"\n Bx'="+x2+"*"+tx+" By'="+y2+"*"+ty+"\n B'("+X2+","+Y2+")"
                +"\n Cx'="+x3+"*"+tx+" Cy'="+y1+"*"+ty+"\n C'("+X3+","+Y3+")"
                 +"\n Dx'="+x4+"*"+tx+" Dy'="+y4+"*"+ty+"\n D'("+X4+","+Y4+")"
                );
       }
          public void shearSegi4(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int tx,int ty){
        Graphics2D ga=(Graphics2D) g;
       int X1,Y1,X2,Y2,X3,Y3,X4,Y4;
        X1= x1+tx*y1;
        Y1= y1+ty*x1;
        
        X2= x2+tx*y2;
        Y2= y2+ty*x2;
        
        X3= x3+tx*y3;
        Y3= y3+ty*x3;
       
        X4= x4+tx*y4;
        Y4= y4+ty*x4;
       
      ga.setColor(Color.ORANGE);
      g.drawLine(300+30*X1,300-30* Y1,300+30* X2,300-30* Y2);
              g.drawLine(300+30*X1,300-30* Y1, 300+30*X3,300-30* Y3);
              g.drawLine(300+30*X2, 300-30* Y2,300+30* X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* Y3,300+30* X4, 300-30* Y4);
        
     
      g.setColor(Color.magenta);
     g.drawString("A'("+X1+","+Y1+")",300+(30*X1), 300-(30*Y1));

      g.drawString("B'("+X2+","+Y2+")",300+(30*X2), 300-(30*Y2));

     g.drawString("C'("+X3+","+Y3+")",300+(30*X3), 300-(30*Y3));

     g.drawString("D'("+X4+","+Y4+")",300+(30*X4), 300-(30*Y4));
      jTextArea1.setText(
                "Shear adalah bentuk transformasi yang membuat distorsi dari bentuk suatu objek, seperti menggeser sisi tertentu."
                 +"\n Untuk melakukan shearing dapat menggunakan rumus: \nx’ = x + tx*y \ny’ = ty*x + y"
                 +"\n Ax'="+x1+"+"+tx+"*"+y1+" Ay'="+ty+"*"+x1+"+"+y1+"\n A'("+X1+","+Y1+")"
                 +"\n Bx'="+x2+"+"+tx+"*"+y2+" By'="+ty+"*"+x2+"+"+y2+"\n B'("+X2+","+Y2+")"
                +"\n Cx'="+x3+"+"+tx+"*"+y3+" Cy'="+ty+"*"+x3+"+"+y3+"\n C'("+X3+","+Y3+")"
               +"\n Dx'="+x4+"+"+tx+"*"+y4+" Dy'="+ty+"*"+x4+"+"+y4+"\n D'("+X4+","+Y4+")"   
              );
       }
        public void rotasiSegi4(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,double sudut){
        Graphics2D ga=(Graphics2D) g;
       int X1,Y1,X2,Y2,X3,Y3,X4,Y4;
       double a,b;
       a= (Math.cos(sudut));
       b= (Math.sin(sudut));
       X1=(int) ((int)(0+(x1-0)*a)-((y1-0)*b));
       Y1= (int) ((int)(0+(x1-0)*b)+((y1-0)*a));
       X2= (int) ((int)(0+(x2-0)*a)-((y2-0)*b));
       Y2= (int) ((int)(0+(x2-0)*b)+((y2-0)*a));
       X3= (int) ((int)(0+(x3-0)*a)-((y3-0)*b));
       Y3=(int) ((int) (0+(x3-0)*b)+((y3-0)*a));
       X4= (int) ((int)(0+(x4-0)*a)-((y4-0)*b));
       Y4= (int) ((int)(0+(x4-0)*b)+((y4-0)*a));
   
        ga.setColor(Color.ORANGE);
      g.drawLine(300+30*X1,300-30* Y1,300+30* X2,300-30* Y2);
              g.drawLine(300+30*X1,300-30* Y1, 300+30*X3,300-30* Y3);
              g.drawLine(300+30*X2, 300-30* Y2,300+30* X4, 300-30* Y4);
              g.drawLine(300+30*X3, 300-30* Y3,300+30* X4, 300-30* Y4);
     
      g.setColor(Color.magenta);
     g.drawString("A'("+X1+","+Y1+")",300+(30*X1), 300-(30*Y1));

      g.drawString("B'("+X2+","+Y2+")",300+(30*X2), 300-(30*Y2));

     g.drawString("C'("+X3+","+Y3+")",300+(30*X3), 300-(30*Y3));

     g.drawString("D'("+X4+","+Y4+")",300+(30*X4), 300-(30*Y4));
       jTextArea1.setText(
                "Rotasi merupakan pemutaran terhadap suatu objek,"
                +"\n Untuk melakukan Rotasi dapat menggunakan rumus: \nX’A = Xp + (XA – Xp)Cos Theta – (YA- YP)Sin Theta\nY’A = YP + (XA – XP)Sin Theta + (YA – YP)Cos Theta"
                 +"\n  A'("+X1+","+Y1+")"
                 +"\n  B'("+X2+","+Y2+")"
                +"\n  C'("+X3+","+Y3+")"
               +"\n  D'("+X4+","+Y4+")"
                 );
       }
         public void refleksiTitikThdpX(Graphics g,int x1,int y1){
             g.drawLine(300+(30*x1), 300-30*(y1*-1), 300+(30*x1), 300-30*(y1*-1));
            g.drawString("A'("+x1+","+y1*-1+")",300+(30*x1), 300-(30*y1*-1));
      
        }
        public void refleksiTitikThdpY(Graphics g,int x1,int y1){
             g.drawLine(300+30*(x1*-1), 300-(30*y1), 300+30*(x1*-1), 300-(30*y1));
               g.drawString("A'("+x1*-1+","+y1+")",300+(30*x1*-1), 300-(30*y1));
        }
        public void refleksiTitikThdpXY(Graphics g,int x1,int y1){
             g.drawLine(300+(30*y1), 300-(30*x1), 300+(30*y1), 300-30*x1);
               g.drawString("A'("+y1+","+x1+")",300+(30*y1), 300-(30*x1));
        }
        public void refleksiGarisThdpX(Graphics g,int x1,int y1,int x2,int y2){
             g.drawLine(300+(30*x1), 300-30*(y1*-1), 300+(30*x2), 300-30*(y2*-1));
        }
        public void refleksiGarisThdpY(Graphics g,int x1,int y1,int x2,int y2){
             g.drawLine(300+30*(x1*-1), 300-(30*y1), 300+30*(x2*-1), 300-(30*y2));
        }
        public void refleksiGarisThdpXY(Graphics g,int x1,int y1,int x2,int y2){
             g.drawLine(300+(30*y1), 300-(30*x1), 300+(30*y2), 300-30*x2);
        }
        public void refleksiSegi3ThdpX(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3){
      Polygon segiTiga = new Polygon();
      segiTiga.addPoint(300+30*x1, 300-30*y1*-1);
      segiTiga.addPoint(300+30*x2, 300-30*y2*-1);
      segiTiga.addPoint(300+30*x3, 300-30*y3*-1);
      Graphics2D ga=(Graphics2D) g;
        ga.setColor(Color.ORANGE);
      ga.fill(segiTiga);
        }
        public void refleksiSegi3ThdpY(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3){
       Polygon segiTiga = new Polygon();
      segiTiga.addPoint(300+30*x1*-1, 300-30*y1);
      segiTiga.addPoint(300+30*x2*-1, 300-30*y2);
      segiTiga.addPoint(300+30*x3*-1, 300-30*y3);
      Graphics2D ga=(Graphics2D) g;
        ga.setColor(Color.PINK);
      ga.fill(segiTiga);
        }
        public void refleksiSegi3ThdpXY(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3){
       Polygon segiTiga = new Polygon();
      segiTiga.addPoint(300+30*y1, 300-30*x1);
      segiTiga.addPoint(300+30*y2, 300-30*x2);
      segiTiga.addPoint(300+30*y3, 300-30*x3);
      Graphics2D ga=(Graphics2D) g;
        ga.setColor(Color.GRAY);
      ga.fill(segiTiga);
        }
         public void refleksiSegi4ThdpX(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4, int y4){
    Graphics2D ga =(Graphics2D) g;
      ga.setColor(Color.ORANGE);
      if(x1==x2||y1==y2){
          g.drawLine(300+30*x1,300-30* y1*-1,300+30* x2,300-30* y2*-1);
          if(x1==x3||y1==y3){
              g.drawLine(300+30*x1,300-30* y1*-1, 300+30*x3,300-30* y3*-1);
              g.drawLine(300+30*x2, 300-30* y2*-1,300+30* x4, 300-30* y4*-1);
              g.drawLine(300+30*x3, 300-30* y3*-1,300+30* x4, 300-30* y4*-1);
          }
          else if(x1==x4||y1==y4){
              g.drawLine(300+30*x1, 300-30*y1*-1, 300+30*x4, 300-30*y4*-1);
               g.drawLine(300+30*x2, 300-30* y2*-1,300+30* x4, 300-30* y4*-1);
              g.drawLine(300+30*x3, 300-30* y3*-1,300+30* x4, 300-30* y4*-1);
          }
        
      }
      
     g.setColor(Color.red);
     g.drawString("A("+x1+","+y1*-1+")",300+(30*x1), 300-(30*y1*-1));

      g.drawString("B("+x2+","+y2*-1+")",300+(30*x2), 300-(30*y2*-1));

     g.drawString("C("+x3+","+y3*-1+")",300+(30*x3), 300-(30*y3*-1));

     g.drawString("D("+x4+","+y4*-1+")",300+(30*x4), 300-(30*y4*-1));
     
        }
        public void refleksiSegi4ThdpY(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4, int y4){
       
      Graphics2D ga=(Graphics2D) g;
        ga.setColor(Color.ORANGE);
      if(x1==x2||y1==y2){
          g.drawLine(300+30*x1*-1,300-30* y1,300+30* x2*-1,300-30* y2);
          if(x1==x3||y1==y3){
              g.drawLine(300+30*x1*-1,300-30* y1, 300+30*x3*-1,300-30* y3);
              g.drawLine(300+30*x2*-1, 300-30* y2,300+30* x4*-1, 300-30* y4);
              g.drawLine(300+30*x3*-1, 300-30* y3,300+30* x4*-1, 300-30* y4);
          }
          else if(x1==x4||y1==y4){
              g.drawLine(300+30*x1*-1, 300-30*y1, 300+30*x4*-1, 300-30*y4);
               g.drawLine(300+30*x2*-1, 300-30* y2,300+30* x4*-1, 300-30* y4);
              g.drawLine(300+30*x3*-1, 300-30* y3,300+30* x4*-1, 300-30* y4);
          }
        
      }
      
     g.setColor(Color.red);
     g.drawString("A("+x1+","+y1*-1+")",300+(30*x1*-1), 300-(30*y1));

      g.drawString("B("+x2+","+y2*-1+")",300+(30*x2*-1), 300-(30*y2));

     g.drawString("C("+x3+","+y3*-1+")",300+(30*x3*-1), 300-(30*y3));

     g.drawString("D("+x4+","+y4*-1+")",300+(30*x4*-1), 300-(30*y4));
     
        }
        public void refleksiSegi4ThdpXY(Graphics g,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
       
      Graphics2D ga=(Graphics2D) g;
  
        ga.setColor(Color.ORANGE);
      if(x1==x2||y1==y2){
          g.drawLine(300+30*y1,300-30* x1,300+30* y2,300-30* x2);
          if(x1==x3||y1==y3){
              g.drawLine(300+30*y1,300-30* x1, 300+30*y3,300-30* x3);
              g.drawLine(300+30*y2, 300-30* x2,300+30* y4, 300-30* x4);
              g.drawLine(300+30*y3, 300-30* x3,300+30* y4, 300-30* x4);
          }
          else if(x1==x4||y1==y4){
              g.drawLine(300+30*y1, 300-30*x1, 300+30*y4, 300-30*x4);
               g.drawLine(300+30*y2, 300-30* x2,300+30* y4, 300-30* x4);
              g.drawLine(300+30*y3, 300-30* x3,300+30* y4, 300-30* x4);
          }
        
      }
      
     g.setColor(Color.red);
     g.drawString("A("+y1+","+x1+")",300+(30*y1), 300-(30*x1));

      g.drawString("B("+y2+","+x2+")",300+(30*y2), 300-(30*x2));

     g.drawString("C("+y3+","+x3+")",300+(30*y3), 300-(30*x3));

     g.drawString("D("+y4+","+x4+")",300+(30*y4), 300-(30*x4));
     
      
        }
       
   } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        jRadioButton4 = new javax.swing.JRadioButton();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        buttonGroup31 = new javax.swing.ButtonGroup();
        buttonGroup32 = new javax.swing.ButtonGroup();
        buttonGroup33 = new javax.swing.ButtonGroup();
        buttonGroup34 = new javax.swing.ButtonGroup();
        buttonGroup35 = new javax.swing.ButtonGroup();
        buttonGroup36 = new javax.swing.ButtonGroup();
        buttonGroup37 = new javax.swing.ButtonGroup();
        buttonGroup38 = new javax.swing.ButtonGroup();
        buttonGroup39 = new javax.swing.ButtonGroup();
        buttonGroup40 = new javax.swing.ButtonGroup();
        buttonGroup41 = new javax.swing.ButtonGroup();
        buttonGroup42 = new javax.swing.ButtonGroup();
        buttonGroup43 = new javax.swing.ButtonGroup();
        buttonGroup44 = new javax.swing.ButtonGroup();
        buttonGroup45 = new javax.swing.ButtonGroup();
        buttonGroup46 = new javax.swing.ButtonGroup();
        buttonGroup47 = new javax.swing.ButtonGroup();
        buttonGroup48 = new javax.swing.ButtonGroup();
        buttonGroup49 = new javax.swing.ButtonGroup();
        buttonGroup50 = new javax.swing.ButtonGroup();
        buttonGroup51 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelX1 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        LabelY1 = new javax.swing.JLabel();
        y1 = new javax.swing.JTextField();
        LabelX2 = new javax.swing.JLabel();
        LabelY2 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        LabelX3 = new javax.swing.JLabel();
        LabelY3 = new javax.swing.JLabel();
        x3 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        LabelX4 = new javax.swing.JLabel();
        LabelY4 = new javax.swing.JLabel();
        x4 = new javax.swing.JTextField();
        y4 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        titik = new javax.swing.JPanel();
        TombolBuatTitik = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        xTitik = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yTitik = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TombolAdisiTitik = new javax.swing.JButton();
        TombolSubtraksiTitik = new javax.swing.JButton();
        TombolDotProductTitik = new javax.swing.JButton();
        garis = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        geometri = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jRadioButton4.setText("jRadioButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 650));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Tampilkan sumbu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel1.setText("Membuat titik");

        LabelX1.setText("X1");

        LabelY1.setText("Y1");

        LabelX2.setText("X2");

        LabelY2.setText("Y2");

        LabelX3.setText("X3");

        LabelY3.setText("Y3");

        LabelX4.setText("X4");

        LabelY4.setText("Y4");

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel12.setText("Jumlah Titik :");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("1 Titik");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("2 Titik");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("3 Titik");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("4 Titik");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton3))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LabelX3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LabelX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LabelX1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(LabelY1))
                                            .addComponent(LabelY3)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelY2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(y1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(y2)
                                    .addComponent(y3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelX4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelY4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelY1)
                            .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelX1))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelY2)
                            .addComponent(LabelX2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelY3)
                            .addComponent(LabelX3)
                            .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelY4)
                            .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelX4))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        TombolBuatTitik.setText("Buat Titik");
        TombolBuatTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolBuatTitikActionPerformed(evt);
            }
        });

        jLabel4.setText("Adisi & Substraksi");

        jLabel5.setText("X");

        jLabel6.setText("Y");

        TombolAdisiTitik.setText("Adisi");
        TombolAdisiTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolAdisiTitikActionPerformed(evt);
            }
        });

        TombolSubtraksiTitik.setText("Subtraksi");
        TombolSubtraksiTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolSubtraksiTitikActionPerformed(evt);
            }
        });

        TombolDotProductTitik.setText("Dot Product");
        TombolDotProductTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDotProductTitikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titikLayout = new javax.swing.GroupLayout(titik);
        titik.setLayout(titikLayout);
        titikLayout.setHorizontalGroup(
            titikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titikLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titikLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(titikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(titikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(titikLayout.createSequentialGroup()
                        .addComponent(TombolAdisiTitik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TombolSubtraksiTitik)
                        .addGap(0, 4, Short.MAX_VALUE))))
            .addGroup(titikLayout.createSequentialGroup()
                .addGroup(titikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titikLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(TombolDotProductTitik))
                    .addGroup(titikLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(TombolBuatTitik)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        titikLayout.setVerticalGroup(
            titikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titikLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(TombolBuatTitik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xTitik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yTitik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TombolAdisiTitik)
                    .addComponent(TombolSubtraksiTitik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TombolDotProductTitik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton9.setText("Buat Garis");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Buat Vektor");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton5.setText("Adisi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Subtraksi");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Dot Product");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout garisLayout = new javax.swing.GroupLayout(garis);
        garis.setLayout(garisLayout);
        garisLayout.setHorizontalGroup(
            garisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(garisLayout.createSequentialGroup()
                .addGroup(garisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(garisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6))
                    .addGroup(garisLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton5))
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(garisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton9)))
                .addGap(33, 33, 33))
        );
        garisLayout.setVerticalGroup(
            garisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(garisLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(17, 17, 17))
        );

        jButton11.setText("Buat Bidang");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Translasi");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Scala");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Rotasi");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Shear");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel7.setText("X");

        jLabel2.setText("Y");

        jLabel3.setText("Sudut Rotasi");

        javax.swing.GroupLayout geometriLayout = new javax.swing.GroupLayout(geometri);
        geometri.setLayout(geometriLayout);
        geometriLayout.setHorizontalGroup(
            geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geometriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(geometriLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(geometriLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(geometriLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(geometriLayout.createSequentialGroup()
                        .addGroup(geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jButton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(geometriLayout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(geometriLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        geometriLayout.setVerticalGroup(
            geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geometriLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addGroup(geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton15))
                .addGap(25, 25, 25)
                .addGroup(geometriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(garis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geometri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(garis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(geometri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jButton1.setText("Pencerminan Terhadap Sumbu x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pencerminan Terhadap Sumbu y");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Pencerminan terhadap garis y=x");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton16.setText("Pencerminan Terhadap Garis y = x");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Tampilkan Grid");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Buat Lingkaran");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel8.setText("Radius");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3794, 3794, 3794))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17)
                                .addGap(30, 30, 30)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton16)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3167, 3167, 3167)
                                        .addComponent(jButton7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton17))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton18)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(60, 60, 60)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        new sumbu().grid(getGraphics());
        new sumbu().paintComponent(getGraphics());
      
         jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton5.setEnabled(true);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Vektor().setVisible(true);
      
        this.dispose();
    


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new dotGaris().paintComponent(getGraphics());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new subtraksiGaris().paintComponent(getGraphics());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new adisiGaris().paintComponent(getGraphics());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TombolDotProductTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDotProductTitikActionPerformed
        new dotTitik().paintComponent(getGraphics());        // TODO add your handling code here:
    }//GEN-LAST:event_TombolDotProductTitikActionPerformed

    private void TombolSubtraksiTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolSubtraksiTitikActionPerformed
        new subtraksiTitik().paintComponent(getGraphics()); // TODO add your handling code here:
    }//GEN-LAST:event_TombolSubtraksiTitikActionPerformed

    private void TombolAdisiTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolAdisiTitikActionPerformed
        new adisiTitik().paintComponent(getGraphics());        // TODO add your handling code here:
    }//GEN-LAST:event_TombolAdisiTitikActionPerformed

    private void TombolBuatTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolBuatTitikActionPerformed
     new titik().paintComponent(getGraphics());
      xTitik.setEnabled(true);
        yTitik.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_TombolBuatTitikActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        x1.setVisible(true);
        y1.setVisible(true);
        LabelX1.setVisible(true);
        LabelY1.setVisible(true);
        xTitik.setEnabled(false);
        yTitik.setEnabled(false);
       
        x2.setVisible(false);
        y2.setVisible(false);
        LabelX2.setVisible(false);
        LabelY2.setVisible(false);
        x3.setVisible(false);
        y3.setVisible(false);
         LabelX3.setVisible(false);
        LabelY3.setVisible(false);
          x4.setVisible(false);
        y4.setVisible(false);
        LabelX4.setVisible(false);
        LabelY4.setVisible(false);
       titik.setVisible(true);
        geometri.setVisible(false);
        garis.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        x1.setVisible(true);
        y1.setVisible(true);
        LabelX1.setVisible(true);
        LabelY1.setVisible(true);
        x2.setVisible(true);
        y2.setVisible(true);
        LabelX2.setVisible(true);
        LabelY2.setVisible(true);
        x3.setVisible(false);
        y3.setVisible(false);
         LabelX3.setVisible(false);
        LabelY3.setVisible(false);
          x4.setVisible(false);
        y4.setVisible(false);
        LabelX4.setVisible(false);
        LabelY4.setVisible(false);
        titik.setVisible(false);
        geometri.setVisible(false);
        garis.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      new garis().paintComponent(getGraphics());  // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new arrow().paintComponent(getGraphics()); 
        new garis().paintComponent(getGraphics());
              // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       
       int X1,Y1,X2,Y2,X3,Y3,X4,Y4;
       X1= Integer.parseInt(x1.getText());
       Y1= Integer.parseInt(y1.getText());
       X2= Integer.parseInt(x2.getText());
       Y2= Integer.parseInt(y2.getText());
       X3= Integer.parseInt(x3.getText());
       Y3= Integer.parseInt(y3.getText());
       
       if(jRadioButton5.isSelected()){
        new bidang().segitiga(getGraphics(), X1,Y1,X2,Y2,X3,Y3);
       }
       else{
           X4= Integer.parseInt(x4.getText());
       Y4= Integer.parseInt(y4.getText());
       new bidang().paintComponent(getGraphics(), X1,Y1,X2,Y2,X3,Y3,X4,Y4);
       }// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
         x1.setVisible(true);
        y1.setVisible(true);
        LabelX1.setVisible(true);
        LabelY1.setVisible(true);
        x2.setVisible(true);
        y2.setVisible(true);
        LabelX2.setVisible(true);
        LabelY2.setVisible(true);
         x3.setVisible(true);
        y3.setVisible(true);
        LabelX3.setVisible(true);
        LabelY3.setVisible(true);
          x4.setVisible(false);
        y4.setVisible(false);
        LabelX4.setVisible(false);
        LabelY4.setVisible(false);
        titik.setVisible(false);
        garis.setVisible(false);
        geometri.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        x1.setVisible(true);
        y1.setVisible(true);
        LabelX1.setVisible(true);
        LabelY1.setVisible(true);
        x2.setVisible(true);
        y2.setVisible(true);
        LabelX2.setVisible(true);
        LabelY2.setVisible(true);
         x3.setVisible(true);
        y3.setVisible(true);
        LabelX3.setVisible(true);
        LabelY3.setVisible(true);
         x4.setVisible(true);
        y4.setVisible(true);
        LabelX4.setVisible(true);
        LabelY4.setVisible(true);
        titik.setVisible(false);
        garis.setVisible(false);
        geometri.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int X1,Y1,X2,Y2,X3,Y3,X4,Y4,tx,ty;
       X1= Integer.parseInt(x1.getText());
       Y1= Integer.parseInt(y1.getText());
       X2= Integer.parseInt(x2.getText());
       Y2= Integer.parseInt(y2.getText());
       X3= Integer.parseInt(x3.getText());
       Y3= Integer.parseInt(y3.getText());
       tx=Integer.parseInt(jTextField1.getText());
       ty=Integer.parseInt(jTextField2.getText());
       
       if(jRadioButton5.isSelected()){
        new transformasi().translasiSegi3(getGraphics(), X1,Y1,X2,Y2,X3,Y3,tx,ty);
       }
       else{
           X4= Integer.parseInt(x4.getText());
       Y4= Integer.parseInt(y4.getText());
       new transformasi().translasiSegi4(getGraphics(), X1,Y1,X2,Y2,X3,Y3,X4,Y4,tx,ty);
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
          int X1,Y1,X2,Y2,X3,Y3,X4,Y4,tx,ty;
       X1= Integer.parseInt(x1.getText());
       Y1= Integer.parseInt(y1.getText());
       X2= Integer.parseInt(x2.getText());
       Y2= Integer.parseInt(y2.getText());
       X3= Integer.parseInt(x3.getText());
       Y3= Integer.parseInt(y3.getText());
       tx=Integer.parseInt(jTextField1.getText());
       ty=Integer.parseInt(jTextField2.getText());
       
       if(jRadioButton5.isSelected()){
        new transformasi().skalaSegi3(getGraphics(), X1,Y1,X2,Y2,X3,Y3,tx,ty);
       }
       else{
           X4= Integer.parseInt(x4.getText());
       Y4= Integer.parseInt(y4.getText());
       new transformasi().skalaSegi4(getGraphics(), X1,Y1,X2,Y2,X3,Y3,X4,Y4,tx,ty);
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int X1,Y1,X2,Y2,X3,Y3,X4,Y4;
        double sudut;
       X1= Integer.parseInt(x1.getText());
       Y1= Integer.parseInt(y1.getText());
       X2= Integer.parseInt(x2.getText());
       Y2= Integer.parseInt(y2.getText());
       X3= Integer.parseInt(x3.getText());
       Y3= Integer.parseInt(y3.getText());
       sudut=Double.parseDouble(jTextField3.getText());
       
       if(jRadioButton5.isSelected()){
        new transformasi().rotasiSegi3(getGraphics(), X1,Y1,X2,Y2,X3,Y3,sudut);
       }
       else{
       X4= Integer.parseInt(x4.getText());
       Y4= Integer.parseInt(y4.getText());
       new transformasi().rotasiSegi4(getGraphics(), X1,Y1,X2,Y2,X3,Y3,X4,Y4,sudut);
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   int X1,X2,X3,X4,Y1,Y2,Y3,Y4;
    X1=Integer.parseInt(x1.getText());
    Y1=Integer.parseInt(y1.getText());
    if(jRadioButton2.isSelected()){
        new transformasi().refleksiTitikThdpX(getGraphics(), X1, Y1);
    }
    else if(jRadioButton1.isSelected()){
        X2=Integer.parseInt(x2.getText());
         Y2=Integer.parseInt(y2.getText());
        new transformasi().refleksiGarisThdpX(getGraphics(), X1, Y1, X2, Y2);
    }
     else if(jRadioButton5.isSelected()){
         X2=Integer.parseInt(x2.getText());
         Y2=Integer.parseInt(y2.getText());
        X3=Integer.parseInt(x3.getText());
         Y3=Integer.parseInt(y3.getText());
        new transformasi().refleksiSegi3ThdpX(getGraphics(), X1, Y1, X2, Y2,X3,Y3);
     }
     else if(jRadioButton3.isSelected()){
         X2=Integer.parseInt(x2.getText());
         Y2=Integer.parseInt(y2.getText());
        X3=Integer.parseInt(x3.getText());
         Y3=Integer.parseInt(y3.getText());
             X4=Integer.parseInt(x4.getText());
         Y4=Integer.parseInt(y4.getText());
           new transformasi().refleksiSegi4ThdpX(getGraphics(), X1, Y1, X2, Y2,X3,Y3,X4,Y4);
    }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int X1,X2,X3,X4,Y1,Y2,Y3,Y4;
    X1=Integer.parseInt(x1.getText());
    Y1=Integer.parseInt(y1.getText());
    if(jRadioButton2.isSelected()){
        new transformasi().refleksiTitikThdpY(getGraphics(), X1, Y1);
    }
    else if(jRadioButton1.isSelected()){
        X2=Integer.parseInt(x2.getText());
         Y2=Integer.parseInt(y2.getText());
        new transformasi().refleksiGarisThdpY(getGraphics(), X1, Y1, X2, Y2);
    }
    else if(jRadioButton5.isSelected()){
         X2=Integer.parseInt(x2.getText());
         Y2=Integer.parseInt(y2.getText());
        X3=Integer.parseInt(x3.getText());
         Y3=Integer.parseInt(y3.getText());
        new transformasi().refleksiSegi3ThdpY(getGraphics(), X1, Y1, X2, Y2,X3,Y3);
    }
    else if(jRadioButton3.isSelected()){
         X2=Integer.parseInt(x2.getText());
         Y2=Integer.parseInt(y2.getText());
        X3=Integer.parseInt(x3.getText());
         Y3=Integer.parseInt(y3.getText());
             X4=Integer.parseInt(x4.getText());
         Y4=Integer.parseInt(y4.getText());
           new transformasi().refleksiSegi4ThdpY(getGraphics(), X1, Y1, X2, Y2,X3,Y3,X4,Y4);
        }
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
         int X1,Y1,X2,Y2,X3,Y3,X4,Y4,tx,ty;
       X1= Integer.parseInt(x1.getText());
       Y1= Integer.parseInt(y1.getText());
       X2= Integer.parseInt(x2.getText());
       Y2= Integer.parseInt(y2.getText());
       X3= Integer.parseInt(x3.getText());
       Y3= Integer.parseInt(y3.getText());
       tx=Integer.parseInt(jTextField1.getText());
       ty=Integer.parseInt(jTextField2.getText());
       
       if(jRadioButton5.isSelected()){
        new transformasi().shearSegi3(getGraphics(), X1,Y1,X2,Y2,X3,Y3,tx,ty);
       }
       else{
           X4= Integer.parseInt(x4.getText());
       Y4= Integer.parseInt(y4.getText());
       new transformasi().shearSegi4(getGraphics(), X1,Y1,X2,Y2,X3,Y3,X4,Y4,tx,ty);
       } // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
int X1,X2,X3,X4,Y1,Y2,Y3,Y4;
    X1=Integer.parseInt(x1.getText());
    Y1=Integer.parseInt(y1.getText());
    if(jRadioButton2.isSelected()){
        new transformasi().refleksiTitikThdpXY(getGraphics(), X1, Y1);
    }
    else if(jRadioButton1.isSelected()){
        X2=Integer.parseInt(x2.getText());
         Y2=Integer.parseInt(y2.getText());
        new transformasi().refleksiGarisThdpXY(getGraphics(), X1, Y1, X2, Y2);
    }
    else  if(jRadioButton5.isSelected()){
          X2=Integer.parseInt(x2.getText());
         Y2=Integer.parseInt(y2.getText());
        X3=Integer.parseInt(x3.getText());
         Y3=Integer.parseInt(y3.getText());
        new transformasi().refleksiSegi3ThdpXY(getGraphics(), X1, Y1, X2, Y2,X3,Y3);
    }else  if(jRadioButton3.isSelected()){
         X2=Integer.parseInt(x2.getText());
         Y2=Integer.parseInt(y2.getText());
        X3=Integer.parseInt(x3.getText());
         Y3=Integer.parseInt(y3.getText());     
        X4=Integer.parseInt(x4.getText());
         Y4=Integer.parseInt(y4.getText());
           new transformasi().refleksiSegi4ThdpXY(getGraphics(), X1, Y1, X2, Y2,X3,Y3,X4,Y4);
        }
              // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
new sumbu().grid(getGraphics());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
    Graphics g=getGraphics();
    Graphics2D ga = (Graphics2D) g;
    //g.drawOval(300, 300, 300+30*Integer.parseInt(jTextField4.getText()),300-30* Integer.parseInt(jTextField4.getText()));
    ga.setColor(Color.red);
    ga.fillOval(300,300, 30*Integer.parseInt(jTextField4.getText()),30* Integer.parseInt(jTextField4.getText()));
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vektor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vektor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vektor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vektor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Vektor().setVisible(true);
                new Vektor().setLocationRelativeTo(null);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelX1;
    private javax.swing.JLabel LabelX2;
    private javax.swing.JLabel LabelX3;
    private javax.swing.JLabel LabelX4;
    private javax.swing.JLabel LabelY1;
    private javax.swing.JLabel LabelY2;
    private javax.swing.JLabel LabelY3;
    private javax.swing.JLabel LabelY4;
    private javax.swing.JButton TombolAdisiTitik;
    private javax.swing.JButton TombolBuatTitik;
    private javax.swing.JButton TombolDotProductTitik;
    private javax.swing.JButton TombolSubtraksiTitik;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup31;
    private javax.swing.ButtonGroup buttonGroup32;
    private javax.swing.ButtonGroup buttonGroup33;
    private javax.swing.ButtonGroup buttonGroup34;
    private javax.swing.ButtonGroup buttonGroup35;
    private javax.swing.ButtonGroup buttonGroup36;
    private javax.swing.ButtonGroup buttonGroup37;
    private javax.swing.ButtonGroup buttonGroup38;
    private javax.swing.ButtonGroup buttonGroup39;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup40;
    private javax.swing.ButtonGroup buttonGroup41;
    private javax.swing.ButtonGroup buttonGroup42;
    private javax.swing.ButtonGroup buttonGroup43;
    private javax.swing.ButtonGroup buttonGroup44;
    private javax.swing.ButtonGroup buttonGroup45;
    private javax.swing.ButtonGroup buttonGroup46;
    private javax.swing.ButtonGroup buttonGroup47;
    private javax.swing.ButtonGroup buttonGroup48;
    private javax.swing.ButtonGroup buttonGroup49;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup50;
    private javax.swing.ButtonGroup buttonGroup51;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JPanel garis;
    private javax.swing.JPanel geometri;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel titik;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField x4;
    private javax.swing.JTextField xTitik;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField y4;
    private javax.swing.JTextField yTitik;
    // End of variables declaration//GEN-END:variables
}
