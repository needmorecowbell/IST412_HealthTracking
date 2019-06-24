/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iCare;

import java.util.ArrayList;

/**
 *
 * @author adam
 */
public class NotificationController {
    
    ArrayList<Notification> notificationsList = new ArrayList<Notification>();
    
    /**
     * Constructor for the NotificationController class.
     * @param notificationsList List of notifications to hydrate the controller with.
     */
    public NotificationController() {
        this.notificationsList = notificationsList;
    }
    
    
    public void addNotification(Notification n)
    {
       notificationsList.add(n);
    }
    
    public Notification displaynotifcationsList()
    {
        for (Notification n : notificationsList)
        {
            //System.out.println(n.toString());
            return n;
        
        }
        return null;
    }
}
    
