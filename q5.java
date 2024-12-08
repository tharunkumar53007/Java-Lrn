import java.util.Scanner;
class q5 {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your score : ");
        int score =scan.nextInt();
        System.out.println("---------------------------------");
        if(score>35 && score<60)
        {
            System.out.print("you can buy video game");
        }
        else if(score>60 && score<90)
        {
            System.out.println("you can buy iPhone 15");
        }
        else if(score>90)
        {
            System.out.println("you can buy MacBook Pro");
        }
        else
        {
            System.out.println("Study Well...");
        }
    }
}
