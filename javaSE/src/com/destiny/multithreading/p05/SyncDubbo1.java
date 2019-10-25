package com.destiny.multithreading.p05;
/**
 * synchronized的重入
 *
 *  可重入锁的关键就是不用释放锁
 * @author alienware
 *
 */
public class SyncDubbo1 {

	public synchronized void method1(){
		System.out.println("method1..");
		method2();
	}
	public synchronized void method2(){
		System.out.println("method2..");
		method3();
	}
	public synchronized void method3(){
		System.out.println("method3..");
	}
	
	public static void main(String[] args) {
		final SyncDubbo1 sd = new SyncDubbo1();

		new Thread(()->sd.method1()).start();
	}
}
