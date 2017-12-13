package OtherTest;

/**
 * 实例变量线程安全问题模拟。(instance_i*2的值等于8时即出现了线程数据错乱)
 */
public class Test2 implements Runnable
{
    private int instance_i;//实例变量

    public void run()
    {
        instance_i = 4;
        System.out.println("[" + Thread.currentThread().getName()
                + "]获取instance_i 的值:" + instance_i);
        instance_i = 10;
        System.out.println("[" + Thread.currentThread().getName()
                + "]获取instance_i*2的值:" + instance_i * 2);
    }

    public static void main(String[] args)
    {
        Test2 t = new Test2();
        //启动尽量多的线程才能很容易的模拟问题
        for (int i = 0; i < 3000; i++)
        {
            //每个线程对在对象t中运行，模拟单例情况
            new Thread(t, "线程" + i).start();
        }
    }


}
