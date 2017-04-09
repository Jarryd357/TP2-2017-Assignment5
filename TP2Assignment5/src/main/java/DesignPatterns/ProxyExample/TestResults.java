/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.ProxyExample;

import DesignPatternsInterfaces.ProxyExampleInterfaces.Results;


public class TestResults implements Results
{
    private String Results;
    
    public TestResults(String Results)
    {
        this.Results = Results;
        loadFromBlackboard(Results);
    }
    
    @Override
   public void displayResults() 
   {
      System.out.println("Results are " + Results);
   }

   private void loadFromBlackboard(String Results)
   {
      System.out.println("Results from Blackboard are " + Results);
   }
}
