package BinaryTrees;

public class ArraySort 
{
 LookupArr a[];
 ArraySort(int l)
 {
	a=new LookupArr[l];
 }
 public void bubbleSort()
 {
	 for(int i=0;i<a.length;i++)
	      for(int j=0;j<a.length-i;j++) 
		     if(a[j].f>a[j+1].f)
		     {
		    	 LookupArr temp=a[j];
		    	 a[j]=a[j+1];
		    	 a[j+1]=temp;
		     }	  
  }
 

}

