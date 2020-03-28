/**
 * final,修饰符的一种
 * 1、意思，最终的
 * 2、final可以修饰：类（外部类，内部类）、变量（成员变量（类变量、实例变量））、方法（静态方法、非静态方法）
 * 3、修饰后有什么不同
 *      （1）修饰类：表示这个类不能被继承，我们可以称它为“太监类”
 *              例如：String、System、Math
 *      （2）修饰方法，表示这个方法不能被重写
 *                  可以被继承
 *      （3）修饰变量，表示这个变量的值不能被修改，即我们成为的"常量"
 *          常量有两种：
 *              一种是字面常量，例如："hello"、"a"、12
 *              一种是final声明的变量
 *       这里要说明一下，常量的命名应该是所有单词都大写，每个单词之间是有_
 *
 */
public class Test19_Final {
    public static void main(String[] args) {
        Son s = new Son();
        s.method();

        final int a = 10;
    }
    public static void change(final Range c)
    {
        //c = new Range();//错误的，因为c是常量
        c.length *= 2;//因为length的前面没有final，可以修改
    }
}
class Range
{
    double length;
}

//final class TaiJian
//{
//
//}
//
//class Sub extends TaiJian
//{
//
//}
class Father
{
    public void test()
    {
    }
    public final void method(){
        System.out.println("父类");
    }

}

class Son extends Father
{
    @Override
    public void test() {
        super.test();
    }

}

