package pojo;
// Generated Oct 12, 2022 2:20:49 PM by Hibernate Tools 4.3.1

import dao.LoginDAO;
import java.util.List;
import javax.faces.bean.ManagedBean;




/**
 * Admin generated by hbm2java
 */
@ManagedBean
public class Admin  implements java.io.Serializable {


     private Integer idAdmin;
     private String username;
     private String password;

    public Admin() {
    }
    
    public String login_user(){
         LoginDAO uDao = new LoginDAO();
         List<Admin> us = uDao.getBy(username, password);
         try{
            if (us != null){
                username = us.get(0).username;
                password = us.get(0).password;
                return "adminutama";
            }    
        }catch (Exception e){
            System.out.print(e);
        }
        return "adminLogingagal";
     }

    public Admin(String username, String password) {
       this.username = username;
       this.password = password;
    }
   
    public Integer getIdAdmin() {
        return this.idAdmin;
    }
    
    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


