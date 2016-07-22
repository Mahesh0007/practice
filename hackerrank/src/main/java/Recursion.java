import java.util.Scanner;

/**
 * Created by vidya.priyadarshini on 22/07/16.
 * Refer resources/Recursion.pdf
 */
public class Recursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();
        if(n<2 || n>12) System.exit(0);

        System.out.println(factorial(n));
    }

    static int factorial(int n){
        if(n==1) return n;
        return n * factorial(n-1);
    }
}
