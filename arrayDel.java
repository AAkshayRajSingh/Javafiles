import java.util.*;
public class arrayDel{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int N=sc.nextInt();
	   int K=sc.nextInt();
	   int count=0;
       System.out.println(" N="+N+" K="+K);       
       int L[]=new int[N];
       for(int i=0;i<N
		   ;i++){
        L[i]=sc.nextInt();
       }
	   for(int i=0;i<N;i++){
	      if(L[i]!=K)
			  count++;
	
	   }
	   System.out.println("The repeated number is :"+count);
    }
}