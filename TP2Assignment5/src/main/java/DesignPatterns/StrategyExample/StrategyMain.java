/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.StrategyExample;


public class StrategyMain 
{
    public static void main(String [] args)
    {
        Context context = new Context(new Addition());
        System.out.println("10 + 10 = " + context.executeStrategy(10, 10));
        
        context = new Context(new Subtraction());
        System.out.println("20 - 10 = " + context.executeStrategy(20, 10));
    }        
}
