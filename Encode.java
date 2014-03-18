package BinaryTrees;
import java.io.IOException;
import java.util.*;
public class Encode 
{
 Scanner in =new Scanner(System.in);
 public int count=0;//to determine the length of the list
 public NODE root;
 
 //constructor
 Encode()
 {
	 root=null;
 }
 
 //create a new node
  public NODE create(char ch,int f)
  {
	  NODE tnode=new NODE(ch,f);
	  return tnode;
  }
  
  public void listGen(String str )
  {   
	  for(int i=(str.length()-1);i>=0;i--)
      {
	   char ch=str.charAt(i);
	   check(ch);
      }
  }
  
  /*checks if the new character exists in the list. 
   * If it does it increments the frequency field of the node. 
   * Else, it inserts a new node into the list*/
  
  public void check(char c)
  {   
	 if(root==null)
		  {
		    NODE tnode=create(c,1);
		    		root=tnode;
		    		count++;
		  }
	  else
	  {
		  NODE temp=root;
		  while(temp!=null)
		  {
			  if(temp.ch==c)
				 break;
			  else
				  temp=temp.right;
		  }
		  if(temp==null)
		  {
			  NODE tnode=create(c,1);
			  temp.right=tnode;
			  tnode.left=temp;
			  count++;
		  }
		  else
			  temp.frequency++;  
	  }

}
  
public void sort()
{   
	ArraySort array=new ArraySort(count);
	NODE temp=root;
	int i=0;
	while(temp!=null)
	{
		LookupArr obj=new LookupArr(temp.frequency,temp.ch);
		array.a[i]=obj;
		i++;
		temp=temp.right;
	}
	array.bubbleSort();
	for(;i>=0;i--)
	  insert(array.a[i].c,array.a[i].f);
}

public void insert(char c,int f)
{
	NODE node=new NODE(c,f);
	if(root==null)root=node;
	else
	{
		node.right=root;
		root.left=node;
		root=node;
	}
		
}

/*Converts the doubly linked list into the required binary tree. It is a recursive definition,
 * where the two characters with least frequencies are combined to form a new node which is 
 * added to the list. The process is continued until a single root node with 2 branches is obtained.*/

public void treeGenerate()
{
	
}


 
}
