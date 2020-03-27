/**
 * this:
 *  1、意思：当前对象
 *      （1）构造器
 *          正在被创建的对象
 *      （2）方法
 *          正在调用该方法的对象
 *  2、用法
 *      （1）this.属性
 *             当局部变量与成员变量同名时，可以在成员变量的前面加this
 *      （2）this.方法
 *              没有非用不可的时候
 *      （3）this()或者this（实参列表）
 *          this()表示调用类的无参构造
 *          this(实参列表)表示调用类的有参构造
 *                 必须在构造器的首行
 *
 */
public class TestThis {
    public static void main(String[] args) {
        CircleThis c1 =new CircleThis(1.2);
    }
}

class CircleThis{
    private double radius;

    public CircleThis(){
        System.out.println("一个原对象被创建");
    }
    //double radius局部变量
    public CircleThis(double radius)
    {
        this();
       this.radius = radius;
       //this.radius代表成员变量，radius代表形参
    }
}

class Student
{
    private String name;
    private int age;
}

