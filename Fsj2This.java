class Fsj2This
{
  int num;
  void methodone(int N)
  {
  int n=N;
    System.out.println("Inside method one "+n);
  }
  void methodTwo()
  {
    System.out.println("Inside method two");
    num=10;
    this.methodone(this.num);
  }
  public static void main(String args[])
  {
    Fsj2This obj=new Fsj2This();
    obj.methodTwo();
  }
}