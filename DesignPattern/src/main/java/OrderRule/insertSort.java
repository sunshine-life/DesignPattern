package OrderRule;

/**
 * 直接插入排序
 */
public class insertSort {
    public static void main(String[] args) {
        int a[] = {
                49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51
        };
        int len = a.length;//单独把数组长度拿出来，提高效率
        int insertNum;//要插入的数
        for (int i = 1; i < len; i++) {//因为第一次不用，所以从1开始
            insertNum = a[i];
            int j = i - 1;//序列元素个数
            for (;j >= 0 && a[j] > insertNum;j--) {//从后往前循环，将大于insertNum的数向后移动
                a[j + 1] = a[j];//元素向后移动
            }
            a[j + 1] = insertNum;//找到位置，插入当前元素
        }
        for (int i : a) {
            System.out.println(i);
        }

    }
}
