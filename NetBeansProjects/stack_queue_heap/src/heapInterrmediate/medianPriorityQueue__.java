/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapInterrmediate;

import java.util.Collections;
import java.util.PriorityQueue;


/**
 *
 * @author sanje
 */
public class medianPriorityQueue__ 
{
    public static void main(String[] args) {
        
    }
    public static class priorityQueue
    {
        
    PriorityQueue<Integer> left ;
    PriorityQueue<Integer> right;
    
        
    
    
    
    public priorityQueue()
    {
        left= new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
        
    }
    
    
    public void add(int val)
    {
        if(right.size()>0 && val >right.peek())
            right.add(val);
        else
            left.add(val);
        
        if(left.size()-right.size()==2)
            right.add(left.remove());
        else if(right.size()-left.size()==2)
            left.add(right.remove());
        
    }
    
    public int remove()
    {
         if(this.size()==0)
        {
            System.out.println("underflow");
            return -1;
        }
        else if(left.size() >= right.size()) 
        {
            return left.remove();
        }
        else
            return right.remove();
    }
    
    public int peek()
    {
        if(this.size()==0)
        {
            System.out.println("underflow");
            return -1;
        }
        else if(left.size() >= right.size()) 
        {
            return left.peek();
        }
        else
            return right.peek();
    }
    
    public int size()
    {
        return left.size()+ right.size();
        
    }
    
    }
}
    

