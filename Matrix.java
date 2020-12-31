import java.util.Scanner;
class Matrix
  {
     public static void main(String args[])
     {
       int x[][]={{1,2,3},{4,5,6}};
       int y[][]={{1,6,4},{8,9,0}};
       int a[][]=new int[2][3];
      for(int i=0;i<2;i++)
      {
         for(int j=0;j<3;j++)
         {
             a[i][j]=x[i][j]+y[i][j];
               System.out.println(+a[i][j]);
         }
  System.out.println( );
      }

     }
  }

