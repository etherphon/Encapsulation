/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author etherdesign
 */
public class Owner {
 
    private Pet p;
 
    public Owner() {
        
    }
    
    public void adoptCat(String name, int age) {
        Pet c = new Cat(name, age);
        p = c;
    }
    
    public void tendTo() {
        p.Care();
    }
    
    public String getPetName() {
        return p.getName();
    }
    
}
