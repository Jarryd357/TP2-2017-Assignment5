/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatternsInterfaces.AdapterExampleInterfaces;

import DesignPatterns.AdaperExample.MobilePhoneBrand;


public interface MobilePhoneChargerAdapter 
{
    //Charger adapter class
    
    public MobilePhoneBrand getSonyMobile();
    
    public MobilePhoneBrand getSamsungMobile();
    
    public MobilePhoneBrand getBlackberryMobile();
}
