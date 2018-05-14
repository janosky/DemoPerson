/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aejan
 */
public class School {
    
    private String name;

    public School(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School is OCC" ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
    
    
    
}
