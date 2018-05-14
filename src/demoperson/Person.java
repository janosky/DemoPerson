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
public class Person {
    
    private int age;

    public Person(int age) {
        setAge(age);
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        
        if (age < 0)
        {
            this.age = 0;
        }
        else if (age > 150)
        {
            this.age = 150;
        }
        else{
              this.age = age;
              
             
             
        }
      
    }

}
