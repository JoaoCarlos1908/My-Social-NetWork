package Telas;

import Classes.GerenciadorSocial;
import java.awt.GridBagLayout;
import javax.swing.JPanel;


public class SusPerfil extends javax.swing.JPanel {

        JPanel JPrincipal;
        int idUser;
 
    public SusPerfil(JPanel JPrincipal) {
        this.JPrincipal = JPrincipal;
        this.idUser = Integer.parseInt(JPrincipal.getName());
        this.setLayout(new GridBagLayout()); 
        initComponents();
    }
    
    public int getId(){
        return Integer.parseInt(this.getName());
    }
    public void setId(int id){
        this.setName(Integer.toString(id));
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

        JpFoto.setBackground(new java.awt.Color(0, 0, 255));
        JpFoto.setPreferredSize(new java.awt.Dimension(110, 110));
        JpFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JpFotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JpFotoLayout = new javax.swing.GroupLayout(JpFoto);
        JpFoto.setLayout(JpFotoLayout);
        JpFotoLayout.setHorizontalGroup(
            JpFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        JpFotoLayout.setVerticalGroup(
            JpFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNome.setText("Nome Perfil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JpFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JpFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JpFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpFotoMouseClicked
        GerenciadorSocial gerenciar = new GerenciadorSocial();
        ViewPerfil perfil = new ViewPerfil(idUser, Integer.parseInt(this.getName()));
        JPrincipal.removeAll();
        perfil.btnSeguirVisibleTrue();
        perfil.btnNoSeguirVisibleTrue();
        JPrincipal.add(perfil);
        gerenciar.MeusPosts(JPrincipal, Integer.parseInt(this.getName()));
        JPrincipal.repaint();
        JPrincipal.revalidate();
    }//GEN-LAST:event_JpFotoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpFoto;
    private javax.swing.JLabel txtNome;
    // End of variables declaration//GEN-END:variables
}
