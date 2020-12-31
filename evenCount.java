import java.util.*;
public class evenCount{
 public static void main(String args[]){
 int count=0;
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int  a[i]=new int[n];
 for(int i=0;i<n;i++){
  a[i]=sc.nextInt();
 }
 for(int i=0;i<n;i++){
  if(String.valueOf(a[i]).length()%2==0){
    count++
  }
  }
  System.out.println(count);
 }
}