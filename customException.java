import java.util.Scanner;
class InvalidAgeException extends Exception
{
  InvalidAgeException(String msg)
  {
    super(msg);
  }
}
class ageValidator
{
  void checkAge(int age)
  {
    try{
      if(age<0 || age>150)
    {
      throw new InvalidAgeException("Age is Invalid");
    }
    else{
      System.out.println("Age is Valid");
    }
    }
    catch(Exception e){
      System.out.println(e);
    }
    
  }
}

public class customException {
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter your age : ");
    int age=scan.nextInt();
    ageValidator ageval=new ageValidator();
    ageval.checkAge(age);
  }
}