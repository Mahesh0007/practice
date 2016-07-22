import java.util.Scanner;

/**
 * Created by vidya.priyadarshini on 22/07/16.
 * Refer resources/Arrays.pdf
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int elem;
        if(n<1 || n>1000) System.exit(0);
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            elem = in.nextInt();
            if(elem<1 || elem>10000) System.exit(0);
            arr[i] = elem;
        }
        printReverse(arr);
        in.close();
    }

    static void printReverse(int[] arr){

        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
