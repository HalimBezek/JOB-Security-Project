/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanfile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author klm
 */
@ManagedBean
@RequestScoped
public class managedBean {

    public String uname;
    public  String password;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String usercontrol(){
        String login;
        if((uname.trim() == "halim") && (password =="123")){
        login = "1";
        return "mainform?faces-redirect=true";
              }
        else{ login="0";
        return login;
            }
      
    }
    /**
     * Creates a new instance of managedBean
     */
    public managedBean() {
    }
    
}
