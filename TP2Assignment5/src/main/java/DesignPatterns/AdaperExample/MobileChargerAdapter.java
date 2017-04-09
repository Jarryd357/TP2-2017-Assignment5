/*
TP Assignment 5 : Design Patterns
Jarryd Pretorius
206155247
 */

package DesignPatterns.AdaperExample;

import DesignPatternsInterfaces.AdapterExampleInterfaces.MobilePhoneChargerAdapter;


public class MobileChargerAdapter extends MobilePhoneCharger implements MobilePhoneChargerAdapter
{
    @Override
    public MobilePhoneBrand getSonyMobile() 
    {
        return getMobilePhoneBrand();
    }
    
    @Override
    public MobilePhoneBrand getSamsungMobile() 
    {
        return getMobilePhoneBrand();
    }
    
    @Override
    public MobilePhoneBrand getBlackberryMobile() 
    {
        return getMobilePhoneBrand();
    }
    
}
