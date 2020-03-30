import java.util.Objects;

/**
 * public int hashCode()返回对象的哈希吗值，支持此方法是为了提高哈希表的性能
 *
 *      如果两个对象的哈希吗不同，就可以认为这两个对象一定不“相等”
 *     但是，如果两个对象的哈希吗值相同，我们不能认为这两个对象一定“相等”
 *
 *
 *
 *
 * public boolean equals(Object obj)指示一些其他对象是否等于此。
 *  换句话说，如果最终要确定两个对象是否“相等”要根据equals方法
 *  （性能低，所以不会刚开始用）
 *  默认情况下，Object类中实现的equals方法，即如果我们自己写的类，没有重写equals方法的话，那么他的比较是等价于“==”,比较的是对象的地址值
 *  我们可以选择进行重写。
 *  （1）无论何时重写该方法，通常需要重写hashCode方法
 *      为什么？
 *      因为：
 *          Java中对应
 *          ①如果两个对象调用equals方法返回true，那么这两个对象的hashCode值必须相同
 *          ②如果两个对象hashCode值不同，那么调用equals方法返回必须是false
 *          ③如果两个对象的hashCode值相同，那么调用equals方法可能是true也可能是false
 *  （2）重写equals方法是，要遵循几个原则
 *     ①自反性;x.equals(x)一定是true
 *     ②对称性 x.equals(y)和y.equals(x)结果一样
 *     ③传递性、
 *     ④一致性：只要不改变，无论何时调用，结果都应该一样
 *     ⑤任何非空引用值x，x.equals(null)都应该返回false
 */
public class Test29_Object_04 {
    public static void main(String[] args) {
        String s1 = "Aa";
        String s2 = "BB";
        System.out.println(s1.hashCode());//2112
        System.out.println(s2.hashCode());//2112
        Circle_Object_04 c1 = new Circle_Object_04();
        c1.radius = 1;
        Circle_Object_04 c2 =new Circle_Object_04();
        c2.radius = 1;

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        //回忆
        String str1 =new String("Hello");
        String str2 =new String("Hello");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true,因为String类型重写了equals方法

        System.out.println("----------------");
        String ss1 = "hello";//特殊，因为ss1和ss2指向同一个常量对象，地址值是同一个
        String ss2 = "hello";
        System.out.println(ss1 == ss2);//true
        System.out.println(ss1.equals(ss2));//true

    }
}

class Circle_Object_04
{
    double radius;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle_Object_04 that = (Circle_Object_04) o;
        return Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
