import java.util.Scanner;
class q1{
  public static void main(String args[])
  {
    Scanner scan =new Scanner(System.in);
    System.out.print("Meghana dead or not ? : ");
    String meghana=scan.nextLine();
    if(meghana.equals("dead"))
    {
      System.out.println("Surya meets ramya.");
    }
    else{
        System.out.println("Surya weds meghana.");
      }
    
    
}
}