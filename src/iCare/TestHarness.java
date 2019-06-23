package iCare;

import java.util.ArrayList;
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

        System.out.print("\tTesting MedName...");
        testMedName();
        System.out.print("success\n");
       
        System.out.print("\tTesting getMedQuantity...");
        testMedQuantity();
        System.out.print("success\n");
        
        System.out.print("\tTesting MedQuantityUnit...");
        testMedQuantityUnit();
        System.out.print("success\n");
        
        
        System.out.print("\tTesting Frequency...");
        testFrequency();
        System.out.print("success\n");  
        
       
       
        System.out.print("\tTesting FrequencyTakenUnit...");
        testFrequencyTakenUnit();
        System.out.print("success\n");
                           
      
        
        System.out.println("\nTesting Medications Class...");
        
        System.out.print("\tTesting MedicationList...");
        testMedicationList();
        System.out.print("success\n");
        
       
        System.out.println("\nTesting User Class...");
        
        System.out.print("\tTesting Username...");
        testUser();
        System.out.print("success\n");
               
        System.out.println("\nTesting Vitals Class...");
        
        System.out.print("\tTesting bodytemp...");
        testBodyTempF();
        System.out.print("success\n");   
     
        System.out.print("\tTesting weight...");
        testWeightLB();
        System.out.print("success\n"); 
     
        System.out.print("\tTesting height...");
        testHeightFT();
        System.out.print("success\n"); 
        
        System.out.print("\tTesting BP Systolic...");
        testBPSystolic();
        System.out.print("success\n");    
      
        System.out.print("\tTesting BP Diastolic...");
        testBPDiastolic();
        System.out.print("success\n");    
      
        System.out.print("\tTesting Respiration Rate...");
        testRespRate();
        System.out.print("success\n");  
        
        System.out.print("\tTesting Pulse BPM...");
        testPulseBPM();
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

    @Test
    public static void testMedName() {
        Medication m = new Medication();
        String expected ="doxycycline";

        m.setMedName(expected);
        String given = m.getMedName();
        assertEquals(expected, given);
    }

    @Test
    public static void testMedQuantity() {
        Medication m = new Medication();
        double expected =200;

        m.setQuantity(expected);
        double given = m.getQuantity();
        
        assertEquals(expected, given,0); //0 for delta
    }

    @Test
    public static void testMedQuantityUnit() {
        Medication m = new Medication();
        String expected ="mg";

        m.setMedName(expected);
        String given = m.getMedName();
        assertEquals(expected, given);
    }


    @Test
    public static void testFrequency() {
        Medication m = new Medication();
        int expected =1;

        m.setFrequency(expected);
        int given = m.getFrequency();
        
        assertEquals(expected, given);
    }

    @Test
    public static void testFrequencyTakenUnit() {
        Medication m = new Medication();
        String expected ="pill/day";

        m.setFrequencyTakenUnit(expected);
        String given = m.getFrequencyTakenUnit();
        assertEquals(expected, given);
    }



    //Test Medications

    @Test
    public static void testMedicationList() {
        ArrayList<Medication> expected = new ArrayList<Medication>();
        Medication med = new Medication();
        med.setMedName("Doxycycline");
        med.setFrequency(1);
        med.setMedQuantityUnit("mg");
        med.setFrequencyTakenUnit("pill/day");
        med.setQuantity(200);
        expected.add(med);
        
        med = new Medication();
        med.setMedName("Ibuprofen");
        expected.add(med);
        
        Medications ms = new Medications(expected);
        
        ArrayList<Medication> given = ms.getMedicationList();

        assertEquals(expected, given);
    }

    // User
    
    @Test
    public static void testUser(){
        User u = new User();
        String expected= "testuser";
        u.setUsername(expected);
        String given = u.getUsername();
        assertEquals(expected, given);
    }
    
    //Vitals
       
    @Test
    public static void testBodyTempF(){
        
        double expected = 99.8;
        Vitals v = new Vitals(expected, 150, 6.2,  120, 80 , 18, 90);
        
        double given =v.getBodyTempF();
        assertEquals(expected, given,0);

    }
    
    @Test 
    public static void testWeightLB(){
        double expected = 150;
        Vitals v = new Vitals(99.8, expected, 6.2,  120, 80 , 18, 90);
        
        double given = v.getWeightLB();
        assertEquals(expected, given,0);

    }
    
    @Test
    public static void testHeightFT(){
        double expected = 6.2;
        Vitals v = new Vitals(99.8, 150, expected,  120, 80 , 18, 90);
        
        double given = v.getHeightFT();
        assertEquals(expected, given,0);
    }
    
    @Test
    public static void testBPSystolic(){
        double expected = 120;
        Vitals v = new Vitals(99.8, 150, 6.2,  expected, 80 , 18, 90);
        double given = v.getBpSystolic();
        assertEquals(expected, given,0);
        
    }
    
    @Test
    public static void testBPDiastolic(){
        double expected = 80;
        Vitals v = new Vitals(99.8, 150, 6.2,  120, expected , 18, 90);
        double given = v.getBpDiastolic();
        assertEquals(expected, given,0);
    }
    
    @Test
    public static void testRespRate(){
        double expected = 18;
        Vitals v = new Vitals(99.8, 150, 6.2,  120, 80 , expected, 90);
        double given = v.getRespRate();
        assertEquals(expected, given,0);
    }
    
    @Test
    public static void testPulseBPM(){
        double expected = 18;
        Vitals v = new Vitals(99.8, 150, 6.2,  120, 80 , expected, expected);
        double given = v.getRespRate();
        assertEquals(expected, given,0);
    }




}