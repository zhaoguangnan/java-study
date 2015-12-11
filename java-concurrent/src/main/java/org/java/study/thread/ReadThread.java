package org.java.study.thread;

/**
 * Created by Administrator on 2015/12/11.
 */
public class ReadThread extends Thread{

    private boolean ready;
    private int number;

//    private Ready readyObj = new Ready();
    private  Ready readyObj = new Ready();
//    private volatile Ready readyObj = new Ready();

    @Override
    public void run() {
        while(!readyObj.isReady()){
            number++;
//            Thread.yield();
//            System.out.println("ddd");
        }

        System.out.println(readyObj.isReady());
    }

    public void readyOn(){
        this.ready = true;
    }

    public void readyObjOn(){
        this.readyObj.setReady(true);
    }

    public boolean isReady() {
        return ready;
    }

    public Ready getReadyObj() {
        return readyObj;
    }
}
