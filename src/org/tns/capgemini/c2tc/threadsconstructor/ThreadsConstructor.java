package org.tns.capgemini.c2tc.threadsconstructor;

class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + 
                            " is running");
    }
}

public class ThreadsConstructor
{
    public static void main(String[] args)
    {
        // Constructor 1 - Thread()
        Thread thread1 = new Thread();
        thread1.setName("Thread 1");
        thread1.start();
        System.out.println("Thread name : " + thread1.getName());

        // Constructor 2 - Thread(String name)
        Thread thread2 = new Thread("Thread 2");
        thread2.start();
        System.out.println("Thread name : " + thread2.getName());

        // Constructor 3 - Thread(Runnable r)
        MyRunnable myRunnable = new MyRunnable();
        Thread thread3 = new Thread(myRunnable);
        thread3.start();

        // Constructor 4 - Thread(Runnable r, String name)
        Thread thread4 = new Thread(myRunnable, "Thread 4");
        thread4.start();
    }
}