/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.User_Authentication;
import ec.edu.espe.model.KeyClass.User;

/**
 *
 * @author Usuario
 */
public class UserSession {
    private User user; 
    
    public void clearUser(){
        
    }
    public User getCurrentUser(){
        return user;
    }

    public User getUser() {
        return user;
    }

  
    public void setUser(User user) {
        this.user = user;
    }
    
}
