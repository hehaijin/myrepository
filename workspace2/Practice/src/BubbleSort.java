
public class BubbleSort implements Comparable {

	private int size;
	private int data[];
	

	
	public BubbleSort(int n)
	{
		size=n;
		data=new int[n];
		for(int i=0;i<n;i++)
		{
			data[i]=(int) (Math.random()*100);
		}
	}
	public int getSize()
	{
		return size;
	}
	
	public void show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public void selectsort()
	
	{
	  for(int i=0;i<size-1;i++)
	  {
		  
		  int index=i;
		  for(int j=i;j<size;j++)
		  {
			  if(data[j]<data[index]) index=j;
			 
		  }
		 
		 if(index !=i)
		 {
		  int temp=data[index];
		  data[index]=data[i];
		  data[i]=temp;
		 }
		
	  }
		
		
		
	}
	
	public int min()
	{
		int min=data[0];
		int index=0;
		for(int i=0;i<size;i++)
		{
			if(data[i] < min) min=data[i];
			index=i;
		}
		return min;
	}
	
	public int max()
	
	{
		int max=data[0];
		for(int i=0;i<size;i++)
		{
			if(data[i] > max) max=data[i];
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
    int data[]=ArraySort.generateArray(100);
    int output[]=new int[100];
		ArraySort.show(data);
		ArraySort.countSort(data,output,96);
	  ArraySort.show(output);

	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
