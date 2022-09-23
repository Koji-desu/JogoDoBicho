/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Koji
 */
public class EscolherBichoTeste extends javax.swing.JFrame {

    /**
     * Creates new form EscolherBichoTeste
     */
    public EscolherBichoTeste() {
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

        jDialog1 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        cbAvestruz = new javax.swing.JCheckBox();
        cbAguia = new javax.swing.JCheckBox();
        cbBurro = new javax.swing.JCheckBox();
        cbBorboleta = new javax.swing.JCheckBox();
        cbCachorro = new javax.swing.JCheckBox();
        cbCabra = new javax.swing.JCheckBox();
        cbCarneiro = new javax.swing.JCheckBox();
        cbCamelo = new javax.swing.JCheckBox();
        cbCobra = new javax.swing.JCheckBox();
        cbCoelho = new javax.swing.JCheckBox();
        cbCavalo = new javax.swing.JCheckBox();
        cbElefante = new javax.swing.JCheckBox();
        cbGalo = new javax.swing.JCheckBox();
        cbGato = new javax.swing.JCheckBox();
        cbJacare = new javax.swing.JCheckBox();
        cbLeao = new javax.swing.JCheckBox();
        cbMacaco = new javax.swing.JCheckBox();
        cbPorco = new javax.swing.JCheckBox();
        cbPavao = new javax.swing.JCheckBox();
        cbPeru = new javax.swing.JCheckBox();
        cbTouro = new javax.swing.JCheckBox();
        cbTigre = new javax.swing.JCheckBox();
        cbUrso = new javax.swing.JCheckBox();
        cbVeado = new javax.swing.JCheckBox();
        cbVaca = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Do Bicho");
        setLocation(new java.awt.Point(535, 150));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Escolha seus bichos");

        cbAvestruz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbAvestruz.setText("Avestruz");
        cbAvestruz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbAvestruzMouseClicked(evt);
            }
        });
        cbAvestruz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAvestruzActionPerformed(evt);
            }
        });

        cbAguia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbAguia.setText("Aguia");

        cbBurro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbBurro.setText("Burro");

        cbBorboleta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbBorboleta.setText("Borboleta");

        cbCachorro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCachorro.setText("Cachorro");

        cbCabra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCabra.setText("Cabra");

        cbCarneiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCarneiro.setText("Carneiro");

        cbCamelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCamelo.setText("Camelo");

        cbCobra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCobra.setText("Cobra");

        cbCoelho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCoelho.setText("Coelho");

        cbCavalo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCavalo.setText("Cavalo");

        cbElefante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbElefante.setText("Elefante");

        cbGalo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGalo.setText("Galo");

        cbGato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGato.setText("Gato");

        cbJacare.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbJacare.setText("Jacaré");

        cbLeao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbLeao.setText("Leão");

        cbMacaco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbMacaco.setText("Macaco");

        cbPorco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPorco.setText("Porco");

        cbPavao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPavao.setText("Pavão");

        cbPeru.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPeru.setText("Peru");

        cbTouro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTouro.setText("Touro");

        cbTigre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTigre.setText("Tigre");

        cbUrso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbUrso.setText("Urso");

        cbVeado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbVeado.setText("Veado");

        cbVaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbVaca.setText("Vaca");

        jButton1.setText("Avançar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAguia)
                                    .addComponent(cbAvestruz)
                                    .addComponent(cbBurro)
                                    .addComponent(cbBorboleta)
                                    .addComponent(cbCachorro)
                                    .addComponent(cbCabra))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbCarneiro)
                                            .addComponent(cbCoelho)
                                            .addComponent(cbCavalo)
                                            .addComponent(cbElefante)
                                            .addComponent(cbGalo))
                                        .addGap(46, 46, 46))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbGato)
                                        .addGap(66, 66, 66)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCobra)
                                    .addComponent(cbJacare)
                                    .addComponent(cbLeao)
                                    .addComponent(cbVaca)
                                    .addComponent(cbVeado)
                                    .addComponent(cbUrso)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTigre)
                            .addComponent(cbTouro)
                            .addComponent(cbPavao)
                            .addComponent(cbPeru)
                            .addComponent(cbPorco)
                            .addComponent(cbMacaco)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(cbCamelo)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAvestruz)
                    .addComponent(cbCarneiro)
                    .addComponent(cbMacaco)
                    .addComponent(cbUrso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAguia)
                    .addComponent(cbCoelho)
                    .addComponent(cbPorco)
                    .addComponent(cbVeado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBurro)
                    .addComponent(cbCavalo)
                    .addComponent(cbPeru)
                    .addComponent(cbVaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBorboleta)
                    .addComponent(cbElefante)
                    .addComponent(cbPavao)
                    .addComponent(cbLeao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCachorro)
                    .addComponent(cbGalo)
                    .addComponent(cbTouro)
                    .addComponent(cbJacare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCabra)
                    .addComponent(cbGato)
                    .addComponent(cbTigre)
                    .addComponent(cbCobra))
                .addGap(18, 18, 18)
                .addComponent(cbCamelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(59, 59, 59))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbAvestruzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAvestruzMouseClicked

    }//GEN-LAST:event_cbAvestruzMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jOptionPane1.setMessage("aaa");
        jOptionPane1.showMessageDialog(null, "123");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbAvestruzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAvestruzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAvestruzActionPerformed

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
            java.util.logging.Logger.getLogger(EscolherBichoTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolherBichoTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolherBichoTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolherBichoTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolherBichoTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbAguia;
    private javax.swing.JCheckBox cbAvestruz;
    private javax.swing.JCheckBox cbBorboleta;
    private javax.swing.JCheckBox cbBurro;
    private javax.swing.JCheckBox cbCabra;
    private javax.swing.JCheckBox cbCachorro;
    private javax.swing.JCheckBox cbCamelo;
    private javax.swing.JCheckBox cbCarneiro;
    private javax.swing.JCheckBox cbCavalo;
    private javax.swing.JCheckBox cbCobra;
    private javax.swing.JCheckBox cbCoelho;
    private javax.swing.JCheckBox cbElefante;
    private javax.swing.JCheckBox cbGalo;
    private javax.swing.JCheckBox cbGato;
    private javax.swing.JCheckBox cbJacare;
    private javax.swing.JCheckBox cbLeao;
    private javax.swing.JCheckBox cbMacaco;
    private javax.swing.JCheckBox cbPavao;
    private javax.swing.JCheckBox cbPeru;
    private javax.swing.JCheckBox cbPorco;
    private javax.swing.JCheckBox cbTigre;
    private javax.swing.JCheckBox cbTouro;
    private javax.swing.JCheckBox cbUrso;
    private javax.swing.JCheckBox cbVaca;
    private javax.swing.JCheckBox cbVeado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
