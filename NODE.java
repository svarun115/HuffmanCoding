package BinaryTrees;

public class NODE 
{
  public int frequency;
  public NODE left;
  public NODE right;
  public char ch;
  NODE(char c,int f)
  {
	  left=null;
	  right=null;
	  frequency=f;
	  ch=c;
  }
};
