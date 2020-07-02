package jdbcDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class Add {
	public static boolean Adds(String name,String password){
	    Connection con=Conn.getconnection();
	    boolean falg=false;
	    PreparedStatement ps=null;
	    String sql="insert into user(name,password)values(?,?)";
	    try {
	        ps=(PreparedStatement) con.prepareStatement(sql);
	        ps.setString(1, name);
	        ps.setString(2, password);
	        int i=ps.executeUpdate();
	        if(i==1){
	            falg=true;
	        }
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    return falg;
}}
