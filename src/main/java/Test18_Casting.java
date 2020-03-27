/**
 * 数据类型的转换：
 *    1、基本数据类型的转换
 *      （1）自动类型转换
 *          byte-->short-->int-->long-->float-->double
 *                 char-->
 *      （2）强制类型转换
 *          double-->float-->long-->int-->short-->byte
 *                                     -->char
 *    2、引用数据类型
 *      父子泪之间的转换：编译期间
 *          （1）向上转型：从子类-->父类
 *                  把子类的对象赋值给父类的变量时
 *          （2）向下转型：从父类-->子类
 *                  把父类的变量赋值给子类的变量时
 *
 *    为什么要向上转型？
 *      因为多态数组、多态参数的应用场景，使得有的时候，不得不向上转型，这是为了方便统一管理各种子类的对象
 *    为什么要向下转型？
 *      为了调用子类特有的方法等
 *   是不是随意的父类的变量，向下转型都会成功呢？
 *      不是，
 *      要想转型成功，必须之前是向上转型的，才能向下转型成功
 *      或者说，必须保证该变量中保存的对象的运行是类型是<=强转的类型
 *      例如
 *          Person p = new Woman();
 *          WOman m = (Woman) p;  p变量中实际存储的对象就是Woman的类型，和强转的Woman类型一样
 */
public class Test18_Casting {
    public static void main(String[] args) {
        //（1）向上转型
        Person2 p = new Woman2();//多态引用
        //一旦吧Woman对象向上转型为Person类型后，就只能调用父类有的方法
        p.eat();
        p.walk();

        //（2）向下转型
        //想要在这里调用Woman特有的方法时
        //编译时，P是Person类型，那么编译不通过
        //因为在Java中，认为父类的概念范围>子类的概念范围
//        Woman2 m = p;//编译报错
          Woman2 m = (Woman2) p;
          m.shop();

          Person2 p2 = new Person2();
          Woman2 w2 = (Woman2) p2;//ClassCastException类型转换异常
          w2.shop();
    }

}
class Person2
{
    String info = "父类";
    public void eat()
    {
        System.out.println("吃饭");
    }
    public  void walk()
    {
        System.out.println("行走");
    }
}

class Woman2 extends Person2
{
    String info = "女人";
    public void eat()
    {
        System.out.println("细嚼慢咽");
    }
    public  void walk()
    {
        System.out.println("慢走");
    }
    public void shop()
    {
        System.out.println("买买买");
    }
}
class Man2 extends Person2
{
    public void eat()
    {
        System.out.println("狼吞虎咽");
    }
    public  void walk()
    {
        System.out.println("快走");
    }
    public void smoke()
    {
        System.out.println("抽抽抽");
    }
}
