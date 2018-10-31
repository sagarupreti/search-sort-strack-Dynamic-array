/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sag.upr.rik;
import sag.upr.rik.util.stack;
import sag.upr.rik.util.dynamiclist;

/**
 *
 * @author ideapad-520S
 */
public class program {
   

   
    public static void main(String[] args) {
        dynamiclist list=new dynamiclist();
        list.add(24);
        list.add(true);
        list.add(2.8);
        list.add(44);
        
       while(list.next()){
           System.out.println(list.getValue());
       }
        
    } 
       
}
        
 
 