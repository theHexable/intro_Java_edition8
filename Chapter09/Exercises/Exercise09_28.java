package Chapter09.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 9.28
 * @Title Common prefix
 */
public class Exercise09_28 {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Exercise09_28 firstWord secondWord");
            System.exit(0);
        }
        System.out.println(prefix(args[0], args[1]));
    }

    public static String prefix(String s1, String s2) {
        String pre = "";
        int small = s1.length() <= s2.length() ? s1.length() : s2.length();
        for (int i = 0; i <= small; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                pre = pre.concat(String.valueOf(s1.charAt(i)));
            } else {
                break;
            }
        }
        return pre;
    }
}
