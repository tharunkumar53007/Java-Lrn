import java.util.Scanner;
class q12 {
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter starting number : ");
    int a=scan.nextInt();
    System.out.print("Enter ending number : ");
    int b=scan.nextInt();
    for(int i=a; i<=b; i++)
    {
      System.out.println(i);
    }
  }
}
