package org.java.study.thread;

/**
 * Created by Administrator on 2015/12/11.
 */
public class ThreadWrong {

    public static void main(String[] args){
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("我是创建的线程");
//                super.run();
            }
        };
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread.suspend();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
    }
}
