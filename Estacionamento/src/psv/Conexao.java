
package psv;

import java.sql.*;
public class Conexao {
    public static Connection abrirConexao(){
        Connection con= null;
        // Faz a conexão com o banco
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url= "";
        url+="jdbc:mysql://127.0.0.1/estacionamento?";
        url +="user=root&password=";
        
        con= DriverManager.getConnection(url);
        
        System.out.println("Conexão Aberta.");
        
        } catch (SQLException e ){
            System.out.println(e.getMessage ());
            
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }  catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    
    //Fecha a conexão com o banco
    public static   void FecharConexao (Connection con ){
        try{
            con.close();
            System.out.println("Conexao fechada.");
        } catch (SQLException e){
             System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

