
public class Test {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Shady Bajary   ");
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb);
    }
}
