package StringDome;

/**
 * Created by zou on 2016/11/16.
 */
public class object {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int temp=1;
        try {
            temp=a/b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println(temp);
    }

}
