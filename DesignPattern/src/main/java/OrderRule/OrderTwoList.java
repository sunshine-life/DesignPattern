package OrderRule;

/**
 * 将两个有序数组进行排序
 */
public class OrderTwoList {
    public static void main(String[] args) {
        int a[] = {1,7,9};
        int b[] = {2,4,6,8,10};
        int alen = a.length;
        int blen = b.length;
        int c[] = new int[alen+blen];
        int i=0,j=0,k=0;
        while(i<alen && j<blen){
            if(a[i] <= b[j]) {
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        while(i<alen){
            c[k++] = a[i++];
        }
        while(j<blen){
            c[k++] = b[j++];
        }
        for (int result : c) {
            System.out.println(result);
        }
    }
}
