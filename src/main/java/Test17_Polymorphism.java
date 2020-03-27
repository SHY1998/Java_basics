/**
 * 多态
 *
 * 变量的引用形式：
 *  （1）本态引用：左边的变量与右边的对象是同一类型
 *  （2）多态引用：左边的变量是父类类型，右边的对象是子类对象
 *
 * 多态表现出来的特征
 *      编译的时候，按照父类的类型进行编译的
 *      执行的方法：子类重写的方法
 *
 * 编译看左边，执行看右边
 * 前提:1、继承 2、重写 3、多态引用
 * 强调：多态和属性无关，直说方法
 */
public class Test17_Polymorphism {

    public static void main(String[] args) {
        //1、本态引用
//        Person17 p =  new Person17();
//        Woman woman = new Woman();
//        Man man = new Man();

        //2、多态引用
        Person17 p2 = new Woman();
        Person17 p3 = new Man();

        p2.eat();
        p2.walk();
        ((Woman) p2).shop();
        System.out.println(p2.info);//属性没有多态，只看编译时类型
    }
}
class Person17
{
    String info = "父类";
    public void eat()
    {
        System.out.println("吃饭");
    }
    public  void walk()
    {
        System.out.println("行走");
    }
}

class Woman extends Person17
{
    String info = "女人";
    public void eat()
    {
        System.out.println("细嚼慢咽");
    }
    public  void walk()
    {
        System.out.println("慢走");
    }
    public void shop()
    {
        System.out.println("买买买");
    }
}
class Man extends Person17
{
    public void eat()
    {
        System.out.println("狼吞虎咽");
    }
    public  void walk()
    {
        System.out.println("快走");
    }
    public void smoke()
    {
        System.out.println("抽抽抽");
    }
}
