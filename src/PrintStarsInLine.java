/**
 * Created by aditibk on 09/12/15.
 */
import java.util.Scanner;

public class PrintStarsInLine {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of stars you want to print : ");
        int number = input.nextInt();
        for(int i = 0;i < number; i++)
            System.out.print("*");
    }
}
