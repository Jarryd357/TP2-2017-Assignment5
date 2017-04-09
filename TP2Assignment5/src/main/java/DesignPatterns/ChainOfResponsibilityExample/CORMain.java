/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.ChainOfResponsibilityExample;


public class CORMain 
{
    private static CustomerQueue customersInQueue()
    {
        CustomerQueue premiumCustomer = new PremiumCustomer(CustomerQueue.queueNo);
        CustomerQueue regularCustomer = new RegularCustomer(CustomerQueue.queueNo);
        
        premiumCustomer.setNextCustomer(regularCustomer);
        
        return premiumCustomer;
    }     
    
    public static void main(String [] args)
    {
        CustomerQueue customerQueue = customersInQueue();
        
        customerQueue.displayMessage(customerQueue.Priority, "Customer in queue");
    }        
}
