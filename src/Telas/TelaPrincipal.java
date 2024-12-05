
package Telas;

import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

public class TelaPrincipal extends javax.swing.JFrame {

    ViewPerfil perfil;
    int idUser;
    
    public TelaPrincipal(int idUser) {
        initComponents();
        
        this.idUser = idUser;
        
        JPrincipal.setLayout(new BoxLayout(JPrincipal, BoxLayout.Y_AXIS));  // Organiza os painéis em coluna
        
        ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane.getVerticalScrollBar().setUnitIncrement(20); // aumenta a velocidade para 20 pixels
        
        this.setLocationRelativeTo(null);
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplMenu = new javax.swing.JPanel();
        btnFeed = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnPost = new javax.swing.JButton();
        btnEditePerfil = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        JPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplMenu.setBackground(new java.awt.Color(204, 204, 204));

        btnFeed.setText("Feed");

        btnPerfil.setText("Perfil");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnPost.setText("+ Post");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });

        btnEditePerfil.setText("Edit Perfil");

        javax.swing.GroupLayout jplMenuLayout = new javax.swing.GroupLayout(jplMenu);
        jplMenu.setLayout(jplMenuLayout);
        jplMenuLayout.setHorizontalGroup(
            jplMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnPost, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnEditePerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        jplMenuLayout.setVerticalGroup(
            jplMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFeed)
                .addGap(68, 68, 68)
                .addComponent(btnPerfil)
                .addGap(64, 64, 64)
                .addComponent(btnPost)
                .addGap(68, 68, 68)
                .addComponent(btnEditePerfil)
                .addGap(253, 253, 253))
        );

        javax.swing.GroupLayout JPrincipalLayout = new javax.swing.GroupLayout(JPrincipal);
        JPrincipal.setLayout(JPrincipalLayout);
        JPrincipalLayout.setHorizontalGroup(
            JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        JPrincipalLayout.setVerticalGroup(
            JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        ScrollPane.setViewportView(JPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jplMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ScrollPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        ViewPerfil perfil = new ViewPerfil(idUser);
        JPrincipal.removeAll();
        JPrincipal.add(perfil);
        JPrincipal.repaint();
        JPrincipal.revalidate();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        CreatePost post = new CreatePost();
        JPrincipal.add(post);
        JPrincipal.repaint();
        JPrincipal.revalidate();
    }//GEN-LAST:event_btnPostActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPrincipal;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnEditePerfil;
    private javax.swing.JButton btnFeed;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPost;
    private javax.swing.JPanel jplMenu;
    // End of variables declaration//GEN-END:variables
}
