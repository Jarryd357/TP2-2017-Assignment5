/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.CloneExample;

import DesignPatternsInterfaces.CloneExampleInterfaces.CloneObject;


public class Client implements CloneObject
{
    //Client Class
    private String companyID;
    private String companyName;
    
    public Client(String companyID, String companyName)
    {
        this.companyID = companyID;
        this.companyName = companyName;   
    }        
    
    @Override
    public CloneObject makeCopy()
    {
        return new Client(companyID, companyName);
    }  
    
    //@Override
    public String ToString()
    {
        return "Number: " + companyID + "\nName: " + companyName;
    }        
            
}
