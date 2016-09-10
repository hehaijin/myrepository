import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    char matrix[][];
    int N;
    int step[][];
    int ca,cb;
    int da,db;
    Solution(int N)
        {
        this.N=N;
       matrix=new char[N][N];
        step=new int[N][N];
    }
    void setCastle(int a,int b)
        {
        ca=a;
        cb=b;
        step[ca][cb]=1;
     
    }
    
    void setDestination(int a,int b)
        {
        da=a;
        db=b;
    }
    
    boolean checkPath(int a,int b,int c,int d)
       { 
         if( a!=c && b!=d) return false;
        
         if(a==c) 
        {
             for(int i=0;i<=(int)Math.abs(d-b);i++)
             {
             
             if(d>=b && matrix[a][b+i]=='X') return false;
             else if(d<b && matrix[a][d+i]=='X') return false;
              }
             
         }
        if(b==d)
         {
            for(int i=0;i<= (int)Math.abs(a-c);i++)
             {
             
             if(a>=c && matrix[c+i][d]=='X') 
             {   
                 return false;
              }
             else if(a<c && matrix[a+i][d]=='X') 
             {    
                 return false;
             }
              }
            
        }
        return true;    
          
        
    }
    
    
    void calculate(int sh)
     {
        for(int i=0;i<N;i++)
            {
            for(int j=0;j<N;j++)
            {  if(step[i][j]==sh) 
               {
             for(int k=0;k<N;k++)
                 {
                if( checkPath(i,j,k,j) && step[k][j]==0 )
                 {   step[k][j]=step[i][j]+1;
                     
                 }
                if( checkPath(i,j,i,k) && step[i][k]==0 ) 
                  {
                    step[i][k]=step[i][j] +1;
                    
                }
             }
            }
            
        } 
           
        }
    } 
    
    
    
    
    
    void showSteps()
   {
             for(int i=0;i<N;i++)
            {
         for(int j=0;j<N;j++)
            {
            System.out.print(step[i][j]);
            System.out.print(" ");
        }
        System.out.println();
     }
        
    }
    
    void showMatrix()
   {
             for(int i=0;i<N;i++)
            {
         for(int j=0;j<N;j++)
            {
            System.out.print(matrix[i][j]);
            System.out.print(" ");
        }
        System.out.println();
     }
        
    }
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        Solution sl=new Solution(N);
        for(int i=0;i<N;i++)
            {String s=sc.nextLine();
             
             for(int j=0;j<N;j++)
             sl.matrix[i][j]=s.charAt(j);
        }
        
        int ca=sc.nextInt();
        int cb=sc.nextInt();
        sl.setCastle(ca,cb);
        int da=sc.nextInt();
        int db=sc.nextInt();
        sl.setDestination(da,db);
        sc.close();
       
        for(int i=1;i<=N;i++)
        sl.calculate(i);
       System.out.println(sl.step[da][db]-1);
    
        
        
    }
}