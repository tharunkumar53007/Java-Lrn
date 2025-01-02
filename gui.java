import javax.swing.JOptionPane;
import java.util.Scanner;
public class gui {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String name=JOptionPane.showInputDialog("Enter your name : ");
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));

        JOptionPane.showMessageDialog(null,"Your name is : "+name);
        JOptionPane.showMessageDialog(null,"You're "+age+" Years Old");
    }
}
