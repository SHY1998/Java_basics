/**
 * 方法的重写：Override
 *      当子类继承了父类的方法，但是父类的方法体不适用与子类了，那么子类可以选择进行重写overwrite
 *
 * 重写有要求：
 *      （1）方法名必须和父类被重写的方法名相同
 *      （2）形参列表必须和父类被重写的形参列表相同
 *      （3）返回值类型
 *              基本数据类型和void，要求与父类被重写的方法的返回值类型形同
 *              引用数据类型：要求子类重写的方法的返回值类型<=父类被重写的方法的返回值类型
 *                  例如：子类方法的返回值类型Student，父类方法的返回值类型是Person
 *      （4）修饰符
 *          ①权限修饰符：子类重写的方法的权限修饰符的可见性范围>=父类重写的方法的权限修饰符的可见性范围
 *                      例如：
 *                          子类重写的方法的权限修饰符为public，父类重写的方法的权限修饰符protected
 *          ②其他修饰符
 */
public class Test14_Override {
    public static void main(String[] args) {
        Manager m = new Manager("嚣杂",20000,200);
        System.out.println(m.getInfo());

    }
}

class Employee
{
    //属性列表
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public String getInfo() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Manager extends Employee
{

    private double bonus;


    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        //父类中的name和salary的属性是私有化的，不能在子类中直接使用
        return "Manager{" +
                "bonus=" + bonus +'\''+
                ", salary=" + getSalary()+", name="+getName()+
        '}';
    }
}

