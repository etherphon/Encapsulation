/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author jhedding
 */
public class Company {
    
    private HRmanager hr;
    
    public Company() {
        hr = new HRmanager();
    }
    
    public void orientNewEmployee(Employee e) {
      hr.orient(e);
      
    }
}
