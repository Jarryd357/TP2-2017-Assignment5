/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.AbstractFactoryExample;

import DesignPatternsInterfaces.AbstractFactoryInterfaces.Animal;


public class Carnivore implements Animal
{
    //Carnivore class
    
    public Carnivore()
    {
        
    }   
    
    @Override
    public String animalType()
    {
        return("This animal eats meat, it's a carnivore!");
    }        
}
