import java.util.Scanner;
class Divide{
  void divideNum(int num,int den)
  {
    try{
      int result=num/den;
      System.out.println("The division is : "+result);
    }
    catch(ArithmeticException e)
    {
      System.out.println("Cannot divide by zero");
    }
  }
}
public class DivisionExample {

  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two integer : ");
    int a=scan.nextInt();
    int b=scan.nextInt();
    Divide div=new Divide();
    div.divideNum(a, b);
  }
}