
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Shady
 */
public class Test {

    static ArrayList<Long> lucky = new ArrayList<>();

    public static void main(String[] args) {
        luckynumber();
        Collections.sort(lucky);
        for (int i = 0; i < lucky.size(); i++) {
            System.out.println(lucky.get(i));
        }
    }

    static void luckynumber() {
        for (int i = 0; i < 512; i++) {
            String num = Integer.toBinaryString(i);
            num = num.replace('1', '4');
            num = num.replace('0', '7');
            lucky.add(Long.parseLong(num));
            for (int j = num.length(); j < 9; j++) {
                num = "0" + num;
                num = num.replace('0', '7');
                lucky.add(Long.parseLong(num));
            }
        }
    }

    public static void generate(String s) {
        if (s.length() != 0) {
            lucky.add(Long.parseLong(s));
        }
        if (s.length() == 10) {
            return;
        }
        generate(s + "4");
        generate(s + "7");
    }

    public static void lucky(long num) {
        if (num > 10e9) {
            return;
        }
        if (num >= 1) {
            lucky.add(num);
        }
        lucky(4 + num * 10);
        lucky(7 + num * 10);
    }
}
