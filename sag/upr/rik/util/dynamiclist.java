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
public class dynamiclist {
    private Object[]nums=new Object[0];
    private int pos=-1;
    
    public void add(Object value){ 
        if(nums.length==0){
            nums=new Object[1];
            nums[0]=value;
        }else{
            Object[] nums1 = new Object[size()+1];
            for(int i=0;i<size();i++){
                nums1[i]=nums[i];
            }
            nums1[size()]=value;
            nums=nums1;
        }
    }
    private int size(){
        return nums.length;
    }
  
     public Object getValue(){
         return nums[pos];
     }
    public boolean next(){
        pos++;
        if(pos==nums.length){
            pos=nums.length-1;
            return false;
            
        }
        return true;
        
    }

    
    
    
} 
