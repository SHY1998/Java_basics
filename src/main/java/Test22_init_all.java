/**
 *顺序
 * 1、类的初始化
 * 2、实例初始化
 */
public class Test22_init_all {
    public static void main(String[] args) {
        Init_All_Demo i = new Init_All_Demo();
    }
}

class Init_All_Demo
{
    //非静态
    {
        System.out.println("（1）Demo的非静态代码块1");
    }


    static {
        System.out.println("（2）demo的静态代码块1");
    }


    private static String info = assign();

    private String message = getMessage();

    static {
        System.out.println("（3）demo的静态代码块2");
    }

    {
        System.out.println("（4）Demo的非静态代码块2");
    }

    public Init_All_Demo()
    {
        System.out.println("（5）无参构造");
    }


    public static String assign()
    {
        System.out.println("（6）assign()方法");
        return "hello";
    }

    public String getMessage() {
        System.out.println("（7）Message()方法");
        return "hello";
    }
}
