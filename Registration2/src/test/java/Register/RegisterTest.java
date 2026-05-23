/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Register;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import test.registration2.login2;

/**
 *
 * @author username
 */
public class RegisterTest {
    
    public RegisterTest() {
    }

    login2 log = new login2 ();
     String firstName = "TEBOGO";
     String lastName = "NGOASH";
  
   
    // Test correct username
    @Test
    public void testCorrectUsername() {
        boolean result = log.checkUserName("kyl_1");
        assertTrue(result);
        System.out.print("welcome "+ firstName +" "+ lastName+  " it is great to see you");
    }

    // Test Incorrect username
    @Test
    public void testIncorrectUsername() {
        boolean result = log.checkUserName("kyle!!!!");
        assertFalse(result);
        System.out.print("Username is not correctly formatted;please ensure that your username contains an underscore and is no more than five characters in length.");
    }

    // Test Correct password
    @Test
    public void testCorrectPassword() {
        boolean result = log.checkPasswordComplexity("Ch&&sec@ke99!");
        assertTrue(result);
        System.out.print("Password successfully captured");
    }

    // Test Incorrect password
    @Test
    public void testIncorrectPassword() {
        boolean result = log.checkPasswordComplexity("passord");
        assertFalse(result);
        System.out.print("Password is not correctly formatterd;please ensure that the password contains at least eight characters,a capital letter,a number,and a special character.");
    }

    // Test Correct phone number
    @Test
    public void testCorrectPhoneNumber() {
        boolean result = log.checkCellPhoneNumber("+27838968976");
        assertTrue(result);
        System.out.print("Cell number successfully captured.");
    }

    // Test Incorrect incorrect phone number
    @Test
    public void testIncorrectPhoneNumber() {
        boolean result = log.checkCellPhoneNumber("08966553");
        assertFalse(result);
        System.out.print("Cell number is incorrectly formatted or does not contain an international code;please correct the number and try again.");
    }
    @Test
   
public void testReturnLoginStatus(){

    login2 log = new login2();

    
    boolean loginStatus = true;

    // Expected Response
    String expectedResponse = "Welcome "+firstName+ lastName+  "it is great to see you again.";

    String result = log.returnLoginStatus(loginStatus);

    assertEquals(expectedResponse, result);

}

@Test
public void testReturnLoginStatusFailed(){

    login2 log = new login2();

    
    boolean loginStatus = false;
    
    // Expected response
    String expectedResponse = "Username or password incorrect, please try again.";

    String result = log.returnLoginStatus(loginStatus);

    assertEquals(expectedResponse, result);

}
}

