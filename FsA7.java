import java.util.Scanner;
class FsA7
{
  private int r,length,breadth,perimeter,area;
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the length of rectangle:");
    length=s.nextInt();
    System.out.println("Enter the breadth of rectangle:");
    breadth=s.nextInt();
    perimeter=2*(length+breadth);
    System.out.println("Perimeter is:"+perimeter);
    area=length*breadth;
    System.out.println("Area is:"+area);
  }
}