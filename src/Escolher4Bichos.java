
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Koji
 */
public class Escolher4Bichos extends javax.swing.JFrame {

    /**
     * Creates new form Escolher4BichosTeste
     */
    
    String nomeSorteado[] = {
        "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro",
        "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo",
        "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro",
        "Tigre", "Urso", "Veado", "Vaca"};
    
    


    public void Voltar() {
        EscolherModo m = new EscolherModo();
        this.dispose();
        m.setVisible(true);
    }
    public void Inicio() {
        Inicial t = new Inicial();
        this.dispose();
        t.setVisible(true);
    }

    public void escolhasPadrao() {
        escolha1.setSelectedIndex(0);
        escolha2.setSelectedIndex(1);
        escolha3.setSelectedIndex(2);
        escolha4.setSelectedIndex(3);

    }

    public Escolher4Bichos() {
        initComponents();
        escolhasPadrao();
    }
    
    public void Sortear(){
        jButton1.setText("Inicio");
        Random r = new Random();
        int idx = r.nextInt(nomeSorteado.length);
        int idx2 = r.nextInt(nomeSorteado.length);
        int idx3 = r.nextInt(nomeSorteado.length);
                int idx4 = r.nextInt(nomeSorteado.length);


        String bicho1, bicho2, bicho3, bicho4;
        bicho1 = escolha1.getSelectedItem() + "";
        bicho2 = escolha2.getSelectedItem() + "";
        bicho3 = escolha3.getSelectedItem() + "";
        bicho4 = escolha4.getSelectedItem() + "";
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
            
            if(nomeSorteado[idx4].equals(bicho1)
                    || nomeSorteado[idx4].equals(bicho2)
                    || nomeSorteado[idx4].equals(bicho3)
                    || nomeSorteado[idx4].equals(bicho4)){
                acertos+=1;
            }



            i++;

        }
        
          switch(acertos){
            
            case 4:
               jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + nomeSorteado[idx] + ", " + nomeSorteado[idx2] + ", " + nomeSorteado[idx3] + " e " +nomeSorteado[idx4]+"\n\n" + "Você... ACERTOOOUU!!! \n\n 4 de 4 acertos\n Parabéns premio máximo!");
               jOptionPane2.showMessageDialog(null, "+100 coins!!!");
                break;
              
            case 3:
                jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + nomeSorteado[idx] + ", " + nomeSorteado[idx2] + ", " + nomeSorteado[idx3] +" e " +nomeSorteado[idx4]+ "\n\n" + "Você... ACERTOOOUU!!! \n\n 3 de 4 acertos\n Parabéns pelo premio!");
                jOptionPane2.showMessageDialog(null, "+75 coins!!!");
                break;
            
            case 2:
                jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + nomeSorteado[idx] + ",  " + nomeSorteado[idx2] + ", " + nomeSorteado[idx3] + " e " +nomeSorteado[idx4]+"\n\n" + "Você... ACERTOUU! \n\n 2 de 4 acertos\n Parabéns pelo premio!");
                 jOptionPane2.showMessageDialog(null, "+50 coins!!!");
                break;
            case 1:
               jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + nomeSorteado[idx] + ",  " + nomeSorteado[idx2] + ", " + nomeSorteado[idx3] + " e " +nomeSorteado[idx4]+"\n\n" + "Você... Acertou! \n\n1 de 4 acertos");
               jOptionPane2.showMessageDialog(null, "+25 coins!!!");
                break;
            default:
              jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + nomeSorteado[idx] + ",  " + nomeSorteado[idx2] + ", " + nomeSorteado[idx3] + " e " +nomeSorteado[idx4]+"\n\n" + "Você... Errou, Tente novamente :(");
              jOptionPane2.showMessageDialog(null, "voce perdeu seus coins apostados");
        }
          

        jButton1.setEnabled(true); 
        jButton2.setEnabled(false);        // TODO add your handling code here:

        jButton3.setEnabled(true); 
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
        jOptionPane2 = new javax.swing.JOptionPane();
        escolha2 = new javax.swing.JComboBox<>();
        escolha1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        escolha4 = new javax.swing.JComboBox<>();
        escolha3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo do Bicho");
        setAutoRequestFocus(false);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        escolha2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        escolha1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Escolha seus bichos");

        escolha4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        escolha3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        jButton2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton2.setText("Sortear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton3.setText("Jogar Novamente");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton1.setText("Inicio");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(escolha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escolha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escolha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escolha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(escolha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Sortear();
               // TODO add your handling code here:
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Voltar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Inicio();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Escolher4Bichos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escolher4Bichos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escolher4Bichos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escolher4Bichos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escolher4Bichos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> escolha1;
    private javax.swing.JComboBox<String> escolha2;
    private javax.swing.JComboBox<String> escolha3;
    private javax.swing.JComboBox<String> escolha4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    // End of variables declaration//GEN-END:variables
}
