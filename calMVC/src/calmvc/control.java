/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calmvc;

/**
 *
 * @author Moath
 */
public class control {
    
    model m;
    
    public control(){
        
        m = new model();
    
    }
    
    public void oprtr(int oprt,double num1,double num2){
    
        switch(oprt){
        case 0:
            m.setnum1(num1);
            m.setnum2(num2);
            m.setanswer(num1+num2);
            m.setoprt("plus");
            break;
        case 1:
            m.setnum1(num1);
            m.setnum2(num2);
            m.setanswer(num1-num2);
            m.setoprt("minus");            
            break;
        case 2:
            m.setnum1(num1);
            m.setnum2(num2);
            m.setanswer(num1*num2);
            m.setoprt("multiply");            
            break;
        case 3:
            m.setnum1(num1);
            m.setnum2(num2);
            m.setanswer(num1/num2);
            m.setoprt("divid");            
            break;
        }
    }
    
    public double geter(){
    
        return m.getanswer();
    }
    
}
