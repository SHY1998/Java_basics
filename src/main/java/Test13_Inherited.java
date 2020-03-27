/**
 * 继承：
 *  （1）延续
 *  （2）扩展
 *
 *  1、为什么要有继承
 *  （1）当某个类，需要派生出很多出类别
 * Person：
 *      需要派生出Teacher、Student等等子类别
 *      那么此时Person中的共有的部分，就不需要在子类别中再去声明
 *  （2）当多个类，出现了共同的特征是，可以把共同的部分抽取到父类中
 *
 *      目的：
 *          代码的复用和扩展
 *  2、如何实现继承
 *      【修饰符】 class 子类 extends 父类{
 *
 *      }
 *   子类：subclass 也称为派生类
 *   父类：superclass 也称为超类，基类
 *  3、继承的特点
 *  （1）子类继承了父类：
 *      从事务的特征来说，子类会继承父类的所有特征。
 *      但是从代码操作角度莱索，父类中私有的属性、方法在子类中是不能直接使用的
 *  （2）子类继承父类时，构造器是不能被继承的
 *  （3）子类继承父类是，在子类的构造器中一定要去调用父类的构造器
 *      默认情况下，调用的是父类的无参构造
 *      如果父类没有无参构造，那么在子类的构造器的首行，必须手动调用父类的有参构造
 *  （4）Java只支持单继承，即一个Java类只能有一个直接父类
 *      但是可间接继承（多层继承）
 *  （5）一个Java类可以同时有很多子类
 */
public class Test13_Inherited {
    public static void main(String[] args) {
        Teacher t = new Teacher(1,1);
        t.setName("老师");
        t.setAge(18);
    }
}
class Person
{
    private String name;
    private int age;

    public Person(int age)
    {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



class Teacher extends Person
{
    private double salary;

    public Teacher(int age, double salary) {
        super(age);//调用父类的有参构造
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Student13 extends Person
{
    private int grade;

    public Student13(int age) {
        super(age);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
