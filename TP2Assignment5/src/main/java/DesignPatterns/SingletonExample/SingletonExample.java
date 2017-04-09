/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.SingletonExample;


public class SingletonExample 
{
    //Rectangle class
    private static SingletonExample se = null;
    
    private SingletonExample()
    {
        
    }
    
    public static SingletonExample getInstance() 
    {
        if (se == null) 
        {
            se = new SingletonExample();
        }
        
        return se;
    }
    
    public int getPerimeter(int length, int width)
    {
        return(2 * (length + width));
    }
    
}
