package com.practice.threadingExample;

public class JoinMethodExample extends Thread {

  public void run(){
    for (int i=0; i<10; i++){
      System.out.println(Thread.currentThread().getName());
      try {
        Thread.sleep(500);
      }catch (Exception e){
        System.out.println(e);
      }
      System.out.println(i);
    }
  }

  public static void main(String[] args) {

    JoinMethodExample t1 = new JoinMethodExample();
    JoinMethodExample t2 = new JoinMethodExample();
    JoinMethodExample t3 = new JoinMethodExample();

    t1.start();
    t2.start();
    t3.start();
    try{
      t2.join();
      t1.join();
    }catch (Exception e){
      System.out.println(e);
    }

  }

}
