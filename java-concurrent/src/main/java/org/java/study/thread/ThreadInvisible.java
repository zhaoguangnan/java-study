package org.java.study.thread;

/**
 * 多线程，线程栈不可见
 *
 * 再JVM运行时，每个线程的私有栈在使用共享数据时，会先将共享数据拷贝到栈顶进行运算，
 * 这份数据其实是一个副本，因此同样存在多线程修改同一个内存单元的一致性问题
 */
public class ThreadInvisible {

    private static class ReadThread extends Thread {
        private boolean ready;
        private int number;

        @Override
        public void run() {
            while(!ready){
                number++;
            }

            System.out.println(ready);
        }

        public void readyOn(){
            this.ready = true;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ReadThread readThread = new ReadThread();
//        readThread.setDaemon(true);
        readThread.start();
        Thread.sleep(200);
        readThread.readyOn();
        System.out.println(readThread.ready);
    }
}
