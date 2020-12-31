import java.util.*;
public class repElement{
    void repeat(int arr[],int size){
      int i,j;
      
      for( i=0;i<size;i++){
         for(j=i+1;i<size;i++){
	    if(arr[i]==arr[j]){
	      System.out.print(arr[i]+" ");
	    }
	  }
      }
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
     }
	 int a_size=a.length;
repElement repeat1=new repElement();
     System.out.println("The number of terms getting repeated are:");
	  repeat1.repeat(a,a_size);
     
    }
}