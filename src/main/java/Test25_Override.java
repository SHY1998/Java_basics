/**
 * 那些方法不能被重写
 * （1）final
 * （2）static
 * （3）private
 *      因为私有的在子类中不可见
 * （4）如果是挎包，修饰符缺省的也不能被重写，因为缺省的挎包看不见
 *
 *
 *
 *
 * 外部类：
 *      权限修饰符：public、缺省的
 *      其他修饰符：final、abstract
 *
 * 方法：
 *      权限修饰符：4种都可以
 *      其他修饰符：final、static、native
 *  成员变量：
 *      权限修饰符：4种都可以
 *      其他修饰符：final、static
 *  代码块：
 *      修饰符：static
 */
public class Test25_Override {
}
