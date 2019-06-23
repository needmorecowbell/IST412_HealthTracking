package iCare;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestHarness {
    public static void main(String[] args) {
        testLogin();
        
        testUserController();

    }

    //Test Login
    @Test
    public static void testLogin(){
        Login l = new Login();
        String expected ="";
        String given = "";
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
    public static void testNotifactionController(){
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }


    //Test Medication
    @Test
    public void testGetMedName() {

        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetMedName() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testGetQuantity() {

        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }
    @Test
    public void testSetQuantity() {

        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testGetMedQuantityUnit() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetMedQuantityUnit() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testGetFrequency() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetFrequency() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testGetFrequencyTakenUnit() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetFrequencyTakenUnit() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    //Test Medications

    @Test
    public void testGetMedicationList() {

        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetMedicationList() {
        String expected ="";
        String given = "";
        assertEquals(expected, given);
    }



}