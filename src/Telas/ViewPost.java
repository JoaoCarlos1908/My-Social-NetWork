
package Telas;

import Classes.GerenciadorSocial;
import javax.swing.JScrollPane;

public class ViewPost extends javax.swing.JPanel {

    private int idUser;
    private int idPost;
    
    public ViewPost(int idUser) {
        initComponents();
        
        this.idUser = idUser;
        
        
        txtDesc.setLineWrap(true);// Habilita a quebra de linha automática
        txtDesc.setWrapStyleWord(true);// Faz a quebra entre palavras
        txtDesc.setCaretPosition(0);
        txtDesc.setEditable(false);
        
        ScrollComet.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        ScrollComet.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollComet.getVerticalScrollBar().setUnitIncrement(20); // aumenta a velocidade para 20 pixels
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
        btnCurtur = new javax.swing.JButton();
        btnShare = new javax.swing.JButton();
        ScrollComet = new javax.swing.JScrollPane();
        JpComent = new javax.swing.JPanel();
        txtView = new javax.swing.JLabel();
        txtLike = new javax.swing.JLabel();
        javax.swing.JButton btnEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 204));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

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

        JpFoto.setBackground(new java.awt.Color(255, 0, 0));

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

        btnCurtur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCurtur.setText("Curtir");
        btnCurtur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurturActionPerformed(evt);
            }
        });

        btnShare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnShare.setText("Compartilhar");
        btnShare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpComentLayout = new javax.swing.GroupLayout(JpComent);
        JpComent.setLayout(JpComentLayout);
        JpComentLayout.setHorizontalGroup(
            JpComentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        JpComentLayout.setVerticalGroup(
            JpComentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        ScrollComet.setViewportView(JpComent);

        txtView.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtView.setText("Visualizaçõs");

        txtLike.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtLike.setText("0");

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setText("Edit.");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JpFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPerfil)
                            .addComponent(txtData)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtView)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCurtur)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLike)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShare)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollComet, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtView)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCurtur)
                            .addComponent(txtLike))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShare)
                            .addComponent(btnEditar))
                        .addGap(18, 18, 18)
                        .addComponent(ScrollComet))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JpFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtPerfil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtData)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCurturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurturActionPerformed
        GerenciadorSocial gerenciar = new GerenciadorSocial();
        
        gerenciar.likePost(this, idUser);
        
        this.repaint();
        this.revalidate();
        
    }//GEN-LAST:event_btnCurturActionPerformed

    private void btnShareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShareActionPerformed

    private void txtDescMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_txtDescMouseWheelMoved
    }//GEN-LAST:event_txtDescMouseWheelMoved

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdPost() {
        idPost = Integer.parseInt(this.getName());
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }
    
    public String getLike() {
        return txtLike.getText();
    }

    public void setLike(String text) {
        this.txtLike.setText(text);
    }

    public String getData() {
        return txtData.getText();
    }

    public void setData(String text) {
        this.txtData.setText(text);
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

    public String getView() {
        return txtView.getText();
    }

    public void setView(String text) {
        this.txtView.setText(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpComent;
    private javax.swing.JPanel JpFoto;
    private javax.swing.JScrollPane ScrollComet;
    private javax.swing.JButton btnCurtur;
    private javax.swing.JButton btnShare;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtData;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JLabel txtLike;
    private javax.swing.JLabel txtPerfil;
    private javax.swing.JLabel txtView;
    // End of variables declaration//GEN-END:variables
}
