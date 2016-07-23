import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vidya.priyadarshini on 23/07/16.
 */
public class Exceptions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();

        if(string.length()<1 || string.length()>6) System.exit(0);

        Pattern p = Pattern.compile("[^a-z0-9 ]");
        Matcher m = p.matcher(string);
        if(m.find()) System.exit(0);


        try {

            System.out.println(Integer.parseInt(string));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
