/**
 *变量的分类：
 *  1、成员变量
 *      （1）类变量：静态的成员变量
 *      （2）实例变量：非静态的成员变量
 *  2、局部变量
 *
 *
 *  区别：
 *  1、声明的位置
 *      （1）成员变量：类中方法外
 *      （2）局部变量：
 *          ①方法（）中形参列表
 *          ②方法体{}中局部变量
 *          ③代码块中的局部变量
 *  2、在内存中存储的位置
 *      （1）成员变量
 *      类变量：方法区
 *      实例变量：堆
 *      （2）局部变量
 *      栈：
 *          虚拟机栈：非native
 *          本地方法栈：native
 *  3、修饰符
 *      （1）成员变量
 *          四种权限修饰符
 *          static、final
 *      （2）局部变量
 *          final
 *  4、生命周期
 *      （1）成员变量
 *          类变量：随着类的加载而分配空间
 *                 随着类的卸载而消亡
 *                 每一个对象共享的
 *          实例变量
 *          每一个对象是独立的
 *          随着对象的创建而分配空间，随着对象被垃圾回收而回收
 *      （2）局部变量
 *          方法调用是，在栈中分配空间，方法调用结束就消亡
 *  5、作用域
 *      （1）成员变量；
 *      类变量：
 *          在本类中随便使用
 *          在其他类中，用“类名。”或“对象。”
 *      实例变量：
 *          在本类中出了staitc代码块和static方法，其他随便用
 *     （2）局部变量
 *          有作用域，超过作用域就不能用了
 *
 */
public class Test26_Variable {
    int a;//成员变量
    static int b;
    {
        int a ;//局部变量
    }
    public String th()
    {
        final int a;
        return "1";
    }
}