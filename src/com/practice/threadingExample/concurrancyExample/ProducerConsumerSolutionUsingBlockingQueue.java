package com.practice.threadingExample.concurrancyExample;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

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

public class ProducerConsumerSolutionUsingBlockingQueue {

  public static void main(String[] args) {
    BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(2);
    ExecutorService executor = Executors.newFixedThreadPool(2);

    Runnable producerTask = () -> {
      try {
        int value = 0;
        while (true) {
          blockingQueue.put(value);

          System.out.println("Produced " + value);

          value++;

          Thread.sleep(1000);
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    Runnable consumerTask = () -> {
      try {
        while (true) {
          int value = blockingQueue.take();

          System.out.println("Consume " + value);

          Thread.sleep(1000);
        }

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    executor.execute(producerTask);
    executor.execute(consumerTask);

    executor.shutdown();
  }

}
