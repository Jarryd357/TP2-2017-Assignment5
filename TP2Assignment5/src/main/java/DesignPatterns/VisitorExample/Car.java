/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.VisitorExample;

import DesignPatternsInterfaces.VisitorExampleInterfaces.CarPart;
import DesignPatternsInterfaces.VisitorExampleInterfaces.CarPartVisitor;


public class Car implements CarPart
{
    CarPart [] carParts;
    private CarPartVisitor CarPartVisitor;
    
    public Car()
    {
        carParts = new CarPart[] {new Engine(), new Battery()};
    }
    
    @Override
    public void accept(CarPartVisitor carPartVisitor)
    {
        for(int i = 0; i < carParts.length; i++)
        {
            carParts[i].accept(CarPartVisitor);
        }   
        
        carPartVisitor.visit(this);
    }        
}
