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
public class User {

    private String username;
    

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public User() {

        
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + '}';
    }


}
