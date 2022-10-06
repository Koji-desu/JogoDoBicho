/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Koji
 */
import java.util.Random;

public class Escolher3BichosTeste extends javax.swing.JFrame {

    /**
     * Creates new form Escolher3BichosTeste
     */
    String nomeSorteado[] = {"Avestruz", "Aguia", "Burro"/*, "Borboleta", "Cachorro",
        "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo",
        "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre",
        "Urso", "Veado", "Vaca"*/
    };

    public void Jogar() {
        JogarTeste3Bichos t = new JogarTeste3Bichos();
        this.dispose();
        t.setVisible(true);

    }

    public void voltar() {
        EscolherModoTeste m = new EscolherModoTeste();
        this.dispose();
        m.setVisible(true);
    }

    public void escolhasPadrao() {
        escolha1.setSelectedIndex(0);
        escolha2.setSelectedIndex(1);
        escolha3.setSelectedIndex(2);

    }

    public Escolher3BichosTeste() {
        initComponents();
        escolhasPadrao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        escolha3 = new javax.swing.JComboBox<>();
        escolha2 = new javax.swing.JComboBox<>();
        escolha1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        jButton1.setText("Avançar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        escolha3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Aguia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacare", "Leao", "Macaco", "Porco", "Pavao", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        escolha2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Aguia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacare", "Leao", "Macaco", "Porco", "Pavao", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        escolha1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Aguia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacare", "Leao", "Macaco", "Porco", "Pavao", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));
        escolha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolha1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Escolha seus bichos");

        jButton3.setText("Sortear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(escolha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escolha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escolha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(escolha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String escolhido1, escolhido2, escolhido3, escolhido4, escolhido5;
        escolhido1 = escolha1.getSelectedItem() + "";
        escolhido2 = escolha2.getSelectedItem() + "";
        escolhido3 = escolha3.getSelectedItem() + "";

        jOptionPane1.setMessage("aaa");
        jOptionPane1.showMessageDialog(null, "Seus bichos escolhidos foram: \n\n" + escolhido1 + "\n" + escolhido2 + "\n" + escolhido3);
        Jogar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        voltar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jButton1.setText("Inicio");
        Random r = new Random();
        int idx = r.nextInt(nomeSorteado.length);
        int idx2 = r.nextInt(nomeSorteado.length);
        int idx3 = r.nextInt(nomeSorteado.length);

        String bicho1, bicho2, bicho3;
        bicho1 = escolha1.getSelectedItem() + "";
        bicho2 = escolha2.getSelectedItem() + "";
        bicho3 = escolha3.getSelectedItem() + "";
        int acertos = 0;
        for(int i = 0; i < 1; i++){
        
            if(nomeSorteado[idx].equals(bicho1)
                || nomeSorteado[idx].equals(bicho2)
                || nomeSorteado[idx].equals(bicho3)
                    ){
                    acertos+=1;
            }
            
            if(nomeSorteado[idx2].equals(bicho1)
                || nomeSorteado[idx2].equals(bicho2)
                || nomeSorteado[idx2].equals(bicho3)
                    ){
                    acertos+=1;
            }
            if(nomeSorteado[idx3].equals(bicho1)
                || nomeSorteado[idx3].equals(bicho2)
                || nomeSorteado[idx3].equals(bicho3)
                    ){
                    acertos+=1;
            }
            
            i++;
            
            
            
        }
        
        if(acertos == 3) /* if de 3 acertos */ {
            jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + nomeSorteado[idx] + ", " + nomeSorteado[idx2] + " e " + nomeSorteado[idx3] + "\n\n" + "Você... ACERTOOOUU!!! \n\n 3 de 3 acertos\n Parabéns premio máximo!");

        }else if(acertos == 2) /* if de 2 acertos */ {
            jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + nomeSorteado[idx] + ",  " + nomeSorteado[idx2] + " e " + nomeSorteado[idx3] + "\n\n" + "Você... ACERTOUU! \n\n 2 de 3 acertos\n Parabéns pelo premio!");

        } else if (acertos == 1) { // IF de 1 acerto
            jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + nomeSorteado[idx] + ",  " + nomeSorteado[idx2] + " e " + nomeSorteado[idx3] + "\n\n" + "Você... Acertou! \n\n1 de 3 acertos");

        } else {
            jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + nomeSorteado[idx] + ",  " + nomeSorteado[idx2] + " e " + nomeSorteado[idx3] + "\n\n" + "Você... Errou, Tente novamente :(");
        }
        System.out.println(acertos);
        jButton3.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void escolha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escolha1ActionPerformed

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
            java.util.logging.Logger.getLogger(Escolher3BichosTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escolher3BichosTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escolher3BichosTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escolher3BichosTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escolher3BichosTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> escolha1;
    private javax.swing.JComboBox<String> escolha2;
    private javax.swing.JComboBox<String> escolha3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    // End of variables declaration//GEN-END:variables
}
