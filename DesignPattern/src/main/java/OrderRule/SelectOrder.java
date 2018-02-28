package OrderRule;

/**
 * 简单选择排序
 */
public class SelectOrder {
    public static void main(String[] args) {
        int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        for(int i = 0;i<a.length;i++){
            int nowValue = a[i];
            int minTemp = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j]<nowValue){
                    nowValue = a[j];
                    minTemp = j;
                }
            }
            a[minTemp]= a[i];
            a[i] = nowValue;
        }
        for (int result : a) {
            System.out.println(result);
        }
    }
}
