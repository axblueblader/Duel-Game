/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duelgame;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Blu
 */
public class GameUI extends javax.swing.JFrame {

    /**
     * Creates new form GameUI
     */
    public GameUI() {
        initComponents();
        initKeyBindings();
        initButtonTexts();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        changesPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botHealthChangesLabel = new javax.swing.JLabel();
        playerHealthChangesLabel = new javax.swing.JLabel();
        playerManaChangesLabel = new javax.swing.JLabel();
        botManaChangesLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        guidePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        slashButton = new javax.swing.JButton();
        shieldButton = new javax.swing.JButton();
        channelButton = new javax.swing.JButton();
        blastButton = new javax.swing.JButton();
        lockButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botHealthText = new javax.swing.JTextField();
        botActionText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        botManaText = new javax.swing.JTextField();
        botShieldText = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        humanHealthText = new javax.swing.JTextField();
        humanActionText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        humanManaText = new javax.swing.JTextField();
        humanShieldText = new javax.swing.JTextField();
        roundPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        roundNum = new javax.swing.JLabel();
        guideButton = new javax.swing.JButton();

        changesPanel.setLayout(new java.awt.GridBagLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Player");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        changesPanel.add(jLabel3, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bot");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        changesPanel.add(jLabel4, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("damage taken");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        changesPanel.add(jLabel7, gridBagConstraints);

        botHealthChangesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botHealthChangesLabel.setText("jLabel3");
        botHealthChangesLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        changesPanel.add(botHealthChangesLabel, gridBagConstraints);

        playerHealthChangesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerHealthChangesLabel.setText("jLabel3");
        playerHealthChangesLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        changesPanel.add(playerHealthChangesLabel, gridBagConstraints);

        playerManaChangesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerManaChangesLabel.setText("jLabel3");
        playerManaChangesLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        changesPanel.add(playerManaChangesLabel, gridBagConstraints);

        botManaChangesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botManaChangesLabel.setText("jLabel3");
        botManaChangesLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        changesPanel.add(botManaChangesLabel, gridBagConstraints);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("mana changes");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        changesPanel.add(jLabel12, gridBagConstraints);

        guidePanel.setMinimumSize(new java.awt.Dimension(550, 550));
        guidePanel.setPreferredSize(new java.awt.Dimension(550, 550));
        guidePanel.setLayout(new javax.swing.BoxLayout(guidePanel, javax.swing.BoxLayout.LINE_AXIS));

        jTextPane2.setContentType("text/html"); // NOI18N
        jTextPane2.setText("<html>\r\n  <head>\n\n<style type=\"text/css\">\n.tg  {border-collapse:collapse;border-spacing:0;}\n.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}\n.tg .tg-c3ow{border-color:inherit;text-align:center;vertical-align:top}\n.tg .tg-wp8o{border-color:#000000;text-align:center;vertical-align:top}\n</style>\r\n  </head>\r\n  <body>\r\n    <h2>Welcome to the Duel Game</h2>\n    <p style=\"margin-top: 0\">\r\n      <h3>How to play</h3>\nYou're goal is to defeat the enemy before 10 rounds.<br>\nEach round, you can choose between 4 choices.<br>\n<h3>1. SLASH:</h3>\nDeals 2 damage to enemy\n<br>Deals 1 damage to enemy, if enemy use SLASH aswell<br>\n<h3>2. SHIELD:</h3>\nCan block damage from SLASH\n<br>After SHIELD 2 times, it takes 1 turn to recharge<br>\n<h3>3. CHANNEL:</h3>\nIncrease your MANA by 1\n<h3>4. BLAST:</h3>\nRequires 2 MANA to use\n<br>Deals 3 damage to enemy, and block SLASH aswell\n<br><h3>Table for reference in damage taken:</h3>\n    </p>\r\n<table class=\"tg\">\n  <tr>\n    <th class=\"tg-c3ow\"></th>\n    <th class=\"tg-c3ow\">SLASH</th>\n    <th class=\"tg-c3ow\">SHIELD</th>\n    <th class=\"tg-c3ow\">CHANNEL</th>\n    <th class=\"tg-c3ow\">BLAST</th>\n  </tr>\n  <tr>\n    <td class=\"tg-c3ow\">SLASH</td>\n    <td class=\"tg-c3ow\">1</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-c3ow\">3</td>\n  </tr>\n  <tr>\n    <td class=\"tg-c3ow\">SHIELD</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-c3ow\">3</td>\n  </tr>\n  <tr>\n    <td class=\"tg-c3ow\">CHANNEL</td>\n    <td class=\"tg-c3ow\">2</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-c3ow\">3</td>\n  </tr>\n  <tr>\n    <td class=\"tg-c3ow\">BLAST</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-c3ow\">0</td>\n    <td class=\"tg-wp8o\">3</td>\n  </tr>\n</table>\n  </body>\r\n</html>\r\n");
        jScrollPane3.setViewportView(jTextPane2);

        guidePanel.add(jScrollPane3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DUEL GAME");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("mainGameFrame"); // NOI18N

        slashButton.setText("SLASH");
        slashButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slashButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        slashButton.setMultiClickThreshhold(2L);
        slashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slashButtonActionPerformed(evt);
            }
        });

        shieldButton.setText("SHIELD");
        shieldButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shieldButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        shieldButton.setMultiClickThreshhold(2L);
        shieldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shieldButtonActionPerformed(evt);
            }
        });

        channelButton.setText("CHANNEL");
        channelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        channelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        channelButton.setMultiClickThreshhold(2L);
        channelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                channelButtonActionPerformed(evt);
            }
        });

        blastButton.setText("BLAST");
        blastButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        blastButton.setDefaultCapable(false);
        blastButton.setEnabled(false);
        blastButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blastButton.setMultiClickThreshhold(2L);
        blastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blastButtonActionPerformed(evt);
            }
        });

        lockButton.setText("LOCK CHOICE AND CONTINUE");
        lockButton.setMultiClickThreshhold(2L);
        lockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(slashButton, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shieldButton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(channelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blastButton, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lockButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shieldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(channelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blastButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel3.setLayout(new java.awt.GridLayout(4, 2, 5, 5));

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Health");
        jPanel3.add(jLabel8);

        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Action");
        jPanel3.add(jLabel9);

        botHealthText.setEditable(false);
        botHealthText.setForeground(new java.awt.Color(204, 0, 0));
        botHealthText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        botHealthText.setText("0");
        botHealthText.setFocusable(false);
        jPanel3.add(botHealthText);

        botActionText.setEditable(false);
        botActionText.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botActionText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        botActionText.setText("-------------");
        botActionText.setFocusable(false);
        botActionText.setMaximumSize(new java.awt.Dimension(69, 22));
        botActionText.setMinimumSize(new java.awt.Dimension(69, 22));
        botActionText.setPreferredSize(new java.awt.Dimension(69, 22));
        jPanel3.add(botActionText);

        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mana");
        jPanel3.add(jLabel10);

        jLabel11.setForeground(new java.awt.Color(51, 204, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Shield");
        jPanel3.add(jLabel11);

        botManaText.setEditable(false);
        botManaText.setForeground(new java.awt.Color(0, 102, 204));
        botManaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        botManaText.setText("0");
        botManaText.setFocusable(false);
        jPanel3.add(botManaText);

        botShieldText.setEditable(false);
        botShieldText.setForeground(new java.awt.Color(51, 204, 0));
        botShieldText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        botShieldText.setText("0");
        botShieldText.setFocusable(false);
        jPanel3.add(botShieldText);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 2, 5, 5));

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Health");
        jPanel2.add(jLabel1);

        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Action");
        jPanel2.add(jLabel2);

        humanHealthText.setEditable(false);
        humanHealthText.setForeground(new java.awt.Color(204, 0, 0));
        humanHealthText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        humanHealthText.setText("0");
        humanHealthText.setFocusable(false);
        jPanel2.add(humanHealthText);

        humanActionText.setEditable(false);
        humanActionText.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        humanActionText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        humanActionText.setText("-------------");
        humanActionText.setToolTipText("");
        humanActionText.setFocusable(false);
        humanActionText.setMaximumSize(new java.awt.Dimension(69, 22));
        humanActionText.setMinimumSize(new java.awt.Dimension(69, 22));
        humanActionText.setPreferredSize(new java.awt.Dimension(69, 22));
        jPanel2.add(humanActionText);

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mana");
        jPanel2.add(jLabel5);

        jLabel6.setForeground(new java.awt.Color(51, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Shield");
        jPanel2.add(jLabel6);

        humanManaText.setEditable(false);
        humanManaText.setForeground(new java.awt.Color(0, 102, 204));
        humanManaText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        humanManaText.setText("0");
        humanManaText.setFocusable(false);
        jPanel2.add(humanManaText);

        humanShieldText.setEditable(false);
        humanShieldText.setForeground(new java.awt.Color(51, 204, 0));
        humanShieldText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        humanShieldText.setText("0");
        humanShieldText.setFocusable(false);
        jPanel2.add(humanShieldText);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ROUND");

        roundNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        roundNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roundNum.setText("0/0");
        roundNum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roundNum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        roundNum.setFocusable(false);

        guideButton.setText("GUIDE");
        guideButton.setFocusable(false);
        guideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanelLayout = new javax.swing.GroupLayout(roundPanel);
        roundPanel.setLayout(roundPanelLayout);
        roundPanelLayout.setHorizontalGroup(
            roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanelLayout.setVerticalGroup(
            roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundNum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Constants for action names
    private static final String[] ACTION_NAME = {"SLASH", "SHIELD", "CHANNEL", "BLAST", "IDLE"};
    
    // Constants for action index
    private static final int SLASH_ACTION_INDEX = 0;
    private static final int SHIELD_ACTION_INDEX = 1;
    private static final int CHANNEL_ACTION_INDEX = 2;
    private static final int BLAST_ACTION_INDEX = 3;
    
    // Constants for hotkeys
    private static final String SLASH_KEY = "Z";
    private static final String SHIELD_KEY = "X";
    private static final String CHANNEL_KEY = "C";
    private static final String BLAST_KEY = "F";
    private static final String LOCK_KEY = "V";
    private static final String GUIDE_KEY = "G";
    
    // CLASS LIKE THIS / CONSTANTS / ENUMS : which is better?
    public final class Properties {
        private static final int HEALTH = 0;
        private static final int MANA = 1; 
        private static final int SHIELD = 2;
        private Properties() {};
    }
    
    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    
    private void updateRound() {
        roundNum.setText(game.getRoundCount() + "/" + DuelGame.MAX_ROUND );
    }
    private final Action lockAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // lock choice and continue
            lockButtonActionPerformed(e);
            }
        };
    
    private final Action openGuide = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,guidePanel,"Guide",
                                        JOptionPane.PLAIN_MESSAGE);
        }
    };
    
    private class chooseAction extends AbstractAction{
        private final int actionIndex;
        chooseAction(int actionIdx){
            actionIndex = actionIdx;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            updateChoice(actionIndex);
            JButton btn = (JButton) e.getSource();
            btn.requestFocusInWindow();
        }
    };
    
    private void initButtonTexts() {
        lockButton.setText( lockButton.getText() + "(" + LOCK_KEY + ")");
        slashButton.setText( slashButton.getText() + "(" + SLASH_KEY + ")");
        shieldButton.setText( shieldButton.getText() + "(" + SHIELD_KEY + ")" );
        channelButton.setText( channelButton.getText() + "(" + CHANNEL_KEY + ")");
        blastButton.setText( blastButton.getText() + "(" + BLAST_KEY + ")");
        guideButton.setText( guideButton.getText() + "(" + GUIDE_KEY + ")");
        JOptionPane.showMessageDialog(null,guidePanel,"Guide",
                                        JOptionPane.PLAIN_MESSAGE);
    }
    
    private void initKeyBindings() { 
        setKeyBindings(lockButton,LOCK_KEY,"lockChoice",lockAction);
        setKeyBindings(slashButton,SLASH_KEY,"slashChoice",new chooseAction(SLASH_ACTION_INDEX));
        setKeyBindings(shieldButton,SHIELD_KEY,"shieldChoice",new chooseAction(SHIELD_ACTION_INDEX));
        setKeyBindings(channelButton,CHANNEL_KEY,"channelChoice",new chooseAction(CHANNEL_ACTION_INDEX));
        setKeyBindings(blastButton,BLAST_KEY,"blastChoice",new chooseAction(BLAST_ACTION_INDEX));
        setKeyBindings(guideButton,GUIDE_KEY,"openGuide",openGuide);
    }
    
    public void setKeyBindings(JButton button,String key, String name, Action action){
      button.getInputMap(IFW).put(KeyStroke.getKeyStroke(key), name);
      button.getActionMap().put(name,action);
    };
    
    
    public void showChanges() {
        int[] humanChanges = game.getPlayerChanges(DuelGame.HUMAN);
        int[] botChanges = game.getPlayerChanges(DuelGame.BOT);
        playerHealthChangesLabel.setText("" + humanChanges[Properties.HEALTH]);
        // a.setText(""+changes["key"]);
        playerManaChangesLabel.setText("" + humanChanges[Properties.MANA]);
        botHealthChangesLabel.setText("" + botChanges[Properties.HEALTH]);
        botManaChangesLabel.setText("" + botChanges[Properties.MANA]);
        JOptionPane.showMessageDialog(null,changesPanel,"Result of actions",
                                        JOptionPane.PLAIN_MESSAGE);
      /*
        JOptionPane.showMessageDialog(new JFrame(),
                message,
                "Result of actions",
                JOptionPane.PLAIN_MESSAGE);
        */
      
    }
    public void showProperties() {
        int[] botProperties = game.getPlayerProperties(DuelGame.BOT);
        int[] humanProperties = game.getPlayerProperties(DuelGame.HUMAN);
        JTextField [] humanTexts = {humanHealthText,humanManaText,humanShieldText};
        JTextField [] botTexts = {botHealthText,botManaText,botShieldText};
        updatePropertiesText(humanTexts,humanProperties);
        updatePropertiesText(botTexts,botProperties);
    }
    
    public void updatePropertiesText(JTextField [] textField, int [] properties) {
        textField[Properties.HEALTH].setText("" + properties[Properties.HEALTH]);
        textField[Properties.MANA].setText("" + properties[Properties.MANA]);
        textField[Properties.SHIELD].setText("" + properties[Properties.SHIELD]);
    }

    public void updateButtons() {
        shieldButton.setEnabled(game.shieldEnabled());
        blastButton.setEnabled(game.blastEnabled());
        //channelButton.setEnabled(game.channelEnabled());
    }

    public void updateChoice(int actionIdx) {
        game.setHumanAction(actionIdx);
        humanActionText.setText(ACTION_NAME[game.getActionIdx(DuelGame.HUMAN)]);
        showProperties();
    }

    
    private void slashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slashButtonActionPerformed
        updateChoice(SLASH_ACTION_INDEX);
    }//GEN-LAST:event_slashButtonActionPerformed

    private void shieldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shieldButtonActionPerformed
        updateChoice(SHIELD_ACTION_INDEX);
    }//GEN-LAST:event_shieldButtonActionPerformed

    private void channelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_channelButtonActionPerformed
        updateChoice(CHANNEL_ACTION_INDEX);
    }//GEN-LAST:event_channelButtonActionPerformed

    private void blastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blastButtonActionPerformed
        updateChoice(BLAST_ACTION_INDEX);
    }//GEN-LAST:event_blastButtonActionPerformed

    private void lockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockButtonActionPerformed
        int invalidAction = game.isPlayerReady();
        showProperties();
        if (invalidAction == 0) {
            game.runGameLogic();
            //This is put here because the bot choice should
            //only be shown after player has chosen
            botActionText.setText(ACTION_NAME[game.getActionIdx(DuelGame.BOT)]);
            updateRound();
            showChanges();
            updateButtons();
            checkGameCondition();
        } else {
            switch (invalidAction){
                case 1: JOptionPane.showMessageDialog(new JFrame(), "Can't SHIELD this turn", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
                break;
                case 2: JOptionPane.showMessageDialog(new JFrame(), "Can't CHANNEL this turn", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
                break;
                case 3: JOptionPane.showMessageDialog(new JFrame(), "Can't BLAST this turn", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
                break;
                default: JOptionPane.showMessageDialog(new JFrame(), "Choose an action", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }//GEN-LAST:event_lockButtonActionPerformed

    private void guideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideButtonActionPerformed
        JOptionPane.showMessageDialog(null,guidePanel,"Guide",
                                        JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_guideButtonActionPerformed

    private void checkGameCondition() {
        if (game.isFinished()) {
            JOptionPane.showMessageDialog(new JFrame(), game.getWinner() 
                    + "\n A new game will start now", "Dialog",
                    JOptionPane.INFORMATION_MESSAGE);            
            game = new DuelGame();
            updateRound();
        }
        showProperties();
        updateButtons();
        
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
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GameUI().setVisible(true);
        });
        game = new DuelGame();        
    }
    private static DuelGame game;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blastButton;
    private javax.swing.JTextField botActionText;
    private javax.swing.JLabel botHealthChangesLabel;
    private javax.swing.JTextField botHealthText;
    private javax.swing.JLabel botManaChangesLabel;
    private javax.swing.JTextField botManaText;
    private javax.swing.JTextField botShieldText;
    private javax.swing.JPanel changesPanel;
    private javax.swing.JButton channelButton;
    private javax.swing.JButton guideButton;
    private javax.swing.JPanel guidePanel;
    private javax.swing.JTextField humanActionText;
    private javax.swing.JTextField humanHealthText;
    private javax.swing.JTextField humanManaText;
    private javax.swing.JTextField humanShieldText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JButton lockButton;
    private javax.swing.JLabel playerHealthChangesLabel;
    private javax.swing.JLabel playerManaChangesLabel;
    private javax.swing.JLabel roundNum;
    private javax.swing.JPanel roundPanel;
    private javax.swing.JButton shieldButton;
    private javax.swing.JButton slashButton;
    // End of variables declaration//GEN-END:variables

}
