/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.BridgeExample;

import DesignPatternsInterfaces.BridgeExampleInterfaces.AnimalEating;


public class FeedAnimal extends Animal
{
    private String Food;
    
    public FeedAnimal(String Food, AnimalEating animalEating)
    {
        super(animalEating);
        this.Food = Food;
    }   
    
    public void eat()
    {
        animalEating.eat(Food);
    }        
}
