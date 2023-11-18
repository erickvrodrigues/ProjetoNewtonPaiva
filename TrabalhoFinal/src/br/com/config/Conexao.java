package br.com.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static final String url = "jdbc:postgresql://localhost/trabalhoFinal";
    private  static final String user = "postgres";
    private static  final String password = "123456";

   public Connection getConexao() {
       try{
           Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/trabalhoFinal","postgres","123456");
           return connection;
       }catch (Exception e){
          e.printStackTrace();
       }
    return null;
   }


}
