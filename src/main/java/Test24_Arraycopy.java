import java.util.Arrays;

/**
 *
 * Object所有引用数据类型的根父类
 * 根据多态，Object类型的变量，形参，就可以接受任意的引用数据类型的对象，包括数组
 *
 *
 *
 * 和数组有关的常用方法：java.lang.System类
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * src:原数组对象
 * srcPos：从cre的[srcPro]下标开始复制
 * dest：目标数组对象
 * destPos目标数组从[destPos]开始存储
 * length 表示从src复制几个元素
 * 说明：如果src和dest是同一个数组的话，那么就会实现数组元素的移动效果
 */
public class Test24_Arraycopy {
    public static void main(String[] args) {
        String [] arr ={"hello","world","java",null,null};

//        System.arraycopy(arr,1,arr,0,2);

        //是现在"hello"和"world"中插入"12"

        System.arraycopy(arr,1,arr,2,2);
        arr[1]= "12";



        System.out.println(Arrays.toString(arr));
    }
}
