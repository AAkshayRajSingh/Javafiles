import java.util.Scanner;
class Min
{
   int i;
   int a[];
   int temp;
   Min()
  {
     for(i=0;i<=a.length;i++)
     {
        if(a[i]>a[i+1])
        {
           a[i+1]=temp;
           temp=a[i];  
           a[i]++;
        }
     }
   System.out.println("Minimum number is:"+a[i]);
  }
}
/*
class Max extends Min
{
  for()
}*/
class Baseclass
{
 int i;
int a[];

 void Baseclass() 
    {
       Scanner s=new Scanner(System.in);
       for(i=1;i<=a.length;i++)
       {
        System.out.println("Enter the elements:");
        a[i]=s.nextInt();    
       }
    }
}