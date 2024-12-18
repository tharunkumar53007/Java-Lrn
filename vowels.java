import java.util.Scanner;
public class vowels {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch=scan.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println(ch+" -> is Vowels");
        }
        else{
            System.out.println(ch+" -> is Consonant");
        }
    }
}
