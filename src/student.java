/**
 * Created by zou on 2016/12/12.
 */
public class student {
    private String name;
    private int age;

    public student() {
        super();
    }

    public student(String name, int age) {
        super();
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
