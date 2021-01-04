import java.util.*;
public class checkevenodd
{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[] = new int[n];
	  int len=a.length;
	  for(int i=0;i<len;i++){
	   a[i]=sc.nextInt();
	  }
	  for(int i=0;i<len;i++){
	   if(a[i]%2==0)
		  {
            a[i]=a[i]+1;	   
	   }
	   else{
	   a[i]=a[i]-1;
		   }
System.out.print(a[i]);
	  }
	  
	}
}