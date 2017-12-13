package Test.queue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by life on 17-2-8.
 */
public class Factory {
    // 仓库最大存储量
    private final int MAX_SIZE = 100;

    // 仓库存储的载体
    private LinkedBlockingQueue<Object> list = new LinkedBlockingQueue<Object>(100);

    // 生产num个产品
    public void produce(int num)
    {
        // 如果仓库剩余容量为0
        if (list.size() + num > MAX_SIZE)
        {
            System.out.println("【库存量上限制】:" + MAX_SIZE + "\t暂时不能执行生产任务!");
        }

        // 生产条件满足情况下，生产num个产品
        for (int i = 1; i <= num; ++i)
        {
            try
            {
                // 放入产品，自动阻塞
                list.put(new Object());
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println("生产后【现仓储量为】:" + list.size());
        }
    }

    // 消费num个产品
    public void consume(int num)
    {
        // 如果仓库存储量不足
        if (list.size() < num)
        {
            System.out.println("【库存量不足】:0\t暂时不能执行消费任务!");
        }

        // 消费条件满足情况下，消费num个产品
        for (int i = 1; i <= num; ++i)
        {
            try
            {
                // 消费产品，自动阻塞
                list.take();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("消费"+num+"后【现仓储量为】:" + list.size());
    }

    // set/get方法
    public LinkedBlockingQueue<Object> getList()
    {
        return list;
    }

    public void setList(LinkedBlockingQueue<Object> list)
    {
        this.list = list;
    }

    public int getMAX_SIZE()
    {
        return MAX_SIZE;
    }
}
