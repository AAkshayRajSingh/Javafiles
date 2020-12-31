import java.util.Scanner;
abstract class Shape
 {
   abstract double getarea(double length);
   abstract double getperimeter(double length); 
 }
class circle extends Shape
 {
  double area,perimeter;
  double getarea(double length)
  {
    area=3.14*length*length;
    return area;
  }
  double getperimeter(double length)
  {
    perimeter=2*3.14*length;
    return perimeter;
  } 
 }
  class square extends Shape
 {
  double getarea(double length)
  {
    double area=length*length;
    return area;
  }
  double getperimeter(double length)
  {
    double perimeter=4*length;
    return perimeter;
  } 
 }
 class Maths
  {
   public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the length:");
      double n=s.nextDouble();
      circle obj =new circle();
       System.out.println("The area of circleis:"+obj.getarea(n));
       System.out.println("The perimeter of circle is:"+obj.getperimeter(n));
       square obj1=new square();
        System.out.println("The area of square is:"+obj1.getarea(n));
        System.out.println("The perimeter of square is:"+obj1.getperimeter(n));
   }
  }