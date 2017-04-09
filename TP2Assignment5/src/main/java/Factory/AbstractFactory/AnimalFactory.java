/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package Factory.AbstractFactory;
import DesignPatternsInterfaces.AbstractFactoryInterfaces.Animal;


public interface AnimalFactory
{
    //Animal Factory
    public abstract Animal animalType(String animalType);
            
}
