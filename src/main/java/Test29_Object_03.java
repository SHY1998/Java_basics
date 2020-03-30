/**
 *
 * protected void finalize()
 *当垃圾收集确定不再有对该对象的引用时，垃圾收集器在对象上调用该对象,即不是程序员手动调用
 *
 *
 * 什么情况下调用？
 * ①当某个对象确定要被回收了
 * ②程序员是无法确定具体哪个时间点会调用
 * ③他是由GC调用
 * ④每个对象，finalize()只会被调用一次
 *      如果某个对象在被GC回收之前复活了，那么再死的时候，就不会调用
 * 当我们在finalize()方法中又让一个引用指向了当前对象this，那么这个对象就会复活
 * 不会调用是因为会循环
 *
 * 面试题：final finalize() finally的区别
 *
 */
public class Test29_Object_03 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            MyClass_Object_03 my = new MyClass_Object_03();
            //for循环体中的局部变量，每一次循环，都是一个新的局部变量，my指向的对象，在一次循环之后就变为垃圾对象了
        }
        //通知垃圾回收器，尽快来回收，但是不能保证立刻马上过来
        System.gc();
        Thread.sleep(1000);//休眠。暂停1S
    }
}
class MyClass_Object_03
{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我呕了");
    }
}
