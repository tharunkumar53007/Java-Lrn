import java.util.Scanner;
class q9 {
  public static void main(String args[])
  {
    Scanner scan =new Scanner(System.in);
    System.out.print("Enter your salary : ");
    int salary=scan.nextInt();
    System.out.print("Enter your Age : ");
    int age=scan.nextInt();
    if(salary>=20000 || age<=25)
    {
      System.out.print("Enter required loan Amount : ");
      int loan=scan.nextInt();
        if(loan<=50000)
        {
          System.out.println("You're eligible for loan.");
        }
        else{
          System.out.println("Maximum loan amount is 50,000 ");
        }
    }
    else
    {
      System.out.println("You're not eligible for loan");
    }
  }
  
}
