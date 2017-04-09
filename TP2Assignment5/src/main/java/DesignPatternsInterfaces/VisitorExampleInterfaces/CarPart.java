/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatternsInterfaces.VisitorExampleInterfaces;


public interface CarPart 
{
    public void accept(CarPartVisitor carPartVisitor);
}
