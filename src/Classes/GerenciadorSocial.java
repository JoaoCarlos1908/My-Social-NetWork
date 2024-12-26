
package Classes;

import Telas.CreatePost;
import Telas.SusPerfil;
import Telas.TelaPrincipal;
import Telas.ViewPost;
import Telas.editPerfil;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GerenciadorSocial {

    public GerenciadorSocial() {
        
    }
    
    public void createPost(CreatePost dados){
        Post post = new Post();
        post.setAutor(Integer.parseInt(dados.getName()));
        post.setDescricaoo(dados.getDesc());
        post.setData(this.getDataHoje());
        
        SocialDAO dao = new SocialDAO();
        dao.createPost(post);
    }
    
    public String getDataHoje() {
        LocalDate hoje = LocalDate.now(); // Obtém a data atual
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define o formato desejado
        return hoje.format(formatter); // Retorna a data formatada
    }
    
    public Usuario getUserDao(int idUser){
        SocialDAO dao = new SocialDAO();
        Usuario user = dao.searchUser(idUser);
        return user;
    }
    
    public void MeusPosts(JPanel JPrincipal, int idUser){
        SocialDAO dao = new SocialDAO();
        ArrayList<ViewPost> posts = dao.MyPosts(idUser);
        
        for (int i = posts.size() - 1; i >= 0; i--) {
            ViewPost post = posts.get(i);
            
            JPrincipal.add(post);
        }
        JPrincipal.revalidate();
        JPrincipal.repaint();
    }
    
    public void likePost(ViewPost post, int idUser) {
        int idPost = post.getIdPost(); // Use um método direto para obter o ID do post
        SocialDAO dao = new SocialDAO();

        try {
            if (dao.existsLike(idPost, idUser)) {
                // Já curtiu, então descurtir
                int like = Integer.parseInt(post.getLike());
                --like;
                post.setLike(Integer.toString(like));

                // Remover registro de like na tabela intermediária
                dao.removeLike(idPost, idUser);
            } else {
                // Ainda não curtiu, então curtir
                int like = Integer.parseInt(post.getLike());
                ++like;
                post.setLike(Integer.toString(like));

                // Inserir registro de like na tabela intermediária
                dao.addLike(idPost, idUser);
            }

            // Atualizar o contador de likes no post
            dao.updatePostLikes(post);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao curtir/descurtir o post: " + ex.getMessage());
        }
    }

    public void updateUser(editPerfil edit, int idUser){
        Usuario user = this.getUserDao(idUser);
        user.setNome(edit.getNome());
        user.setIdade(Integer.parseInt(edit.getIdade()));
        user.setFone(edit.getFone());
        user.setBio(edit.getBio());
        
        SocialDAO dao = new SocialDAO();
        dao.updateUser(user, true);
    }
    
    public void sugestaoAmigos(JPanel JsAmigos){
        SocialDAO dao = new SocialDAO();
        ArrayList<Usuario> amigos = new ArrayList<>();
        amigos = dao.listaAmigos();
        
        for(Usuario user: amigos){
            SusPerfil viewAmigos = new SusPerfil();
            viewAmigos.setName(Integer.toString(user.getId()));
            viewAmigos.setNome(user.getNome());
            //viewAmigos.setImagem(user.getImagem());
            
            JsAmigos.add(viewAmigos);
        }
    }
}
