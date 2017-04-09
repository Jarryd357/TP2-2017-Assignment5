/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.ProxyExample;

import DesignPatternsInterfaces.ProxyExampleInterfaces.Results;


public class ProxyTestResults implements Results
{
    private TestResults testResults;
    private String Results;

    public ProxyTestResults(String Results)
    {
        this.Results = Results;
    }

    @Override
    public void displayResults() 
    {
        if(testResults == null)
        {
            testResults = new TestResults(Results);
        }
        testResults.displayResults();
   }
}
