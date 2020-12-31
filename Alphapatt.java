import java.util.Scanner;
class Alphapatt
{
 public static void main(String args[])
{
   char ch='A';
   int i,j,n,t;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number:");
   n=s.nextInt();
   for(i=0;i<=n;i++)
   {
     if(i%2==0)
     {
       for(j=0;j<=i;j++)
       {
         if(ch==91)
         ch='A';
         System.out.print(ch);
         ch++;
       }
   }
else
{
 t=i;
   for(j=0;j<=i;j++)
   {
     System.out.format("%c",ch+t);
     t--;
   }
   for(j=0;j<=i;j++)
   ch++;
}
System.out.println( );
}
   
}

}