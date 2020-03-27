/**
 * super:
 *      从父类中去查找，引用父类的××
 *
 *
 * 用法：
 *     1、super.属性
 *          当子类声明了和父类同名的属性时，可以使用super.属性来访问父类的属性
 *     2、super.方法
 *          当在子类中需要地阿偶用父类被重写的方法是，可以使用super.方法
 *     3、super()或super(实参列表)
 *          super():调用父类的无参构造
 *          super(实参列表)：调用父类的有参构造
 *
 * 注意：
 *  （1）super()或super(实参列表)必须在子类构造器的首行
 *  （2）如果子类的构造器中，没有写super（），他也存在
 *      但是如果子类构造器中写super(实参列表)，那么super()就不会存在
 *
 */
public class Test15_Super {
    public static void main(String[] args) {

//        B b = new B();
//        b.printNum(3);




    }
}
class A
{
    int num = 1;
}
class B extends A
{
    int num = 2 ;
    public void printNum(int num)
    {
        System.out.println(num);//局部变量(int num)
        System.out.println(this.num);//成员变量，子类自己的int num
        System.out.println(super.num);
    }
}

class Human
{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human()
    {
        super();
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
    public String getInfo()
    {
        return "姓名"+name+"年龄"+age;
    }
}

class XuSheng extends Human
{
    private int score;

    public XuSheng(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public XuSheng(){
        super();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String getInfo()
    {
//        return "姓名"+getName()+"年龄"+getAge()+"成绩"+score;
        return super.getInfo()+"成绩"+score;
    }
}