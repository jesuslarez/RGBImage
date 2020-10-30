package view;

import model.Canvas;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setLookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPositionButtonGroup = new javax.swing.ButtonGroup();
        tittleJLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        allJCheckBox = new javax.swing.JCheckBox();
        redJCheckBox = new javax.swing.JCheckBox();
        blueJCheckBox = new javax.swing.JCheckBox();
        greenJCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        topLeftJRadioButton = new javax.swing.JRadioButton();
        bottomLeftJRadioButton = new javax.swing.JRadioButton();
        topRightJRadioButton = new javax.swing.JRadioButton();
        bottomRightJRadioButton = new javax.swing.JRadioButton();
        canvas = new model.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tittleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittleJLabel.setText("RGB Image");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Colour Filter"));

        allJCheckBox.setSelected(true);
        allJCheckBox.setText("All");
        allJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allJCheckBoxActionPerformed(evt);
            }
        });

        redJCheckBox.setSelected(true);
        redJCheckBox.setText("Red");
        redJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redJCheckBoxActionPerformed(evt);
            }
        });

        blueJCheckBox.setSelected(true);
        blueJCheckBox.setText("Blue");
        blueJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueJCheckBoxActionPerformed(evt);
            }
        });

        greenJCheckBox.setSelected(true);
        greenJCheckBox.setText("Green");
        greenJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenJCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(allJCheckBox)
                        .addGap(28, 28, 28)
                        .addComponent(redJCheckBox))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(greenJCheckBox)
                        .addGap(8, 8, 8)
                        .addComponent(blueJCheckBox)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allJCheckBox)
                    .addComponent(redJCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueJCheckBox)
                    .addComponent(greenJCheckBox))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Logo Position"));

        logoPositionButtonGroup.add(topLeftJRadioButton);
        topLeftJRadioButton.setText("Top Left");
        topLeftJRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                topLeftJRadioButtonStateChanged(evt);
            }
        });

        logoPositionButtonGroup.add(bottomLeftJRadioButton);
        bottomLeftJRadioButton.setText("Bottom Left");
        bottomLeftJRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bottomLeftJRadioButtonStateChanged(evt);
            }
        });

        logoPositionButtonGroup.add(topRightJRadioButton);
        topRightJRadioButton.setSelected(true);
        topRightJRadioButton.setText("Top Right");
        topRightJRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                topRightJRadioButtonStateChanged(evt);
            }
        });

        logoPositionButtonGroup.add(bottomRightJRadioButton);
        bottomRightJRadioButton.setText("Bottom Right");
        bottomRightJRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bottomRightJRadioButtonStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottomLeftJRadioButton)
                    .addComponent(topLeftJRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topRightJRadioButton)
                    .addComponent(bottomRightJRadioButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topLeftJRadioButton)
                    .addComponent(topRightJRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottomLeftJRadioButton)
                    .addComponent(bottomRightJRadioButton))
                .addGap(15, 15, 15))
        );

        canvas.setPreferredSize(new java.awt.Dimension(300, 400));

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tittleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittleJLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topLeftJRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_topLeftJRadioButtonStateChanged
        if (topLeftJRadioButton.isSelected()) {
            canvas.setLogoPosition(0);
            repaint();
        }
    }//GEN-LAST:event_topLeftJRadioButtonStateChanged

    private void topRightJRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_topRightJRadioButtonStateChanged
        if (topRightJRadioButton.isSelected()) {
            canvas.setLogoPosition(1);
            repaint();
        }
    }//GEN-LAST:event_topRightJRadioButtonStateChanged

    private void bottomLeftJRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bottomLeftJRadioButtonStateChanged
        if (bottomLeftJRadioButton.isSelected()) {
            canvas.setLogoPosition(2);
            repaint();
        }
    }//GEN-LAST:event_bottomLeftJRadioButtonStateChanged

    private void bottomRightJRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bottomRightJRadioButtonStateChanged
        if (bottomRightJRadioButton.isSelected()) {
            canvas.setLogoPosition(3);
            repaint();
        }
    }//GEN-LAST:event_bottomRightJRadioButtonStateChanged

    private void allJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allJCheckBoxActionPerformed
        if (allJCheckBox.isSelected()) {
            canvas.setRed(true);
            canvas.setBlue(true);
            canvas.setGreen(true);
            redJCheckBox.setSelected(true);
            blueJCheckBox.setSelected(true);
            greenJCheckBox.setSelected(true);
            repaint();
        }else{
            allJCheckBox.setSelected(true);
        }
    }//GEN-LAST:event_allJCheckBoxActionPerformed

    private void redJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redJCheckBoxActionPerformed
        if (redJCheckBox.isSelected()) {
            canvas.setRed(true);
        } else if (greenJCheckBox.isSelected() || blueJCheckBox.isSelected()) {
            canvas.setRed(false);
            allJCheckBox.setSelected(false);
        }else{
            redJCheckBox.setSelected(true);
        }
        repaint();
    }//GEN-LAST:event_redJCheckBoxActionPerformed

    private void blueJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueJCheckBoxActionPerformed
        if (blueJCheckBox.isSelected()) {
            canvas.setBlue(true);
        } else if (greenJCheckBox.isSelected() || redJCheckBox.isSelected()){
            canvas.setBlue(false);
            allJCheckBox.setSelected(false);
        }else{
            blueJCheckBox.setSelected(true);
        }
        repaint();
    }//GEN-LAST:event_blueJCheckBoxActionPerformed

    private void greenJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenJCheckBoxActionPerformed
        if (greenJCheckBox.isSelected()) {
            canvas.setGreen(true);
        } else if (redJCheckBox.isSelected() || blueJCheckBox.isSelected()){
            canvas.setGreen(false);
            allJCheckBox.setSelected(false);
        }else{
            greenJCheckBox.setSelected(true);
        }
        repaint();
    }//GEN-LAST:event_greenJCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allJCheckBox;
    private javax.swing.JCheckBox blueJCheckBox;
    private javax.swing.JRadioButton bottomLeftJRadioButton;
    private javax.swing.JRadioButton bottomRightJRadioButton;
    private model.Canvas canvas;
    private javax.swing.JCheckBox greenJCheckBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.ButtonGroup logoPositionButtonGroup;
    private javax.swing.JCheckBox redJCheckBox;
    private javax.swing.JLabel tittleJLabel;
    private javax.swing.JRadioButton topLeftJRadioButton;
    private javax.swing.JRadioButton topRightJRadioButton;
    // End of variables declaration//GEN-END:variables

    private void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
