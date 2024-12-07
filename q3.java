import java.util.Scanner;
class q3{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter your income : ");
    int income =scan.nextInt();
    if(income>7000)
    {
      System.out.println("Scholarship available !");
    }
    else{
      System.out.println("Scholarship not available !");
    }
  }
}