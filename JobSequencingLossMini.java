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
public class JobSequencingLossMini {
    public void lossMinimum(){
        int loss[]={3,1,2,4};                   
        int daysTofinish[]={4,1000,2,5};        
        int schedule[]=new int[daysTofinish.length];
        int j=0,days,k=0;
        int min=daysTofinish[0];
        for(int i=1;i<daysTofinish.length;i++){    
            if(min>daysTofinish[i]){
                min=daysTofinish[i];
                j=i;
            }
        }
        schedule[k++]=min;                              //schedule=2
        daysTofinish[j]=-1;                             //4,1000,-1,5
        loss[j]=-1;                                     //3,1,-1,4
        days=min;
        min=loss[0]*days;                               //6
        for(int i=1;i<loss.length;i++){
            if(loss[i]!=-1){
                if(min<loss[i]*days){
                    schedule[k++]=daysTofinish[i];
                    j=i;
                }
            }
        }
        days=days+daysTofinish[j];                          //days=7
        daysTofinish[j]=-1;                                 //4,1000,-1,-1
        loss[j]=-1;                                         //3,1,-1,-1
    
        System.out.println("min->"+min);
    }
}