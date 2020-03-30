/**
 * 局部内部类
 * 1、声明的位置：方法体内
 * 2、特点
 * （1）局部内部类的修饰符，只能有abstract或final
 * （2）有作用域
 * （3）如果局部内部类在静态方法中，不能使用外部类的非静态成员
 * （4）在局部内部类中，可以使用当前局部内部类所在方法的局部变量
 * 但是要求，这个局部变量必须是final的常量
 * 在Java8是，如果某个局部变量被局部内部类使用了，会默认使用final，一旦变为常量，他的值就不能修改了
 * 为什么？
 *
 */
public class Test34_localInner {
}
class Outer_Local{
    private int i = 1;
    private static int j = 2;
    public void test(){
        int a =10;
        //局部内部类
        class Inner{
            public void method()
            {
                System.out.println(i);
                System.out.println(j);
            }
        }
    }
    public void method()
    {
       // Outer_Local.Inner  in = new Outer_Local.Inner();
    }
//    public static void fun{
//        class Inner{
//            public void method()
//            {
//                System.out.println(i);
//                System.out.println(j);
//            }
//        }
//    }
}