/**
 * static
 * 1、意思，静态的
 * 2、他可以修饰什么？
 * （1）方法
 * （2）成员变量
 * （3）内部类
 * （4）代码块
 * 3、修饰后有什么不同？
 *  （1）方法：我们成为"静态方法"或者"类方法"
 *      ①这个方法，可以用"类名.方法"进行调用（推荐），当然也可以使用"对象名.方法"进行调用
 *      ②静态方法中，是不允许出现：this,super，对本类的非静态属性、方法的使用代码的
 *  （2）成员变量
 *      ①用static修饰的成员变量的值，表示是这个类型的所有对象"共享的"
 *      ②static修饰的成员变量的值，存储在内存的方法区
 *      ③static修饰的成员变量的get/set方法也是静态的
 *      ④如果在方法中有局部变量与static修饰的成员变量同名时在静态变量前面加"类名."来区别
 */
public class Test21_Static {
    private int num;//非静态的

    private static  int a;//可以修饰成员变量

    public int getNum()
    {
        return num;
    }
    public static void main(String[] args) {
        StaticThis tools = new StaticThis();
        tools.printStatic(5,10,"#");//不推荐使用"对象名."调用，因为会让人误会不同的对象，调用结果可能会不同

        StaticThis.printStatic(3,5,"&");

        //  System.out.println(num);
        //  System.out.println(getNum());

        //static int a = 10; //不能修饰局部变量

        Accunt a1 = new Accunt();
        Accunt a2 = new Accunt();

        System.out.println("a1.rate = "+ a1.rate);
        System.out.println("a2.rate = "+ a2.rate);

        a1.rate = 0.045;

        System.out.println("a1.rate = "+ a1.rate);
        System.out.println("a2.rate = "+ a2.rate);

    }
}
class StaticThis
{
    public static void printStatic(int line,int column,String sigh)
    {
        for(int i = 0;i<line;i++)
        {
            for (int j = 0;j<column;j++)
            {
                System.out.print(sigh);
            }
            System.out.println();
        }
    }
}

class Accunt
{
    static double rate = 0.035;//Account所有对象共享
    double banlance = 10000;//Accunt的每一个对象独立

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Accunt.rate = rate;
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }
}