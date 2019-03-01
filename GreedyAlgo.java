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
public class GreedyAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ActivitySelection selection=new ActivitySelection();
        selection.selectActivity();
        
        EgyptionProblem egypt=new EgyptionProblem();
        egypt.problem();
        
        JobSequencing job=new JobSequencing();
        job.schedulejob();
      
        JobSequencingLossMini minimum=new JobSequencingLossMini();
        minimum.lossMinimum();
        
        AssignMiceToHoles mice=new AssignMiceToHoles();
        mice.assignHoles();
        
        FittingSelves selves=new FittingSelves();
        selves.selvesFit();
        
        PoliceThief police=new PoliceThief();
        police.catchThief();
        
        WaterConnection water=new WaterConnection();
        water.makeConnection();
    
        HuffmanCoding huffman=new HuffmanCoding();
        huffman.createTree();        
        
        EfficientHuffmanCoding efficientWay=new EfficientHuffmanCoding();
        efficientWay.huffmanCoding();
    }
    
}
