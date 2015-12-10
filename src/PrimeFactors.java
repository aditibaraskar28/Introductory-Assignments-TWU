import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by aditibk on 09/12/15.
 */
public class PrimeFactors {
    public static boolean isPrime(int number){
        int k = 0;
            for(int i = 2;i < number; i++){
                if(number % i == 0)
                    k++;
            }
        if(k == 0)
            return true;
        return false;
    }

    public static ArrayList<Integer> generate(int number){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 2;i <= number;i++){
            if(number % i == 0 && isPrime(i))
                list.add(i);
        }
        return list;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        ArrayList<Integer> primefactors = generate(number);
        System.out.println("Prime Factors of " + number + " : "+primefactors);

    }
}
