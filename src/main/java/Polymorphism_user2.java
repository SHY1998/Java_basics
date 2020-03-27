/**
 * 多态参数
 *      形参那是父类的类型，实参是子类的对象
 */
public class Polymorphism_user2 {
    public static void main(String[] args) {
        //匿名对象
        check(new Dog());//隐含了，形参Animal a = 实参 new Dog()
        check(new Cat());//隐含了，形参Animal a = 实参 new Cat()
    }
    public static  void check(Animal a)
    {
        a.eat();
    }
}
class Animal
{
    public void eat()
    {
        System.out.println("吃东西");
    }
}

class Dog extends Animal
{
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}

class Cat extends Animal
{
    @Override
    public void eat() {
        System.out.println("吃猫粮");
    }
}


