
package Classes;

import Telas.CreatePost;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
}
