/**
 * 一、匿名内部类
 * 语法格式
 *  new 父类名 （【实参列表】）
 *  {
 *      类的成员
 *  }
 *  或
 *  new 父接口名（）
 *  {
 *      类的成员
 *  }
 *
 *特殊：声明匿名内部类与创建他的对象是一起完成的，匿名内部类只有唯一的对象
 */
public class Test32_AnonymousInner {
    public static void main(String[] args) {
        //1、需求1，要声明一个Object的子类，匿名子类，并在子类中声明一个方法public void test(){}打印“hello“
        //下面这段代码，声明了匿名内部类，也创建了他的对象
        //但是没有说这个对象干什么，编译不通过

        //（1）我们可以把这个对象，赋值给一个变量
        //多态引用，因为是object子类的对象
        Object objk = new Object()
        {
            public void test()
            {
                System.out.println("hello");
            }
        };


        //（2）我们可以用这个对象，直接调用方法
        new Object()
        {
            public void test()
            {
                System.out.println("hello");
            }
        }.test();
    }
}
