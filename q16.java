import java.util.Scanner;
class q16 {
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int[] num=new int[10];
    for(int i=0; i<10; i++)
    {
      System.out.print("Enter number #"+i+" : ");
      num[i]=scan.nextInt();
    }
    System.out.println("You Enterd Numbers are : ");
    for(int i=0; i<10; i++)
    {
      System.out.println(num[i]);
    }
  }
}
