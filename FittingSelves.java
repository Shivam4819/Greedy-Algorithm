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
public class FittingSelves {
    public void selvesFit(){
        int w=24,m=3,n=5;
        int q=0,p=0,result,w1=w;
        while(w>=n){
            System.out.println("w1->"+w);
            q=q+1;
            System.out.println("q->"+q);
            w=w-n;
            System.out.println("w2->"+w);
            p=w/m;
            System.out.println("p->"+p);
            if(w%m==0){
                w=0;
            }
        }
        result=m*p+n*q;
        w=w1-result;
        System.out.println(p+" "+q+" "+w);
    }
}
