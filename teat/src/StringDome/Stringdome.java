package StringDome;

/**
 * Created by zou on 2016/11/15.
 */
public class Stringdome {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer();
        sb.append("i love ");
        System.out.println(sb.toString());
        tell(sb);
        System.out.println(sb.toString());
        }
        public static void tell(StringBuffer s)
        {
            s.append("jikexueyuan");
    }
}
