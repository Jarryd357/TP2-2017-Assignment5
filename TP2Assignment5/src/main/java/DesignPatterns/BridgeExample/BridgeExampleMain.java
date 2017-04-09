/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.BridgeExample;


public class BridgeExampleMain 
{
    public static void main(String [] args)
    {
        Animal carnivore = new FeedAnimal("Meat", new CarnivoreAnimal());
        Animal herbivore = new FeedAnimal("Grass", new HerbivoreAnimal());
        
        carnivore.eat();
        herbivore.eat();
    }        
}
