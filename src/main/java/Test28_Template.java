/**
 * 设计模式？
 *  Java中常用的设计模式有23种
 *  JavaSE
 *  （1）模板设计模式
 *  （2）单例设计模式（*******）
 *  （3）工厂设计模式
 *  （4）代理设计模式（***）
 *  （5）迭代器设计模式
 *  （6）装饰者设计模式
 *
 *
 *  （1）模板设计模式
 *      当拟解决问题是，总体的算法的结构/步骤是确定的，但是其中的一步或几部的代码的具体实现是不确定的
 *      得使用者自行决定
 *   举例：
 *      编写一个类，包含一个方法，可以统计 执行任意代码的运行时间
 *  步骤
 *  （1）获取开始系统时间
 *  （2）执行×
 *  （3）获取结束时系统时间
 *  （4）计算时间差
 */
public class Test28_Template {
    public static void main(String[] args) {
    MyCalTime my = new MyCalTime();
    long time = my.getTime();
        System.out.println("耗时"+time);
    }
}
//模板类
 abstract class CalTime
{   //可以计算任意一段代码的运行时间
    //final的目的是不希望子类重写，改写我的算法结构
    public final long getTime()
    {
        //（1）获取开始系统时间
        long start = System.currentTimeMillis();

        //（2）执行×
        doWork();

        //（3）获取结束时系统时间
        long end = System.currentTimeMillis();

        //（4）计算时间差
        return end-start;
    }
    //protected的目的，希望只是子类中进行访问和重写
    protected abstract void doWork();
}
class MyCalTime extends CalTime
{
    @Override
    public void doWork() {
        long sum =0;
        for (int i = 0; i <100000 ; i++) {
            sum +=i;
        }
        System.out.println("sum="+sum);
    }

}