class FsjThis
{
  FsjThis()
  {
    this("Kmit");
    System.out.println("In default Constructor");
  }
  FsjThis(String str)
  {
    System.out.println("In parameterized Constructor"+str);
  }
  public static void main(String args[])
  {
    FsjThis obj=new FsjThis();
  }
}