package entities;
// Generated Aug 3, 2022 1:23:10 AM by Hibernate Tools 4.3.1



/**
 * LoginUser generated by hbm2java
 */
public class LoginUser  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String password;

    public LoginUser() {
    }

    public LoginUser(String name, String password) {
       this.name = name;
       this.password = password;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


