package org.java.study.thread;

/**
 * Created by Administrator on 2015/12/11.
 */
public class ThreadWaite {

    public static void main(String[] args){

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
        thread.interrupt();
//        Object object = new Object();
//        synchronized (object){
//            try {
//                object.wait(); //必须基于synchronized使用
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
