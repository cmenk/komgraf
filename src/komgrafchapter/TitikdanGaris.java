/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komgrafchapter;

import com.sun.org.apache.xpath.internal.objects.XBooleanStatic;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.math.*;

public class TitikdanGaris extends javax.swing.JFrame {

//     public void bruteLine(int x1, int y1, int x2, int y2, Graphics g) {
//        int DY2, DYDX2, p, xa, ya, xb, yb;
//        if (x1 < x2) {
//            xa = x1;
//            ya = y1;
//            xb = x2;
//            yb = y2;
//        } else {
//            xa = x2;
//            ya = y2;
//            xb = x1;
//            yb = y1;
//        }
//        int deltaX = xb - xa;
//        int deltaY = yb - ya;
//        float m = (float) deltaY / (float) deltaX;
//        float c = y1 - (m * x1);
//        for (int x = xa; x < xb; x++) {
//            float floatY = (m * x) + c;
//            int y = Math.round(floatY);
//            g.setColor(Color.blue);
//            g.drawLine(250 + xa, 250 - ya, 250 + xa, 250 - ya);
//            System.out.println("DeltaX: " + deltaX + ", deltaY: " + deltaY + ", m: " + m + ", c: " + c + " x: " + x + " floaty: " + floatY + ", y: " + y);
//           
//        }
//    }
    public void brasehamline(int x1, int y1, int x2, int y2, Graphics g) {
        int deltaX, deltaY, DY2, DYDX2, p, xa, ya, xb, yb, m;
        deltaX = Math.abs(x2 - x1);
        deltaY = Math.abs(y2 - y1);

        DY2 = 2 * deltaY;
        DYDX2 = 2 * (deltaY - deltaX);
        p = DY2 - deltaX;//parameter

        if (x1 < x2) {
            xa = x1;
            ya = y1;
            xb = x2;
            yb = y2;
        } else {
            xa = x2;
            ya = y2;
            xb = x1;
            yb = y1;
        }

        if (yb > 0) {
            while (xa < xb) {
                xa = xa + 1;
                if (p < 0) {
                    p = p + DY2;
                } else {
                    if (ya < yb) {
                        ya = ya + 1;
                    } else {
                        ya = ya - 1;
                    }
                    p = p + DYDX2;
                }
            }
        } else {
            while (ya < yb) {
                ya = ya + 1;
                if (p < 0) {
                    p = p + DY2;
                } else {
                    if (xa < xb) {
                        xa = xa + 1;
                    } else {
                        xa = xa - 1;
                    }
                    p = p + DYDX2;
                }
            }
        }

        System.out.println("DeltaX: " + deltaX + ", deltaY: " + deltaY + ", x: " + xa + ", y: " + ya);
        System.out.println("");
    }

    /**
     * Creates new form TitikdanGaris
     */
    public TitikdanGaris() {
        initComponents();
        x.setEnabled(false);
        y.setEnabled(false);
        x1.setEnabled(false);
        y1.setEnabled(false);
        x2.setEnabled(false);
        y2.setEnabled(false);

    }

    public class titik extends JPanel {

        @Override
        public void paintComponent(Graphics ga) {

            super.paintComponents(ga);
            int xa = Integer.parseInt(x.getText());
            int ya = Integer.parseInt(y.getText());
            ga.setColor(Color.red);
            ga.drawLine(300 + 30 * xa, 300 - 30 * ya, 300 + 30 * xa, 300 - 30 * ya);
            ga.setColor(Color.RED);
            ga.drawString("A(" + x.getText() + "," + y.getText() + ")", 300 + 30 * Integer.parseInt(x.getText()), 300 - 30 * Integer.parseInt(y.getText()));

            for (int a = 0; a < 600; a += 30) {
                if (a == 300) {
                    ga.setColor(Color.BLACK);
                    ga.drawLine(0, 300, 600, 300);
                    ga.drawLine(300, 30, 300, 600);
                } else {
                    ga.setColor(Color.GRAY);
                    ga.drawLine(0, 600 - a, 600, 600 - a);
                    ga.drawLine(600 - a, 30, 600 - a, 600);
                }
                ga.setColor(Color.blue);
                ga.drawString(Integer.toString((a - 300) / 30), a, 300);
                ga.drawString(Integer.toString((300 - a) / 30), 300, a);
            }
            //        }
        }
    }

    public class sumbu {

        public void paintComponent(Graphics ga) {
            jPanel2.paintComponents(ga);
            for (int a = 0; a <= 600; a += 30) {
                if (a == 300) {
                    ga.setColor(Color.BLACK);
                    ga.drawLine(0, 300, 600, 300);
                    ga.drawLine(300, 30, 300, 600);
                } else {
                    ga.setColor(Color.GRAY);
                    ga.drawLine(0, 600 - a, 600, 600 - a);
                    ga.drawLine(600 - a, 30, 600 - a, 600);
                }
                ga.setColor(Color.BLACK);
                ga.drawString(Integer.toString((a - 300) / 30), a, 300);
                ga.drawString(Integer.toString((300 - a) / 30), 300, a);

            }
        }
    }

    public class titik1 {

        public void paintComponent(Graphics ga) {
            jPanel2.paintComponents(ga);
            int xa = Integer.parseInt(x.getText());
            int ya = Integer.parseInt(y.getText());
            ga.setColor(Color.red);
            ga.drawLine(300 + 30 * xa, 300 - 30 * ya, 300 + 30 * xa, 300 - 30 * ya);
            ga.setColor(Color.RED);
            ga.drawString("A(" + x.getText() + "," + y.getText() + ")", 300 + 30 * Integer.parseInt(x.getText()), 300 - 30 * Integer.parseInt(y.getText()));
            jTextArea1.setText("Titik A(" + xa + "," + ya + ")");
        }
    }

    public class penambahan {

        public void paintComponent(Graphics ga) {
            jPanel2.paintComponents(ga);
            int xa = Integer.parseInt(x1.getText());
            int ya = Integer.parseInt(y1.getText());
            int xb = Integer.parseInt(x2.getText());
            int yb = Integer.parseInt(y2.getText());
            String vector;
            int xab = xa + xb;
            int yab = ya + yb;

            ga.setColor(Color.ORANGE);

            ga.drawLine(300 + 30 * xa, 300 - 30 * ya, 300 + 30 * xb, 300 - 30 * yb);
            ga.setColor(Color.BLUE);
            ga.drawLine(300 + 30 * (xa + xb), 300 - 30 * (ya + yb), 300 + 30 * xa, 300 - 30 * ya);
            ga.setColor(Color.RED);
            ga.drawLine(300 + 30 * xb, 300 - 30 * yb, 300 + 30 * (xa + xb), 300 - 30 * (ya + yb));
//                brasehamline(xa, ya, xb, yb, ga);
//            bruteLine(xb, yb, xb, yb, ga);

            ga.setColor(Color.red);

            ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
            ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));
            ga.drawString("C(" + xab + "," + yab + ")", (300 + 30 * (xa + xb)), (300 - 30 * (ya + yb)));
            jTextArea1.setText("Adisi Garis A-B = \n x1(A)+X2(B) =" + xab + "\ny1(A)+y2(B)=" + yab + "\nMaka Hasil adisi ialah C =(" + xab + "," + yab + ")");

        }
    }

    public class Pengurangan {

        public void paintComponent(Graphics ga) {
            jPanel2.paintComponents(ga);
            String vector;
            int xa = Integer.parseInt(x1.getText());
            int ya = Integer.parseInt(y1.getText());
            int xb = Integer.parseInt(x2.getText());
            int yb = Integer.parseInt(y2.getText());

            int xab = xa - xb;
            int yab = ya - yb;
            if (xa < xb) {
                vector = "Kanan";
            } else {
                vector = "Kiri";
            }

            ga.setColor(Color.ORANGE);

            ga.drawLine(300 + 30 * xa, 300 - 30 * ya, 300 + 30 * xb, 300 - 30 * yb);
            ga.drawLine(300 + 30 * (xa - xb), 300 - 30 * (ya - yb), 300 + 30 * xa, 300 - 30 * ya);
            ga.drawLine(300 + 30 * xb, 300 - 30 * yb, 300 + 30 * (xa - xb), 300 - 30 * (ya - yb));
//                brasehamline(xa, ya, xb, yb, ga);
//            bruteLine(xb, yb, xb, yb, ga);

            ga.setColor(Color.red);

            ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
            ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));
            ga.drawString("C(" + xab + "," + yab + ")", (300 + 30 * (xa - xb)), (300 - 30 * (ya - yb)));
            jTextArea1.setText("Subtraction Garis A-B = \n x1(A)-X2(B) =" + xab + "\ny1(A)-y2(B)=" + yab + "\nMaka Hasil Subtraction ialah C =(" + xab + "," + yab + ")");

        }
    }
    public class translasi {
          public void paintComponent(Graphics ga) {
            jPanel2.paintComponents(ga);
            String vector;
            int xa = Integer.parseInt(x1.getText());
            int ya = Integer.parseInt(y1.getText());
            int xb = Integer.parseInt(x2.getText());
            int yb = Integer.parseInt(y2.getText());
             int kx = Integer.parseInt(x.getText());
            int ky = Integer.parseInt(y.getText());

            int x3 = xa+kx;
            int x4 = xb+kx;
            int y3 = ya+ky;
            int y4 = yb+ky;
            

            int xab = xa - xb;
            int yab = ya - yb;
            if (xa < xb) {
                vector = "Kanan";
            } else {
                vector = "Kiri";
            }

            ga.setColor(Color.ORANGE);

            ga.drawLine(300 + 30 * xa, 300 - 30 * ya, 300 + 30 * xb, 300 - 30 * yb);
            ga.drawLine(300 + 30 * (xa - xb), 300 - 30 * (ya - yb), 300 + 30 * xa, 300 - 30 * ya);
            ga.drawLine(300 + 30 * xb, 300 - 30 * yb, 300 + 30 * (xa - xb), 300 - 30 * (ya - yb));
//                brasehamline(xa, ya, xb, yb, ga);
//            bruteLine(xb, yb, xb, yb, ga);

            ga.setColor(Color.red);

            ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
            ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));
            ga.drawString("C(" + xab + "," + yab + ")", (300 + 30 * (xa - xb)), (300 - 30 * (ya - yb)));
            jTextArea1.setText("Subtraction Garis A-B = \n x1(A)-X2(B) =" + xab + "\ny1(A)-y2(B)=" + yab + "\nMaka Hasil adisi ialah C =(" + xab + "," + yab + ")");

        }
        
    }
    
    public class crossproduct {

        public void paintComponent(Graphics ga) {
            jPanel2.paintComponents(ga);
            int xa = Integer.parseInt(x1.getText());
            int ya = Integer.parseInt(y1.getText());
            int xb = Integer.parseInt(x2.getText());
            int yb = Integer.parseInt(y2.getText());
            int xab = xa * yb;
            int yab = ya * xb;

            ga.setColor(Color.ORANGE);
            ga.drawLine(300, 300, 300 + 30 * xa, 300 - 30 * ya);
            ga.drawLine(300, 300, 300 + 30 * xb, 300 - 30 * yb);
            ga.setColor(Color.RED);
            ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
            ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));

            double crossproduct = ((xab) - (yab));
            jTextArea1.setText("Crossproduct =" + crossproduct + "\nHasil dari (x1(A)*y2(B))-(y1(A)*x2(B))=(" + xab + ")+(" + yab + ")=" + crossproduct);

        }
    }
    public class dotproduct {

        public void paintComponent(Graphics ga) {
            jPanel2.paintComponents(ga);
            int xa = Integer.parseInt(x1.getText());
            int ya = Integer.parseInt(y1.getText());
            int xb = Integer.parseInt(x2.getText());
            int yb = Integer.parseInt(y2.getText());
            int xab = xa * xb;
            int yab = ya * yb;

            ga.setColor(Color.ORANGE);
            ga.drawLine(300, 300, 300 + 30 * xa, 300 - 30 * ya);
            ga.drawLine(300, 300, 300 + 30 * xb, 300 - 30 * yb);
            ga.setColor(Color.RED);
            ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
            ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));

            double dotproduct = ((xab) + (yab));
            jTextArea1.setText("Dot Product =" + dotproduct + "\nHasil dari (x1(A)*x2(B))+(y1(A)*y2(B))=(" + xab + ")+(" + yab + ")=" + dotproduct);

        }
    }

    public class adisidot {

        public void paintComponent(Graphics ga) {
            jPanel2.paintComponents(ga);
            int xa = Integer.parseInt(x1.getText());
            int ya = Integer.parseInt(y1.getText());
            int xb = Integer.parseInt(x2.getText());
            int yb = Integer.parseInt(y2.getText());
            int xab = (xa + xb);
            int yab = (ya + yb);

            ga.setColor(Color.ORANGE);
            ga.drawLine(300, 300, 300 + 30 * xa, 300 - 30 * ya);
            ga.drawLine(300, 300, 300 + 30 * xb, 300 - 30 * yb);
            ga.setColor(Color.BLUE);
            ga.drawLine(300, 300, 300 + 30 * xab, 300 - 30 * yab);

            ga.setColor(Color.RED);
            ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
            ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));
            ga.drawString("C(" + xab + "," + yab + ")", (300 + 30 * xab), (300 - 30 * yab));

            double pjgvector = Math.sqrt(((xab - 0) * (xab - 0)) + ((yab - 0) * (yab - 0)));
            jTextArea1.setText("Adisi Garis A-B = \n x1(A)+X2(B) =" + xab + "\ny1(A)+y2(B)=" + yab + "\nMaka Hasil adisi ialah C =(" + xab + "," + yab + ")\n Panjang Vector C =" + pjgvector);

        }

    }

    public class subtractiondot {

        public void paintComponent(Graphics ga) {
            jPanel2.paintComponents(ga);
            int xa = Integer.parseInt(x1.getText());
            int ya = Integer.parseInt(y1.getText());
            int xb = Integer.parseInt(x2.getText());
            int yb = Integer.parseInt(y2.getText());
            int xab = (xa - xb);
            int yab = (ya - yb);

            ga.setColor(Color.ORANGE);
            ga.drawLine(300, 300, 300 + 30 * xa, 300 - 30 * ya);
            ga.drawLine(300, 300, 300 + 30 * xb, 300 - 30 * yb);
            ga.setColor(Color.BLUE);
            ga.drawLine(300, 300, 300 + 30 * xab, 300 - 30 * yab);

            ga.setColor(Color.RED);
            ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
            ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));
            ga.drawString("C(" + xab + "," + yab + ")", (300 + 30 * xab), (300 - 30 * yab));

            double pjgvector = Math.sqrt(((xab - 0) * (xab - 0)) + ((yab - 0) * (yab - 0)));
            jTextArea1.setText("Subtraction Garis A-B = \n x1(A)-X2(B) =" + xab + "\ny1(A)-y2(B)=" + yab + "\nMaka Hasil adisi ialah C =(" + xab + "," + yab + ")\nPanjang Vector =" + pjgvector);

        }

    }

    public class Line {

        public Point point1;
        public Point point2;

        Line(Point p1, Point p2) {
            point1 = p1;
            point2 = p2;
        }

    }

    public class garis1 {

        public void paintComponent(Graphics ga) {
            String vector;
            jPanel2.paintComponents(ga);
            int xa = Integer.parseInt(x1.getText());
            int ya = Integer.parseInt(y1.getText());
            int xb = Integer.parseInt(x2.getText());
            int yb = Integer.parseInt(y2.getText());
            if (xa < xb) {
                vector = "Kanan";
                ga.setColor(Color.red);
                ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
                 ga.drawString("(B)(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));
            } else {
                vector = "Kiri";
                ga.setColor(Color.red);
                  ga.drawString("(A)(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
                 ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));
            
            }
            Point p = new Point(xa, ya);
            Point p2 = new Point(xb, yb);
            Line l = new Line(p, p2);
            ga.setColor(Color.ORANGE);
            ga.drawLine(300 + 30 * xa, 300 - 30 * ya, 300 + 30 * xb, 300 - 30 * yb);
//            brasehamline(xa, ya, xb, yb, ga);
//            bruteLine(xb, yb, xb, yb, ga);
            ga.setColor(Color.red);
//            ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
//            ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));
            double pjggaris = Math.sqrt(((xb - xa) * (xb - xa)) + ((yb - ya) * (yb - ya)));
            jTextArea1.setText("Panjang Vector = " + pjggaris + " \n Arah Vector =" + vector);

        }
    }

    public class garis extends JPanel {

        @Override
        public void paintComponent(Graphics ga) {
            String vector;
            super.paintComponents(ga);
            int xa = Integer.parseInt(x1.getText());
            int ya = Integer.parseInt(y1.getText());
            int xb = Integer.parseInt(x2.getText());
            int yb = Integer.parseInt(y2.getText());
            if (xa < xb) {
                vector = "Kanan";
            } else {
                vector = "Kiri";
            }
            ga.setColor(Color.ORANGE);
            ga.drawLine(300 + 30 * xa, 300 - 30 * ya, 300 + 30 * xb, 300 - 30 * yb);
//                brasehamline(xa, ya, xb, yb, ga);
//            bruteLine(xb, yb, xb, yb, ga);
            double pjggaris = Math.sqrt(((xb - xa) * (xb - xa)) + ((yb - ya) * (yb - ya)));
            ga.setColor(Color.red);
            ga.drawString("A(" + x1.getText() + "," + y1.getText() + ")", (300 + 30 * xa), (300 - 30 * ya));
            ga.drawString("B(" + x2.getText() + "," + y2.getText() + ")", (300 + 30 * xb), (300 - 30 * yb));
            ga.drawString("Panjang Garis A-B : " + pjggaris, 5, 20);

            for (int a = 0; a <= 600; a += 30) {
                if (a == 300) {
                    ga.setColor(Color.BLACK);
                    ga.drawLine(0, 300, 600, 300);
                    ga.drawLine(300, 30, 300, 600);
                } else {
                    ga.setColor(Color.GRAY);
                    ga.drawLine(0, 600 - a, 600, 600 - a);
                    ga.drawLine(600 - a, 30, 600 - a, 600);
                }
                ga.setColor(Color.BLACK);
                ga.drawString(Integer.toString((a - 300) / 30), a, 300);
                ga.drawString(Integer.toString((300 - a) / 30), 300, a);

            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        x = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        y = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        x1 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        y2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Titik");

        jLabel2.setText("X");

        jLabel3.setText("Y");

        jButton1.setText("Pop Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("X1");

        jLabel5.setText("Y1");

        jLabel6.setText("X2");

        jLabel7.setText("Y2");

        jButton2.setText("Pop Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Garis");

        jToggleButton1.setText("Back");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jButton3.setText("Tampilkan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Tampilkan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("AKTIFKAN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Reset");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setText("INFO");

        jButton7.setText("Penambahan");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Pengurangan");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton9.setText("Tampilkan");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel10.setText("Dot Product");

        jButton10.setText("Adisi");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Subtraction");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel11.setText("Cross Product");

        jButton12.setText("Tampilkan");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(45, 45, 45)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton8)))
                                        .addComponent(jLabel10)))
                                .addComponent(jButton9)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton11)))
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6))
                                .addComponent(jLabel9)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton12))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToggleButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(171, 171, 171))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        titik gs = new titik();
        JFrame jf = new JFrame("Tampilan Titik");

        jf.add(gs);
        jf.setSize(600, 630);
        jf.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        garis gs = new garis();
        JFrame jf = new JFrame("1 Garis");

        jf.add(gs);

        jf.setSize(600, 630);
        jf.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        awalan a = new awalan();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new titik1().paintComponent(getGraphics());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new garis1().paintComponent(getGraphics());// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new sumbu().paintComponent(getGraphics());
        x.setEnabled(true);
        y.setEnabled(true);
        x1.setEnabled(true);
        y1.setEnabled(true);
        x2.setEnabled(true);
        y2.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new TitikdanGaris().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new penambahan().paintComponent(getGraphics());// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new Pengurangan().paintComponent(getGraphics());// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new dotproduct().paintComponent(getGraphics());// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new adisidot().paintComponent(getGraphics());// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new subtractiondot().paintComponent(getGraphics());// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        new crossproduct().paintComponent(getGraphics()); // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(TitikdanGaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TitikdanGaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TitikdanGaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TitikdanGaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TitikdanGaris().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField x;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField y;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    // End of variables declaration//GEN-END:variables
}
