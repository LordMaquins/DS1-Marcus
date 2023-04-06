
package dao;
import factory.ConnectionFactory; 
import Modelo.Usuario; 
import java.sql.*; 
import java.sql.PreparedStatement; 
 import java.sql.SQLException;

public class UsuarioDAO {
  Long id;
  String Nome;
  String Cpf;
  String Email;
  String Telefone;
  
  public UsuarioDAO(){
       Connection connection= new ConnectionFactory().getConnection();
  }
  public void adicional(Usuario usuario){
      String sql= "INSERT INTO usuario(nome,cpf,email,telefone) VALUES (?,?,?,?)";
              try{
                  PreparedStatement stmt= connection.prepareStatement(sql);
                  stmt.setString(1, usuario.getNome());
                  stmt.setString(2,usuario.getCpf());
                  stmt.setString(3,usuario.getEmail());
                  stmt.setString(4,usuario.getTelefone());
                  stmt.execute();
                  stmt.close();
                  
              } catch (SQLException u){
                  throw new RuntimeException(u);
              }
  }

}
