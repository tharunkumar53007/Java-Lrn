import java.util.Scanner;
class q6 {
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("What is the score in a game ? : ");
        int score=scan.nextInt();
        if(score<50)
        {
            System.out.println("you need to improve");
        }
        else if(score>50 && score<70)
        {
            System.out.println("Good job!");
        }
        else{
            System.out.println("Excellent performance");
        }
    }
}
