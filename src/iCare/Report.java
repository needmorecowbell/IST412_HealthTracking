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
public class Report {
    public Report(){

    }
    
    /**
     * Fetches patient info from the database.
     * @param userId The patient's ID.
     */
    public void getPatientInfo(String userId) {}
    
    /**
     * Generates a report.
     * 
     * @param userId The patient's ID.
     */
    public void generateReport(String userId){
        getPatientInfo(userId);
    }
}
