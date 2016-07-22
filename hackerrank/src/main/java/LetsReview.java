import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vidya.priyadarshini on 22/07/16.
 *
 * Sample Input : 2
 Hacker
 Rank
 Sample Output :
 Hce akr
 Rn ak
 For explanation and Problem statement refer resources.
 */
public class LetsReview {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();

        String str;
        int t = sc.nextInt();
        if(t<1 || t >10) System.exit(0);

        for(int i=0;i<t;i++) {
            str = sc.next();
            if(str==null) System.exit(0);
            int len = str.length();
            if (len < 2 || len > 10000) System.exit(0);
            stringList.add(str);
        }

        for(String s : stringList) {
            System.out.println(printEvenIndex(s) + " " + printOddIndex(s));
        }
        sc.close();
    }

    /**
     * @param str
     * @return even indexes
     */
    static String printEvenIndex(String str) {
        String evenStr = "";
            for (int index = 0; index < str.length(); index += 2) {
                evenStr = evenStr + str.charAt(index);
            }

        return evenStr;
    }

    /**
     * @param str
     * @return odd indexes
     */
    static String printOddIndex(String str) {
        String oddStr = "";

        for(int index = 1;index < str.length(); index += 2) {
            oddStr = oddStr + str.charAt(index);
        }
        return oddStr;
    }
}
