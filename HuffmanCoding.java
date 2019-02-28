/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgo;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 *
 * @author shivam
 */
class CreateNode{
char chardata;
int frequency;

CreateNode left=null;
CreateNode right=null;
}
class MyComparator implements Comparator<CreateNode> { 
    public int compare(CreateNode x, CreateNode y) 
    { 
  
        return x.frequency - y.frequency; 
    } 
} 
public class HuffmanCoding {
    public void createTree(){
        int n=6;
        char arr[]={'a', 'b', 'c', 'd', 'e', 'f' };
        int frequency[]={5, 9, 12, 13, 16, 45 };
        PriorityQueue q=new PriorityQueue();
        
        for(int i=0;i<n;i++){
            CreateNode node=new CreateNode();
            node.chardata=arr[i];
            node.frequency=frequency[i];
            node.left=null;
            node.right=null;
            q.add(node);
        }
        
        CreateNode root=null;
         while (q.size() > 1) { 
  
            CreateNode x = q.peek(); 
            q.poll(); 
  
            CreateNode y = q.peek(); 
            q.poll(); 
  
            CreateNode f = new CreateNode(); 
  
            f.frequency = x.frequency + y.frequency; 
            f.chardata = '-'; 
  
            f.left = x; 
  
            f.right = y; 
  
            root = f; 
  
            q.add(f); 
        } 
  
        // print the codes by traversing the tree 
        printCode(root, ""); 
    }
     public void printCode(CreateNode root, String s) { 
  
        // base case; if the left and right are null 
        // then its a leaf node and we print 
        // the code s generated by traversing the tree. 
        if (root.left 
                == null
            && root.right 
                   == null
            && Character.isLetter(root.chardata)) { 
  
            // c is the character in the node 
            System.out.println(root.chardata + ":" + s); 
  
            return; 
        }
        printCode(root.left, s + "0"); 
        printCode(root.right, s + "1"); 
    }
}