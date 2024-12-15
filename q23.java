import java.util.Scanner;
public class q23 {
  Scanner scan=new Scanner(System.in);
  String getname()
  {
    System.out.print("Enter your name : ");
    String name=scan.nextLine();
    return name;
  }
  String getphone()
  {
    System.out.print("Enter your Phone number : ");
    String phone=scan.nextLine();
    return phone;
  }
  String getaddress(){
    System.out.print("Enter your address : ");
    String address=scan.nextLine();
    return address;
  }
  public static void main(String args[])
  {
    q23 details=new q23();
    String myname=details.getname();
    String phonenumber=details.getphone();
    String myaddress=details.getaddress();
    System.out.println("------------------------------");
    System.out.println("Your name is : "+myname);
    System.out.println("Your Phone number is : "+phonenumber);
    System.out.println("Your Address is : "+myaddress);
  }
}
