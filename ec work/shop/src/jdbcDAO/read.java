package jdbcDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class read {
	public static boolean isCheck(String name,String password){
        Connection con=Conn.getconnection();
        String sql="select * from user";
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            ps=(PreparedStatement) con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                String name1=rs.getString("name");
                String password1=rs.getString("password");
                if(name1.equals(name)&&password1.equals(password)){
                    return true;
                    
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;}
        public static boolean isCheck1(String name){
            Connection con=Conn.getconnection();
            String sql="select * from user";
            PreparedStatement ps=null;
            ResultSet rs=null;
            try {
                ps=(PreparedStatement) con.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    String name1=rs.getString("name");
                    
                    if(name1.equals(name)){
                        return true;
                        
                    }
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return false;
            
        }
}
