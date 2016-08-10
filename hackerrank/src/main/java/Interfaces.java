import java.util.Scanner;

/**
 * Created by vidya.priyadarshini on 23/07/16.
 */

interface AdvancedArithmetic{
        int divisorSum(int n);
    }

public class Interfaces{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
