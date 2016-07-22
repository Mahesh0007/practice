import java.util.*;

/**
 * Created by vidya.priyadarshini on 22/07/16.
 * Refer resources/Maps.pdf
 * Sample Input :
 * 3
 sam 99912222
 tom 11122222
 harry 12299933
 sam
 edward
 harry
 Sample Output :
 sam=99912222
 Not found
 harry=12299933
 */
public class Maps {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1 || n > Math.pow(10, 5)) System.exit(0);

        Map<String, Integer> phoneBook = new HashMap<String, Integer>(n);
        List<String> queries = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            if (name != null ) {
                for(int k=0;k<name.length();k++) if(Character.isUpperCase(name.charAt(k))) System.exit(0);
                phoneBook.put(name, phone);
            }
        }

        while (in.hasNext()) {
            String s = in.next();
            if (s != null) {
                queries.add(s);
            }
        }
        in.close();

        if (queries.size() == 0 || queries.size() > Math.pow(10, 5)) System.exit(0);

        for (String s : queries) {
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else
                System.out.println("Not found");
        }

    }
}
