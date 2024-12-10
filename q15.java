import java.util.Scanner;
class q15{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int[] num=new int[5];
    for(int i=0; i<5; i++)
    {
      System.out.print("Enter num #"+i+" : ");
      num[i]=scan.nextInt();
    }
    System.out.println("You Entered numbers are : ");
    for(int j=0; j<5; j++)
    {
      System.out.println(num[j]);
    }
  }
}