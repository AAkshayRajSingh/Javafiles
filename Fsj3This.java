class Fsj3This
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
    methodone(num);
  }
  public static void main(String args[])
  {
    Fsj3This obj=new Fsj3This();
    obj.methodTwo();
  }
}