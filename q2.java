import java.util.Scanner;
class q2 {
  public static void main(String args[])
  {
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter your score : ");
    int mark=scan.nextInt();
    if(mark>=35)
    {
      System.out.println("You're passed !");
    }
    else{
      System.out.println("You're failed !");
    }
  }
}
