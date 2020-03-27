/**
 * 向下转型时是有风险的，可能会发生ClassCastException
 * 因为这是一个运行时异常，不能提前发现
 * 我们想通过代码去避免ClassCastException，我们可以使用instanceof来进行判断
 *
 * 语法格式
 *      变量/对象 instanceof 类型
 *  结果要么是true。要么是false
 *      什么情况下返回true
 *
 */
public class Tes19_Instanceof {
    public static void main(String[] args) {
       Man2 m = new Man2();
       test(m);

       Woman2 wm = new Woman2();
       test(wm);
    }

    public static void test(Person2 person2)
    {
        //如果这个p是个女人，就调用他的shop方法
        //如果这个p是个男人，就调用它的smoke方法
        if (person2 instanceof Woman2)
        {
            Woman2 m = (Woman2) person2;
            m.shop();
        }else if (person2 instanceof Man2)
        {
            Man2 m = (Man2) person2;
            m.smoke();
        }

    }
}
