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

public class model {
    
    public static String students123 = " Moath , Najeeb , Mohammad ";
    
    private  double num1;
    private  double num2;
    private  double answer;
    private  String oprt;
    
    public  double getanswer(){
        return answer;
    }
    
    public  double getnum1(){
        return num1;
    }
    
    
    public  double getnum2(){
        return num2;
    }
    
    public  void setanswer(double a){
        answer = a;
    }
    
    public  void setnum1(double a){
        num1 = a;
    }
    
    
    public  void setnum2(double a){
        num2 = a;
    }
    
    public  String getoprt(){
        return oprt;
    }
    
    public  void setoprt(String a){
        oprt = a;
    }
}
