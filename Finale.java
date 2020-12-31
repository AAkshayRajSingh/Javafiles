import java.util.*;
class x
  {
    void getMethod()
    {
       System.out.println("x method called");
    } 
  }
    class y extends x
  {
      void getMethod()
    {
       System.out.println("y method called");
    } 
  }
class Finale
{
  public static void main(String args[])
   {
      y obj=new y();
      obj.getMethod();
   }
}