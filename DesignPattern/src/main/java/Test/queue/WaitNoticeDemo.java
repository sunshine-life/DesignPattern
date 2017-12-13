package Test.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * User: csx
 * Date: 4/24/14
 * Time: 9:56 AM
 * To change this template use File | Settings | File Templates.
 *
 * 生产者与消费者模型中，要保证以下几点：
 * 1 同一时间内只能有一个生产者生产
 * 2 同一时间内只能有一个消费者消费
 * 3 生产者生产的同时消费者不能消费
 * 4 消费者消费的同时生产者不能生产
 * 5 共享空间空时消费者不能继续消费
 * 6 共享空间满时生产者不能继续生产
 *
 * 使用并发库中的BlockingQueue(阻塞队列） 实现生产者与消费者
 */
public class WaitNoticeDemo {
    public static void main(String[] args) {
        //固定容器大小为10
        BlockingQueue<Food> foods = new LinkedBlockingQueue<Food>(10);
        Thread produce = new Thread(new Produce(foods));
        Thread consume = new Thread(new Consume(foods));
        produce.start();
        consume.start();
    }
}

/**
 * 生产者
 */
class Produce implements Runnable{
    private BlockingQueue<Food> foods;
    Produce(BlockingQueue<Food> foods) {
        this.foods = foods;
    }

    @Override
    public void run() {
        int i = 0;
        while (true&&i<30){
            try {
                //当生产的食品数量装满了容器，那么在while里面该食品容器(阻塞队列)会自动阻塞  wait状态 等待消费
                foods.put(new Food("食品"+i));
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }
}

/**
 * 消费者
 */
class Consume implements Runnable {
    private BlockingQueue<Food> foods;
    Consume(BlockingQueue<Food> foods){
        this.foods = foods;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);  //用于测试当生产者生产满10个食品后是否进入等待状态
            while (true){
                //当容器里面的食品数量为空时，那么在while里面该食品容器(阻塞队列)会自动阻塞  wait状态 等待生产
                Food food = foods.take();
                System.out.println("消费"+food.getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}

/**
 * 食品
 */
class Food{
    private String name;

    String getName() {
        return name;
    }

    Food(String name){
        this.name = name;
        System.out.println("生产"+name);
    }
}


//模仿微信红包算法
class Redpaper{
    /**
     * 1.总金额不能超过200*100 单位是分
     * 2.每个红包都要有钱，最低不能低于1分，最大金额不能超过200*100
     */
    private static final int MINMONEY =1;
    private static final int MAXMONEY =200*100;

    /**
     * 红包 合法性校验
     * @param money
     * @param count
     * @return
     */
    private boolean isRight(int money, int count) {
        double avg =money/count;
        //小于最小金额
        if(avg<MINMONEY){
            return false;
            //大于最大金额
        }else if(avg>MAXMONEY){
            return false;
        }
        return true;
    }


    static void creatRedpaer(float totalAmount,int num){
      for(int i=0;i<num;i++){

      }
   }

}
