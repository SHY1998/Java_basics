/**
 * 1、封装性
 * (1)隐藏实现细节
 * (2)安全
 *
 *
 *1、封装的范围
 * （1）属性的封装、方法的封装
 * （2）组件的封装
 * （3）系统的封装
 *
 *
 *3、封装的实现：靠权限修饰符来控制可见的范围
 *
 *权限修饰符：
 * （1）可见范围
 *                          本类            本包            其他包子类           任意位置
 *          private         √               ×               ×                   ×
 *          缺省/省略        √               √               ×                   ×
 *          protected       √               √               √                   ×
 *          public          √               √               √                   √
 * （2）那些可以加权限修饰符
 *         类、属性、方法、构造器、内部类
 * （3）分别可以加什么权限修饰符
 *          类：缺省或public
 *              如果类前面有public，那么必须与源文件名相同
 *          属性：四种都可以
 *          方法：四种都可以
 *4、属性的封装
 * 大多数情况下，属性都是private
 * 如果属性私有化了，我们会提供get\set方法
 *
 *
 * 5、方法的封装
 * 大多数情况下，方法都是public
 *
 */
public class Test10_Encapsulation {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.setRadius(1.2);
        System.out.println(c1.getRadius());

    }
}
     class Circle
    {
        private double radius;

        /**
         * get方法，用于在其他类中修改radius的值
         * @return
         */
        public double getRadius() {
            return radius;
        }

        /**
         *用于在其他类中获取radius的值
         * @param radius
         */
        public void setRadius(double radius) {
            this.radius = radius;
        }
    }

