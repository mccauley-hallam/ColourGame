import java.awt.Color;
import java.util.*;

public class Main extends javax.swing.JFrame 
{
    Random rng = new Random();
    
    Integer col1 = rng.nextInt(5) + 1;
    Integer col2 = rng.nextInt(5) + 1;
    Integer col3 = rng.nextInt(5) + 1;
    Integer score = 0;
    
    Integer guess1 = 0, guess2 = 0, guess3 = 0,
            guessCount = 0;

    public Main() 
    {
        initComponents();
        
        System.out.println(col1.toString());
        System.out.println(col2.toString());
        System.out.println(col3.toString());
        
        txtLog.append("Select 3 Colours And Press Check\nAnswers\n\nColours Selected Have to be in the\nCorrect Order\n\n");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        colArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        colArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        colArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        btnGreen = new javax.swing.JButton();
        btnRed = new javax.swing.JButton();
        btnBlue = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnOrange = new javax.swing.JButton();
        btnYellow = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        colArea1.setEditable(false);
        colArea1.setColumns(20);
        colArea1.setRows(5);
        jScrollPane1.setViewportView(colArea1);

        colArea2.setEditable(false);
        colArea2.setColumns(20);
        colArea2.setRows(5);
        jScrollPane2.setViewportView(colArea2);

        colArea3.setEditable(false);
        colArea3.setColumns(20);
        colArea3.setRows(5);
        jScrollPane3.setViewportView(colArea3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Colour 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Colour 2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Colour 3");

        btnStart.setText("Check Answers");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane4.setViewportView(txtLog);

        btnGreen.setBackground(new java.awt.Color(102, 255, 102));
        btnGreen.setForeground(new java.awt.Color(0, 204, 0));
        btnGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGreenActionPerformed(evt);
            }
        });

        btnRed.setBackground(new java.awt.Color(255, 51, 51));
        btnRed.setForeground(new java.awt.Color(255, 51, 51));
        btnRed.setToolTipText("");
        btnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedActionPerformed(evt);
            }
        });

        btnBlue.setBackground(new java.awt.Color(0, 0, 255));
        btnBlue.setForeground(new java.awt.Color(0, 0, 255));
        btnBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlueActionPerformed(evt);
            }
        });

        jLabel4.setText("Choose 3");

        btnOrange.setBackground(new java.awt.Color(255, 153, 0));
        btnOrange.setForeground(new java.awt.Color(0, 0, 255));
        btnOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrangeActionPerformed(evt);
            }
        });

        btnYellow.setBackground(new java.awt.Color(255, 255, 0));
        btnYellow.setForeground(new java.awt.Color(255, 255, 0));
        btnYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYellowActionPerformed(evt);
            }
        });

        btnRestart.setText("Restart Game");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRed, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(83, 83, 83)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(121, 121, 121))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRed, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*
    
    COLOR CODE
       VV
    1 = RED
    2 = GREEN
    3 = BLUE
    4 = YELLOW
    5 = ORANGE
    
    
    guessCount is used to count the number of guesses the player has had
    
    */
    
    
    
    // RED SELECTION
    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
        if(guessCount == 0)
        {
            guess1 = 1;
            guessCount += 1;
            txtLog.append("Guess 1 = RED\n");
        }
        else if(guessCount == 1)
        {
            guess2 = 1;
            guessCount += 1;
            txtLog.append("Guess 2 = RED\n");
        }
        else if(guessCount == 2)
        {
            guess3 = 1;
            guessCount += 1;
            txtLog.append("Guess 3 = RED\n");
        }
        else
        {
            guessCount += 100;
        }
    }//GEN-LAST:event_btnRedActionPerformed

    // GREEN SELECTION
    private void btnGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGreenActionPerformed
        if(guessCount == 0)
        {
            guess1 = 2;
            guessCount += 1;
            txtLog.append("Guess 1 = GREEN\n");
        }
        else if(guessCount == 1)
        {
            guess2 = 2;
            guessCount += 1;
            txtLog.append("Guess 2 = GREEN\n");
        }
        else if(guessCount == 2)
        {
            guess3 = 2;
            guessCount += 1;
            txtLog.append("Guess 3 = GREEN\n");
        }
        else
        {
            guessCount += 100;
        }
    }//GEN-LAST:event_btnGreenActionPerformed

    // BLUE SELECTION
    private void btnBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlueActionPerformed
        if(guessCount == 0)
        {
            guess1 = 3;
            guessCount += 1;
            txtLog.append("Guess 1 = BLUE\n");
        }
        else if(guessCount == 1)
        {
            guess2 = 3;
            guessCount += 1;
            txtLog.append("Guess 2 = BLUE\n");
        }
        else if(guessCount == 2)
        {
            guess3 = 3;
            guessCount += 1;
            txtLog.append("Guess 3 = BLUE\n");
        }
        else
        {
            guessCount += 100;
        }
    }//GEN-LAST:event_btnBlueActionPerformed

    // CHECK ANSWERS
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // Assign random numbers to a colour
        if(col1 == 1)
        {
            colArea1.setBackground(Color.red);
            txtLog.append("\nArea 1 = RED\n");
        }
        else if(col1 == 2)
        {
            colArea1.setBackground(Color.green);
            txtLog.append("\nArea 1 = GREEN\n");
        }
        else if(col1 == 3)
        {
            colArea1.setBackground(Color.blue);
            txtLog.append("\nArea 1 = BLUE\n");
        }
        else if(col1 == 4)
        {
            colArea1.setBackground(Color.yellow);
            txtLog.append("\nArea 1 = YELLOW\n");
        }
        else if(col1 == 5)
        {
            colArea1.setBackground(Color.orange);
            txtLog.append("\nArea 1 = ORANGE\n");
        }
        
        if(col2 == 1)
        {
            colArea2.setBackground(Color.red);
            txtLog.append("Area 2 = RED\n");
        }
        else if(col2 == 2)
        {
            colArea2.setBackground(Color.green);
            txtLog.append("Area 2 = GREEN\n");
        }
        else if(col2 == 3)
        {
            colArea2.setBackground(Color.blue);
            txtLog.append("Area 2 = BLUE\n");
        }
        else if(col2 == 4)
        {
            colArea2.setBackground(Color.yellow);
            txtLog.append("Area 2 = YELLOW\n");
        }
        else if(col2 == 5)
        {
            colArea2.setBackground(Color.orange);
            txtLog.append("Area 2 = ORANGE\n");
        }
        
        if(col3 == 1)
        {
            colArea3.setBackground(Color.red);
            txtLog.append("Area 3 = RED\n");
        }
        else if(col3 == 2)
        {
            colArea3.setBackground(Color.green);
            txtLog.append("Area 3 = GREEN\n");
        }
        else if(col3 == 3)
        {
            colArea3.setBackground(Color.blue);
            txtLog.append("Area 3 = BLUE\n");
        }
        else if(col3 == 4)
        {
            colArea3.setBackground(Color.yellow);
            txtLog.append("Area 3 = YELLOW\n");
        }
        else if(col3 == 5)
        {
            colArea3.setBackground(Color.orange);
            txtLog.append("Area 3 = ORANGE\n");
        }
        
        // Check answers
        if(col1 == guess1)
        {
            score++;
            txtLog.append("\nScore = " + score.toString() + "\n");
            txtLog.append("\nYou Win!\n");
            
            if(col2 == guess2)
            {
                score++;
                txtLog.append("\nScore = " + score.toString() + "\n");
                txtLog.append("\nYou Win!\n");
                
                if(col3 == guess3)
                {
                    score++;
                    txtLog.append("\nScore = " + score.toString() + "\n");
                    txtLog.append("\nYou Win!\n");
                }
            }
            else if(col3 == guess3)
            {
                score++;
                txtLog.append("\nScore = " + score.toString() + "\n");
                txtLog.append("\nYou Win!\n");
            }
        }
        else
        {
            txtLog.append("\nScore = 0\n");
            txtLog.append("\nYou Lose!\n");
        }
        txtLog.append("------------------\nGame Over\n------------------\n\n");
        txtLog.append("To play again press 'Restart Game'");
    }//GEN-LAST:event_btnStartActionPerformed

    // YELLOW SELECTION
    private void btnOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrangeActionPerformed
        if(guessCount == 0)
        {
            guess1 = 4;
            guessCount += 1;
            txtLog.append("Guess 1 = YELLOW\n");
        }
        else if(guessCount == 1)
        {
            guess2 = 4;
            guessCount += 1;
            txtLog.append("Guess 2 = YELLOW\n");
        }
        else if(guessCount == 2)
        {
            guess3 = 4;
            guessCount += 1;
            txtLog.append("Guess 3 = YELLOW\n");
        }
        else
        {
            guessCount += 100;
        }
    }//GEN-LAST:event_btnOrangeActionPerformed

    // ORANGE SELECTION
    private void btnYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYellowActionPerformed
        if(guessCount == 0)
        {
            guess1 = 5;
            guessCount += 1;
            txtLog.append("Guess 1 = ORANGE\n");
        }
        else if(guessCount == 1)
        {
            guess2 = 5;
            guessCount += 1;
            txtLog.append("Guess 3 = ORANGE\n");
        }
        else if(guessCount == 2)
        {
            guess3 = 5;
            guessCount += 1;
            txtLog.append("Guess 3 = ORANGE\n");
        }
        else
        {
            guessCount += 100;
        }
    }//GEN-LAST:event_btnYellowActionPerformed

    // RESTART GAME
    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        guess1 = 0;
        guess2 = 0;
        guess3 = 0;
        score = 0;
        guessCount = 0;
        
        txtLog.setText("");
        
        col1 = rng.nextInt(5) + 1;
        col2 = rng.nextInt(5) + 1;
        col3 = rng.nextInt(5) + 1;
        
        colArea1.setBackground(Color.white);
        colArea2.setBackground(Color.white);
        colArea3.setBackground(Color.white);
        
        txtLog.append("Select 3 Colours And Press Check\nAnswers\n\nColours Selected Have to be in the\nCorrect Order\n\n");
    }//GEN-LAST:event_btnRestartActionPerformed

    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlue;
    private javax.swing.JButton btnGreen;
    private javax.swing.JButton btnOrange;
    private javax.swing.JButton btnRed;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnYellow;
    private javax.swing.JTextArea colArea1;
    private javax.swing.JTextArea colArea2;
    private javax.swing.JTextArea colArea3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
}
