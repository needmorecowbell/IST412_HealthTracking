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
public class UserController {
    
    User user;
    
    /**
     * This is the constructor for the UserController class.
     * @param user sets the user we are handling.
     */
    public UserController(User user) {
        this.user = user;
    }
    public void displayUser()
    {
        System.out.println(user.toString());
    }
    public String getUsername()
    {
        return user.getUsername();
    }
        
}
