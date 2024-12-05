package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SocialDAO {
 
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    //Metodos
    public void createUser(Usuario user){//create
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement("INSERT INTO user(usuario, senha, nome, idade, tell)VALUES(?,?,?,?,?)");
        
            stmt.setString(1, user.getUser());
            stmt.setString(2, user.getSenha());
            stmt.setString(3, user.getNome());
            stmt.setInt(4, user.getIdade());
            stmt.setString(5, user.getTell());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closerConnection(con, stmt);
        }
    }
    
    public ArrayList<Usuario> readUser() {
        String sql = "SELECT * FROM user";
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setId(rs.getInt("id"));
                user.setUser(rs.getString("usuario"));
                user.setSenha(rs.getString("senha"));
                user.setNome(rs.getString("nome"));
                user.setIdade(rs.getInt("idade"));
                user.setTell(rs.getString("tell"));
            
                usuarios.add(user); // Adiciona a tarefa à lista*/
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar tarefas: " + ex.getMessage());
        } finally {
            ConnectionFactory.closerConnection(con, stmt, rs);
        }
    
        return usuarios;
    }
    
    public void updateUser(Usuario user, Boolean estado) {
        try {
            // Obter a conexão (substitua pelo seu método de conexão)
            con = ConnectionFactory.getConnection();
            // Query SQL para atualizar a tarefa existente
            String sql = "UPDATE uer SET usuario = ?, senha = ? WHERE id = ?";
            
            if (estado) {
                stmt = con.prepareStatement(sql);

                //Preenchendo os parâmetros da query
                stmt.setString(1, user.getUser());
                stmt.setString(2, user.getSenha());
                stmt.setInt(3, user.getId()); // ID da tarefa para atualização

                // Executa a query
                stmt.executeUpdate();
            
            } else {
                // Chama o método responsável por adicionar uma nova tarefa
                this.createUser(user);
            }
        } catch (SQLException ex) {
            // Exibe mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao salvar ou editar a tarefa: " + ex.getMessage());
        } finally {
            // Fecha conexão
            ConnectionFactory.closerConnection(con, stmt);
        }
    }   
    
     public void deleteUser(Usuario user) {
         try {
            // Obter a conexão (substitua pelo seu método de conexão)
            con = ConnectionFactory.getConnection();
            // Preparar a instrução SQL para deletar a tarefa pelo ID
            String sql = "DELETE FROM user WHERE id = ?";
            stmt = con.prepareStatement(sql);

            //Definir o ID da tarefa como parâmetro
            stmt.setInt(1, user.getId());

            // Executar a instrução
            int rowsAffected = stmt.executeUpdate();

            // Feedback para o usuário
            if (rowsAffected > 0) {
                 
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma tarefa encontrada com o ID especificado.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover a tarefa: " + ex.getMessage());
        } finally {
            // Fechar a conexão e a declaração
            ConnectionFactory.closerConnection(con, stmt);
        }
        this.readUser();
    }

    public boolean verifyUser(String texto, String nomeColuna) {
        String sql = "SELECT EXISTS (SELECT 1 FROM user WHERE " + nomeColuna + " = ? COLLATE utf8mb4_bin) AS texto_presente";
        con = ConnectionFactory.getConnection();
        boolean existe = false;

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, texto); // Substitui o ? pelo texto exato que está sendo pesquisado
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    existe = rs.getBoolean("texto_presente"); // Pega o valor do alias da consulta
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Exibe o erro no console
        }

        return existe;
    }  
    
    public boolean verifyPass(String username, String password) {
        String sql = "SELECT senha FROM user WHERE usuario = ? COLLATE utf8mb4_bin";
        con = ConnectionFactory.getConnection();
        boolean isAuthenticated = false;

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, username); // Define o parâmetro para o nome de usuário

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Obtemos a senha armazenada no banco de dados
                    String storedPassword = rs.getString("senha");
                    // Comparar a senha armazenada com a senha fornecida
                    isAuthenticated = storedPassword.equals(password); // Aqui você pode aplicar hashing para mais segurança
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Exibe o erro no console
        }
        return isAuthenticated;
    }

    public void createPost(Post post){
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement("INSERT INTO post(idAutor, descricao, data)VALUES(?,?,?)");
        
            stmt.setInt(1, post.getidAutor());
            stmt.setString(2, post.getDescricao());
            stmt.setString(3, post.getData());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Post salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar post: "+ex);
        }finally{
            ConnectionFactory.closerConnection(con, stmt);
        }
    }
    
    public Usuario searchUser(String username, String password) {
        String sql = "SELECT * FROM user WHERE usuario = ? AND senha = ?";
        Usuario user = new Usuario();
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, username); // Substitui o primeiro '?' pelo valor de username
            stmt.setString(2, password); // Substitui o segundo '?' pelo valor de password
            rs = stmt.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setUser(rs.getString("usuario"));
                user.setSenha(rs.getString("senha"));
                user.setNome(rs.getString("nome"));
                user.setIdade(rs.getInt("idade"));
                user.setTell(rs.getString("tell"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário: " + ex.getMessage());
        } finally {
            ConnectionFactory.closerConnection(con, stmt, rs);
        }

        return user;
    }
    
    public Usuario searchUser(int idUser) {
        String sql = "SELECT * FROM user WHERE id = ?";
        Usuario user = new Usuario();
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idUser); // Substitui o primeiro '?' pelo valor de username
            rs = stmt.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setUser(rs.getString("usuario"));
                user.setSenha(rs.getString("senha"));
                user.setNome(rs.getString("nome"));
                user.setIdade(rs.getInt("idade"));
                user.setTell(rs.getString("tell"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário: " + ex.getMessage());
        } finally {
            ConnectionFactory.closerConnection(con, stmt, rs);
        }

        return user;
    }
}
