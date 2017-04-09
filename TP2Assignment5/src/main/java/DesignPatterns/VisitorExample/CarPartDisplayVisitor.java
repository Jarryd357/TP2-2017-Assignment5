/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.VisitorExample;

import DesignPatternsInterfaces.VisitorExampleInterfaces.CarPartVisitor;


public class CarPartDisplayVisitor implements CarPartVisitor
{
   @Override
   public void visit(Car car) 
   {
      System.out.println("Displaying Car");
   }

   @Override
   public void visit(Engine engine) 
   {
      System.out.println("Displaying Engine");
   }

   @Override
   public void visit(Battery battery) 
   {
      System.out.println("Displaying Battery");
   }
}
