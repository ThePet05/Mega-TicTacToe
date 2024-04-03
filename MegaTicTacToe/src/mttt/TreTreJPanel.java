package mttt;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

public class TreTreJPanel extends javax.swing.JPanel {

    public static boolean xoxo = true;
    //True = OOO
    //False = XXX
    
    public static boolean vinst[] = new boolean[9];
    public static short vinstLag[] = new short[9];
    public static short square = 10;
    //10 = all squares
    public static short megaVinst = 0;
    //0 = none, 1 = OOO, 2 = XXX
    
    public static short vinstOOO = 0;
    public static short vinstXXX = 0;
    
    public TreTreJPanel() {
        initComponents();
        winReset();
    }

    public void winReset() {
        for (int i = 0; i < vinst.length; i++) {
            vinst[i] = false;
            vinstLag[i] = 0;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new mttt.JPanel();
        panel2 = new mttt.JPanel();
        panel3 = new mttt.JPanel();
        panel4 = new mttt.JPanel();
        panel5 = new mttt.JPanel();
        panel6 = new mttt.JPanel();
        panel7 = new mttt.JPanel();
        panel8 = new mttt.JPanel();
        panel9 = new mttt.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblOOO = new javax.swing.JLabel();
        lblXXX = new javax.swing.JLabel();

        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 262));

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Wins:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("OOO:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("XXX:");
        jLabel3.setMaximumSize(new java.awt.Dimension(32, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 16));

        lblOOO.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblOOO.setText("0");

        lblXXX.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblXXX.setText("0");
        lblXXX.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnReset)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOOO)
                            .addComponent(lblXXX, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOOO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXXX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(btnReset)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        winReset();
        
        square = 10;
        panel1.reset();
        panel2.reset();
        panel3.reset();
        panel4.reset();
        panel5.reset();
        panel6.reset();
        panel7.reset();
        panel8.reset();
        panel9.reset();
        megaVinst = 0;
        updateBoard();
        System.out.println("Reset");
        
    }//GEN-LAST:event_btnResetActionPerformed

    
    public static void winChecking(){
        vinst[0] = panel1.getVinst();
        vinst[1] = panel2.getVinst();
        vinst[2] = panel3.getVinst();
        vinst[3] = panel4.getVinst();
        vinst[4] = panel5.getVinst();
        vinst[5] = panel6.getVinst();
        vinst[6] = panel7.getVinst();
        vinst[7] = panel8.getVinst();
        vinst[8] = panel9.getVinst();
        
        vinstLag[0] = panel1.winColor;
        vinstLag[1] = panel2.winColor;
        vinstLag[2] = panel3.winColor;
        vinstLag[3] = panel4.winColor;
        vinstLag[4] = panel5.winColor;
        vinstLag[5] = panel6.winColor;
        vinstLag[6] = panel7.winColor;
        vinstLag[7] = panel8.winColor;
        vinstLag[8] = panel9.winColor;
        
    }
    
    
    
    public static void vinstCheck(){
        System.out.println(TreTreJPanel.square);
        for (int i = 0; i < 8;i = i+3) {
            if (vinstLag[i] == vinstLag[i+1] && vinstLag[i] == vinstLag[i+2] && vinstLag[i] == 2) {
                System.out.println("MEGA vinst 2");
                megaVinst = 2;
            }
            if (vinstLag[i] == vinstLag[i+1] && vinstLag[i] == vinstLag[i+2] && vinstLag[i] == 1) {
                System.out.println("MEGA vinst 1");
                megaVinst = 1;
            }
        }
        
        
        if (vinstLag[0] == vinstLag[4] && vinstLag[0] == vinstLag[8] && vinstLag[0] == 1) {
            System.out.println("MEGA vinst 1");
            megaVinst = 1;
        }
        if (vinstLag[0] == vinstLag[4] && vinstLag[0] == vinstLag[8] && vinstLag[0] == 2) {
            System.out.println("MEGA vinst 2");
            megaVinst = 2;
        }
        
        
        
        if (vinstLag[6] == vinstLag[4] && vinstLag[6] == vinstLag[2] && vinstLag[6] == 1) {
            System.out.println("MEGA vinst 1");
            megaVinst = 1;
        }
        if (vinstLag[6] == vinstLag[4] && vinstLag[6] == vinstLag[2] && vinstLag[6] == 2) {
            System.out.println("MEGA vinst 2");
            megaVinst = 2;
        }
        
        for (int i = 0; i < 3; i++) {
            if (vinstLag[i] == vinstLag[i+3] && vinstLag[i] == vinstLag[i+6] && vinstLag[i] == 2) {
                System.out.println("MEGA vinst 2");
                megaVinst = 2;
            }
            if (vinstLag[i] == vinstLag[i+3] && vinstLag[i] == vinstLag[i+6] && vinstLag[i] == 1) {
                System.out.println("MEGA vinst 1");
                megaVinst = 1;
            }
        }
    }
    
    public static void updateBoard(){
        
        if (megaVinst > 0) {
            panel1.disableAll();
            panel2.disableAll();
            panel3.disableAll();
            panel4.disableAll();
            panel5.disableAll();
            panel6.disableAll();
            panel7.disableAll();
            panel8.disableAll();
            panel9.disableAll();
            
            if (megaVinst == 1) {
                vinstOOO++;
                lblOOO.setText(String.valueOf(vinstOOO));
            } else {
                vinstXXX++;
                lblXXX.setText(String.valueOf(vinstXXX));
            }
            
        } else if (square == 0 && vinstLag[0] == 0) {
            panel1.enableAll();
            panel2.disableAll();
            panel3.disableAll();
            panel4.disableAll();
            panel5.disableAll();
            panel6.disableAll();
            panel7.disableAll();
            panel8.disableAll();
            panel9.disableAll();
        } else if (square == 1 && vinstLag[1] == 0) {
            panel1.disableAll();
            panel2.enableAll();
            panel3.disableAll();
            panel4.disableAll();
            panel5.disableAll();
            panel6.disableAll();
            panel7.disableAll();
            panel8.disableAll();
            panel9.disableAll();
        } else if (square == 2 && vinstLag[2] == 0) {
            panel1.disableAll();
            panel2.disableAll();
            panel3.enableAll();
            panel4.disableAll();
            panel5.disableAll();
            panel6.disableAll();
            panel7.disableAll();
            panel8.disableAll();
            panel9.disableAll();
        } else if (square == 3 && vinstLag[3] == 0) {
            panel1.disableAll();
            panel2.disableAll();
            panel3.disableAll();
            panel4.enableAll();
            panel5.disableAll();
            panel6.disableAll();
            panel7.disableAll();
            panel8.disableAll();
            panel9.disableAll();
        } else if (square == 4 && vinstLag[4] == 0) {
            panel1.disableAll();
            panel2.disableAll();
            panel3.disableAll();
            panel4.disableAll();
            panel5.enableAll();
            panel6.disableAll();
            panel7.disableAll();
            panel8.disableAll();
            panel9.disableAll();
        } else if (square == 5 && vinstLag[5] == 0) {
            panel1.disableAll();
            panel2.disableAll();
            panel3.disableAll();
            panel4.disableAll();
            panel5.disableAll();
            panel6.enableAll();
            panel7.disableAll();
            panel8.disableAll();
            panel9.disableAll();
        } else if (square == 6 && vinstLag[6] == 0) {
            panel1.disableAll();
            panel2.disableAll();
            panel3.disableAll();
            panel4.disableAll();
            panel5.disableAll();
            panel6.disableAll();
            panel7.enableAll();
            panel8.disableAll();
            panel9.disableAll();
        } else if (square == 7 && vinstLag[7] == 0) {
            panel1.disableAll();
            panel2.disableAll();
            panel3.disableAll();
            panel4.disableAll();
            panel5.disableAll();
            panel6.disableAll();
            panel7.disableAll();
            panel8.enableAll();
            panel9.disableAll();
        } else if (square == 8 && vinstLag[8] == 0) {
            panel1.disableAll();
            panel2.disableAll();
            panel3.disableAll();
            panel4.disableAll();
            panel5.disableAll();
            panel6.disableAll();
            panel7.disableAll();
            panel8.disableAll();
            panel9.enableAll();
        } else {
            panel1.enableAll();
            panel2.enableAll();
            panel3.enableAll();
            panel4.enableAll();
            panel5.enableAll();
            panel6.enableAll();
            panel7.enableAll();
            panel8.enableAll();
            panel9.enableAll();
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel lblOOO;
    private static javax.swing.JLabel lblXXX;
    public static mttt.JPanel panel1;
    public static mttt.JPanel panel2;
    public static mttt.JPanel panel3;
    public static mttt.JPanel panel4;
    public static mttt.JPanel panel5;
    public static mttt.JPanel panel6;
    public static mttt.JPanel panel7;
    public static mttt.JPanel panel8;
    public static mttt.JPanel panel9;
    // End of variables declaration//GEN-END:variables
}
