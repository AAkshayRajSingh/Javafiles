// Complete the jumpingOnClouds function below.
/*import java.util.*;
public class jumpingCloud
{
	static int result(int c[]){
	 int len = c.length;
	 int count=-1;
	 for(int i=0;i<len;){
	  if(i+2<len && c[i+2]==0){
	   i+=2;
	  }
	  else{
	  i+=1;
	  }
	 count++;
	 }
	 return count;
	}
	public static void main(String args[]){
	Scanner x =new Scanner(System.in);
	int n=x.nextInt();
	int c[]=new int[n];
	for(int i=0;i<n;i++){
	c[i]=x.nextInt();
	}
	int res=result(c);
	System.out.println(res);
	}

}*/
import java.util.*;
public class jumpingCloud
{
	static int  result(int c[]){
	 int len=c.length;
	 int count=-1;
	 for(int i=0;i<len;){
	   if(i+2<len && c[i+2]==0)
		   i+=2;
	   else
		   i+=1;
	count++;
	 }
	return count;
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int c[]=new int[n];
	for(int i=0;i<n;i++){
	 c[i]=sc.nextInt();
	}
	int res=result(c);
	System.out.println(res);
	}
	
}