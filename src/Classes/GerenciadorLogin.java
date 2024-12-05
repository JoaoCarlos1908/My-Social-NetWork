
package Classes;

import Telas.DadosCadastro;
import Telas.TelaDeCadastro;
import Telas.TelaDeLogin;
import Telas.TelaPrincipal;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GerenciadorLogin {
    
    DadosCadastro dados;
    TelaDeCadastro cadastro;
    TelaDeLogin login;
    
    public GerenciadorLogin(DadosCadastro dados, TelaDeCadastro cadastro, TelaDeLogin login) {
        this.dados = dados;
        this.cadastro = cadastro;
        this.login = login;
    }
    
    public void Acessar(){
        SocialDAO dao = new SocialDAO();
        if(dao.verifyUser(login.getUser(), "usuario")){
            if(dao.verifyPass(login.getUser(), login.getPass())){
            Usuario user = new Usuario();
            user = dao.searchUser(login.getUser(), login.getPass());
            TelaPrincipal principal = new TelaPrincipal(user.getId());
                principal.setVisible(true);
                login.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto!");
        }
    }
    
    public Boolean txtNull(Container container){
        for (Component component : container.getComponents()) {
            // Verifica se o componente é um JTextField
            if (component instanceof JTextField) {
                JTextField campoTexto = (JTextField) component;
                if (campoTexto.getText() == null || campoTexto.getText().trim().isEmpty()) {
                    return true; // Retorna true se encontrar algum campo vazio
                }
            } else if (component instanceof Container) {
                // Se o componente for outro container, verifica recursivamente
                if (txtNull((Container) component)) {
                    return true;
                }
            }
        }
        return false; // Retorna false se nenhum campo estiver vazio
    }
    
    public void salvarUser(){
        if(this.txtNull(dados)){
            JOptionPane.showMessageDialog(null, "Prencha todos os Dados!");
        }else{
            if(dados.getPass().equals(dados.getPassC())){
                SocialDAO dao = new SocialDAO();
                Usuario user = new Usuario();
                user.setNome(dados.getNome());
                user.setIdade(Integer.parseInt(dados.getIdade()));
                user.setTell(dados.getTell());
                user.setUser(dados.getUser());
                user.setSenha(dados.getPass());
                
                dao.createUser(user);
                
                JOptionPane.showMessageDialog(null, "Cadastro Realizado!");
                TelaDeLogin login = new TelaDeLogin();
                login.setVisible(true);
                cadastro.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Senha não coincide!");
            }
        }
    }
    
}
