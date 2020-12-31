import java.util.Scanner;
class Circle
{
 
  public static void main(String args[])
  {
int r;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the radius of sphere:");
    r=s.nextInt();
    area obj1=new area();
    obj1.area(r);
    volume obj2=new volume();
    obj2.volume(r) ;
   }
} 
class volume
{
  public void volume(int r)
  {
     double volume=4/3*3.1415*(r*r*r);
     System.out.println("Total Volume is:"+volume);
  }
}
class area
{
   public void area(int r)
   {
   double area=4*3.1415*(r*r);
   System.out.println("Total Area is:" +area);
   }
}
   
   
     