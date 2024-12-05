
package Classes;

import java.util.ArrayList;

public class Usuario {
    //Atributos
    private int id;
    private String user;
    private String senha;
    private String nome;
    private int idade;
    private String fone;
    private int seguidores;
    private String bio ;
    private ArrayList<Usuario> amigos;
    
    //Construtor

    public Usuario() {
        this.id = 0;
        this.user = "";
        this.senha = "";
        this.nome = "";
        this.idade = 0;
        this.fone = "";
        this.seguidores = 0;
        this.bio = "";
    }
    
    //Metodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTell() {
        return fone;
    }

    public void setTell(String tell) {
        this.fone = tell;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }
    
}
