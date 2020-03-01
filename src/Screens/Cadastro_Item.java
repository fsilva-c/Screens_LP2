/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens;

/**
 *
 * @author qwerty
 */
public class Cadastro_Item extends javax.swing.JFrame {
    int xMouse;
    int yMouse;

    /**
     * Creates new form cadastro_item
     */
    public Cadastro_Item() {
        initComponents();
        
        //buttoGroup para selecionar apenas um botão por vez
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup1.add(button_bebida);
        buttonGroup1.add(button_comida);
        
        texto_cnpj.setEnabled(false);
        jtext_descricao.setEnabled(false);
        icon_pesquisarFornecedor.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        text_preco = new javax.swing.JPanel();
        panel_icon = new keeptoo.KGradientPanel();
        label_icon = new javax.swing.JLabel();
        button_bebida = new javax.swing.JRadioButton();
        button_comida = new javax.swing.JRadioButton();
        label_esqueciSenha1 = new javax.swing.JLabel();
        label_cadProduto = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        texto_nome = new javax.swing.JTextField();
        label_preco = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtext_descricao = new javax.swing.JTextArea();
        label_fornecedor = new javax.swing.JLabel();
        label_desc1 = new javax.swing.JLabel();
        icon_pesquisarFornecedor = new javax.swing.JLabel();
        texto_cnpj = new javax.swing.JFormattedTextField();
        barra_ferramentas = new javax.swing.JPanel();
        panel_fechar = new javax.swing.JPanel();
        label_fechar = new javax.swing.JLabel();
        panel_minimizar = new javax.swing.JPanel();
        label_minimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        text_preco.setBackground(new java.awt.Color(255, 255, 255));

        panel_icon.setkEndColor(new java.awt.Color(0, 0, 0));
        panel_icon.setkStartColor(new java.awt.Color(70, 0, 110));
        panel_icon.setkTransparentControls(false);

        label_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-ingredientes-96.png"))); // NOI18N

        button_bebida.setBackground(new java.awt.Color(70, 0, 110));
        button_bebida.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        button_bebida.setForeground(new java.awt.Color(204, 204, 204));
        button_bebida.setText("Bebida");
        button_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bebidaActionPerformed(evt);
            }
        });

        button_comida.setBackground(new java.awt.Color(70, 0, 110));
        button_comida.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        button_comida.setForeground(new java.awt.Color(204, 204, 204));
        button_comida.setText("Comida");
        button_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_comidaActionPerformed(evt);
            }
        });

        label_esqueciSenha1.setBackground(new java.awt.Color(204, 204, 204));
        label_esqueciSenha1.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        label_esqueciSenha1.setForeground(new java.awt.Color(153, 153, 153));
        label_esqueciSenha1.setText("Restaurante Lombinho de Porco II");
        label_esqueciSenha1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_cadProduto.setBackground(new java.awt.Color(204, 204, 204));
        label_cadProduto.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_cadProduto.setForeground(new java.awt.Color(204, 204, 204));
        label_cadProduto.setText("Cadastro de Produto");

        javax.swing.GroupLayout panel_iconLayout = new javax.swing.GroupLayout(panel_icon);
        panel_icon.setLayout(panel_iconLayout);
        panel_iconLayout.setHorizontalGroup(
            panel_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_iconLayout.createSequentialGroup()
                .addGroup(panel_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_iconLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_esqueciSenha1))
                    .addGroup(panel_iconLayout.createSequentialGroup()
                        .addGroup(panel_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_iconLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(label_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_iconLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(label_cadProduto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel_iconLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_comida, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(button_bebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_iconLayout.setVerticalGroup(
            panel_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_iconLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label_esqueciSenha1)
                .addGap(18, 18, 18)
                .addComponent(label_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_cadProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_bebida)
                .addGap(37, 37, 37)
                .addComponent(button_comida)
                .addGap(45, 45, 45))
        );

        label_nome.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_nome.setForeground(new java.awt.Color(51, 51, 51));
        label_nome.setText("Nome");

        texto_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        label_preco.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_preco.setForeground(new java.awt.Color(51, 51, 51));
        label_preco.setText("Preço");

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-salvar-35.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtext_descricao.setColumns(20);
        jtext_descricao.setRows(5);
        jtext_descricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jScrollPane1.setViewportView(jtext_descricao);

        label_fornecedor.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_fornecedor.setForeground(new java.awt.Color(51, 51, 51));
        label_fornecedor.setText("Fornecedor");

        label_desc1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_desc1.setForeground(new java.awt.Color(51, 51, 51));
        label_desc1.setText("Descrição");

        icon_pesquisarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-pesquisar-25.png"))); // NOI18N
        icon_pesquisarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        texto_cnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        try {
            texto_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        barra_ferramentas.setBackground(new java.awt.Color(255, 255, 255));
        barra_ferramentas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_ferramentasMouseDragged(evt);
            }
        });
        barra_ferramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_ferramentasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                barra_ferramentasMouseReleased(evt);
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
            .addGroup(panel_fecharLayout.createSequentialGroup()
                .addComponent(label_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_fecharLayout.setVerticalGroup(
            panel_fecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_fechar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
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
            .addComponent(label_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barra_ferramentasLayout = new javax.swing.GroupLayout(barra_ferramentas);
        barra_ferramentas.setLayout(barra_ferramentasLayout);
        barra_ferramentasLayout.setHorizontalGroup(
            barra_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_ferramentasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra_ferramentasLayout.setVerticalGroup(
            barra_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout text_precoLayout = new javax.swing.GroupLayout(text_preco);
        text_preco.setLayout(text_precoLayout);
        text_precoLayout.setHorizontalGroup(
            text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(text_precoLayout.createSequentialGroup()
                .addComponent(panel_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(text_precoLayout.createSequentialGroup()
                        .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(text_precoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_preco)
                                    .addComponent(label_nome))
                                .addGap(18, 18, 18)
                                .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(texto_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                    .addComponent(jTextField2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, text_precoLayout.createSequentialGroup()
                                .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_fornecedor)
                                    .addComponent(label_desc1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(text_precoLayout.createSequentialGroup()
                                        .addGap(0, 8, Short.MAX_VALUE)
                                        .addComponent(icon_pesquisarFornecedor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(13, 13, 13))
                    .addGroup(text_precoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addComponent(barra_ferramentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        text_precoLayout.setVerticalGroup(
            text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(text_precoLayout.createSequentialGroup()
                .addComponent(barra_ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nome))
                .addGap(52, 52, 52)
                .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_preco))
                .addGap(42, 42, 42)
                .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_desc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(text_precoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_fornecedor)
                    .addComponent(icon_pesquisarFornecedor)
                    .addComponent(texto_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        getContentPane().add(text_preco);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void button_bebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bebidaActionPerformed
        // TODO add your handling code here:
        texto_cnpj.setEnabled(true); 
        icon_pesquisarFornecedor.setEnabled(true);
        
        jtext_descricao.setEnabled(false);
        jtext_descricao.setText("");
    }//GEN-LAST:event_button_bebidaActionPerformed

    private void button_comidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_comidaActionPerformed
        // TODO add your handling code here:
        texto_cnpj.setEnabled(false); 
        icon_pesquisarFornecedor.setEnabled(false);
        
        jtext_descricao.setEnabled(true);
        texto_cnpj.setText("");
    }//GEN-LAST:event_button_comidaActionPerformed

    private void label_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fecharMouseClicked
        Cadastro_Item.this.dispose();
    }//GEN-LAST:event_label_fecharMouseClicked

    private void barra_ferramentasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMouseDragged
        // TODO add your handling code here:
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_barra_ferramentasMouseDragged

    private void barra_ferramentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barra_ferramentasMousePressed

    private void barra_ferramentasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_barra_ferramentasMouseReleased

    
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
            java.util.logging.Logger.getLogger(Cadastro_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Item().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_ferramentas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton button_bebida;
    private javax.swing.JRadioButton button_comida;
    private javax.swing.JLabel icon_pesquisarFornecedor;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea jtext_descricao;
    private javax.swing.JLabel label_cadProduto;
    private javax.swing.JLabel label_desc1;
    private javax.swing.JLabel label_esqueciSenha1;
    private javax.swing.JLabel label_fechar;
    private javax.swing.JLabel label_fornecedor;
    private javax.swing.JLabel label_icon;
    private javax.swing.JLabel label_minimizar;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_preco;
    private javax.swing.JPanel panel_fechar;
    private keeptoo.KGradientPanel panel_icon;
    private javax.swing.JPanel panel_minimizar;
    private javax.swing.JPanel text_preco;
    private javax.swing.JFormattedTextField texto_cnpj;
    private javax.swing.JTextField texto_nome;
    // End of variables declaration//GEN-END:variables
    
}
