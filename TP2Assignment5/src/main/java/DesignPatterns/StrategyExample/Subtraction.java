/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.StrategyExample;

import DesignPatternsInterfaces.StrategyExampleInterfaces.Strategy;


public class Subtraction implements Strategy
{
    @Override
    public int calculate(int num1, int num2)
    {
        return num1 - num2;
    }        
}
