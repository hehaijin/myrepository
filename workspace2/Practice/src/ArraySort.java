
public class ArraySort {
	
	public static int[] generateArray(int size)
	{
		int data[]=new int[size];
		for(int i=0;i<size;i++)
		{
			data[i]=(int) (Math.random()*100);
		}
		return data;
		
	}
	
public static void countSort(int source[], int output[], int K)
{ 
	boolean flag=false;
	for(int i=0;i<source.length;i++)
	{
		if(source[i] > K)  
		{
			System.out.println("Input out of range, can not use counting sort!");
			flag=true;
			break;
		}
	}
	if(flag) return;
	
	int count[]=new int[K+1];
	for(int i=0;i<source.length;i++)
	{
		count[source[i]]++;
	}
	

  for(int i=1;i<K;i++)
  {
	  count[i]=count[i]+count[i-1];
  }
  
  for(int i=source.length-1;i>=0;i--)
  {
	  count[source[i]]--;
	  output[count[source[i]]]=source[i];
	  
  }
	
	
	
	
}
	
	public static void heapSort(int array[])
	{  
		buildheap(array,array.length);// build the heap for once.
		for(int i=0;i<array.length;i++)
		{
			
			int temp=array[0];		 
			array[0]=  array[array.length-1-i];
			array[array.length-1-i]=temp;
			
			heapify(array,0,array.length-i-1);  //call heapify each iteration.
		}
		
		
	}
	
	public static void buildheap(int array[],int heapsize)
	{  
	  for(int i=array.length;i>=0;i--)   //must be in reverse sequence
		  heapify(array,i,heapsize);
		
	}
	
	public static void heapify(int array[], int index,int heapsize)
	{
		int left=2*index+1;  //left children
		int right=2*index +2;  //right children
		int larger=index;    
		if(left<heapsize && array[left] >array[index]) larger=left;    //compare left with itself
		if(right<heapsize && array[right] >array[larger]) larger=right;  //compare right with itself
		if(larger!=index)    //swap
		{
			int temp=array[index];
			array[index]=array[larger];
			array[larger]=temp;
			heapify(array,larger,heapsize);   //recursively heapify
		}
		
	}
	
	public static void show(int array[])
	{
		for(int i=0;i<array.length;i++)
			{
			System.out.print(array[i]);
		  System.out.print(" ");
			}
		System.out.println();
	}
	
	
	
	public static void bubble(int array[])
	{
		int length=array.length;
		
		for(int i=0;i<length-1;i++)
		{
			for(int j=length-1;j>i;j--)
			{
				if(array[j]<array[j-1])
				{
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
		   }
		}
	
		
	}
	
	
	public static void quick(int array[])
	{
		
		quick(array,0,array.length-1);
		
		
	}
	
	
	public static void quick(int array[], int left, int right)
	{
		int p=partition(array,left,right);
		if(p>left) quick(array,left,p-1);
		if(p<right) quick(array,p+1,right);
	
	}
	
	private static int partition(int array[],int left,int right)
	{
		int pivot=array[right];
		if(left==right) return left;
		int index=left-1;
		for( int i=left; i< right;i++)
		{
			if(array[i] < pivot)
			{ index++;
				int temp=array[i];
				array[i]=array[index];
				array[index]=temp;
			}
		}
		index++;
		int temp=array[right];
		array[right]=array[index];
		array[index]=temp;
		return index;
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
