/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.BridgeExample;

import DesignPatternsInterfaces.BridgeExampleInterfaces.AnimalEating;


public class HerbivoreAnimal implements AnimalEating
{
    @Override
    public void eat(String Food)
    {
        System.out.print("Herbiivore eats " + Food);
    }        
}
