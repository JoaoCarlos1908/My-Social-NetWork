
package Classes;

import java.sql.Date;
import java.util.ArrayList;

public class Perfil {
    //Atributos
    private int id;
    private String nome;
    private Date data;
    private String fone;
    private int seguidores;
    private String bio ;
    private ArrayList<Perfil> amigos;
    
    //Construtor
    public Perfil() {
    }
    
    //Metodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public ArrayList<Perfil> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Perfil> amigos) {
        this.amigos = amigos;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }
    
}
