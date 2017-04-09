/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.AdaperExample;


public class MobilePhoneBrand 
{
    //Mobile Phone class
    
    private String Brand;
    
    public MobilePhoneBrand(String Brand)
    {
        this.Brand = Brand;
    }     
    
    public String getBrand()
    {
        return Brand;
    }
    
    public void setBrand(String Brand)
    {
        this.Brand = Brand;
    }        
    
}
