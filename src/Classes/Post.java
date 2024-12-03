
package Classes;

import java.net.URL;
import java.util.ArrayList;

public class Post {
    //Atributos
    private int id;
    private Perfil autor;
    private int visualisacoes;
    private int Curtidas;
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

    public Perfil getAutor() {
        return autor;
    }

    public void setAutor(Perfil autor) {
        this.autor = autor;
    }

    public int getVisualisacoes() {
        return visualisacoes;
    }

    public void setVisualisacoes(int visualisacoes) {
        this.visualisacoes = visualisacoes;
    }

    public int getCurtidas() {
        return Curtidas;
    }

    public void setCurtidas(int Curtidas) {
        this.Curtidas = Curtidas;
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
