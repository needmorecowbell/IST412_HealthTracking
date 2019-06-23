package iCare;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestHarness {
    public static void main(String[] args) {
        System.out.print("Testing Login...");
        testLogin();
        System.out.print("success\n");
        
        System.out.println("\nTesting Controllers...");
        
        System.out.print("\tTesting UserController...");
        testUserController();
        System.out.print("success\n");
        
        System.out.print("\tTesting NotificationController...");
        testNotificationController();
        System.out.print("success\n");
        
        System.out.println("\nTesting Medication Class...");

        System.out.print("\tTesting getMedName...");
        testGetMedName();
        System.out.print("success\n");
        
        System.out.print("\tTesting setMedName...");
        testSetMedName();
        System.out.print("success\n");
    
        System.out.print("\tTesting getMedQuantity...");
        testGetMedName();
        System.out.print("success\n");
        
        System.out.print("\tTesting setMedQuantity...");
        testSetMedName();
        System.out.print("success\n");
    }

    //Test Login
    @Test
    public static void testLogin(){
        Login l = new Login();
        l.Authenticate("test", "password");
        boolean given = l.isAuthenticated();
        boolean expected = true;
        assertEquals(expected, given);
    }

    //Test UserController
    @Test
    public static void testUserController(){
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testNotificationController(){
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }


    //Test Medication
    @Test
    public static void testGetMedName() {

        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testSetMedName() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testGetQuantity() {

        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }
    @Test
    public static void testSetQuantity() {

        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testGetMedQuantityUnit() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testSetMedQuantityUnit() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testGetFrequency() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testSetFrequency() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testGetFrequencyTakenUnit() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testSetFrequencyTakenUnit() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    //Test Medications

    @Test
    public static void testGetMedicationList() {

        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public static void testSetMedicationList() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }



}