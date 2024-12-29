
package Telas;

import Classes.GerenciadorSocial;
import Classes.Usuario;
import javax.swing.JLabel;


public class ViewPerfil extends javax.swing.JPanel {

    int idUser;
    int idSus;
    Boolean x;
    
    public ViewPerfil(int idUser) {
        initComponents();
        
        this.idUser = idUser;
        this.ShowView(idUser);
        txtBio.setLineWrap(true);// Habilita a quebra de linha automática
        txtBio.setWrapStyleWord(true);// Faz a quebra entre palavras
        txtBio.setCaretPosition(0);
        txtBio.setEditable(false);
        x = true;
    }
    public ViewPerfil(int idUser, int idSus) {
        initComponents();
        
        this.idUser = idUser;
        this.idSus = idSus;
        this.ShowView(idSus);
        txtBio.setLineWrap(true);// Habilita a quebra de linha automática
        txtBio.setWrapStyleWord(true);// Faz a quebra entre palavras
        txtBio.setCaretPosition(0);
        txtBio.setEditable(false);
        x = false;
    }

    public void ShowView(int id){
        GerenciadorSocial gerenciar = new GerenciadorSocial();
        Usuario user = gerenciar.getUserDao(id);

        this.txtNome.setText(user.getNome());
        this.txtFone.setText("Fone: " + user.getFone());
        this.txtIdade.setText("Idade: " + Integer.toString(user.getIdade()));
        this.txtBio.setText(user.getBio());
        this.txtSeguidores.setText(Integer.toString(user.getSeguidores()));
        
        this.repaint();
        this.revalidate();
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdSus() {
        return idSus;
    }

    public void setIdSus(int idSus) {
        this.idSus = idSus;
    }

    public int getSeguidores() {
        return Integer.parseInt(this.txtSeguidores.getText());
    }

    public void setSeguidores(int Seguidores) {
        this.txtSeguidores.setText(Integer.toString(Seguidores));
    }
    
    public void btnSeguirVisibleTrue(){
        this.btnSeguir.setVisible(true);
    }
    public void btnSeguirVisibleFalse(){
        this.btnSeguir.setVisible(false);
    }
    
    public void btnNoSeguirVisibleTrue(){
        this.btnDeixarDeSeguir.setVisible(true);
    }
    public void btnNoSeguirVisibleFalse(){
        this.btnDeixarDeSeguir.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtFone = new javax.swing.JLabel();
        txtIdade = new javax.swing.JLabel();
        txtSeguidores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBio = new javax.swing.JTextArea();
        btnSeguir = new javax.swing.JButton();
        btnDeixarDeSeguir = new javax.swing.JButton();
        txtSeguidores1 = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblFoto.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblFoto.setText("Foto Perfil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblFoto)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblFoto)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtNome.setText("Nome do Usuario");

        txtFone.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtFone.setText("Telefone");

        txtIdade.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtIdade.setText("Idade");

        txtSeguidores.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtSeguidores.setText("0");

        txtBio.setColumns(20);
        txtBio.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtBio.setRows(5);
        txtBio.setText("Biografia");
        jScrollPane1.setViewportView(txtBio);

        btnSeguir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSeguir.setText("Seguir");
        btnSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguirActionPerformed(evt);
            }
        });

        btnDeixarDeSeguir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeixarDeSeguir.setText("Deixar de Seguir");
        btnDeixarDeSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeixarDeSeguirActionPerformed(evt);
            }
        });

        txtSeguidores1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtSeguidores1.setText("Seguidores:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSeguir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnDeixarDeSeguir))
                    .addComponent(txtFone)
                    .addComponent(txtNome)
                    .addComponent(txtIdade)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSeguidores1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSeguidores)))
                .addGap(107, 126, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdade)
                        .addGap(18, 18, 18)
                        .addComponent(txtFone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSeguidores)
                            .addComponent(txtSeguidores1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeixarDeSeguir)
                            .addComponent(btnSeguir)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguirActionPerformed
       GerenciadorSocial gerenciar = new GerenciadorSocial();
        
        gerenciar.Seguidores(this, idUser);
        
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_btnSeguirActionPerformed

    private void btnDeixarDeSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeixarDeSeguirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeixarDeSeguirActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeixarDeSeguir;
    private javax.swing.JButton btnSeguir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextArea txtBio;
    private javax.swing.JLabel txtFone;
    private javax.swing.JLabel txtIdade;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSeguidores;
    private javax.swing.JLabel txtSeguidores1;
    // End of variables declaration//GEN-END:variables
}
