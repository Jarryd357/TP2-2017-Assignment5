/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.CloneExample;

import DesignPatternsInterfaces.CloneExampleInterfaces.CloneObject;


public class Employee implements CloneObject
{
    //Employee Class
    private String empNumber;
    private String empName;
    
    public Employee(String empNumber, String empName)
    {
        this.empNumber = empNumber;
        this.empName = empName;   
    }        
    
    @Override
    public CloneObject makeCopy()
    {
        return new Employee(empNumber, empName);
    }  
    
    //@Override
    public String ToString()
    {
        return "Number: " + empNumber + "\nName: " + empName;
    }        
            
}
