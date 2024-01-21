/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HesapMakinesi;

/**
 *
 * @author Sude Nisa Tarcan
 */
public class HesapMakinesi extends javax.swing.JFrame {

    double NumEnter1;
    double NumEnter2; 
    double Result;
    double PercentResult;
    String op; 
    
    public HesapMakinesi() {
        initComponents();
    }        

     private void EnterNumbers(String q)
     {
         String Nums = jtxtResult.getText() + q; 
         jtxtResult.setText(Nums); 
     }                                                             
   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(() -> {
            new HesapMakinesi().setVisible(true);
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtnBS = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnPercent = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigitOne = new javax.swing.JButton();
        jbtnDigitTwo = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnMult = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnDigitZero = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jbtnDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setBackground(new java.awt.Color(255, 204, 204));
        jtxtResult.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jtxtResult.setForeground(new java.awt.Color(0, 0, 0));
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 100));

        jbtnBS.setBackground(new java.awt.Color(255, 153, 153));
        jbtnBS.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnBS.setForeground(new java.awt.Color(0, 0, 0));
        jbtnBS.setText("<---");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 60));

        jbtnCE.setBackground(new java.awt.Color(255, 153, 153));
        jbtnCE.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnCE.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 90, 60));

        jbtnPM.setBackground(new java.awt.Color(255, 153, 153));
        jbtnPM.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnPM.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 90, 60));

        jbtnPercent.setBackground(new java.awt.Color(255, 153, 153));
        jbtnPercent.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnPercent.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPercent.setText("%");
        jbtnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPercentActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 90, 60));

        jbtnDigit7.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigit7.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigit7.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 60));

        jbtnDigit8.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigit8.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigit8.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 90, 60));

        jbtnDigit9.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigit9.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigit9.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 90, 60));

        jbtnPlus.setBackground(new java.awt.Color(255, 153, 153));
        jbtnPlus.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 90, 60));

        jbtnDigit4.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigit4.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigit4.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 60));

        jbtnDigit5.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigit5.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigit5.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 90, 60));

        jbtnDigit6.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigit6.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigit6.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, 60));

        jbtnMinus.setBackground(new java.awt.Color(255, 153, 153));
        jbtnMinus.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnMinus.setForeground(new java.awt.Color(0, 0, 0));
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, 60));

        jbtnDigitOne.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigitOne.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigitOne.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigitOne.setText("1");
        jbtnDigitOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigitOneActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigitOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, 60));

        jbtnDigitTwo.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigitTwo.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigitTwo.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigitTwo.setText("2");
        jbtnDigitTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigitTwoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigitTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 90, 60));

        jbtnDigit3.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigit3.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigit3.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 90, 60));

        jbtnMult.setBackground(new java.awt.Color(255, 153, 153));
        jbtnMult.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnMult.setForeground(new java.awt.Color(0, 0, 0));
        jbtnMult.setText("*");
        jbtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 90, 60));

        jbtnDot.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDot.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDot.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 90, 60));

        jbtnDigitZero.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDigitZero.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDigitZero.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDigitZero.setText("0");
        jbtnDigitZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigitZeroActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigitZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 90, 60));

        jbtnEquals.setBackground(new java.awt.Color(255, 153, 153));
        jbtnEquals.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnEquals.setForeground(new java.awt.Color(0, 0, 0));
        jbtnEquals.setText("=");
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 90, 60));

        jbtnDiv.setBackground(new java.awt.Color(255, 153, 153));
        jbtnDiv.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jbtnDiv.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDiv.setText("/");
        jbtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 90, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
           String backSp = null; 
      
      if (jtxtResult.getText().length() > 0)
      {
        StringBuilder sb = new StringBuilder(jtxtResult.getText()); 
        sb.deleteCharAt(jtxtResult.getText().length() -1); 
        backSp = sb.toString();
        jtxtResult.setText(backSp);
      }        
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
         jtxtResult.setText("");
      
      String Fn, Sn; 
      
      Fn = String.valueOf(NumEnter1); 
      Sn = String.valueOf(NumEnter2); 
     
      Fn = "";
      Sn = "";  
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        double nums = Double.parseDouble(String.valueOf(jtxtResult.getText())); 
     nums = nums * (-1);
     jtxtResult.setText(String.valueOf(nums)); 
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPercentActionPerformed
         NumEnter1 = Double.parseDouble(jtxtResult.getText());
          double percentResult = (NumEnter1) / 100;
          jtxtResult.setText(String.valueOf(percentResult));
    }//GEN-LAST:event_jbtnPercentActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
     EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
         EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
        EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
     EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigitOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigitOneActionPerformed
        EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigitOneActionPerformed

    private void jbtnDigitTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigitTwoActionPerformed
         EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigitTwoActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
         EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigitZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigitZeroActionPerformed
        EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigitZeroActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        if(! jtxtResult.getText().contains("."))
           {
                jtxtResult.setText(jtxtResult.getText() + jbtnDot.getText()); 
           }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualsActionPerformed
      NumEnter2 = Double.parseDouble(jtxtResult.getText()); 
          if (op == "+")
          {
            Result = NumEnter1 + NumEnter2; 
            jtxtResult.setText(String.valueOf(Result)); 
          }
          
          else if (op == "-")
          {
              Result = NumEnter1 - NumEnter2; 
            jtxtResult.setText(String.valueOf(Result)); 
          }
          
            else if (op == "*")
          {
              Result = NumEnter1 * NumEnter2; 
            jtxtResult.setText(String.valueOf(Result)); 
          }
           
            else if (op == "/")
          {
              Result = NumEnter1 / NumEnter2; 
            jtxtResult.setText(String.valueOf(Result)); 
          }
    }//GEN-LAST:event_jbtnEqualsActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
         NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op ="+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
         NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op ="-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultActionPerformed
       NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op ="*";
    }//GEN-LAST:event_jbtnMultActionPerformed

    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivActionPerformed
       NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op ="/";
    }//GEN-LAST:event_jbtnDivActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDigitOne;
    private javax.swing.JButton jbtnDigitTwo;
    private javax.swing.JButton jbtnDigitZero;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMult;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPercent;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
