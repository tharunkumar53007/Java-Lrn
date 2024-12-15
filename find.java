import java.util.Scanner;
public class find {
  String evenorodd(int num)
  {
    if(num%2==0)
    {
      return "Even Number";
    }
    else{
      return "Odd Number";
    }
  }
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a integer : ");
    int unum=scan.nextInt();
    find ufind=new find();
    String ans=ufind.evenorodd(unum);
    System.out.println(unum+" is a "+ans);
  }
}
