/*
import java.util.*;
import java.lang.Math;
public class Wipro
{
	//Simple Interest.
	static float SI(float p,float r,float t){
	 float si=(p*r*t)/100;
    return si;
	}
	//Compound Interest.
	static double CI(float p,double r,float n,float t){
	 double A=p*Math.pow(1+(r/n),n*t);
	 double res=A-p;
	 return res;
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	float p=sc.nextFloat();
    float r=sc.nextFloat();
	float t=sc.nextFloat();
	float n=sc.nextFloat();
	System.out.println(SI(p,r,t));
	System.out.println(CI(p,r,n,t));
	}
	}
//program for conversion from decimal to binary
import java.util.*;
public class Wipro
{
	public static void toBinary(int num,int a[]){
	int i=0;
	while(num>0){
	 a[i]=num%2;
	 num=num/2;
	 i++;
	}
	 System.out.println("The Binary value is :");
	 for(int j=i-1;j>=0;j--){
	   System.out.println(""+a[j]);
	 }
	}
	public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
	  int a[]=new int[num];
	  System.out.println("The value of the number "+num+" is ");
	  toBinary(num,a);
	}
}
*/
//program for conversion from decimal to binary

