/*
test your c skills
//Fibonacci series program.
import java.util.*;
public class pract
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n1=0,n2=1,n3;
	int count=sc.nextInt();
System.out.print(" "+n1);
	System.out.print(" "+n2);
	for(int i=2;i<count;i++){
	   n3=n1+n2;
	   System.out.print(" "+n3);
	   n1=n2;
	   n2=n3;
	}
	}
}
//COUNT NUMBER OF WORD GET REPEATED IN THE SERIES .
import java.util.*;
public class pract
{
	static final int ASCII=256;
	static String maxnoofOccurences(String str){
	int max=-1;
	int count[]=new int[ASCII];
	int len=str.length();
	for(int i=0;i<len;i++){
      count[str.charAt(i)]++;	
	}
	String result=" ";
	for(int i=0;i<len;i++){
        if(max<count[str.charAt(i)])
		{
	     max=count[str.charAt(i)];
		 result+=str.charAt(i);
		}
		else if(max==count[str.charAt(i)]){
		  max=count[str.charAt(i)];
		  if(!result.contains(""+str.charAt(i))){
		   result+=str.charAt(i);
		  }
		}
	
	}
	return result;
	}
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   System.out.println("Input= "+str);
   System.out.println("Output= "+maxnoofOccurences(str));
 }
}

import java.util.*;
public class pract
{
	static void printPattern(int r){
	  r=r/2;
	  int count=r;
	  for(int i=0;i<r;i++){
		  for(int j=0;j<=i;j++){
		  if(j!=0)
		{
			
		  System.out.print("*"+count);
	  }
	  else{
	    System.out.print(count);
	  }
	  }
	  count++;
	  System.out.print("\n");
	  }
	}
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  printPattern(n);
	}
}

//Sample Input
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers describing the colors  of the socks in the pile.

Constraints

 where 
Output Format

Return the total number of matching pairs of socks that Alex can sell.
9
10 20 20 10 10 30 50 10 20
Sample Output

3

import java.util.*;
public class pract
{
 static int noofEqualpairs(int n,int a[]){
      int count=0;
	  HashSet<Integer> set=new HashSet<Integer>();
	  for(int i=0;i<n;i++){
		  int element=a[i];
	    if(set.contains(a[i])){
		  set.remove(a[i]);
		  count++;
		}
		else
		  {
		     set.add(a[i]);
		}
	  }
	  return count;
   }
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++){
     a[i]=sc.nextInt();
   }
   System.out.println(noofEqualpairs(n,a));
   }
}

//Swapping number without using the temp variable:
import java.util.*;
public class pract
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Numbers before Swapping=  "+a+" "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Numbers after Swapping=  "+a+" "+b);
  }
}
//Program for swapping numbers using different forms.
import java.util.*;
public class pract
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Numbers before Swapping=  "+a+" "+b);
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("Numbers after Swapping=  "+a+" "+b);
  }
}
import java.util.*;
public class pract
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("Numbers before Swapping=  "+x+" "+y);
	x=x^y;
	y=x^y;
	x=x^y;
	System.out.println("Numbers after Swapping=  "+x+" "+y);
  }
}
//Program to print area of triangle
import java.util.*;
public class Wipro
{
	static float triangle(float b,float h){
    float result=(b*h)/2;
	return result;
	}
	public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 float b=sc.nextFloat();
     float h=sc.nextFloat();
     System.out.println(triangle(b,h));
	}
}

//Program to print area of rectangle
import java.util.*;
public class Wipro
{
   static int Rectangle(int width,int height){
     int area=width*height;
	 return area;
   }
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int width=sc.nextInt();
   int height=sc.nextInt();
   System.out.println(Rectangle(width,height));
   }
}
*/





























































