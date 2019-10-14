public class Thread_Runnable {

    public static void main(String[] args) {

        //匿名内部类创建进程
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("t1-inner_class_by_Thread");
            }
        };

        Thread t2 = new Thread(new Runnable() {

            public void run() {
                System.out.println("t2-inner_class_by_impelements_Runnable");
            }
        });

        //继承Thread类创建线程实例
        Thread exThread = new ExThread();

        //实现Runnable接口创建线程实例
        ImThread imThread = new ImThread();

        //调用线程的方法为 start()
        t1.start();
        t2.start();
        exThread.start();
        //必须要Thread类start方法启动
        new Thread(imThread).start();
    }

}

/**
 * ExThread继承了Thread类，并重写起run()方法
 */
class ExThread extends Thread {

    @Override
    public void run() {
        System.out.println("this is ExThread that extends Thread");
    }

}

/**
 * ImThread实现了Runnable接口，同样需要重写run方法
 * 相比于继承Thread类，实现Runnable方式更加灵活
 */
class ImThread implements Runnable{
    public void run() {
        System.out.println("this is ImThread that impelements Runable");
    }
}
