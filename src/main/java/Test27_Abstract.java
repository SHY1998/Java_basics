/**
 * 面试题：
 * 1、面向对象的基本特征：封装、继承、多态
 * 2、面向对象的特征：封装、继承、多态、抽象
 *
 * 抽象：abstract
 *  1、什么情况下会用到抽象
 *      当我们在声明一个类时，某个或某些方法的实现不清楚，或者无法给出具体的实现，
 *      要等到具体的子类中才能给出具体的实现，这样的方法就能声明为抽象
 *
 *   抽象方法没用方法体
 *
 *
 *   例如：一个图形类Graphic_Abstract
 *              不论什么图形，都会有两个特征（1）面积（2）周长
 *  2、抽象方法
 *  语法格式：
 *          【其他修饰符】 abstract 返回值类型 方法名【形参列表】
 *  3、抽象类
 *      如果一个类中包含了抽象方法，那么这个类必须是一个抽象类
 *  语法格式：
 *          【其他修饰符】 abstract class 抽象类名{}；
 * 4、抽象类的特征
 *  （1）抽象类不能直接实例化，不能直接创建对象或者说，不能创建抽象类的对象
 *  （2）如果子类继承了抽象类，就必须重写父类的所有抽象方法，否则子类也必须是一个抽象类
 *  （3）抽象类也有构造器，这个构造器不是为了创建抽象类自己的对象用的，而是为子类创建对象服务的
 *  （4）抽象父类与子类的对象之间可以构成多态引用
 *  （5）抽象类中也可能没有抽象方法
 *      存在的意义
 *          ①为了多态的引用，父类可以管理各类子类对象
 *          ②不希望创建父类的对象，而是创建子类的对象
 *
 *
 *
 * 5、修饰限制
 *  （1）可以修饰什么
 *      ①类
 *      ②方法
 *  （2）修饰类以后，和那些修饰符不能一起使用
 *  类：public 和 缺省的
 *  abstract 和 final 不能一起使用
 *  （3）修饰方法方法以后
 *  方法：四种权限修饰符
 *      final static abstract native
 *    ①final abstract不行     final不能被继承
 *    ②static，abstract不行    static不能被重写
 *    ③native abstract 不行   因为都没有方法体，不知道什么情况，会有歧义
 *    ④private，abstract不行 私有方法不能被重写
 */
public class Test27_Abstract {
    public static void main(String[] args) {
        //Graphic_Abstract g1 = new  Graphic_Abstract();//不能创建抽象类的对象

        Graphic_Abstract g1 = new Circile_Abstract(1.2);//多态引用
        System.out.println("面积"+g1.getArea());
    }

}
abstract class Graphic_Abstract
{
    private String name;

    public Graphic_Abstract(String name) {
        this.name = name;
    }
    public Graphic_Abstract()
    {
        super();
    }
    //不得不声明
//    public double getArea()
//    {
//        return 0.0;
//    }
    public abstract double getArea();
}
class Circile_Abstract extends Graphic_Abstract
{
    public Circile_Abstract(double radius) {
        this.radius = radius;
    }

    public Circile_Abstract()
    {
        super();
    }

    private double radius;

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
