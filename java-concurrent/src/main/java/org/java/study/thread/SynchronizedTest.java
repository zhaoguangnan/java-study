package org.java.study.thread;

/**
 * Created by zhaoguangnan on 2015/12/14.
 */
public class SynchronizedTest {

    public  void  test1() {
//        synchronized (this) {

            System.out.println("aaaaaaaaaa");
//        }
    }

    public  void test2() {
//        synchronized (this) {

            System.out.println("bbbbbbbbb");
//        }
    }

    public static void main(String[] args) {
        final SynchronizedTest syn = new SynchronizedTest();

        for (int i = 0; i < 15; i++) {
            new Thread(){
                @Override
                public void run() {

                    synchronized (syn) {
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        syn.test1();
                    }

                }
            }.start();
        }

        for (int i = 0; i < 15; i++) {
            new Thread(){
                @Override
                public void run() {
                    synchronized (syn) {

                        syn.

                                test2();
                    }
                }
            }.start();
        }


    }
}
