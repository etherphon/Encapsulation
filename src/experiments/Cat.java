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
public class Cat extends Pet {
    
    public Cat() {
        
    }
    
    public Cat(String name, int age) {
       super(name, age);
    }

    @Override
    public void Care() {
        this.Feed();
        this.Pet();
        this.Play();
    }
    
    private void Pet() {
        System.out.println("The cat purrs.");
        this.setMood("happy");
    }
    
    private void Feed() {
        System.out.println(this.getName() + " eats thier Fancy Feast.");
        this.setMood("full");
    }
    
    private void Play() {
        System.out.println(this.getName() + " play with their ball of yarn.");
        this.setMood("playful");
    }
    
    
}
