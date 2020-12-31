import java.util.*;
public class NumericArray
{
	public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   System.out.println("Numbers before Swapping are "+a+" "+b);
	   int t=a;
	   a=b;
	   b=t;
	   System.out.println("Numbers after Swapping are "+a+" "+b);
       
	}
}