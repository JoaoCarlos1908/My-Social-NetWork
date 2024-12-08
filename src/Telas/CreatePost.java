
package Telas;

import Classes.GerenciadorSocial;
import Classes.Usuario;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CreatePost extends javax.swing.JPanel {

    private int idUser;
    private JPanel JPrincipal;
    
    public CreatePost(int idUser, JPanel JPrincipal) {
        initComponents();
        
        this.idUser = idUser;
        this.JPrincipal = JPrincipal;
        
        txtDesc.setLineWrap(true);// Habilita a quebra de linha automática
        txtDesc.setWrapStyleWord(true);// Faz a quebra entre palavras
        txtDesc.setCaretPosition(0);
        this.ShowPost();
    }

    public void ShowPost(){
        GerenciadorSocial gerenciar = new GerenciadorSocial();
        Usuario user = gerenciar.getUserDao(idUser);
        this.txtPerfil.setText(user.getNome());
        this.txtData.setText(gerenciar.getDataHoje());
        this.setName(Integer.toString(user.getId()));
        
        this.repaint();
        this.revalidate();
    }
    
    public JPanel getJpFoto() {
        return JpFoto;
    }

    public void setJpFoto(JPanel JpFoto) {
        this.JpFoto = JpFoto;
    }

    public String getDesc() {
        return txtDesc.getText();
    }

    public void setDesc(String text) {
        this.txtDesc.setText(text);
    }

    public String getPerfil() {
        return txtPerfil.getText();
    }

    public void setPerfil(String text) {
        this.txtPerfil.setText(text);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JpFoto = new javax.swing.JPanel();
        txtPerfil = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnPublicar = new javax.swing.JButton();
        btnMarcar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 0));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        JpFoto.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout JpFotoLayout = new javax.swing.GroupLayout(JpFoto);
        JpFoto.setLayout(JpFotoLayout);
        JpFotoLayout.setHorizontalGroup(
            JpFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        JpFotoLayout.setVerticalGroup(
            JpFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        txtPerfil.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPerfil.setText("Perfil");

        txtData.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtData.setText("Data Post");

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDesc.setRows(5);
        txtDesc.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                txtDescMouseWheelMoved(evt);
            }
        });
        jScrollPane1.setViewportView(txtDesc);

        btnPublicar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPublicar.setText("Publicar");
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });

        btnMarcar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMarcar.setText("Marcar Amigo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JpFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPerfil)
                                    .addComponent(txtData)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnPublicar)
                                .addGap(50, 50, 50)
                                .addComponent(btnMarcar)))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtPerfil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtData))
                            .addComponent(JpFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPublicar)
                            .addComponent(btnMarcar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_txtDescMouseWheelMoved
    }//GEN-LAST:event_txtDescMouseWheelMoved

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        GerenciadorSocial gerenciar = new GerenciadorSocial();
        gerenciar.createPost(this);
        JPrincipal.removeAll();
        JPrincipal.repaint();
        JPrincipal.revalidate();
    }//GEN-LAST:event_btnPublicarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpFoto;
    private javax.swing.JButton btnMarcar;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtData;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JLabel txtPerfil;
    // End of variables declaration//GEN-END:variables
}
