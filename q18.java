import java.util.Scanner;
class q18 {
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a size of an array : ");
    int size=scan.nextInt();
    int[] num=new int[size];
    System.out.println("Enter "+size+" Numbers : ");
    for(int i=0; i<=size-1; i++)
    {
      num[i]=scan.nextInt();
    }
    int mid=(size-1)/2;
    System.out.println("The Middle element is : "+num[mid]);
  }

}
