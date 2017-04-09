/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.VisitorExample;

import DesignPatternsInterfaces.VisitorExampleInterfaces.CarPart;
import DesignPatternsInterfaces.VisitorExampleInterfaces.CarPartVisitor;


public class Battery implements CarPart
{
    public void accept(CarPartVisitor carPartVisitor)
    {
        carPartVisitor.visit(this);
    }        
}
