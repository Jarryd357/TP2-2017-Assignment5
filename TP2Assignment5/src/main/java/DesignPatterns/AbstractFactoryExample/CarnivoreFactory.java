/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.AbstractFactoryExample;

import Factory.AbstractFactory.AnimalFactory;
import DesignPatternsInterfaces.AbstractFactoryInterfaces.Animal;
        

public class CarnivoreFactory implements AnimalFactory
{
    
    public CarnivoreFactory()
    {
        
    }
    
    @Override
    public Animal animalType(String animalType)
    {
        return null;
    }        
}
