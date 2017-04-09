/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.ProxyExample;

import DesignPatternsInterfaces.ProxyExampleInterfaces.Results;


public class ProxyExampleMain 
{
    public static void main(String [] args)
    {
        Results results = new ProxyTestResults("72 out 100 - 72%");

        //results fetched from Blackboard
        results.displayResults(); 
        System.out.println("\n");
      
        //results not fetched from Blackboard
        results.displayResults();
    }        
}
