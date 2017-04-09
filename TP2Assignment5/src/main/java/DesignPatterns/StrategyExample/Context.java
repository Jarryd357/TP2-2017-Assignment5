/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.StrategyExample;

import DesignPatternsInterfaces.StrategyExampleInterfaces.Strategy;


public class Context 
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2)
    {
        return strategy.calculate(num1, num2);
    }  
}
