import java.util.Scanner;

/**
 * Created by aditibk on 09/12/15.
 */
public class PrintRightTriangle {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print : ");
        int number = input.nextInt();
        for(int i = 1;i <= number; i++){
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
