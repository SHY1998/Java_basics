import java.util.Comparator;

/**
 * Interface Comparator<T>
 *     抽象方法：int compare(T o1,T o2)
 *  这个接口是代表Java中比较两个对象的标准，而且是一种“定制”比较的标准
 *  这个接口中没有规定如何比较两个对象的大小
 *  但是规定了，如果你认为O1大于o2，就返回正整数
 *  如果你认为O1等于o2，就返回正整数
 *  如果你认为O1小于o2，就返回负整数
 */
public class Test30_Interface_01 {
    public static void main(String[] args) {
        Student_Interface s1 =new Student_Interface("shy",23,4);
        Student_Interface s2 =new Student_Interface("sasdhy",223,24);

        //比较s1和s2的大小
//        if (s1 >s2) {//错误的
//            System.out.println("s1>s2");
//        }
        AgeComparator c =new AgeComparator();
        if (c.compare(s1,s2)>0)
        {
            System.out.println("s1>s2");
        }else if(c.compare(s1,s2)<0)
        {
            System.out.println("s1<s2");
        }else
        {
            System.out.println("s12s2");
        }
    }
}

//实现Comparator接口，来定制两个学生比较的具体实现方式
//按照年龄比较
class AgeComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        //（1）向下转型
        Student_Interface s1 = (Student_Interface) o1;
        Student_Interface s2 = (Student_Interface) o2;

        //（2）开始比较
        if(s1.getAge()>s2.getAge())
        {
            return 1;
        }else if(s1.getAge()<s2.getAge())
        {
            return -1;
        }
        return 0;

    }
}


class Student_Interface
{
    private String name;
    private int age;
    private int score;

    public Student_Interface(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student_Interface() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student_Interface{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
