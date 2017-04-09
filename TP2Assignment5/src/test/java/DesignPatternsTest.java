/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

import DesignPatterns.SingletonExample.SingletonExample;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class DesignPatternsTest 
{
    
    public DesignPatternsTest() 
    {
    }
    
    @Test
    public void singletonTest()
    {
        SingletonExample se = SingletonExample.getInstance();
        
        int result = se.getPerimeter(10, 15);
        Assert.assertEquals(50, result, 0);
    }        
 
}
