//program to know the negative values:--
import java.util.*;
public class countNegative
{
	static int noofNegatives(int balance[],int noofacc){
	  int count=0;
	  for(int i=0;i<noofacc;i++){
	    if(balance[i]<0)
			count++;
	  }
		return count;
	}
	public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 int noofacc=sc.nextInt();
	 int balance[]=new int[noofacc];
     for(int i=0;i<noofacc;i++){
	   balance[i]=sc.nextInt();
	 }
	 int  result=noofNegatives(balance,noofacc);
	 System.out.println(result);
	}
}