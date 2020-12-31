import java.util.Scanner;
class Eightnum
{
   public static void main(String args[])
   {
     int i,j,n,first,middle,last;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number:");
     n=s.nextInt();
      first=0;
       last=n-1;
      middle=n/2;
      for(i=0;i<n;i++)
      {
         if(i==first||i==middle||i==last)
         {
           for(j=0;j<3;j++)
           {
               System.out.print("* ");
           }
         }
        else
         for(j=0;j<2;j++)
         { 
            System.out.print("*   ");
         }
         System.out.println();
      }
   }
}