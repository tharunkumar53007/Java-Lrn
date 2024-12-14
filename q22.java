import java.util.Scanner;
public class q22 {
  int add(int a,int b)
  {
    return a+b;
  }
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int a=scan.nextInt();
    int b=scan.nextInt();
    q22 sum=new q22();
    int ans=sum.add(a, b);
    System.out.println("The Addition of two number is : "+ans);
  }
}
