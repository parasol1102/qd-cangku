package LongAction;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Servlet;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.config.entities.ActionConfig;

import jdbcDAO.read;
import userBean.User;

public class login extends ActionSupport {
private String name;
private String password;
private boolean falg=false;

    private static final long serialVersionUID = 1L;

    public String logins(){
        ServletActionContext sac=null;
        name=sac.getRequest().getParameter("name");
       password=sac.getRequest().getParameter("password");
        falg=read.isCheck(name, password);
            if(falg){
                return "succes";
    
            }else{
                return "defeat";
            }
        
        
    }
}