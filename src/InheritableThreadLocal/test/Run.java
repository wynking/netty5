package InheritableThreadLocal.test;
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在main线程中取值=" + Tools.inheritableThreadLocalExt.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            MyThread myThread = new MyThread();
            myThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
