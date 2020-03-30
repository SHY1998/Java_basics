/**
 * 1、接口
 * 行为标准
 *
 * Java中
 *  为了限定某些类（这些类之间可能没有继承关系，甚至都不是一个派系里面的），但是这些类都有相同的行为特征
 *  例如：
 *  Bird类
 *  Plan类
 *  Kite类
 *  这些类不是同一个父类派生出来的，但是又希望它们有相同的行为特征，这个时候就可以设计接口
 *  这个时候通过这个接口就可以同时管理这些类
 *
 *
 *  例如JDBC
 *  Java中，设计了很多接口，Connection（连接数据库），Statement（执行sql语句），ResultSet（返回结果）
 *
 *  2、如何去声明接口
 *  ①接口的语法格式：
 *      【权限修饰符】 interface 接口名{
 *          接口成员列表
 *      }
 *  ②接口的成员
 *  JDK1.8之前，只能有两种成员
 *  （1）全局的静态常量 public static final（而且这三个单词可以省略）
 *  为什么只能是常量？
 *  因为标准中，只能写定死的
 *  （2）公共抽象的方法 public abstract 而且这两个单词可以省略
 *  为什么只能是抽象方法
 *  标准中规定有什么行为标准，行为特征，至于你怎么实现，那么你自己说了算
 *  3、使用者如何去使用接口
 *  【修饰符】 class 实现类 implements 接口们{}
 *
 *  4、接口的特点
 *  ①、接口是标准，就是用来被遵守的，即就是用来被实现的，那么要求实现类在实现接口时。必须实现/重写所有的抽象方法。
 *  否则这个实现类就得是一个抽象类
 *  ②接口不能直接创建对象
 *  ③接口类型的变量与实现类的对象构成多态引用
 *  ④一个类继承父类时，Java只支持单继承，但是一个类在实现借口是，可以同时实现多个接口
 *  ⑤一个类如果同时继承父类，又实现接口，要求继承在前，实现在后
 *  ⑥在Java中，接口还可以继承接口
 *
 */
public class Test30_Interface  {
    public static void main(String[] args) {
//        Flyable f = new Flyable();//接口是不能直接创建对象的
        Flyable[] sky = new Flyable[3];
        //数组元素类型是Flyable类型，是接口类型
        sky[0] = new Bird();//多态引用
        sky[1] = new Plane();
        sky[2] = new Kite();

        for (int i = 0; i <sky.length ; i++) {
            sky[i].fly();
        }
    }

}
//声明一个Flyable接口
interface Flyable
{
    public static final long MAX_SPEED = 700000;

//    public abstract void fly();
    void fly();
}

//声明了一个Jumpable接口
interface Jumpable
{
    void jump();
}

class Animal_Interface
{

}

//让小鸟继承Animal_Interface，并实现Flyable,Jumpable接口
class Bird extends  Animal_Interface implements Flyable,Jumpable
{
    //重写接口的抽象方法，实现接口的抽象方法
    @Override
    public void fly() {
        System.out.println("小鸟飞");
    }

    @Override
    public void jump() {
        System.out.println("单脚跳");
    }
}

class Plane implements  Flyable
{

    @Override
    public void fly() {
        System.out.println("飞机飞");
    }
}
class Kite implements Flyable
{

    @Override
    public void fly() {
        System.out.println("风筝飞");
    }
}

interface A_interface
{
    void a();
}

interface B_interface
{
    void b();
}
interface C_interface extends A_interface,B_interface
{
    void c();
}
class Impl implements C_interface
{

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}