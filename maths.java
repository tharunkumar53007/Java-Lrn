import java.util.Scanner;
public class maths {
  void sum(int a, int b)
  {
    System.out.println("Addition is : "+ (a+b));
  }

  void sub(int a, int b)
  {
    System.out.println("Subtraction is : "+(a-b));
  }

  void mul(int a, int b)
  {
    System.out.println("Muliplication is : "+ (a*b));
  }

  void div(int a, int b)
  {
    System.out.println("Division is : "+ (a/b));
  }
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int a=scan.nextInt();
    int b=scan.nextInt();
    maths operations=new maths();
    operations.sum(a,b);
    operations.sub(a,b);
    operations.mul(a,b);
    operations.div(a,b);
  }
}
