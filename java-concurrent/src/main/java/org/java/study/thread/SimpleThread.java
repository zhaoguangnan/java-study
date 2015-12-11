package org.java.study.thread;

/**
 * Created by Administrator on 2015/12/11.
 */
public class SimpleThread {

    public static void main(String[] args){
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "\t" + Thread.currentThread().getId() + "\t我是被创建的线程");
            }
        }.start();

        System.out.println(Thread.currentThread().getName() + "\t" + Thread.currentThread().getId() + "\tmain thread end");
    }
}
