package mttt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JPanel extends javax.swing.JPanel {
    
    public boolean vinst = false;
    
    public boolean enabled = true;
    
    public short winColor = 0;
    //1 = circ, 2 = kryss
    
    public int player[] = new int[9];
    //0 = ingen, 1 = cirkel, 2 = kryss
    
    public static boolean xoxo = true;
    //True = OOO
    //False = XXX
    
    public static int xMouseCord = 0;
    public static int yMouseCord = 0;
    
    public ImageIcon blank = new ImageIcon(getClass().getResource("/images/Blank.png"));
    public ImageIcon cross = new ImageIcon(getClass().getResource("/images/Cross.png"));
    public ImageIcon circle = new ImageIcon(getClass().getResource("/images/Circle.png"));
    
    public JPanel() {
        initComponents();
        resetPlayer();
    }
    
    public void resetPlayer() {
        for (int i = 0; i < player.length; i++) {
            player[i] = 0;
        }
    }
    
    
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        //initsierar värden för bred och längd
        
        if (enabled) {
            g.setColor(new Color(210, 227, 239));
        } else {
            g.setColor(new Color(65, 65, 65));
        }
        if (vinst) {
            if (winColor == 1) {
                g.setColor(new Color(0,39,119));
            } else {
                g.setColor(new Color(120, 0, 0));
            }
        }
        g.fillRect(0, 0, width, height);
        //Fyller backgrunden med ljus eller mörk skärm beroende på vems tur det är
            
        
        g.setColor(Color.black);
        
        g.drawLine(width/3+1, 0, width/3+1, height);
        g.drawLine((width/3)*2+1, 0, (width/3)*2+1, height);
        g.drawLine(0, height/3+1, width, height/3+1);
        g.drawLine(0, (height/3)*2+1, width,(height/3)*2+1);
        
        g.drawLine(width/3, 0, width/3, height);
        g.drawLine((width/3)*2, 0, (width/3)*2, height);
        g.drawLine(0, height/3, width, height/3);
        g.drawLine(0, (height/3)*2, width,(height/3)*2);
        
        g.drawLine(width/3-1, 0, width/3-1, height);
        g.drawLine((width/3)*2-1, 0, (width/3)*2-1, height);
        g.drawLine(0, height/3-1, width, height/3-1);
        g.drawLine(0, (height/3)*2-1, width,(height/3)*2-1);
        
        
        //Graphics2 kan skapa tjocka linjer
        //Valt att använda PaintComponent och skrivit kod så att varje linje skrivs 3 gånger med två som har offsets
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblXO1 = new javax.swing.JLabel();
        lblXO2 = new javax.swing.JLabel();
        lblXO3 = new javax.swing.JLabel();
        lblXO4 = new javax.swing.JLabel();
        lblXO5 = new javax.swing.JLabel();
        lblXO6 = new javax.swing.JLabel();
        lblXO7 = new javax.swing.JLabel();
        lblXO8 = new javax.swing.JLabel();
        lblXO9 = new javax.swing.JLabel();

        lblXO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blank.png"))); // NOI18N
        lblXO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXO1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblXO1MouseReleased(evt);
            }
        });

        lblXO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blank.png"))); // NOI18N
        lblXO2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXO2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblXO2MouseReleased(evt);
            }
        });

        lblXO3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blank.png"))); // NOI18N
        lblXO3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXO3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblXO3MouseReleased(evt);
            }
        });

        lblXO4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blank.png"))); // NOI18N
        lblXO4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXO4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblXO4MouseReleased(evt);
            }
        });

        lblXO5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blank.png"))); // NOI18N
        lblXO5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXO5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblXO5MouseReleased(evt);
            }
        });

        lblXO6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blank.png"))); // NOI18N
        lblXO6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXO6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblXO6MouseReleased(evt);
            }
        });

        lblXO7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blank.png"))); // NOI18N
        lblXO7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXO7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblXO7MouseReleased(evt);
            }
        });

        lblXO8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blank.png"))); // NOI18N
        lblXO8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXO8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblXO8MouseReleased(evt);
            }
        });

        lblXO9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blank.png"))); // NOI18N
        lblXO9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXO9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblXO9MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblXO1)
                        .addGap(1, 1, 1)
                        .addComponent(lblXO2)
                        .addGap(1, 1, 1)
                        .addComponent(lblXO3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblXO7)
                        .addGap(1, 1, 1)
                        .addComponent(lblXO8)
                        .addGap(1, 1, 1)
                        .addComponent(lblXO9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblXO4)
                        .addGap(1, 1, 1)
                        .addComponent(lblXO5)
                        .addGap(1, 1, 1)
                        .addComponent(lblXO6)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblXO1)
                    .addComponent(lblXO2)
                    .addComponent(lblXO3))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblXO4)
                    .addComponent(lblXO5)
                    .addComponent(lblXO6))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblXO7)
                    .addComponent(lblXO8)
                    .addComponent(lblXO9))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblXO1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO1MousePressed
        xMouseCord = MouseInfo.getPointerInfo().getLocation().x;
        yMouseCord = MouseInfo.getPointerInfo().getLocation().y;
    }//GEN-LAST:event_lblXO1MousePressed

    private void lblXO1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO1MouseReleased
        if (enabled && player[0] == 0) {
            if ((MouseInfo.getPointerInfo().getLocation().x > xMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().x < xMouseCord +10) && (MouseInfo.getPointerInfo().getLocation().y > yMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().y < yMouseCord +10) ) {
            if (!vinst) {
                TreTreJPanel.square = 0;
                if (player[0] == 0) {
                    xoxo = TreTreJPanel.xoxo;
                    if (xoxo) {
                        lblXO1.setIcon(circle);
                        TreTreJPanel.xoxo = false;
                        player[0] = 1;
                    } else {
                        lblXO1.setIcon(cross);
                        TreTreJPanel.xoxo = true;
                        player[0] = 2;
                    }
                }
                vinstCheck();
            }
        bigTTJPvinstcheck();
        TreTreJPanel.updateBoard();
        }
        }
        
    }//GEN-LAST:event_lblXO1MouseReleased

    private void lblXO2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO2MousePressed
        xMouseCord = MouseInfo.getPointerInfo().getLocation().x;
        yMouseCord = MouseInfo.getPointerInfo().getLocation().y;
    }//GEN-LAST:event_lblXO2MousePressed

    private void lblXO2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO2MouseReleased
        if (enabled && player[1] == 0) {
            if ((MouseInfo.getPointerInfo().getLocation().x > xMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().x < xMouseCord +10) && (MouseInfo.getPointerInfo().getLocation().y > yMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().y < yMouseCord +10) ){
            if (!vinst) {
            TreTreJPanel.square = 1;
            if (player[1] == 0) {
            xoxo = TreTreJPanel.xoxo;
        if (xoxo) {
            lblXO2.setIcon(circle);
            TreTreJPanel.xoxo = false;
            player[1] = 1;
        } else {
            lblXO2.setIcon(cross);
            TreTreJPanel.xoxo = true;
            player[1] = 2;
        }
        }
        vinstCheck();
        }
        bigTTJPvinstcheck();
        TreTreJPanel.updateBoard();
        }
        }
        
    }//GEN-LAST:event_lblXO2MouseReleased

    private void lblXO3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO3MousePressed
        xMouseCord = MouseInfo.getPointerInfo().getLocation().x;
        yMouseCord = MouseInfo.getPointerInfo().getLocation().y;
    }//GEN-LAST:event_lblXO3MousePressed

    private void lblXO3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO3MouseReleased
        if (enabled && player[2] == 0) {
            if ((MouseInfo.getPointerInfo().getLocation().x > xMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().x < xMouseCord +10) && (MouseInfo.getPointerInfo().getLocation().y > yMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().y < yMouseCord +10) ){
            if (!vinst) {
            TreTreJPanel.square = 2;
            if (player[2] == 0) {
            xoxo = TreTreJPanel.xoxo;
        if (xoxo) {
            lblXO3.setIcon(circle);
            TreTreJPanel.xoxo = false;
            player[2] = 1;
        } else {
            lblXO3.setIcon(cross);
            TreTreJPanel.xoxo = true;
            player[2] = 2;
        }
        }
        vinstCheck();
        }
        bigTTJPvinstcheck();
        TreTreJPanel.updateBoard();
        }
        }
        
    }//GEN-LAST:event_lblXO3MouseReleased

    private void lblXO4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO4MousePressed
        xMouseCord = MouseInfo.getPointerInfo().getLocation().x;
        yMouseCord = MouseInfo.getPointerInfo().getLocation().y;
    }//GEN-LAST:event_lblXO4MousePressed

    private void lblXO4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO4MouseReleased
        if (enabled && player[3] == 0) {
            if ((MouseInfo.getPointerInfo().getLocation().x > xMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().x < xMouseCord +10) && (MouseInfo.getPointerInfo().getLocation().y > yMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().y < yMouseCord +10) ){
            if (!vinst) {
            TreTreJPanel.square = 3;
            if (player[3] == 0) {
            xoxo = TreTreJPanel.xoxo;
        if (xoxo) {
            lblXO4.setIcon(circle);
            TreTreJPanel.xoxo = false;
            player[3] = 1;
        } else {
            lblXO4.setIcon(cross);
            TreTreJPanel.xoxo = true;
            player[3] = 2;
        }
        }
        vinstCheck();
        }
        bigTTJPvinstcheck();
        TreTreJPanel.updateBoard();
        }
        }
        
    }//GEN-LAST:event_lblXO4MouseReleased

    private void lblXO5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO5MousePressed
        xMouseCord = MouseInfo.getPointerInfo().getLocation().x;
        yMouseCord = MouseInfo.getPointerInfo().getLocation().y;
    }//GEN-LAST:event_lblXO5MousePressed

    private void lblXO5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO5MouseReleased
        if (enabled && player[4] == 0) {
            if ((MouseInfo.getPointerInfo().getLocation().x > xMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().x < xMouseCord +10) && (MouseInfo.getPointerInfo().getLocation().y > yMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().y < yMouseCord +10) ){
            if (!vinst) {
            TreTreJPanel.square = 4;
            if (player[4] == 0) {
            xoxo = TreTreJPanel.xoxo;
        if (xoxo) {
            lblXO5.setIcon(circle);
            TreTreJPanel.xoxo = false;
            player[4] = 1;
        } else {
            lblXO5.setIcon(cross);
            TreTreJPanel.xoxo = true;
            player[4] = 2;
        }
        }
        vinstCheck();
        }
        bigTTJPvinstcheck();
        TreTreJPanel.updateBoard();
        }
        }
        
    }//GEN-LAST:event_lblXO5MouseReleased

    private void lblXO6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO6MousePressed
        xMouseCord = MouseInfo.getPointerInfo().getLocation().x;
        yMouseCord = MouseInfo.getPointerInfo().getLocation().y;
    }//GEN-LAST:event_lblXO6MousePressed

    private void lblXO6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO6MouseReleased
        if (enabled && player[5] == 0) {
            if ((MouseInfo.getPointerInfo().getLocation().x > xMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().x < xMouseCord +10) && (MouseInfo.getPointerInfo().getLocation().y > yMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().y < yMouseCord +10) ){
            if (!vinst) {
            TreTreJPanel.square = 5;
            if (player[5] == 0) {
            xoxo = TreTreJPanel.xoxo;
        if (xoxo) {
            lblXO6.setIcon(circle);
            TreTreJPanel.xoxo = false;
            player[5] = 1;
        } else {
            lblXO6.setIcon(cross);
            TreTreJPanel.xoxo = true;
            player[5] = 2;
        }
        }
        vinstCheck();
        }
        bigTTJPvinstcheck();
        TreTreJPanel.updateBoard();
        }
        }
        
    }//GEN-LAST:event_lblXO6MouseReleased

    private void lblXO7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO7MousePressed
        xMouseCord = MouseInfo.getPointerInfo().getLocation().x;
        yMouseCord = MouseInfo.getPointerInfo().getLocation().y;
    }//GEN-LAST:event_lblXO7MousePressed

    private void lblXO7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO7MouseReleased
        if (enabled && player[6] == 0) {
            if ((MouseInfo.getPointerInfo().getLocation().x > xMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().x < xMouseCord +10) && (MouseInfo.getPointerInfo().getLocation().y > yMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().y < yMouseCord +10) ){
            if (!vinst) {
            TreTreJPanel.square = 6;
            if (player[6] == 0) {
            xoxo = TreTreJPanel.xoxo;
        if (xoxo) {
            lblXO7.setIcon(circle);
            TreTreJPanel.xoxo = false;
            player[6] = 1;
        } else {
            lblXO7.setIcon(cross);
            TreTreJPanel.xoxo = true;
            player[6] = 2;
        }
        }
        vinstCheck();
        }
        bigTTJPvinstcheck();
        TreTreJPanel.updateBoard();
        }
        }
        
    }//GEN-LAST:event_lblXO7MouseReleased

    private void lblXO8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO8MousePressed
        xMouseCord = MouseInfo.getPointerInfo().getLocation().x;
        yMouseCord = MouseInfo.getPointerInfo().getLocation().y;
    }//GEN-LAST:event_lblXO8MousePressed

    private void lblXO8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO8MouseReleased
        if (enabled && player[7] == 0) {
            if ((MouseInfo.getPointerInfo().getLocation().x > xMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().x < xMouseCord +10) && (MouseInfo.getPointerInfo().getLocation().y > yMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().y < yMouseCord +10) ){
            if (!vinst) {
            TreTreJPanel.square = 7;
            if (player[7] == 0) {
            xoxo = TreTreJPanel.xoxo;
        if (xoxo) {
            lblXO8.setIcon(circle);
            TreTreJPanel.xoxo = false;
            player[7] = 1;
        } else {
            lblXO8.setIcon(cross);
            TreTreJPanel.xoxo = true;
            player[7] = 2;
        }
        }
        vinstCheck();
        }
        bigTTJPvinstcheck();
        TreTreJPanel.updateBoard();
        }
        }
        
    }//GEN-LAST:event_lblXO8MouseReleased

    private void lblXO9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO9MousePressed
        xMouseCord = MouseInfo.getPointerInfo().getLocation().x;
        yMouseCord = MouseInfo.getPointerInfo().getLocation().y;
    }//GEN-LAST:event_lblXO9MousePressed

    private void lblXO9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXO9MouseReleased
        if (enabled && player[8] == 0) {
            if ((MouseInfo.getPointerInfo().getLocation().x > xMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().x < xMouseCord +10) && (MouseInfo.getPointerInfo().getLocation().y > yMouseCord -10) && (MouseInfo.getPointerInfo().getLocation().y < yMouseCord +10) ){
            if (!vinst) {
            TreTreJPanel.square = 8;
            if (player[8] == 0) {
            xoxo = TreTreJPanel.xoxo;
        if (xoxo) {
            lblXO9.setIcon(circle);
            TreTreJPanel.xoxo = false;
            player[8] = 1;
        } else {
            lblXO9.setIcon(cross);
            TreTreJPanel.xoxo = true;
            player[8] = 2;
        }
        }
        vinstCheck();
        }
        bigTTJPvinstcheck();
        TreTreJPanel.updateBoard();
            }
        }
        
    }//GEN-LAST:event_lblXO9MouseReleased

    public boolean getVinst(){
        return vinst;
    }
    
    public short getWinColor(){
        return winColor;
    }
    
    
    public boolean vinstCheck(){
        System.out.println(TreTreJPanel.square);
        for (int i = 0; i < 8;i = i+3) {
            if (player[i] == player[i+1] && player[i] == player[i+2] && player[i] == 2) {
                System.out.println("vinst 2");
                vinst = true;
                winColor = 2;
                TreTreJPanel.winChecking();
                return true;
            }
            if (player[i] == player[i+1] && player[i] == player[i+2] && player[i] == 1) {
                System.out.println("vinst 1");
                vinst = true;
                winColor = 1;
                TreTreJPanel.winChecking();
                return true;
            }
        }
        
        
        if (player[0] == player[4] && player[0] == player[8] && player [0] == 1) {
            System.out.println("vinst 1");
            vinst = true;
            winColor = 1;
            TreTreJPanel.winChecking();
            return true;
        }
        if (player[0] == player[4] && player[0] == player[8] && player [0] == 2) {
            System.out.println("vinst 2");
            vinst = true;
            winColor = 2;
            TreTreJPanel.winChecking();
            return true;
        }
        
        
        
        if (player[6] == player[4] && player[6] == player[2] && player [6] == 1) {
            System.out.println("vinst 1");
            vinst = true;
            winColor = 1;
            TreTreJPanel.winChecking();
            return true;
        }
        if (player[6] == player[4] && player[6] == player[2] && player [6] == 2) {
            System.out.println("vinst 2");
            vinst = true;
            winColor = 2;
            TreTreJPanel.winChecking();
            return true;
        }
        
        
        for (int i = 0; i < 3; i++) {
            if (player[0+i] == player[3+i] && player[0+i] == player[6+i] && player[0+i] == 1) {
                System.out.println("vinst 1");
                vinst = true;
                winColor = 1;
                TreTreJPanel.winChecking();
                return true;
            }
            if (player[0+i] == player[3+i] && player[0+i] == player[6+i] && player[0+i] == 2) {
                System.out.println("vinst 2");
                vinst = true;
                winColor = 2;
                TreTreJPanel.winChecking();
                return true;
            }
        }
        
        return false;
    }
    
    public void disableAll(){
        lblXO1.setEnabled(false);
        lblXO2.setEnabled(false);
        lblXO3.setEnabled(false);
        lblXO4.setEnabled(false);
        lblXO5.setEnabled(false);
        lblXO6.setEnabled(false);
        lblXO7.setEnabled(false);
        lblXO8.setEnabled(false);
        lblXO9.setEnabled(false);
        enabled = false;
        
    }
    public void enableAll(){
        if (!vinst) {
            lblXO1.setEnabled(true);
            lblXO2.setEnabled(true);
            lblXO3.setEnabled(true);
            lblXO4.setEnabled(true);
            lblXO5.setEnabled(true);
            lblXO6.setEnabled(true);
            lblXO7.setEnabled(true);
            lblXO8.setEnabled(true);
            lblXO9.setEnabled(true);
            enabled = true;
        }
    }
    
    
    public void bigTTJPvinstcheck(){
        TreTreJPanel.winChecking();
        TreTreJPanel.vinstCheck();
    }

    public void reset(){
        
        vinst = false;
        winColor = 0;
        resetPlayer();
        xoxo = true;
        repaint();
        enableAll();
        
        lblXO1.setIcon(blank);
        lblXO2.setIcon(blank);
        lblXO3.setIcon(blank);
        lblXO4.setIcon(blank);
        lblXO5.setIcon(blank);
        lblXO6.setIcon(blank);
        lblXO7.setIcon(blank);
        lblXO8.setIcon(blank);
        lblXO9.setIcon(blank);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblXO1;
    private javax.swing.JLabel lblXO2;
    private javax.swing.JLabel lblXO3;
    private javax.swing.JLabel lblXO4;
    private javax.swing.JLabel lblXO5;
    private javax.swing.JLabel lblXO6;
    private javax.swing.JLabel lblXO7;
    private javax.swing.JLabel lblXO8;
    private javax.swing.JLabel lblXO9;
    // End of variables declaration//GEN-END:variables

    void disable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
