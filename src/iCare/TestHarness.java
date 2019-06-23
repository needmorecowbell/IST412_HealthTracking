import org.junit.Test;
import static org.junit.Assert.*;

public class TestHarness {
    public static void main(String[] args) {
        testLogin();
        testUserController();

    }

    //Test Login
    @Test
    public void testLogin(){
        Login l = new Login();
        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    //Test UserController
    @Test
    public void testUserController(){
        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testNotifactionController(){
        expected ="";
        given = "";
        assertEquals(expected, given);
    }


    //Test Medication
    @Test
    public void testGetMedName() {

        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetMedName() {
        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public double testGetQuantity() {

        expected ="";
        given = "";
        assertEquals(expected, given);
    }
    @Test
    public void testSetQuantity() {

        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testGetMedQuantityUnit() {
        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetMedQuantityUnit() {
        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testGetFrequency() {
        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetFrequency() {
        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testGetFrequencyTakenUnit() {
        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetFrequencyTakenUnit() {
        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    //Test Medications

    @Test
    public void testGetMedicationList() {

        expected ="";
        given = "";
        assertEquals(expected, given);
    }

    @Test
    public void testSetMedicationList() {
        expected ="";
        given = "";
        assertEquals(expected, given);
    }



}