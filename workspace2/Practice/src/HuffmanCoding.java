
public class HuffmanCoding {

	 class Node
	 {
     public  int frequency; // the frequency of this tree
      public  char data;
      public  Node left, right;
	 }
	 

void decode(String S ,Node root)
    {int i=0;
     Node n=root;  
    while(i<S.length())    //
        {  
          int c=S.charAt(i);
          if(c=='0') n=n.left;
          else n=n.right;
         if(n.left==null && n.right ==null)  //check if n is a leaf node. if so, print the leaf and make n points to root again.
            { System.out.print(n.data);
             n=root;
            }
         i++;
         }
      }

	 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
