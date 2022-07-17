
package Controller;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;



public class FabricaConexao {
private Connection conexao;
private String URL = "jdbc:mysql://localhost:3306/sistema?userSSL=false";
private String USUARIO = "root";
private String PASSWORD = "root" ;

public Connection getConnection() {
      try {
          return DriverManager.getConnection(URL,USUARIO,PASSWORD);
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
  }

}
