/*import java.util.*;
public class Matrices
{
	public static void main(String args[]){
	      int row1,row2,col1,col2;
		  Scanner sc=new Scanner(System.in);
		  row1=sc.nextInt();
		  col1=sc.nextInt();
		  row2=sc.nextInt();
		  col2=sc.nextInt();
		  boolean flag=true;
		  int a[][]=new int[row1][col1];
          int b[][]=new int[row2][col2];
		  for(int i=0;i<row1;i++){
		      for(int j=0;j<col1;j++){
			     a[i][j]=sc.nextInt();
			  }
		  }
		   for(int i=0;i<row2;i++){
		      for(int j=0;j<col2;j++){
			     b[i][j]=sc.nextInt();
			  }
		  }
		  System.out.println("First matrix1:");
		  for(int i=0;i<row1;i++){
	            for(int j=0;j<col1;j++){
				System.out.print(a[i][j]+" ");
				}
				System.out.println();
		  }
		  System.out.println("Second matrix2:");
		  for(int i=0;i<row2;i++){
	            for(int j=0;j<col2;j++){
				System.out.print(b[i][j]+" ");
				}
				System.out.println();
		  }
		  row1=a.length;
		  col1=a[0].length;
          row2=b.length;
		  col2=b[0].length;
          if(row1!=row2||col1!=col2){
		  System.out.println("They are not equal");
		  }
		  else{
			  for(int i=0;i<row1;i++){
			   for(int j=0;j<col1;j++){
			      if(a[i][j]!=b[i][j])
					  flag=false;
				  break;
			   }
			  }
		  }
		  if(flag)
			  System.out.println("They are equal");
		  else
			  System.out.println("They are not equal");

	}
}*/
import java.util.*;
public class Matrices
{
	public static void main(String args[]){
	 int row1,row2,col1,col2;
	 boolean flag=true;
	 Scanner sc=new Scanner(System.in);
	 row1=sc.nextInt();
	 col1=sc.nextInt();
	 row2=sc.nextInt();
	 col2=sc.nextInt();
	 int a[][]=new int[row1][col1];
	 int b[][]=new int[row2][col2];
	 for(int i=0;i<row1;i++){
	  for(int j=0;j<col1;j++){
	    a[i][j]=sc.nextInt();
	  }
	  }
	  	 for(int i=0;i<row2;i++){
	  for(int j=0;j<col2;j++){
	    b[i][j]=sc.nextInt();
	  }
	  }
	  System.out.println("First matrix is as follows:");
	  for(int i=0;i<row1;i++){
	    for(int j=0;j<col1;j++){
		  System.out.print(a[i][j]+" ");
		}
		System.out.println();
	  }
	  	  System.out.println("Second matrix is as follows:");
	  for(int i=0;i<row2;i++){
	    for(int j=0;j<col2;j++){
		  System.out.print(b[i][j]+" ");
		}
		System.out.println();
	  }
	  row1=a.length;
	  col1=a[0].length;
      row2=b.length;
	  col2=b[0].length;
      if(row1!=row2||col1!=col2)
		  System.out.println("They are not equal");
	  else{
	    for(int i=0;i<row1;i++)
			for(int j=0;j<col1;j++)
			 if(a[i][j]!=b[i][j])
		  {
			flag=false;
			break;
		}
	  }
	  if(flag)
		  System.out.println("The matrices are equal");
	  else
		  System.out.println("The matrices are notequal");
	}
}

































