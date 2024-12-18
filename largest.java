import java.util.Scanner;
public class largest {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three integers : ");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        if(n1>=n2 && n1>=n3)
        System.out.println(n1+" is the Largest Number");
        else if(n2>=n1 && n2>=n3)
        System.out.println(n2+" is the Largest Number");
        else if(n3>=n1 && n3>=n2)
        System.out.println(n3+" is the Largest Number");
    }
}
