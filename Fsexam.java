import java.util.Scanner;
class Node
{
    int data;
    Node next;
}
class LinkedList
{
    Node head;
    void insertlast()
    {
        Scanner sc=new Scanner(System.in);
        Node n1=new Node();
        System.out.print("enter data:");
        n1.data=sc.nextInt();
        n1.next=null;
        if(head==null)
        {
            head=n1;
        }
        else
        {
           Node n2=head;
           while(n2.next!=null)
           {
               n2=n2.next;
           }
           n2.next=n1;
        }
        System.out.println();
    }
    void display()
    {
        Node n1=head;
        if(n1==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.print("list:");
            while(n1!=null)
            {
                System.out.print(n1.data+"->");
                n1=n1.next;
            }
        }
        System.out.println();
    }
    void insertfirst()
    {
        Scanner sc=new Scanner(System.in);
        Node n1=new Node();
        System.out.print("enter data:");
        n1.data=sc.nextInt();
        n1.next=head;
        head=n1;
        System.out.println();
    }
    void insertmiddle()
    {
        Scanner sc=new Scanner(System.in);
        Node n1=new Node();
        System.out.print("enter data:");
        n1.data=sc.nextInt();
        n1.next=null;
        System.out.print("enter position to enter:");
        int pos=sc.nextInt();
        Node n2=head;
        int i=1;
       if(pos==1)
       {
           n1.next=head;
           head=n1;
       }
       else
       {
           while(i<pos-1)
           {
               n2=n2.next;
               i++;
           }
           n1.next=n2.next;
           n2.next=n1;
       }
       System.out.println();
    }
    void search()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter element to search:");
        int element=sc.nextInt();
        Node n1=head;
        int count=1;
        while(n1!=null)
        {
            if(n1.data==element)
            {
                System.out.println(element+" "+"found at position"+" "+count);
                break;
            }
            count++;
            n1=n1.next;
        }
        if(n1==null)
        {
            System.out.println("no such element in list");
        }
        System.out.println();
    }
    void update()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter position you want to update:");
        int pos=sc.nextInt();
        System.out.println("enter new element:");
        int nelement=sc.nextInt();
        Node n1=head;
        int i=1;
        while(i<pos)
        {
            n1=n1.next;
            i++;
        }
        n1.data=nelement;
        System.out.println();
    }
    void deletemiddle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter postion to delete:");
        int pos=sc.nextInt();
        Node n1=head;
        Node n2=null;
        int i=0;
        if(pos==1)
        {
            head=n1.next;
            n1.next=null;
        }
        else
        {
            while(i<pos-1)
            {
                n1=n1.next;
                i++;
            }
            n2=n1.next;
            n1.next=n2.next;
            n2.next=null;
        }
        System.out.println();
    }
    void deletestart()
    {
        Node n1=head;
        head=n1.next;
        n1.next=null;
        System.out.println();
    }
    void deletelast()
    {
        Node n1=head;
        int count=0,i=0;
        while(n1.next!=null)
        {
            count++;
            n1=n1.next;
        }
        n1=head;
        while(i<count-1)
        {
            n1=n1.next;
            i++;
        }
        n1.next=null;
        System.out.println();
    }
}
public class Fsexam {
	  public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        LinkedList obj=new LinkedList();
	        System.out.println("1.display");
	        System.out.println("2.insert at last");
	        System.out.println("3.insert first");
	        System.out.println("4.insert middle");
	        System.out.println("5.search an element");
	        System.out.println("6.update an element at a position");
	        System.out.println("7.delete first node");
	        System.out.println("8.delete last node");
	        System.out.println("9.delete middle node");
	        System.out.println("10.exit");
	        while(true)
	        {
	            System.out.print("enter your choice:");
	            int ch=sc.nextInt();
	            switch(ch)
	            {
	                case 1:obj.display();
	                break;
	                case 2:obj.insertlast();
	                break;
	                case 3:obj.insertfirst();
	                break;
	                case 4:obj.insertmiddle();
	                break;
	                case 5:obj.search();
	                break;
	                case 6:obj.update();
	                break;
	                case 7:obj.deletestart();
	                break;
	                case 8:obj.deletelast();
	                break;
	                case 9:obj.deletemiddle();
	                break;
	                case 10:System.exit(0);
	                break;
	                default:System.out.println("invalid option");
	            }
	        }
	    }
}
