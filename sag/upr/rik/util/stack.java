/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sag.upr.rik.util;

/**
 *
 * @author ideapad-520S
 */
public class stack {
    private int[] data=new int[100];
    private int pos=0;
    
    
     public void add(int value){
         if(pos<data.length){
         data[pos]=value;
         pos++;
        } 
    }
     
     public int pop(){
        int popvalue=data[pos-1];
        pos--;
        return popvalue;
     }
     
     public void printData(){
          for(int i=0;i<data.length;i++){
              if(data[i]!=0){
              System.out.println(data[i]);
          }
    }
}
}
