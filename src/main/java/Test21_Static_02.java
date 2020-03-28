/**
 * （3）代码块
 *
 * 非静态代码块:
 * 【修饰符】 class 类
 * {
 *     非静态代码块
 * }
 *
 *
 * 静态代码块
 * 【修饰符】 class 类
 *      static{
 *       非静态代码块
 *  }
 *  特点
 *  (1)每一个类的静态代码块只会执行一次
 *  (2)静态代码块在第一次使用这个类时执行,在类初始化时执行。
 *
 *
 *
 *  类初始化即执行类初始化方法：<clinit>()
 *      一个类只有一个，他也是由编译器编译生成的，由两部分组成
 *          ①静态变量的显示赋值
 *          ②静态代码块的代码
 *
 *
 *  回忆：实例初始化方法<init>或<init>(形参列表)
 *  一个类可能有好几个实例初始化方法，有几个构造器就有几个实例初始化方法，他们由编译器根据
 *      ①成员变量的显示赋值代码
 *      ②非静态代码块
 *      ③构造器的代码
 *
 *
 */
public class Test21_Static_02 {
    static{
        System.out.println("Test21_Static_02静态代码块");
    }
    public static void main(String[] args) {
//        Static_02_MyClass.test_Static_02();
//        Static_02_MyClass.test_Static_02();
//        Static_02_MyClass.test_Static_02();


//        Static_02_MyClass my1 = new Static_02_MyClass();
//        Static_02_MyClass my2 = new Static_02_MyClass();
//        Static_02_MyClass my3 = new Static_02_MyClass();



        Static_Demo d =new Static_Demo();//穿件一个类的对象时，会导致类的初始化


    }

}

class Static_02_MyClass
{
    static{
        System.out.println("Static_02_MyClass静态代码块");
    }

    public static void test_Static_02() {
        System.out.println("静态方法");
    }
}

class Static_Demo
{
    static {
        System.out.println("demo的静态代码块1");
    }
    private static String info = assign();
    static {
        System.out.println("demo的静态代码块2");
    }
    public static String assign()
    {
        System.out.println("assign()方法");
        return "hello";
    }

}

