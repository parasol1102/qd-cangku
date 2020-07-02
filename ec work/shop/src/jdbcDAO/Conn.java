package jdbcDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
public static Connection con;
  public static Connection getconnection() {
      try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
      String url="jdbc:mysql://127.0.0.1:3306/userdb?characterEncoding=utf8";
      String user="root";
      String password="123456";
      try {
        con=DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return con;}
}