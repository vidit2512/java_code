import java.util.*;
public class fibb
{
    public void fib(int arr[],int n)
    {
        int a=0,b=1,c=0;
        if(n==1)
        arr[0]=0;
        if(n==2)
        arr[1]=1;
        for(int i=3;i<=n;i++)
        {  
          c=a;
           a=b; 
           b=b+c;arr[i-1]=b;
        }
    }
       public static void main(String args[])
      {
      fibb ob=new fibb();
      System.out.println("enter the limit till series to be printed");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      ob.fib(arr,n);
      for(int i=0;i<n;i++)
      {
      System.out.print(arr[i]+ "  " );
    }
}
}