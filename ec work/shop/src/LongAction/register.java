package LongAction;

import org.apache.struts2.ServletActionContext;

import jdbcDAO.Add;
import jdbcDAO.read;

public class register {
private boolean falg=false;
private String name;
private String password;
    public String registers(){
        ServletActionContext sac=null;
        name=sac.getRequest().getParameter("name");
       password=sac.getRequest().getParameter("password");
      
        falg=read.isCheck1(name); //ец
        if(!falg){
            falg=Add.Adds(name, password);
            if(falg){
            
                return "succes";
            }
            else{
                
                
                return "defeat";
            }

        }else{
            return "defeat";
        }
    }
}