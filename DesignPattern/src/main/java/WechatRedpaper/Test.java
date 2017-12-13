package WechatRedpaper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by life on 17-5-15.
 */
public class Test {
    public static void main(String[] args) {
        /*RedFactory rf = new RedFactory();
        PruductRed p = new PruductRed(rf);
        Thread t1 = new Thread(p,"生产");
        t1.start();
        for(int i=0;i<13;i++){
            ConsumerRed c = new ConsumerRed(rf);
            Thread t = new Thread(c,"消费"+i);
            t.start();
        }*/


        //创建一个可重用固定线程数的线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
        Thread t1 = new MyThread();
        t1.setName("A");
        Thread t2 = new MyThread();
        t2.setName("B");
        Thread t3 = new MyThread();
        t3.setName("C");
        Thread t4 = new MyThread();
        t4.setName("D");
        Thread t5 = new MyThread();
        t5.setName("E");
        //将线程放入池中进行执行
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        //关闭线程池
        pool.shutdown();

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName()+"正在执行。。。");
        System.out.println(Thread.currentThread().getName()+"正在执行。。。");
    }
}
