import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by vidya.priyadarshini on 22/07/16.
 */
public class BinaryNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 1 || n > Math.pow(10, 6)) System.exit(0);

        int curRem;
        int cnt = 0;
        int prevRem = 0;
        Stack<Integer> binaryStack = new Stack();
        while (n > 0) {
            curRem = n % 2;
            n = n / 2;
            binaryStack.push(curRem);
        }

        Iterator<Integer> i = binaryStack.iterator();

        if(binaryStack.contains(1)) cnt++;
        int maxCnt =cnt;
        while (i.hasNext()) {

            curRem = i.next();
            if (curRem == 1 && curRem == prevRem) {
                cnt++;
                if(cnt > maxCnt) {
                    maxCnt = cnt;
                }
            }
            else {
                if(cnt!=0)cnt=1;
            }
            prevRem = curRem;

        }
        System.out.println(maxCnt);
    }
}
