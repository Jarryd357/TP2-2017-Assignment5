/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatternsInterfaces.VisitorExampleInterfaces;

import DesignPatterns.VisitorExample.Battery;
import DesignPatterns.VisitorExample.Car;
import DesignPatterns.VisitorExample.Engine;


public interface CarPartVisitor 
{
    public void visit(Car car);
    public void visit(Engine engine);
    public void visit(Battery battery);
}
