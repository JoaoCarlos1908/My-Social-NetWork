
package Classes;

import java.net.URL;
import java.util.ArrayList;

public class Post {
    //Atributos
    private int id;
    private int idAutor;
    private int view;
    private int like;
    private ArrayList<String> comentarios;
    private String descricaoo;
    private URL midia;
    
    //Construtor
    public Post() {
    }
    
    //Metodos
    public void curtir(){}
    public void comentar(){}
    public void compartilhar(){}
    public void editar(){}
    public void contarVisualizacao(){}
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getidAutor() {
        return idAutor;
    }

    public void setAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getView() {
        return view;
    }

    public void setView(int visualisacoes) {
        this.view = visualisacoes;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public String getDescricaoo() {
        return descricaoo;
    }

    public void setDescricaoo(String descricaoo) {
        this.descricaoo = descricaoo;
    }

    public URL getMidia() {
        return midia;
    }

    public void setMidia(URL midia) {
        this.midia = midia;
    }

}
