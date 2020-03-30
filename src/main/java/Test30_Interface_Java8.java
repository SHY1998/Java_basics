/**
 * java8之后，接口又增加了两种新成员
 * (3)静态方法：public static 不可以省略
 * 为什么
 * 因为JDK法阵了一段时间后，类库中多了很多这样的成组的API
 * ①Paht接口和Paths工具类
 * ②Collection接口和Collection工具类
 *
 * 一般工具类汇总都是静态方法，这些静态方法，基本都是为了前面这个对应接口服务的
 * 这样的话，就会出现很多API，使得学习成本增加
 *
 * 开始吧这样的静态方法，直接挪到接口中定义就好了，减少了这样工具类的出现
 *
 * (4)默认方法：public default 不可以省略
 *
 * 因为有的时候，一个接口他的大多数实现类对接口的抽象方法的实现代码式样的，那么我们写好几次就太麻烦了
 * 相当于，默认方法是原来的抽象方法有了一个默认实现，如果实现类的实现和接口一样。就不需要重写，如果不一样就重写。
 *
 * （5）冲突问题
 * ①当一个类同时实现了两个甚至更多接口是，这些个接口中出现了方法签名相同的默认方法是
 * 那么我们必须在这些实现类中，做出选择
 * 选择一，保留齐总一个，放弃另一个
 * 选择二，两者都不用，完全重写一个
 * ②当一个了同时继承了父类，又实现了接口，那么当父类中出现了和接口方法签名一样的方法时，怎么办？
 * 选择一：默认选择，编译器默认选择父类
 * 选择二：改选，保留接口的
 * 选择三：完全自己重写
 *
 *
 *
 */
public class Test30_Interface_Java8 {
    public static void main(String[] args) {
        MyInter.test();
//        MyInter my = new MyInter();
        //接口不能出创建对象


//        MyInter my = new InterImpl1();
//        my.method();


        Son_method s = new Son_method();
        s.test();
    }
}
interface MyInter
{
    public static void test()
    {
        System.out.println("静态方法");
    }

    void fun();
    public default void method()
    {
        System.out.println("默认方法");
    }
}

class InterImpl1 implements MyInter
{

    @Override
    public void fun() {
        System.out.println("aaa");
    }
}
interface A_method
{
    public default void test()
    {
        System.out.println("xxx");
    }
}
interface B_method
{
    public default void test()
    {
        System.out.println("yyy");
    }
}

class C implements A_method,B_method
{
    //选择一，保留其中一个，放弃另一个
    //在类中，重接口的默认方法是，default要删掉
//    public  void test()
//    {
//        A_method.super.test();//保留A接口的实现
//        B_method.super.test();//保留B接口的实现
//    }

    public void test()
    {
        System.out.println("ccc");
    }
}


class Father_method
{
    public void test()
    {
        System.out.println("fff");
    }
}
interface D
{
    public default void test()
    {
        System.out.println("ddd");
    }
}
class Son_method extends Father_method implements D
{
    //选择一，默认选择
    //选择二，改选干爹
    public  void  test()
    {
        D.super.test();
    }
}