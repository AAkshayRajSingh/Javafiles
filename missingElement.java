import java.util.*;
public class missingElement
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
    for(int i=0;i<n;i++){
	 a[i]=sc.nextInt();
	}
	int exp_length=a.length+1;
	int tot_sum=(exp_length)*(exp_length+1)/2;
	int sum=0;
	for(int i=0;i<n;i++){
	 sum=sum+a[i];
	}
	int Missing=tot_sum-sum;
	System.out.println("The missing value is : "+Missing);
}
}