import java.util.Scanner;

/**
 * Created by aditibk on 09/12/15.
 */
public class PrintDiamond {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print : ");
        int number = input.nextInt();
        for(int i = 1;i <= number; i++){
            for(int k = 1;k <= number - i + 1;k++)
                System.out.print(" ");
            for(int j = 0; j < 2*i-1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(int i = number-1;i >= 1; i--){
            for(int k = 1;k <= number - i + 1;k++)
                System.out.print(" ");
            for(int j = 0; j < 2*i-1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
