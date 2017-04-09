/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.BridgeExample;

import DesignPatternsInterfaces.BridgeExampleInterfaces.AnimalEating;


public abstract class Animal 
{
    protected AnimalEating animalEating;
    
    protected Animal(AnimalEating animalEating)
    {
        this.animalEating = animalEating;
    }        
    
    public abstract void eat();
}
