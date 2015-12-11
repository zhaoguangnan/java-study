package org.java.study.thread;

/**
 * Created by Administrator on 2015/12/11.
 */
public class SimpleThread {

    public static void main(String[] args){
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "\t" + Thread.currentThread().getId() + "\t我是被创建的线程");
            }
        };
        System.out.println(thread.getState());
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
        System.out.println(Thread.currentThread().getName() + "\t" + Thread.currentThread().getId() + "\tmain thread end");
    }
}
