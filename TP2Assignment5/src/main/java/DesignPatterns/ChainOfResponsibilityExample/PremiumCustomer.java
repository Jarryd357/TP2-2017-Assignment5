/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.ChainOfResponsibilityExample;


public class PremiumCustomer extends CustomerQueue
{
    public PremiumCustomer(int Priority)
    {
       this.Priority = Priority;         
    }   
    
    @Override
    protected void customerMessage(String Message)
    {
        System.out.print("Customer priority is " + Message);
    }        
}
