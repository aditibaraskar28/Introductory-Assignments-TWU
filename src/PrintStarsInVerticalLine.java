import java.util.Scanner;

/**
 * Created by aditibk on 09/12/15.
 */
public class PrintStarsInVerticalLine {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of stars you want to print : ");
        int number = input.nextInt();
        for(int i = 0;i < number; i++)
            System.out.println("*");
    }
}
