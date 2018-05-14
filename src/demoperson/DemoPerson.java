/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoperson;

/**
 *
 * @author aejan
 */
public class DemoPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person(8);
        System.out.println("p1: "+p1.getAge());
        
        p1.setAge(251);
        
        System.out.println("after"+ p1.getAge());
    }
    
}
