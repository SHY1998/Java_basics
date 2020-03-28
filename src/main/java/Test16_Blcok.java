/**
 * 1、非静态代码块
 * （1）声明的格式：
 *      【修饰符】  class 类名
 *      {
 *          非静态代码块
 *      }
 *
 * （2）非静态代码块中的代码什么时候执行
 *          ①在每次创建对象的时候执行
 *          ②比构造器早
 * （3）实例初始化的过程：创建对象时，为对象进行初始化的操作
 *      ①为成员变量显示赋值
 *      ②执行非静态代码块
 *      ③执行构造器
 *
 *
 *  Java编译器其实，会吧这三个部分的代码，合成一个叫做<init>（【形参列表】）实例初始化方法
 *  即编译后的.class字节码信息中，是没有构造器这个概念
 *
 * <init>（【形参列表】）实例初始化方法的代码就是有三个部分组成。
 *      ①为成员变量显示赋值
 *      ②执行非静态代码块
 *      ③执行构造器
 *
 * 其中①②按顺序执行，而③一定是他们当中最后执行
 *
 *  而且，有几个构造器，就会有几个实例初始化方法，那么当你创建对象的时候，调用对应的构造器是，其实执行的是对应的实例初始化方法<init>（【形参列表】）
 *
 *
 */
public class Test16_Blcok {
    public static void main(String[] args) {
//        MyClass my = new MyClass();
//
//        MyClass my2 = new MyClass("shy");
        Demo d1 =new Demo();//调用无参构造，本质上是调用<init>（）实例初始化方法



    }
}

class MyClass
{
    private String str;
    public MyClass()
    {
        System.out.println("无参构造");
    }

    public MyClass(String str) {
        this.str = str;
        System.out.println("有参构造");
    }

    {
        System.out.println("非静态代码块");
    }
}

class Demo
{

    {
        System.out.println("非静态代码块1");
    }
    private String str = assign();
    public Demo()
    {
        System.out.println("无参构造");
    }


    public Demo(String str) {
        this.str = str;
        System.out.println("有参构造");
    }
    {
        System.out.println("非静态代码块2");
    }

    public String assign()
    {
        System.out.println("assign");
        return "hello";
    }
}
