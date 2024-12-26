package Telas;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class SusPerfil extends javax.swing.JPanel {

 
    public SusPerfil() {
        initComponents();
    }

    public JPanel getJpFoto() {
        return JpFoto;
    }

    public void setJpFoto(JPanel JpFoto) {
        this.JpFoto = JpFoto;
    }

    public String getNome() {
        return txtNome.getText();
    }

    public void setNome(String text) {
        this.txtNome.setText(text);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpFoto = new javax.swing.JPanel();
        txtNome = new javax.swing.JLabel();

        JpFoto.setBackground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout JpFotoLayout = new javax.swing.GroupLayout(JpFoto);
        JpFoto.setLayout(JpFotoLayout);
        JpFotoLayout.setHorizontalGroup(
            JpFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        JpFotoLayout.setVerticalGroup(
            JpFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNome.setText("Nome Perfil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNome)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome)
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpFoto;
    private javax.swing.JLabel txtNome;
    // End of variables declaration//GEN-END:variables
}
