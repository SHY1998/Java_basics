/**
 * java.lang.Object类型的方法
 * （1）public String toString()
 *      用于返回对象的信息，类似于我们原来的getInfo，建议所有子类重写
 *      如果没有重写，返回一个由其中的对象是一个实例，该符号字符`的类的名称的字符串@ ”和对象的哈希码的无符号的十六进制表示。
 *
 * 如果你只打印一个对象，或者用对象与字符串进行拼接，默认情况下会自动调用这个对象的toString（）；
 */
public class Test29_Object_01 {
    public static void main(String[] args) {
        Employee_Object emp = new Employee_Object("shy",24,233);
        System.out.println(emp.toString());
        //Employee_Object@4554617c
        System.out.println(emp.hashCode());//1163157884

        System.out.println(emp);
        //如果你只打印一个对象，或者用对象与字符串进行拼接，默认情况下会自动调用这个对象的toString（）；
        //Employee_Object@4554617c
    }

}
class Employee_Object
{
    private String name;
    private int age;
    private double salary;

    public Employee_Object(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee_Object() {
    }

    @Override
    public String toString() {
        return "Employee_Object{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}