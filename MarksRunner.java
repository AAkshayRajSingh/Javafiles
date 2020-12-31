import java.util.Scanner;
class Marks
{
  int sub1,sub2,sub3,sub4,sub5;
  int total;
  float per;
  String res;
  
  Marks()
	{
      total=0;
	  per=0.0f;
	}
  Marks(int s1,int s2,int s3,int s4,int s5)
	{
     	 sub1=s1;
		 sub2=s2;
		 sub3=s3;
		 sub4=s4;
		 sub5=s5;
	}


    public void process()
	{
		total=sub1+sub2+sub3+sub4+sub5;
		per=total/5;
		
		if(sub1>=40 &&sub2>=40&&sub3>=40&&sub4>=40&&sub5>=40)
		{

		if (per >= 60)
			res="First div";
		else if (per >= 50)
             res="Second div";
		else if (per >= 40)
			res="Third div";
		}
		else
			res="Fail";
	}
	public void grade()
	{
		System.out.println("Total marks scored "+total);
        System.out.println("Average "+per);
		System.out.println("Grade "+res);
	}
}
class MarksRunner
{
  public static void main(String[] args)
	{
	 
      
	 Scanner s=new Scanner(System.in);
	 int m1=s.nextInt();
	 int m2=s.nextInt();
	 int m3=s.nextInt();
     int m4=s.nextInt();
	 int m5=s.nextInt();
	 Marks obj1=new Marks(m1,m2,m3,m4,m5); 
	 obj1.process();
	 obj1.grade();

	}
}
  