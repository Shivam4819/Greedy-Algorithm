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
public class EgyptionProblem {
    public void problem(){
        int nr=6,dr=14;
        int resrult=dr%nr;
        
        method2(nr, dr);
    }
    public void  method2(int nr,int dr){
        if(nr==0 || dr==0){
            return ;
        }
        if(nr%dr==0){
            System.out.println(nr/dr);
            return;
        }
        if(dr%nr==0){
            System.out.println("1/"+dr/nr);
            return; 
        }
        if(nr>dr){
            System.out.print(nr / dr + " + "); 
             method2(nr % dr, dr); 
            return; 
        }
        int n = dr / nr + 1; 
        System.out.print("1/" + n + " + "); 
  
       method2(nr * n - dr, dr * n); 
    }
}
