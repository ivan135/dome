import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by zou on 2016/11/17.
 */


public class 异常 {
    public static void main(String[] args)
        {
           Collection c = new ArrayList();
            c.add(new student("张三", 23));
            c.add(new student("李四", 24));
            c.add(new student("王五", 25));
            c.add(new student("赵刘", 26));

            Object[] arr = c.toArray();
            for (int i = 0; i <arr.length ; i++) {
                //System.out.println(arr[i])0;
                //System.out.println(arr[i].getName);
                student s = (student)arr[i];
                System.out.println(s.getName());

            }
    }
}



