package Test.waitnotify;

/**
 * 生产者类Producer继承线程类Thread
 */
public class Producer extends Thread
{
    // 每次生产的产品数量
    private int num;

    // 所在放置的仓库
    private Factory storage;

    // 构造函数，设置仓库
    public Producer(Factory storage)
    {
        this.storage = storage;
    }

    // 线程run函数
    public void run()
    {
        produce(num);
    }

    // 调用仓库Storage的生产函数
    public void produce(int num)
    {
        storage.produce(num);
    }

    // get/set方法
    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public Factory getStorage()
    {
        return storage;
    }

    public void setStorage(Factory storage)
    {
        this.storage = storage;
    }
}