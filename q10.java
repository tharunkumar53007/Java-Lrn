import java.util.Scanner;
class q10 {
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two integer : ");
    int a=scan.nextInt();
    int b=scan.nextInt();
    boolean result=a>b;
    int great=result?a:b;
    System.out.println("-------------------------");
    System.out.println(great+" is Greater Number");
  }
}
