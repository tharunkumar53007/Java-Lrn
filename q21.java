import java.util.Scanner;
public class q21 {
  void addition(int a, int b)
  {
    int sum=a+b;
    System.out.println("The Addition of TWO number is : "+sum);
  }
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int a=scan.nextInt();
    int b=scan.nextInt();
    q21 maths=new q21();
    maths.addition(a, b);
  }
}
