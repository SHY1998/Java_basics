/**
 * 继承关系的类初始化方法
 *
 *一个类初始化时，那么检查它的父类是否初始化。如果父类没有初始化，那么会先初始化父类
 * 因为一个类只要初始化一次
 *
 *
 * （1）父类初始化<clint>
 *     ①静态变量的显示赋值
 *     ②静态代码块
 *
 *
 * 特殊：静态方法是不能被重写的
 */
public class Test21_Static_03 {
    public static void main(String[] args) {

        //如果父类已经初始化
//        Father_static father_static = new Father_static();
//        System.out.println("=================");

        //全部代码都在
//        Son_static  son_static = new Son_static();

        //验证静态方法是否能被重写
        Father_static f = new Son_static();
        f.assign();//静态办法在编译期间就确定了，不需要在运行时绑定



    }
}

class Father_static
{
    private static String info = assign();
    static
    {
        System.out.println("（1）父类的静态代码块");
    }
    public static String assign()
    {
        System.out.println("（2）assign()方法");
        return "hello";
    }
}

class Son_static extends Father_static
{
    private static String info = assign();
    static
    {
        System.out.println("（3）子类的静态代码块");
    }
    public static String assign()
    {
        System.out.println("（4）assign()方法");
        return "hello";
    }
}
