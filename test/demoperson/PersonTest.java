/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoperson;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aejan
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new Person(8);
        String expResult = "Person{age=8}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Person instance = new Person(8);
        int expResult = 8;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setAge method, of class Person.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 11;
        Person instance = new Person(86);
        
        instance.setAge(age);
        int result = instance.getAge();
        int expResult = 55;
        // TODO review the generated test code and remove the default call to fail.
            assertEquals(expResult, result);
    }
    
     @Test
    public void testSetAgeToBig() {
        System.out.println("setAgeToBig");
        int age = 155;
        Person instance = new Person(50);
        
        instance.setAge(age);
        int result = instance.getAge();
        int expResult = 155;
        // TODO review the generated test code and remove the default call to fail.
            assertEquals("trying 155 should be 150",expResult, result);
    }
    
}
