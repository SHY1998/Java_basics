/**
 * 多态应用
 *
 * （1）多态数组
 *      数组的元素是父类的类型，实际存储的是子类的对象
 *      用这样的数组，就可以统一管理，所有子类的对象
 */
public class Polymorphism_user {
    public static void main(String[] args) {
        /**
         * 创建一个数组，可以存储各种图形的对象，包括圆对象、矩形对象、三角对象
         *
         */

        //本态数组
//        Circle_user[] yuan = new Circle_user[3];
//        Rectangle[] jus = new Rectangle[3];

        Graphic_user[] all = new Graphic_user[3];
        //左边的元素all[0]是Graphic_user乐行
        all[0] = new Circle_user(1.2);

        Graphic_user g2 = new Rectangle(2,4);
        all[1] = g2;

        all[2] = new Circle_user(4.2);


        //遍历素有图形的编辑
        for (int i = 0;i<all.length;i++)
        {
            //执行哪个getArea()方法，要看all[i]中存储的是哪个子类的对象
            System.out.println("面积"+all[i].getArea());
        }
    }
}

class Graphic_user
{
    public double getArea()
    {
        return 0.0;
    }
}

class Circle_user extends Graphic_user
{
    private double radius;

    public Circle_user(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return 3.14*radius*radius;
    }
}

class Rectangle extends Graphic_user
{
    private  double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}