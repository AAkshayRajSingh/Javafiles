class Length
{
  int len=100;
}
class Breadth extends Length
{
  int bre=20;
}
class inh extends Breadth
{
  public static void main(String[] args)
  {
     inh obj=new inh();
     obj.dispArea();
  }
  public void dispArea()
  {
     System.out.println("Area:"+len*bre);11
  }
}