/**
 * native
 * 1、意思，原生的，本地的
 * 2、可以修饰什么
 *      可以修饰方法
 * 3、他修饰的方法有什么不同
 *
 *
 * 语法格式
 * 【修饰符】 class 类
 * {
 *     【其他修饰符】 native 返回值类型 方法名（【形参列表】）；
 * }
 *
 * native修饰的方法，看不见方法体
 *      native修饰的方法，不是用Java语言实现的，而是调用了底层c/c++的代码，这些代码被
 *      编译为.dll文件，让Java来执行
 *
 * 4、特殊
 * (1)native方法，对于Java程序员来说，该怎么调用还怎么调用
 * (2)子类还可以选择让他进行重写
 */
public class Test20_Native {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.hashCode());
    }
}

class MyClassThis extends Object{

    @Override
    public int hashCode() {
        return 1;
    }
}
