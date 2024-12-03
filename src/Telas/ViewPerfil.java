
package Telas;


public class ViewPerfil extends javax.swing.JPanel {

    public ViewPerfil() {
        initComponents();
        
        txtBio.setLineWrap(true);// Habilita a quebra de linha automática
        txtBio.setWrapStyleWord(true);// Faz a quebra entre palavras
        txtBio.setCaretPosition(0);
        txtBio.setEditable(false);
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
        txtSeguidores.setText("Seguidores");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSeguidores)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSeguir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnDeixarDeSeguir))
                    .addComponent(txtFone)
                    .addComponent(txtNome)
                    .addComponent(txtIdade))
                .addGap(107, 126, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdade)
                        .addGap(18, 18, 18)
                        .addComponent(txtFone)
                        .addGap(18, 18, 18)
                        .addComponent(txtSeguidores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeixarDeSeguir)
                            .addComponent(btnSeguir)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeguirActionPerformed

    private void btnDeixarDeSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeixarDeSeguirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeixarDeSeguirActionPerformed


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
    // End of variables declaration//GEN-END:variables
}
