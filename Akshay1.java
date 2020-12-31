import java.util.*;
abstract class Marks
{
	Marks()
	{
		int a[][]=new int[2][3];
		int s1,s2,s3;
		System.out.println("Enter the values of three subjects:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
			
			a[i][j]=s.nextInt();
		}
		}
		s.close();
		}
}
class Grace extends Marks
{
	final void giveGrace()
	{
		int[][] a = null;
		for(int i=0;i<2;i++)
		{
		   if(a[i][3]<40)
		   {
			   a[i][3]+=5;
			   a[i][4]=1;
		   }
		}
		for(int i=0;i<2;i++)
			for(int j=0;j<5;j++)
			{
				System.out.println(a[i][j]+"");
			}
	}
}
class Totmks extends Grace
{
	Totmks()
	{
		totmks();
		giveGrace();
	}
	public void totmks()
	{
		
		int tot=0;
		for(int i=0;i<2;i++)
		{
			tot=0;
			int[][] a = null;
			for(int j=0;j<3;j++)
			{
				tot+= a[i][j];
			a[i][3]=tot/3;
			}
		}
	}
}
public class Akshay1
{
	public static void main(String[] args)
	{
		Totmks obj=new Totmks();
	}
}