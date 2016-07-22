import java.util.Scanner;

/**
 * Created by vidya.priyadarshini on 22/07/16.
 * Refer resources/Arrays2D.pdf
 */
public class Arrays2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int val;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                if(!in.hasNext()) System.exit(0);
                val = in.nextInt();
                if(val < -9 || val > 9) System.exit(0);
                arr[i][j] = val;
            }
        }
        in.close();
        System.out.println("Input matrix before sums computing");
        printHourGlass(arr);

        int[] sums = computeHourGlassSum(arr);

        System.out.println("Max hour glass sum is " + computeMaxHourGlassSum(sums));
    }

    static int[] computeHourGlassSum(int[][] matrix) {

        int[] sums = new int[16];

        int[][] hourGlass = new int[3][3];
        int cnt =0; int row=0,col=0; int sum=0;

        while(cnt<16) {
            int tempr = row;
            int tempc = col;
            for(int r=0;r<3;r++) {
                for (int c = 0; c < 3; c++) {
                    hourGlass[r][c] = matrix[tempr][tempc];
                    if(r==0&&c==0 || r==0 && c==1 || r==0 && c==2 || r==1 && c==1 || r==2 && c==0 || r==2 && c==1 || r==2 && c==2) {
                        sum = sum + hourGlass[r][c];
                    }
                    tempc++;
                }
                tempr++;
                tempc = tempc - 3;
            }
            System.out.println("Computed sum for following hourGlass no. " + cnt);
            printHourGlass(hourGlass);
            sums[cnt]=sum;
            sum=0;
            cnt ++;
            if(col<=2) col++; else col=0;
            if(cnt%4==0) {
                row++;
            }
        }

        return sums;
    }

    static int computeMaxHourGlassSum(int[] sums){
        int maxSum=sums[0];

        for(int i=0;i<sums.length;i++) {
            if(maxSum<sums[i]) maxSum = sums[i];
        }

        return maxSum;
    }

    static void printHourGlass(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
