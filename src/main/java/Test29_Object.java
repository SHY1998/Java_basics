/**
 * Java中规定
 *如果一个类没有显示声明他的父类，那么默认这个类的父类就是java.lang.Object
 *
 * 类Object是类层次机构的根类，每个类都是用Object作为超类，所有对象都实现这个类的方法
 *
 * 如何理解跟不累？
 * （1）所有对象（包括数组）都实现这个类的方法。
 *      换句话说Object类中声明的方法，所有引用数据类型（包括数组）中都有
 * （2）所有类的对象的实例化过程，都会调用Object的实例初始化方法
 * （3）所有的对象都可以赋值给OBject的变量
 *  或者说Object类型的变量、形参、数组可以接受任意类型的对象
 */
public class Test29_Object {
    public Test29_Object() {
        super();//调用Object的无仓否早，或者说是无参的实例初始化方法<init>（）
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        Object obj = new Test29_Object();

        test("hello");//多态参数

        Object[] all = new Object[5];//多态数组
        all[0] = new Test29_Object();//多态引用

        Object[] arr1 = new Test29_Object[5];//可以
        //Object[] arr2 = new int[5];//不可以，int是基本数据类型

    }
    public static void test(Object obj)
    {

    }

}
