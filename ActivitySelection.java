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
public class ActivitySelection {
    public void selectActivity(){
        int start[]= {1,3,0,5,8,5};
        int finish[]={2,4,6,7,9,9};
        
        int i=0;
        
        System.out.println(i+" ");
        
        for(int j=1;j<start.length;j++){
            if(start[j]>=finish[i]){
                System.out.println("in if->"+start[j]+"  "+finish[i]);
                System.out.println(j+" ");
                i=j;
            }
        }
    }
}
