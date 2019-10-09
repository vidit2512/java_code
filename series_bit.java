import java.util.*;
public class series_bit
{
public boolean ck(int n)
{
   
 if((~((n|n>>1)>>1))==0) 
return true;
else
return false;
}
public static void main(String args[])
{
     System.out.println("enter the no. to check whether it is in binary series of 101010.."); 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    series_bit ob=new series_bit();
    System.out.println(ob.ck(n));
      
}  
}