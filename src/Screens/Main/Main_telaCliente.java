/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens.Main;

import Negocio.Pessoas.Client;
import Screens.Conta.Conta;
import Screens.Bonus.Bonus;
import Screens.Cardapio.Realizar_Pedido;
import Screens.Cadastros.Dados_Cadastrais;
import Screens.Cardapio.Tipo_Cardapio;
import javax.swing.JFrame;

/**
 *
 * @author qwerty
 */
public class Main_telaCliente extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    Client usuario;
    JFrame tela_realizarPedido, tela_conta, tela_EscolhaCardapio, tela_AlterarRegistro, tela_Bonus;
    
    /**
     * Creates new form main_screenCliente
     */
    public Main_telaCliente() {
        initComponents();
    }

    public Main_telaCliente(Client c1) {
        this.usuario = c1;
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

        background = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        panel_barraTarefas = new javax.swing.JPanel();
        panel_fechar = new javax.swing.JPanel();
        label_fechar = new javax.swing.JLabel();
        panel_minimizar = new javax.swing.JPanel();
        label_minimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_iconRealizarPedido = new javax.swing.JLabel();
        label_dadosCadastrais = new javax.swing.JLabel();
        label_iconCardapio = new javax.swing.JLabel();
        label_DadosCadastrais = new javax.swing.JLabel();
        label_realizarPedido1 = new javax.swing.JLabel();
        label_cardapio = new javax.swing.JLabel();
        label_iconSair = new javax.swing.JLabel();
        label_sair = new javax.swing.JLabel();
        label_iconConta = new javax.swing.JLabel();
        label_conta = new javax.swing.JLabel();
        label_iconBonus = new javax.swing.JLabel();
        label_bonus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setkEndColor(new java.awt.Color(70, 0, 110));
        background.setkStartColor(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panel_barraTarefas.setBackground(new java.awt.Color(255, 255, 255));
        panel_barraTarefas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_barraTarefasMouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_barraTarefasMouseDragged(evt);
            }
        });
        panel_barraTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_barraTarefasMousePressed(evt);
            }
        });

        panel_fechar.setBackground(new java.awt.Color(255, 255, 255));
        panel_fechar.setPreferredSize(new java.awt.Dimension(30, 30));

        label_fechar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label_fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_fechar.setText("X");
        label_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_fecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_fecharLayout = new javax.swing.GroupLayout(panel_fechar);
        panel_fechar.setLayout(panel_fecharLayout);
        panel_fecharLayout.setHorizontalGroup(
            panel_fecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fecharLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_fecharLayout.setVerticalGroup(
            panel_fecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fecharLayout.createSequentialGroup()
                .addComponent(label_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_minimizar.setBackground(new java.awt.Color(255, 255, 255));

        label_minimizar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_minimizar.setText("-");

        javax.swing.GroupLayout panel_minimizarLayout = new javax.swing.GroupLayout(panel_minimizar);
        panel_minimizar.setLayout(panel_minimizarLayout);
        panel_minimizarLayout.setHorizontalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        panel_minimizarLayout.setVerticalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_minimizarLayout.createSequentialGroup()
                .addComponent(label_minimizar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        jLabel1.setText("Restaurante Lombinho de Porco II");

        javax.swing.GroupLayout panel_barraTarefasLayout = new javax.swing.GroupLayout(panel_barraTarefas);
        panel_barraTarefas.setLayout(panel_barraTarefasLayout);
        panel_barraTarefasLayout.setHorizontalGroup(
            panel_barraTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraTarefasLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_barraTarefasLayout.setVerticalGroup(
            panel_barraTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fechar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
            .addComponent(panel_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_barraTarefasLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-loja-96.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_barraTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_barraTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2))
        );

        label_iconRealizarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-ingredientes-96.png"))); // NOI18N
        label_iconRealizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_iconRealizarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconRealizarPedidoMouseClicked(evt);
            }
        });

        label_dadosCadastrais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-menu-de-usuário-masculino-96.png"))); // NOI18N
        label_dadosCadastrais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_dadosCadastrais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_dadosCadastraisMouseClicked(evt);
            }
        });

        label_iconCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-equity-security-96.png"))); // NOI18N
        label_iconCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_iconCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconCardapioMouseClicked(evt);
            }
        });

        label_DadosCadastrais.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_DadosCadastrais.setForeground(new java.awt.Color(204, 204, 204));
        label_DadosCadastrais.setText("Dados Cadastrais");

        label_realizarPedido1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_realizarPedido1.setForeground(new java.awt.Color(204, 204, 204));
        label_realizarPedido1.setText("Realizar Pedido");

        label_cardapio.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_cardapio.setForeground(new java.awt.Color(204, 204, 204));
        label_cardapio.setText("Cardápio");

        label_iconSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-sair-96.png"))); // NOI18N
        label_iconSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_iconSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconSairMouseClicked(evt);
            }
        });

        label_sair.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_sair.setForeground(new java.awt.Color(204, 204, 204));
        label_sair.setText("Sair");

        label_iconConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-conta-96.png"))); // NOI18N
        label_iconConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_iconConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconContaMouseClicked(evt);
            }
        });

        label_conta.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_conta.setForeground(new java.awt.Color(204, 204, 204));
        label_conta.setText("Conta");

        label_iconBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-presente-96.png"))); // NOI18N
        label_iconBonus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_iconBonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconBonusMouseClicked(evt);
            }
        });

        label_bonus.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_bonus.setForeground(new java.awt.Color(204, 204, 204));
        label_bonus.setText("Bônus");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(label_realizarPedido1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_iconRealizarPedido)
                            .addComponent(label_dadosCadastrais)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_DadosCadastrais)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(label_conta)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_iconBonus)
                                    .addComponent(label_iconConta))
                                .addGap(66, 66, 66)))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_iconCardapio)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(label_cardapio))
                            .addComponent(label_iconSair))
                        .addGap(218, 218, 218))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(label_bonus)
                        .addGap(117, 117, 117)
                        .addComponent(label_sair)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_iconRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_iconConta)))
                    .addComponent(label_iconCardapio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_realizarPedido1)
                    .addComponent(label_conta)
                    .addComponent(label_cardapio))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(label_dadosCadastrais, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_DadosCadastrais)
                            .addComponent(label_bonus)
                            .addComponent(label_sair)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_iconSair)
                            .addComponent(label_iconBonus))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fecharMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_label_fecharMouseClicked

    private void label_iconRealizarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconRealizarPedidoMouseClicked
        // TODO add your handling code here:
        
        //instanciar a tela cad pessoa apenas uma vez
        if(tela_realizarPedido == null)
            tela_realizarPedido= new Realizar_Pedido(this.usuario);
        
        tela_realizarPedido.setVisible(true);
        tela_realizarPedido.setLocationRelativeTo(null);

    }//GEN-LAST:event_label_iconRealizarPedidoMouseClicked

    private void panel_barraTarefasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_barraTarefasMouseDragged
        // TODO add your handling code here:
        int X = evt.getXOnScreen();
	int Y = evt.getYOnScreen();
	this.setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_panel_barraTarefasMouseDragged

    private void panel_barraTarefasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_barraTarefasMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_barraTarefasMouseMoved

    private void panel_barraTarefasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_barraTarefasMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
	yMouse = evt.getY();
    }//GEN-LAST:event_panel_barraTarefasMousePressed

    private void label_iconContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconContaMouseClicked
        // TODO add your handling code here:
        if(tela_conta == null)
            tela_conta = new Conta();
        
        tela_conta.setVisible(true);
        tela_conta.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_iconContaMouseClicked

    private void label_iconCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconCardapioMouseClicked
        // TODO add your handling code here:
        if(tela_EscolhaCardapio == null)
            tela_EscolhaCardapio = new Tipo_Cardapio();
        
        tela_EscolhaCardapio.setVisible(true);
        tela_EscolhaCardapio.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_iconCardapioMouseClicked

    private void label_dadosCadastraisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_dadosCadastraisMouseClicked
        // TODO add your handling code here:
        if(tela_AlterarRegistro == null)
            tela_AlterarRegistro = new Dados_Cadastrais();
        
        tela_AlterarRegistro.setVisible(true);
        tela_AlterarRegistro.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_dadosCadastraisMouseClicked

    private void label_iconBonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconBonusMouseClicked
        // TODO add your handling code here:
        if(tela_Bonus == null )
            tela_Bonus = new Bonus();
        
        tela_Bonus.setVisible(true);
        tela_Bonus.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_iconBonusMouseClicked

    private void label_iconSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_label_iconSairMouseClicked

   
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
            java.util.logging.Logger.getLogger(Main_telaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_telaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_telaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_telaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_telaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_DadosCadastrais;
    private javax.swing.JLabel label_bonus;
    private javax.swing.JLabel label_cardapio;
    private javax.swing.JLabel label_conta;
    private javax.swing.JLabel label_dadosCadastrais;
    private javax.swing.JLabel label_fechar;
    private javax.swing.JLabel label_iconBonus;
    private javax.swing.JLabel label_iconCardapio;
    private javax.swing.JLabel label_iconConta;
    private javax.swing.JLabel label_iconRealizarPedido;
    private javax.swing.JLabel label_iconSair;
    private javax.swing.JLabel label_minimizar;
    private javax.swing.JLabel label_realizarPedido1;
    private javax.swing.JLabel label_sair;
    private javax.swing.JPanel panel_barraTarefas;
    private javax.swing.JPanel panel_fechar;
    private javax.swing.JPanel panel_minimizar;
    // End of variables declaration//GEN-END:variables
}
