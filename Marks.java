import java.util.Scanner;
class Marks
{
  int sub1,sub2,sub3,sub4,sub5;
  int total;
  float per;
  Scanner s=new Scanner(System.in);
  Marks()
	{
     sub1=80;
	 sub2=90;
     sub3=70;
	 sub4=95;
	 sub5=100;
	}

    public void grade(float per)
	{
		if (per >= 60)
			System.out.println("First div");
		else if (per >= 50)
             System.out.println("Second div");
		else if (per >= 40)
			System.out.println("Third div");
		else
			System.out.println("Fail");
	}
	public void grade(int total)
	{
		System.out.println("Total marks scored "+total);
	}
}
class MarksRunner
{
  public static void main(String[] args)
	{
	 int total;
	 float per;
     Marks obj1=new Marks();  
	 Scanner s=new Scanner(System.in);
	 obj1.sub1=s.nextInt();
	 obj1.sub2=s.nextInt();
	 obj1.sub3=s.nextInt();
	 obj1.sub4=s.nextInt();
	 obj1.sub5=s.nextInt();

	 total=obj1.sub1+obj1.sub2+obj1.sub3+obj1.sub4+obj1.sub5;
	 per=(total/5);
	 obj1.grade(per);
	 obj1.grade(total);
	}
}
  