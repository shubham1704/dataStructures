package com.practice.threadingExample.concurrancyExample;

import java.util.LinkedList;
import java.util.Queue;

/**
 * **************************PROBLEM STATEMENT*************************************************
 *
 * There are two processes, a producer and a consumer, that share a common buffer with a limited size.
 * The producer “produces” data and stores it in the buffer, and the consumer “consumes” the data,
 * removing it from the buffer. Having two processes that run in parallel, we need to make sure that
 * the producer will not put new data in the buffer when the buffer is full and the consumer won’t
 * try to remove data from the buffer if the buffer is empty
 *
 *
 *
 * ********************SOLUTION******************************
 *
 * For solving this concurrency problem, the producer and the consumer will have to communicate with each
 * other. If the buffer is full, the producer will go to sleep and will wait to be notified. After the
 * consumer will remove some data from the buffer, it will notify the producer, and then, the producer
 * will start refilling the buffer again. The same process will happen if the buffer is empty, but in
 * this case, the consumer will wait to be notified by the producer.
 *
 * If this communication is not done properly, it can lead to a deadlock where both processes will wait for each other.
 *
 */

public class ProducerConsumerUsingClassicApproach {

  public static void main(String[] args) throws InterruptedException {
    Buffer buffer = new Buffer(2);

    Thread producerThread = new Thread(() -> {
      try {
        buffer.produce();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    Thread consumerThread = new Thread(() -> {
      try {
        buffer.consume();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    producerThread.start();
    consumerThread.start();

    producerThread.join();
    consumerThread.join();
  }

  static class Buffer {

    private Queue<Integer> list;
    private int size;

    public Buffer(int size) {
      this.list = new LinkedList<>();
      this.size = size;
    }

    public void produce() throws InterruptedException {
      int value = 0;
      while (true) {
        synchronized (this) {
          while (list.size() >= size) {
            // wait for the consumer
            wait();
          }

          list.add(value);

          System.out.println("Produced " + value);

          value++;

          // notify the consumer
          notify();

          Thread.sleep(1000);
        }
      }
    }

    public void consume() throws InterruptedException {
      while (true) {
        synchronized (this) {
          while (list.size() == 0) {
            // wait for the producer
            wait();
          }

          int value = list.poll();

          System.out.println("Consume " + value);

          // notify the producer
          notify();

          Thread.sleep(1000);
        }
      }
    }
  }
}
