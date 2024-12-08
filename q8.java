import java.util.Scanner;
class q8 {
  public static void main(String args[])
  {
    Scanner scan =new Scanner(System.in);
    System.out.print("What is the colour of Traffic light : ");
    String light=scan.nextLine();
    if(light.equals("red"))
    {
      System.out.println("Stop");
    }
    else if(light.equals("yellow"))
    {
      System.out.println("Get Ready");
    }
    else if(light.equals("green"))
    {
      System.out.println("Go");
    }
    else
    {
      System.out.println("Wront input !");
    }
  }
}
