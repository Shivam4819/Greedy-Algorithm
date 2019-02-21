/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgo;

/**
 *
 * @author shivam
 */
public class JobSequencing {
    public void schedulejob(){
        int deadline[]={2,2,1,1,3};
        int profit[]={100,27,25,19,15};
        int slot[]=new int[profit.length];
        for(int i=1;i<slot.length;i++){
            slot[i]=0;
        }
        slot[deadline[0]-1]=1;
        for(int i=1;i<profit.length;i++){
            if(slot[deadline[i]-1]==0){
              
               slot[deadline[i]-1]=i+1; 
                 System.out.println("slot->"+slot[deadline[i]-1]);
            }
        }
        for(int i=0;i<slot.length;i++){
            if(slot[i]!=0)
              System.out.println(slot[i]);
        }
        
    }
}
