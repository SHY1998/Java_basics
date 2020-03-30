/**
 * 什么情况下回用到成员内部类（方法外声明的）
 * 当描述一个事务是，发现他的内部还有一个完整的就够需要用一个类来描述
 * 并且发现这个内部的结构，如果独立存在是没有意义的，必须在这个外部类中才有意义，而且这个内部结构职位这个外部类服务
 *
 *
 *
 *
 * 成员内部类分为两种：
 * 1、静态成员内部类
 * 【修饰符】 class 外部类
 * {
 *     【其他修饰符】 static class 内部类
 *     {
 *     }
 * }
 * 注意，只有成员内部类才能用static修饰，其他外部类、局部内部类等都不可以用
 * 2、非静态成员内部类
 *【修饰符】 class 外部类
 * {
 *     【其他修饰符】  class 内部类
 *     {
 *     }
 * }、
 *
 *
 *
 *
 * 静态内部类
 * 1、特点
 * （1）静态内部类汇总，可以出现原本能够定义的所有成员
 * （2）静态内部类中不能使用外部类的非静态成员
 * （3）在外部类中，使用静态内部类，和使用其他的类一样的原则
 * （4）在外部类的外面使用静态内部类
 * ①如果使用静态内部类的静态成员，直接"类名."
 * ②如果使用静态内部类的非静态方法
 * （5）静态内部类不会顺着外部类的初始化一起初始化，而是要在使用到这个静态内部类时才会初始化
 *
 *
 *
 * 非静态成员内部类
 * 1、特点
 * （1）在非静态内部类中，不能出现任何和static有关的声明
 * （2）在非静态内部类中，可以随意访问外部类的所用成员，包括静态的和非静态的
 * （3）在外部类的静态成员中，不能使用非静态的成员
 * （4）在外部类的外面使用
 * 第一步，先创建外部类的对象
 * 第二部：要么通过外部类的对象，去创建内部类的对象
 *      要么通过外部类的对象，去获取内部类的对象
 *
 */
public class Test33_Inner {
    public static void main(String[] args) {
//        Outer.Inner.test();
//        Outer.Inner in =new Outer.Inner();
//        in.method();
//        Outer out = new Outer();

        //我们要在这里使用非静态内部类，因为一次是Inner是Outer的费静态成员，所以需要用得到Outer的对象
        Outer out = new Outer();
//        Outer.Inner in = out.new Inner();
        Outer.Inner in =out.getInner();
    }
}

//非静态内部类
class Outer
{
    private int i = 1 ;
    private static int j = 2;
    class Inner
    {
        public void method()
        {
            System.out.println("非静态内部类的非静态方法");
            System.out.println(i);
            System.out.println(j);
        }

    }

    public static void outTest()
    {
        //Inner in =new Inner();//静态的方法不能访问非静态的成员
    }
    public void outMethod()
    {
        Inner in =new Inner();
        in.method();
    }
    public Inner getInner()
    {
        return new Inner();
    }
}























//静态内部类
//class Outer
//{
//    static {
//        System.out.println("外部类的静态代码块");
//    }
//    //静态内部类
//    static class Inner{
//        static {
//            System.out.println("静态内部类的代码块");
//        }
//        public void method()
//        {
//            System.out.println("静态内部类的非静态方法");
//        }
//
//        public static void test()
//        {
//            System.out.println("静态内部类的静态方法");
//        }
//
//    }
//}
