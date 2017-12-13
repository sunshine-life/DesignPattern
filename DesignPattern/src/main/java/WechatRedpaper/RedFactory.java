package WechatRedpaper;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class RedFactory {

    //阻塞队列的map，用来保存不同的红包，一个BlockingQueue保存一个红包序列
    private Map<String,BlockingQueue> redmap  = new TreeMap<String,BlockingQueue>();



    public  List<Double> initRedPaper(String name,double totalAmount,int papers) throws InterruptedException {
        // papers人抢
        // 发红包总金额totalAmount元
        double S = totalAmount;
        // 0-totalAmount之间papers个节点，加首尾papers+2个点赋值给数组a
        double[] a = new double[papers+2];
        // 第一个数是0
        a[0] = 0;
        // 最后一个数是100
        a[a.length - 1] = S;
        // 生成9个数随机节点并保留两位小数
        for (int m = 1; m < a.length - 1; m++)
        {
            a[m] = Double.valueOf(String.format("%.2f", S * Math.random()));
        }
        // 冒泡排序对9个点进行排序
        for (int i = 1; i < a.length - 2; i++)
        {
            for (int j = 1; j < a.length - 1 - i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    double temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(double c:a){
            System.out.println(c);
        }
        System.out.println("===================================");
        //红包金额赋值给数组aa
        double[] aa = new double[a.length - 1];
        // 后一项减前一项的差值为红包金额
        for (int n = 0; n < a.length - 1; n++)
        {
            double mon = a[n + 1] - a[n];
            //用自己的算法实现四舍五入保留两位小数
            int n1 = (int) (mon * 1000);
            int c = n1 % 10;
            if (c > 4)
                mon = (double) ((n1 + 10) / 10) / 100;
            else
                mon = (double) (n1 / 10) / 100;
            aa[n] = mon;
        }
        //列表打乱数组aa中的顺序，实现抢红包的次序与红包金额匹配随机
        List<Double> list = new ArrayList<Double>();
        for(int i = 0; i < aa.length; i++)
        {
            list.add(aa[i]);
        }
        Collections.shuffle(list);
        BlockingQueue queue = new LinkedBlockingDeque(papers+2);
        double total = 0;
        for(double i:list){
            System.out.println(i);
            total+=i;
            queue.put(i);
        }
        System.out.println("total:" +total);
        redmap.put(name,queue);
        return list;
    }


    public void getRed(String redStr){
        try {
            if(redmap.get(redStr)==null){
                Thread.sleep(500);
            }
            Object get = redmap.get(redStr).poll(100, TimeUnit.MILLISECONDS);
            if(get == null){
                System.out.println(Thread.currentThread().getName()+"手速慢了，领完了");
            }else{
                System.out.println(Thread.currentThread().getName()+"恭喜获得红包"+get+"元"+"=========================="+redStr);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void say(){
        System.out.println("test");
    }

}
