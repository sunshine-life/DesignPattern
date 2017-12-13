package OtherTest;

/**
 * 实例变量线程安全问题模拟。(instance_i*2的值等于8时即出现了线程数据错乱)
 */
public class Test3 implements Runnable {
    public Demos demo;
    Test3(Demos demo){
        this.demo = demo;
    }

    public void test(){
        demo.instance_i = 4;
        System.out.println("[" + Thread.currentThread().getName()
                + "]获取instance_i 的值:" + demo.instance_i);
        demo.instance_i = 10;
        //启动尽量多的线程才能很容易的模拟问题
        System.out.println("[" + Thread.currentThread().getName()
                + "]获取instance_i*2的值:" + demo.instance_i * 2);
    }


    @Override
    public void run() {
        test();
    }

    static class Demos{
        public int instance_i;//实例变量
    }

    public static void main(String[] args) {
        Demos demo = new Demos();
        //启动尽量多的线程才能很容易的模拟问题
        for (int i = 0; i < 3000; i++)
        {
            Test3 t = new Test3(demo);
            (new Thread(t)).start();
            //t.run();
        }
    }
}
