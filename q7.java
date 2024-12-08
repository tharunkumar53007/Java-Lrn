import java.util.Scanner;
class q7 {
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter your mark in tamil : ");
    int tam=scan.nextInt();
    System.out.print("Enter your mark in English : ");
    int eng=scan.nextInt();
    System.out.print("Enter your mark in Maths : ");
    int maths=scan.nextInt();
    System.out.print("Enter your mark in Science : ");
    int sci=scan.nextInt();
    System.out.print("Enter your mark in Social Science : ");
    int ss=scan.nextInt();

    int average=(tam+eng+maths+sci+ss)/5;
    if(average<35)
    {
      System.out.println("Your Average is : "+average+"%");
      System.out.println("Addtion class is required.");
    }
    else{
      System.out.println("Your Average is : "+average+"%");
      System.out.println("You are good to go.");
    }
  }
}
