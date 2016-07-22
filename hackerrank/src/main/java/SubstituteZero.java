import java.util.Scanner;

/**
 * Created by vidya.priyadarshini on 22/07/16.
 */
public class SubstituteZero {

    public static int rowsLen;
    public static int colsLen;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        rowsLen = scanner.nextInt();
        colsLen = scanner.nextInt();

        int [][] matrix = new int[rowsLen][colsLen];

        for(int i=0;i<rowsLen;i++) {
            for(int j=0;j<colsLen;j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix before transformation");
        printMatrix(matrix);

        int [][] result;
        result = substitueZero(matrix);


        System.out.println("Matrix after transformation");
        printMatrix(result);

    }

    public static int[][] substitueZero(int[][] matrix) {

        if(rowsLen<1 || rowsLen>1000 || colsLen<1 || colsLen>1000) System.exit(0);
        int[][] result=new int[rowsLen][colsLen];
        for(int r=0;r<rowsLen;r++)
            for(int c=0;c<colsLen;c++)
                result[r][c]=matrix[r][c];

        for(int i=0;i<rowsLen;i++) {
            for(int j=0;j<colsLen;j++){
                if(matrix[i][j]==0) {
                    for(int col=0;col<colsLen;col++){
                        result[i][col]=0;
                    }
                    for(int row=0;row<rowsLen;row++){
                        result[row][j]=0;
                    }
                }
            }
        }
        return result;
    }


    public static void printMatrix(int[][] matrix) {

        System.out.println("Printing matrix : ");

        for(int i=0;i<rowsLen;i++) {
            for(int j=0;j<colsLen;j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("");
        }

    }
}
