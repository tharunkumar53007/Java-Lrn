import java.util.Scanner;
public class school {
  String passorfail(int tot)
  {
    if(tot>250 && 600>tot)
    {
      return "PASS";
    }
    else if(250>tot){
      return "FAIL";
    }
    else{
      return "Invalid input";
    }
  }
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter Your total mark : ");
    int total=scan.nextInt();
    school obj1=new school();
    String fin=obj1.passorfail(total);
    System.out.println(fin);
  }
}
