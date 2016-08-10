import java.util.Scanner;

/**
 * Created by vidya.priyadarshini on 25/07/16.
 */
public class Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<2 || n>600) System.exit(0);
        int a[] = new int[n];
        int val=0;
        for(int a_i=0; a_i < n; a_i++){
            val = in.nextInt();
            if(val<1 || val > 2 * Math.pow(10,6)) System.exit(0);
            a[a_i] = in.nextInt();
        }
    }
}
