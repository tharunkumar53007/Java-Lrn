import java.util.Scanner;
class q17 {
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter which table you want : ");
    int tb=scan.nextInt();
    for(int i=1; i<=tb; i++)
    {
      System.out.println(i+"x"+tb+"="+(i*tb));
    }
  }
}
