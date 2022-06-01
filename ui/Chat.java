package ui;

/**
 * @author yuri.costa
 */
public class Chat extends javax.swing.JFrame {
    
    public Chat() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChat = new javax.swing.JPanel();
        chatPanel = new javax.swing.JDesktopPane();
        name = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        fieldMessage = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        fieldChat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setName("menu"); // NOI18N

        panelChat.setAutoscrolls(true);
        panelChat.setInheritsPopupMenu(true);
        panelChat.setMaximumSize(new java.awt.Dimension(1500, 600));
        panelChat.setMinimumSize(new java.awt.Dimension(600, 400));
        panelChat.setPreferredSize(new java.awt.Dimension(600, 400));

        name.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        name.setText("Nome");

        message.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        message.setText("Recado");

        backButton.setText("...");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        fieldMessage.setToolTipText("Write a message...");
        fieldMessage.setMaximumSize(null);
        fieldMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMessageActionPerformed(evt);
            }
        });

        sendButton.setText("Enviar");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("SimSun", 2, 12)); // NOI18N
        status.setText("Status");

        fieldChat.setEditable(false);
        fieldChat.setFocusable(false);
        fieldChat.setMaximumSize(null);
        fieldChat.setRequestFocusEnabled(false);
        fieldChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldChatActionPerformed(evt);
            }
        });

        chatPanel.setLayer(name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        chatPanel.setLayer(message, javax.swing.JLayeredPane.DEFAULT_LAYER);
        chatPanel.setLayer(backButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        chatPanel.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        chatPanel.setLayer(fieldMessage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        chatPanel.setLayer(sendButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        chatPanel.setLayer(status, javax.swing.JLayeredPane.DEFAULT_LAYER);
        chatPanel.setLayer(fieldChat, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout chatPanelLayout = new javax.swing.GroupLayout(chatPanel);
        chatPanel.setLayout(chatPanelLayout);
        chatPanelLayout.setHorizontalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(chatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chatPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(chatPanelLayout.createSequentialGroup()
                        .addComponent(fieldMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        chatPanelLayout.setVerticalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chatPanelLayout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelChatLayout = new javax.swing.GroupLayout(panelChat);
        panelChat.setLayout(panelChatLayout);
        panelChatLayout.setHorizontalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chatPanel)
        );
        panelChatLayout.setVerticalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chatPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMessageActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendButtonActionPerformed

    private void fieldChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldChatActionPerformed

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
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Chat menu = new Chat();
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JDesktopPane chatPanel;
    private javax.swing.JTextField fieldChat;
    private javax.swing.JTextField fieldMessage;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel message;
    private javax.swing.JLabel name;
    private javax.swing.JPanel panelChat;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}