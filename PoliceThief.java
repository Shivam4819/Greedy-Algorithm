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
public class PoliceThief {
    public void catchThief(){
        char arr[]={'P', 'T', 'P', 'T', 'T', 'P'};
        int thief[]=new int[arr.length/2+1];
        int police[]=new int[arr.length/2+1];
        int k=3,j=0,value=0,j1=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='T'){
                thief[j++]=i;
            }
            if(arr[i]=='P'){
                police[j1++]=i;
            }
        }
        
        for(int i=0;i<police.length;i++){
            
            if(police[i]-thief[i]<k ||thief[i]-police[i]<k){
                value++;
            }
            if(police[i]==0 && thief[i]==0){
                value=value-1;
            }
        }
        for(int i=0;i<thief.length;i++){
            System.out.print(thief[i]+" ");
            
        }
        System.out.println(" ");
        
        for(int i=0;i<police.length;i++){
            System.out.print(police[i]+" ");
        }
       
        System.out.println("value->"+value);
    }
}
