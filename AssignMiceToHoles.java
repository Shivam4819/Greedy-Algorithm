/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgo;
import java.util.Arrays;
/**
 *
 * @author shivam
 */
public class AssignMiceToHoles {
    public void assignHoles(){
        int micePos[]={-10, -79, -79, 67, 93, -85, -28, -94 };
        int holesPos[]={-2, 9, 69, 25, -31, 23, 50, 78 };
        int max;
        Arrays.sort(micePos);
        Arrays.sort(holesPos);
        max=holesPos[0]-micePos[0];
        for(int i=1;i<micePos.length;i++){
            if(max<(holesPos[i]-micePos[i]))
                max=holesPos[i]-micePos[i];
        }
        System.out.println("max->"+max);
    }
}
