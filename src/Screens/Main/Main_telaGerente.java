/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens.Main;

import Screens.Pesquisa.Pesquisa_Bonus;
import Screens.Cadastros.Cadastro_Fornecedor;
import Screens.Cadastros.Cadastro_Item;
import Screens.Conta.Cozinha;
import Screens.Pesquisa.Pesquisa_Cliente;
import Screens.Pesquisa.Pesquisa_Conta;
import javax.swing.JFrame;

/**
 *
 * @author qwerty
 */
public class Main_telaGerente extends javax.swing.JFrame {
    int xMouse;
    int yMouse;

    JFrame tela_cadastroItem, tela_fornecedor, tela_ListaClientes, tela_listaBonus, tela_listaConta, cozinha;
    /**
     * Creates new form main_screen
     */
    public Main_telaGerente() {
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

        jLabel3 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        panel_barraTarefas = new javax.swing.JPanel();
        panel_fechar = new javax.swing.JPanel();
        label_fechar = new javax.swing.JLabel();
        panel_minimizar = new javax.swing.JPanel();
        label_minimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label_gerente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_iconGerItens = new javax.swing.JLabel();
        label_gerItens = new javax.swing.JLabel();
        label_iconCardapio = new javax.swing.JLabel();
        label_cozinha = new javax.swing.JLabel();
        label_iconSair = new javax.swing.JLabel();
        label_cardapio1 = new javax.swing.JLabel();
        label_iconBonus = new javax.swing.JLabel();
        label_bonus = new javax.swing.JLabel();
        label_iconCozinha = new javax.swing.JLabel();
        label_DadosCadastrais = new javax.swing.JLabel();
        label_iconCozinha1 = new javax.swing.JLabel();
        label_cozinha1 = new javax.swing.JLabel();
        label_dadosCadastrais2 = new javax.swing.JLabel();
        label_sair1 = new javax.swing.JLabel();
        label_iconFornecedor = new javax.swing.JLabel();
        label_fornecedor = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        jLabel3.setText("Restaurante Lombinho de Porco II");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(70, 0, 110));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panel_barraTarefas.setBackground(new java.awt.Color(255, 255, 255));
        panel_barraTarefas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
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
            .addComponent(label_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_minimizarLayout.setVerticalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_minimizarLayout.createSequentialGroup()
                .addComponent(label_minimizar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        jLabel1.setText("Restaurante Lombinho de Porco II");

        label_gerente.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_gerente.setForeground(new java.awt.Color(102, 102, 102));
        label_gerente.setText("Painel do Gerente");

        javax.swing.GroupLayout panel_barraTarefasLayout = new javax.swing.GroupLayout(panel_barraTarefas);
        panel_barraTarefas.setLayout(panel_barraTarefasLayout);
        panel_barraTarefasLayout.setHorizontalGroup(
            panel_barraTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraTarefasLayout.createSequentialGroup()
                .addGroup(panel_barraTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(label_gerente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_barraTarefasLayout.setVerticalGroup(
            panel_barraTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fechar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(panel_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_barraTarefasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_gerente)
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
                .addComponent(panel_barraTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_barraTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_iconGerItens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-ingredientes-96.png"))); // NOI18N
        label_iconGerItens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iconGerItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconGerItensMouseClicked(evt);
            }
        });

        label_gerItens.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_gerItens.setForeground(new java.awt.Color(204, 204, 204));
        label_gerItens.setText("Itens");

        label_iconCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-equity-security-96.png"))); // NOI18N
        label_iconCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label_cozinha.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_cozinha.setForeground(new java.awt.Color(204, 204, 204));
        label_cozinha.setText("Cozinha");

        label_iconSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-sair-96.png"))); // NOI18N
        label_iconSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iconSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconSairMouseClicked(evt);
            }
        });

        label_cardapio1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_cardapio1.setForeground(new java.awt.Color(204, 204, 204));
        label_cardapio1.setText("Cardápio");

        label_iconBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-presente-96.png"))); // NOI18N
        label_iconBonus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iconBonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconBonusMouseClicked(evt);
            }
        });

        label_bonus.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_bonus.setForeground(new java.awt.Color(204, 204, 204));
        label_bonus.setText("Bônus");

        label_iconCozinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-caixa-registradora-antiga-96.png"))); // NOI18N
        label_iconCozinha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iconCozinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconCozinhaMouseClicked(evt);
            }
        });

        label_DadosCadastrais.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_DadosCadastrais.setForeground(new java.awt.Color(204, 204, 204));
        label_DadosCadastrais.setText("Clientes");

        label_iconCozinha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-fogão-a-gás-96.png"))); // NOI18N
        label_iconCozinha1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iconCozinha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconCozinha1MouseClicked(evt);
            }
        });

        label_cozinha1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_cozinha1.setForeground(new java.awt.Color(204, 204, 204));
        label_cozinha1.setText("Caixa");

        label_dadosCadastrais2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-menu-de-usuário-masculino-96.png"))); // NOI18N
        label_dadosCadastrais2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_dadosCadastrais2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_dadosCadastrais2MouseClicked(evt);
            }
        });

        label_sair1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_sair1.setForeground(new java.awt.Color(204, 204, 204));
        label_sair1.setText("Sair");

        label_iconFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-produto-96.png"))); // NOI18N
        label_iconFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iconFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconFornecedorMouseClicked(evt);
            }
        });

        label_fornecedor.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_fornecedor.setForeground(new java.awt.Color(204, 204, 204));
        label_fornecedor.setText("Fornecedor");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(label_gerItens)
                                .addGap(32, 32, 32))
                            .addComponent(label_iconBonus)
                            .addComponent(label_iconGerItens)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(label_bonus)))
                .addGap(57, 57, 57)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(label_cardapio1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(label_cozinha1))
                    .addComponent(label_iconCardapio)
                    .addComponent(label_iconCozinha))
                .addGap(53, 53, 53)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_iconCozinha1)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(label_cozinha)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_fornecedor)
                                    .addComponent(label_iconFornecedor)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(label_dadosCadastrais2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_iconSair)
                                .addGap(4, 4, 4)))
                        .addGap(55, 55, 55))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label_DadosCadastrais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_sair1)
                        .addGap(102, 102, 102))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_iconGerItens, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_iconCardapio))
                        .addGap(6, 6, 6)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_cardapio1)
                            .addComponent(label_gerItens)))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(label_iconFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label_fornecedor))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(label_iconCozinha1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(label_cozinha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(label_iconCozinha, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(label_iconBonus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_cozinha1)
                            .addComponent(label_bonus))
                        .addGap(165, 165, 165))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_iconSair)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(label_dadosCadastrais2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_DadosCadastrais)
                                    .addComponent(label_sair1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fecharMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_label_fecharMouseClicked

    private void panel_barraTarefasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_barraTarefasMouseDragged
        // TODO add your handling code here:
        int X = evt.getXOnScreen();
	int Y = evt.getYOnScreen();
	this.setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_panel_barraTarefasMouseDragged

    private void panel_barraTarefasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_barraTarefasMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
	yMouse = evt.getY();
    }//GEN-LAST:event_panel_barraTarefasMousePressed

    private void label_iconGerItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconGerItensMouseClicked
        // TODO add your handling code here:
        if(tela_cadastroItem == null )
            tela_cadastroItem = new Cadastro_Item();
        
        tela_cadastroItem.setVisible(true);
        tela_cadastroItem.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_iconGerItensMouseClicked

    private void label_iconSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_label_iconSairMouseClicked

    private void label_iconFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconFornecedorMouseClicked
        // TODO add your handling code here:
        if(tela_fornecedor == null )
            tela_fornecedor = new Cadastro_Fornecedor();
        
        tela_fornecedor.setVisible(true);
        tela_fornecedor.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_iconFornecedorMouseClicked

    private void label_dadosCadastrais2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_dadosCadastrais2MouseClicked
        // TODO add your handling code here:
        if(tela_ListaClientes == null)
            tela_ListaClientes = new Pesquisa_Cliente();
       
        tela_ListaClientes.setVisible(true);
        tela_ListaClientes.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_dadosCadastrais2MouseClicked

    private void label_iconCozinha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconCozinha1MouseClicked
        // TODO add your handling code here:
        if(cozinha == null )
            cozinha = new Cozinha();
        
        cozinha.setVisible(true);
        cozinha.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_iconCozinha1MouseClicked

    private void label_iconBonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconBonusMouseClicked
        // TODO add your handling code here:
        if(tela_listaBonus == null )
            tela_listaBonus = new Pesquisa_Bonus();
        
        tela_listaBonus.setVisible(true);
        tela_listaBonus.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_iconBonusMouseClicked

    private void label_iconCozinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconCozinhaMouseClicked
        // TODO add your handling code here:
        if(tela_listaConta == null )
            tela_listaConta = new Pesquisa_Conta();
        
        tela_listaConta.setVisible(true);
        tela_listaConta.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_iconCozinhaMouseClicked

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
            java.util.logging.Logger.getLogger(Main_telaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_telaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_telaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_telaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_telaGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label_DadosCadastrais;
    private javax.swing.JLabel label_bonus;
    private javax.swing.JLabel label_cardapio1;
    private javax.swing.JLabel label_cozinha;
    private javax.swing.JLabel label_cozinha1;
    private javax.swing.JLabel label_dadosCadastrais2;
    private javax.swing.JLabel label_fechar;
    private javax.swing.JLabel label_fornecedor;
    private javax.swing.JLabel label_gerItens;
    private javax.swing.JLabel label_gerente;
    private javax.swing.JLabel label_iconBonus;
    private javax.swing.JLabel label_iconCardapio;
    private javax.swing.JLabel label_iconCozinha;
    private javax.swing.JLabel label_iconCozinha1;
    private javax.swing.JLabel label_iconFornecedor;
    private javax.swing.JLabel label_iconGerItens;
    private javax.swing.JLabel label_iconSair;
    private javax.swing.JLabel label_minimizar;
    private javax.swing.JLabel label_sair1;
    private javax.swing.JPanel panel_barraTarefas;
    private javax.swing.JPanel panel_fechar;
    private javax.swing.JPanel panel_minimizar;
    // End of variables declaration//GEN-END:variables
}
