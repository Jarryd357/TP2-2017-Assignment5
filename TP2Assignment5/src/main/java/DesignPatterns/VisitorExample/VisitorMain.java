/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.VisitorExample;

import DesignPatternsInterfaces.VisitorExampleInterfaces.CarPart;


public class VisitorMain 
{
    public static void main(String [] args)
    {
        CarPart car = new Car();
        car.accept(new CarPartDisplayVisitor());
    }        
}
