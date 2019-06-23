/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iCare;

/**
 *
 * @author adam
 */
public class Login {
    
    Boolean loggedIn;
    /**
     *
     */
    public Login() {
    }

    /**
     * Checks for login.
     * @return boolean 
     */
    public Boolean isAuthenticated(){
        return this.loggedIn;
    
    }
    
    /**
     * Handles logging in.
     * @return boolean
     */
    Boolean login() {
        this.loggedIn=true;
        return true;
    }
    
    /**
     * The main authentication method.
     * @param user User's username
     * @param password User's password
     */
    public void Authenticate(String user, String password){
        login();
    }
}
