import java.util.ArrayDeque;

public class BinaryTree {
	
	  
  private class Node 
	 {
	    int data;
	    Node left;
	    Node right;
	 }

	int height(Node root)
    {
       if(root==null) return 0;
       else if(root.left==null && root.right==null) return 0; //tree height for a single node is 0.
           else return Math.max(height(root.left),height(root.right))+1;
   
    }
	
  public Node Insert(Node root,int value) //something wrong here. did not pass test case #5.
    {
      Node newnode=new Node();
      newnode.data=value;
      if(root==null)     //check if the tree is null
          {
          root=newnode;
          root.left=null;
          root.right=null;
         
      }
    
      Node n=null;
      Node x=root;
      while(x!=null)    //n is the parent node we are looking for, x is the insert position. exit condition: x is null;
          {
          n=x;
          if(value < n.data) x=x.left;
          else x=x.right;
      }
      
      
      if(value < n.data)  // assign the new node; x is useless here. 
          n.left=newnode;
      else n.right=newnode;
    
     return root;
     
       
    }

  

static Node lca(Node root,int v1,int v2)  //assume each node have different data.
    {  if(root!=null)
        {
        if(v1<root.data &&  v2 <root.data)
             return lca(root.left, v1, v2);
        else if(v1>root.data && v2>root.data)
             return lca(root.right, v1, v2);
        else return root;
         }
     else return null;
    }






	
	
public	void preOrder(Node root)
	{
		
		if(root!=null)
		{
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}

	}
	
	
	
	public void topView(Node root)
	{
		if(root!=null)
	      {
	      topView(root.left,true);
	      System.out.print(root.data+" ");
	      topView(root.right,false);
	  }
		    
		      
		}

	

public void topView(Node root,boolean left)
    {
    if(left)
   {
    if(root!= null) 
        {
        topView(root.left, true);
        System.out.print(root.data+" ");
    }
    }
    else
        {
        if(root!=null)
            {
            System.out.print(root.data+" ");
            topView(root.right,false);
          
        }
    }
}

	
public void LevelOrder(Node root)
{
   ArrayDeque<Node> queue=new ArrayDeque<Node>();
   if(root!=null){
     queue.add(root);
}
   while(queue.size() >0)
       {
      Node n=queue.remove();
      System.out.print(n.data+" ");
     if(n.left!=null)  queue.add(n.left);
     if(n.right!=null) queue.add(n.right);
   }
   
  
}






	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
