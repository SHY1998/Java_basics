import java.util.Arrays;

/**
 * API:应用成语编程接口 俗称：帮助文档
 *
 * java.util.Arrays
 * (1)public static int binarySearch(int[] a,int key)
 *  使用二分搜索法来搜索指定的int型数组，以获得指定的值；
 *  要求数组是有序的，否则结果不确定
 *  如果key在数组中存在，就返回找到的第一个的下标，如果不存在就返回负数
 *
 * (2)public static int[] copyOf(int[] original,int newLength)
 *      从original原数组中赋值得到一个新数组
 *      新数组的长度为newLength
 *（3）：public static boolean equals(int[] a,int[] a2)
 *      比较两个数组的长度和内容是否一致
 * (4)public static void fill(int[] a,int val)
 *      把a数组的元素用val填充
 *  (5)public static void sort(int[] a)
 *      吧数组a按照升序排序
 *  (6)public static String toString(int[] a)
 *      把A数组的元素遍历拼接为一个字符串
 */
public class Test23_Arrays {

    public static void main(String[] args) {
//        int arr[] = {1,3,5,7,9};
//        System.out.println(Arrays.binarySearch(arr,4));
//            （2）
//        int arr[] = {1,3,5,7,9};
//        int [] newArr = Arrays.copyOf(arr,15);
//        int [] newArr2 = Arrays.copyOf(arr,3);
//        for(int i=0;i<newArr.length;i++)
//        {
//            System.out.println(newArr[i]+" ");
//        }
//        （3）
//        int[] arr1 = {1,3,5,6};
//        int[] arr2 = {1,3,5,6};
//        System.out.println(Arrays.equals(arr1,arr2));
//        （4）
//        int[] arr = new int[5];
//        Arrays.fill(arr,2);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+"");
//        }
//        （5）
//        int[] arr = {3,31,41,512,41};
//        Arrays.sort(arr);
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i]+"");
//    }
//        （6）
        int[] arr = {3,31,41,512,41};
        System.out.println(Arrays.toString(arr));

    }

}
