/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CulminatingProject;

/**
 *
 * @author anhen3335
 */
// Declares the score variable and the random variable
public class Quiz extends javax.swing.JFrame {
int random = (int) Math.ceil (Math.random()*4);
int score = 0;
int counter = 0;
    /**
     * Creates new form Quiz
     */
    public Quiz() {
        // makes buttons false
        initComponents();
        Button1A.setEnabled(false);
        Button2A.setEnabled(false);
        Button3A.setEnabled(false);
        Button4A.setEnabled(false);
        Button1B.setEnabled(false);
        Button2B.setEnabled(false);
        Button3B.setEnabled(false);
        Button4B.setEnabled(false);
        Button1C.setEnabled(false);
        Button2C.setEnabled(false);
        Button3C.setEnabled(false);
        Button4C.setEnabled(false);
        Button1D.setEnabled(false);
        Button2D.setEnabled(false);
        Button3D.setEnabled(false);
        Button4D.setEnabled(false);
        buttonreturn.setEnabled(false);
        int counter = 0;
        int score = 0;
        System.out.println (random);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelQuizTitle = new javax.swing.JLabel();
        Button1A = new javax.swing.JButton();
        Button1B = new javax.swing.JButton();
        Button1C = new javax.swing.JButton();
        Button1D = new javax.swing.JButton();
        Button2A = new javax.swing.JButton();
        Button2B = new javax.swing.JButton();
        Button2C = new javax.swing.JButton();
        Button2D = new javax.swing.JButton();
        Button3B = new javax.swing.JButton();
        Button3A = new javax.swing.JButton();
        Button3C = new javax.swing.JButton();
        Button3D = new javax.swing.JButton();
        Button4A = new javax.swing.JButton();
        Button4B = new javax.swing.JButton();
        Button4C = new javax.swing.JButton();
        Button4D = new javax.swing.JButton();
        buttonStart = new javax.swing.JButton();
        label1A = new javax.swing.JLabel();
        label2B = new javax.swing.JLabel();
        label1B = new javax.swing.JLabel();
        label2C = new javax.swing.JLabel();
        label1C = new javax.swing.JLabel();
        label1D = new javax.swing.JLabel();
        label2A = new javax.swing.JLabel();
        label4D = new javax.swing.JLabel();
        label2D = new javax.swing.JLabel();
        label4A = new javax.swing.JLabel();
        label3D = new javax.swing.JLabel();
        label3B = new javax.swing.JLabel();
        label4B = new javax.swing.JLabel();
        label4C = new javax.swing.JLabel();
        label3A = new javax.swing.JLabel();
        label3C = new javax.swing.JLabel();
        label1Q = new javax.swing.JLabel();
        label2Q = new javax.swing.JLabel();
        label3Q = new javax.swing.JLabel();
        label4Q = new javax.swing.JLabel();
        labelScore = new javax.swing.JLabel();
        labelScorenum = new javax.swing.JLabel();
        buttonreturn = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelQuizTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelQuizTitle.setText("Quiz");
        jPanel1.add(LabelQuizTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 6, -1, 49));

        Button1A.setText("A");
        Button1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1AActionPerformed(evt);
            }
        });
        jPanel1.add(Button1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 151, -1, -1));

        Button1B.setText("B");
        Button1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1BActionPerformed(evt);
            }
        });
        jPanel1.add(Button1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 185, -1, -1));

        Button1C.setText("C");
        Button1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1CActionPerformed(evt);
            }
        });
        jPanel1.add(Button1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, -1, -1));

        Button1D.setText("D");
        Button1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1DActionPerformed(evt);
            }
        });
        jPanel1.add(Button1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 243, -1, -1));

        Button2A.setText("A");
        Button2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2AActionPerformed(evt);
            }
        });
        jPanel1.add(Button2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 355, 41, -1));

        Button2B.setText("B");
        Button2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2BActionPerformed(evt);
            }
        });
        jPanel1.add(Button2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 387, 41, -1));

        Button2C.setText("C");
        Button2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2CActionPerformed(evt);
            }
        });
        jPanel1.add(Button2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 422, 41, -1));

        Button2D.setText("D");
        Button2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2DActionPerformed(evt);
            }
        });
        jPanel1.add(Button2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 451, 41, -1));

        Button3B.setText("B");
        Button3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3BActionPerformed(evt);
            }
        });
        jPanel1.add(Button3B, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        Button3A.setText("A");
        Button3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3AActionPerformed(evt);
            }
        });
        jPanel1.add(Button3A, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        Button3C.setText("C");
        Button3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3CActionPerformed(evt);
            }
        });
        jPanel1.add(Button3C, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        Button3D.setText("D");
        Button3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3DActionPerformed(evt);
            }
        });
        jPanel1.add(Button3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        Button4A.setText("A");
        Button4A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4AActionPerformed(evt);
            }
        });
        jPanel1.add(Button4A, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        Button4B.setText("B");
        Button4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4BActionPerformed(evt);
            }
        });
        jPanel1.add(Button4B, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, 20));

        Button4C.setText("C");
        Button4C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4CActionPerformed(evt);
            }
        });
        jPanel1.add(Button4C, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        Button4D.setText("D");
        Button4D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4DActionPerformed(evt);
            }
        });
        jPanel1.add(Button4D, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        buttonStart.setText("Start");
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartActionPerformed(evt);
            }
        });
        jPanel1.add(buttonStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 25, -1, -1));

        label1A.setText(" ");
        jPanel1.add(label1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 155, 180, -1));
        jPanel1.add(label2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 388, 180, 23));
        jPanel1.add(label1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 185, 180, 23));
        jPanel1.add(label2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 422, 190, 22));

        label1C.setText(" ");
        jPanel1.add(label1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 218, 180, -1));

        label1D.setText(" ");
        jPanel1.add(label1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 247, 180, -1));

        label2A.setText(" ");
        jPanel1.add(label2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 359, 190, 22));
        jPanel1.add(label4D, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 240, 22));
        jPanel1.add(label2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 452, 200, 22));
        jPanel1.add(label4A, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 160, 20));
        jPanel1.add(label3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 270, 22));
        jPanel1.add(label3B, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 270, 20));
        jPanel1.add(label4B, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 180, 22));
        jPanel1.add(label4C, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 180, 22));
        jPanel1.add(label3A, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 260, 22));
        jPanel1.add(label3C, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 280, 22));

        label1Q.setText(" ");
        jPanel1.add(label1Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 280, 20));
        jPanel1.add(label2Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 60));

        label3Q.setText(" ");
        jPanel1.add(label3Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 310, 20));

        label4Q.setText(" ");
        jPanel1.add(label4Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 290, 20));

        labelScore.setText("Score");
        jPanel1.add(labelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));
        jPanel1.add(labelScorenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        buttonreturn.setText("Return");
        buttonreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonreturnActionPerformed(evt);
            }
        });
        jPanel1.add(buttonreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartActionPerformed
      // makes buttons work
        buttonStart.setEnabled(false);
        Button1A.setEnabled(true);
        Button2A.setEnabled(true);
        Button3A.setEnabled(true);
        Button4A.setEnabled(true);
        Button1B.setEnabled(true);
        Button2B.setEnabled(true);
        Button3B.setEnabled(true);
        Button4B.setEnabled(true);
        Button1C.setEnabled(true);
        Button2C.setEnabled(true);
        Button3C.setEnabled(true);
        Button4C.setEnabled(true);
        Button1D.setEnabled(true);
        Button2D.setEnabled(true);
        Button3D.setEnabled(true);
        Button4D.setEnabled(true);
       // decides which set of Questions will be presented
        if (random == 1){
        label1Q.setText ("The first Battle of El Alamein was defending");
        label1A.setText ("Alexandria");
        label1B.setText ("Rhine");
        label1C.setText ("Rainbows");
        label1D.setText ("Normandy");
        label2Q.setText ("Who won the Battle of Caen");
        label2A.setText ("Allies");
        label2B.setText ("Axis");
        label2C.setText ("Stalemate");
        label2D.setText ("Seth");
        label3Q.setText ("How many Allied troops died at the battle of the Bulge");
        label3A.setText ("146 000");
        label3B.setText ("125 000");
        label3C.setText ("15 000");
        label3D.setText ("-1");
        label4Q.setText ("Which Allied member participated in the most battles");
        label4A.setText ("Canada");
        label4B.setText ("United Kingdom");
        label4C.setText ("United States");
        label4D.setText ("The Empire of Racecar Driving Spain");   
        }
        else if (random == 2){
        label1Q.setText ("Which leader was at the Batte of Caen");
        label1A.setText ("Walter Model");
        label1B.setText ("Dwight D. Eisenhower");
        label1C.setText ("Douglas MacArthur");
        label1D.setText ("Miles Dempsey");
        label2Q.setText ("How many casuelties were there at the Bulge, total");
        label2A.setText ("125000");
        label2B.setText ("2710000");
        label2C.setText ("2");
        label2D.setText ("146000");
        label3Q.setText ("Which nation did not participate at the Bulge");
        label3A.setText ("Canada");
        label3B.setText ("Nazi Germany");
        label3C.setText ("Kingdom of Italy");
        label3D.setText ("Luxembourg");
        label4Q.setText ("Which nation participated at El Alamein");
        label4A.setText ("Canada");
        label4B.setText ("Australia");
        label4C.setText ("The Empire of Japan");
        label4D.setText ("United States");  
        }
        else if (random == 3){
        label1Q.setText ("Which Axis leaders participated in the most battles");
        label1A.setText ("Erwin Rommel");
        label1B.setText ("Walter Model");
        label1C.setText ("Friedrich Dollmann");
        label1D.setText ("Adolf Hitler");
        label2Q.setText ("When did the battle of the Bulge end");
        label2A.setText ("25 Jan 1945");
        label2B.setText ("16 Dec 1944");
        label2C.setText ("14 Jan 1945");
        label2D.setText ("9 Feb 2001");
        label3Q.setText ("The victors of El Alamein was");
        label3A.setText ("Allies");
        label3B.setText ("Stalemate");
        label3C.setText ("a fedora");
        label3D.setText ("Axis");
        label4Q.setText ("Who participated in the battle at Caen");
        label4A.setText ("Belgium");
        label4B.setText ("France");
        label4C.setText ("Canada");
        label4D.setText ("Some random country");   
        }
        else if (random == 4){
        label1Q.setText ("Who won the battle of the Bulge");
        label1A.setText ("Allies");
        label1B.setText ("Axis");
        label1C.setText ("Stalemate");
        label1D.setText ("it is still happeing");
        label2Q.setText ("When did the battle for Caen begin");
        label2A.setText ("6 June 1944");
        label2B.setText ("6 August 1944");
        label2C.setText ("6 June 1945");
        label2D.setText ("Yesterday");
        label3Q.setText ("What best describe the battle of the Bulge");
        label3A.setText ("A final German attempt at a offensive");
        label3B.setText ("Tasty");
        label3C.setText ("A desperate Defense of a vital position");
        label3D.setText ("A vital battle for the capture of a city");
        label4Q.setText ("Who did not participate at El Alamein");
        label4A.setText ("British Raj");
        label4B.setText ("New Zealand");
        label4C.setText ("South Africa");
        label4D.setText ("France");
        }
        
    }//GEN-LAST:event_buttonStartActionPerformed
// All the buttons check if their buttons is correct for the set of questions asked
    private void Button4AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4AActionPerformed
        if (random == 1){
            score = score +0;     
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
            score = score +0;     
        }
        else if (random == 4){
             score = score +0;    
        }
        Button4A.setEnabled(false);
        Button4B.setEnabled(false);
        Button4C.setEnabled(false);
        Button4D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button4AActionPerformed

    private void Button3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3DActionPerformed
        if (random == 1){
             score = score +0;    
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
          score = score +0;       
        }
        else if (random == 4){
          score = score +0;       
        }
        Button3A.setEnabled(false);
        Button3B.setEnabled(false);
        Button3C.setEnabled(false);
        Button3D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button3DActionPerformed

    private void Button3CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3CActionPerformed
         if (random == 1){
           score = score +0;      
        }
        else if (random == 2){
         score++;    
    }
        else if (random == 3){
           score = score +0;    
        }
        else if (random == 4){
            score = score +0;     
        }
         Button3A.setEnabled(false);
        Button3B.setEnabled(false);
        Button3C.setEnabled(false);
        Button3D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button3CActionPerformed

    private void Button3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3AActionPerformed
         if (random == 1){
             score++;   
        }
        else if (random == 2){
         score = score +0;     
    }
        else if (random == 3){
         score++; 
        }
        else if (random == 4){
        score++;  
        }
         Button3A.setEnabled(false);
        Button3B.setEnabled(false);
        Button3C.setEnabled(false);
        Button3D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button3AActionPerformed

    private void Button3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3BActionPerformed
         if (random == 1){
             score = score +0;    
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
            score = score +0;     
        }
        else if (random == 4){
            score = score +0;     
        }
         Button3A.setEnabled(false);
        Button3B.setEnabled(false);
        Button3C.setEnabled(false);
        Button3D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button3BActionPerformed

    private void Button2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2DActionPerformed
         if (random == 1){
            score = score +0;     
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
           score = score +0;      
        }
        else if (random == 4){
          score = score +0;       
        }
         Button2A.setEnabled(false);
        Button2B.setEnabled(false);
        Button2C.setEnabled(false);
        Button2D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button2DActionPerformed

    private void Button2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2BActionPerformed
         if (random == 1){
           score = score +0;      
        }
        else if (random == 2){
        score++;
    }
        else if (random == 3){
             score = score +0;    
        }
        else if (random == 4){
             score = score +0;    
        }
         Button2A.setEnabled(false);
        Button2B.setEnabled(false);
        Button2C.setEnabled(false);
        Button2D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button2BActionPerformed

    private void Button2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2AActionPerformed
         if (random == 1){
         score++;
        }
        else if (random == 2){
        score = score +0;
    }
        else if (random == 3){
         score++;   
        }
        else if (random == 4){
         score++;
        }
         Button2A.setEnabled(false);
        Button2B.setEnabled(false);
        Button2C.setEnabled(false);
        Button2D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button2AActionPerformed

    private void Button1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1DActionPerformed
         if (random == 1){
            score = score +0;     
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
         score = score +0;        
        }
        else if (random == 4){
           score++; 
        }
         Button1A.setEnabled(false);
        Button1B.setEnabled(false);
        Button1C.setEnabled(false);
        Button1D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button1DActionPerformed

    private void Button1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1CActionPerformed
         if (random == 1){
           score = score +0;    
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
             score = score +0;    
        }
        else if (random == 4){
             score = score +0;    
        }
         Button1A.setEnabled(false);
        Button1B.setEnabled(false);
        Button1C.setEnabled(false);
        Button1D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button1CActionPerformed

    private void Button1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1AActionPerformed
         if (random == 1){
          score ++;  
        }
        else if (random == 2){
        score = score +0;
    }
        else if (random == 3){
         score++;   
        }
        else if (random == 4){
        score++;   
        }
         Button1A.setEnabled(false);
        Button1B.setEnabled(false);
        Button1C.setEnabled(false);
        Button1D.setEnabled(false);
        counter ++;
        Score (counter);
        
    }//GEN-LAST:event_Button1AActionPerformed

    private void Button1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1BActionPerformed
        if (random == 1){
          score = score +0;     
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
           score = score +0;      
        }
        else if (random == 4){
          score = score +0;       
        }
        Button1A.setEnabled(false);
        Button1B.setEnabled(false);
        Button1C.setEnabled(false);
        Button1D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button1BActionPerformed

    private void Button2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2CActionPerformed
         if (random == 1){
            score = score +0;     
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
          score = score +0;       
        }
        else if (random == 4){
         score = score +0;        
        }
         Button2A.setEnabled(false);
        Button2B.setEnabled(false);
        Button2C.setEnabled(false);
        Button2D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button2CActionPerformed

    private void Button4BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4BActionPerformed
         if (random == 1){
             score++;   
        }
        else if (random == 2){
         score++;  
    }
        else if (random == 3){
          score = score +0;       
        }
        else if (random == 4){
         score = score +0;        
        }
         Button4A.setEnabled(false);
        Button4B.setEnabled(false);
        Button4C.setEnabled(false);
        Button4D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button4BActionPerformed

    private void Button4CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4CActionPerformed
         if (random == 1){
             score = score +0;    
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
          score++;  
        }
        else if (random == 4){
          score = score +0;       
        }
         Button4A.setEnabled(false);
        Button4B.setEnabled(false);
        Button4C.setEnabled(false);
        Button4D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button4CActionPerformed

    private void Button4DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4DActionPerformed
         if (random == 1){
             score = score +0;    
        }
        else if (random == 2){
         score = score +0;    
    }
        else if (random == 3){
           score = score +0;      
        }
        else if (random == 4){
          score++;  
        }
         Button4A.setEnabled(false);
        Button4B.setEnabled(false);
        Button4C.setEnabled(false);
        Button4D.setEnabled(false);
        counter ++;
        Score (counter);
    }//GEN-LAST:event_Button4DActionPerformed

    private void buttonreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonreturnActionPerformed
         this.setVisible(false);
        new CulminatingProjectForm().setVisible(true);
    }//GEN-LAST:event_buttonreturnActionPerformed
public Integer Score(Integer Counter){
 if (Counter == 4){
    labelScorenum.setText (Integer.toString(score));
    buttonreturn.setEnabled(true);
 }   
 return 0;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1A;
    private javax.swing.JButton Button1B;
    private javax.swing.JButton Button1C;
    private javax.swing.JButton Button1D;
    private javax.swing.JButton Button2A;
    private javax.swing.JButton Button2B;
    private javax.swing.JButton Button2C;
    private javax.swing.JButton Button2D;
    private javax.swing.JButton Button3A;
    private javax.swing.JButton Button3B;
    private javax.swing.JButton Button3C;
    private javax.swing.JButton Button3D;
    private javax.swing.JButton Button4A;
    private javax.swing.JButton Button4B;
    private javax.swing.JButton Button4C;
    private javax.swing.JButton Button4D;
    private javax.swing.JLabel LabelQuizTitle;
    private javax.swing.JButton buttonStart;
    private javax.swing.JButton buttonreturn;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel label1A;
    private javax.swing.JLabel label1B;
    private javax.swing.JLabel label1C;
    private javax.swing.JLabel label1D;
    private javax.swing.JLabel label1Q;
    private javax.swing.JLabel label2A;
    private javax.swing.JLabel label2B;
    private javax.swing.JLabel label2C;
    private javax.swing.JLabel label2D;
    private javax.swing.JLabel label2Q;
    private javax.swing.JLabel label3A;
    private javax.swing.JLabel label3B;
    private javax.swing.JLabel label3C;
    private javax.swing.JLabel label3D;
    private javax.swing.JLabel label3Q;
    private javax.swing.JLabel label4A;
    private javax.swing.JLabel label4B;
    private javax.swing.JLabel label4C;
    private javax.swing.JLabel label4D;
    private javax.swing.JLabel label4Q;
    private javax.swing.JLabel labelScore;
    private javax.swing.JLabel labelScorenum;
    // End of variables declaration//GEN-END:variables
}
