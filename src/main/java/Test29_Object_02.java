/**
 * public final 类<?> getClass()
 * 返回此Object的运行时类。
 */
public class Test29_Object_02 {
    public static void main(String[] args) {
        Father_Object_02 f =new son_Object_02();
        //此时f就有两个类型，编译时类型Father，运行时类型Son
        Class c =f.getClass();
        System.out.println(c);//打印运行时类


        Object obj = 12;
        System.out.println(obj.getClass());
    }
}
class Father_Object_02
{

}
class son_Object_02 extends Father_Object_02
{

}
