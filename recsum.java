import java.util.*;
public class recsum
{
public int sum(int n)
{
if(n<=0)
return 0;
else
{
return n+sum(n-1);
}
}
public static void main(String args[])
{
System.out.println("enter the no. till sum of natura no. to be calculated");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
recsum ob=new recsum();
int k=ob.sum(n);
System.out.println(k);
}
}

