/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.ChainOfResponsibilityExample;


public abstract class CustomerQueue 
{
    public static int queueNo;
    
    protected int Priority;
    
    protected CustomerQueue nextCustomer;
    
    public void setNextCustomer(CustomerQueue nextCustomer)
    {
        this.nextCustomer = nextCustomer;
    }        
    
    public void displayMessage(int Priority, String Message)
    {
        if(this.Priority <= Priority)
        {
            customerMessage(Message);
        }
        if(nextCustomer != null)
        {
            nextCustomer.displayMessage(Priority, Message);
        }    
    }  
    
    abstract protected void customerMessage(String Message);
}
