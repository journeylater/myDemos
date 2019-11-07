package com.destiny.multiThreading.p17;

import java.util.concurrent.Executors;

public class UseExecutors {

	public static void main(String[] args) {

		//固定大小的线程池，可以指定线程池的大小，该线程池corePoolSize和maximumPoolSize相等，
		// 阻塞队列使用的是LinkedBlockingQueue，大小为整数最大值。
		Executors.newFixedThreadPool(10);

		//缓存线程池，缓存的线程默认存活60秒。线程的核心池corePoolSize大小为0，核心池最大为Integer.MAX_VALUE,
		// 阻塞队列使用的是SynchronousQueue。是一个直接提交的阻塞队列，   
		// 他总会迫使线程池增加新的线程去执行新的任务。在没有任务执行时，当线程的空闲时间超过keepAliveTime（60秒），
		// 则工作线程将会终止被回收，当提交新任务时，如果没有空闲线程，则创建新线程执行任务，
		// 会导致一定的系统开销。如果同时又大量任务被提交，而且任务执行的时间不是特别快，
		// 那么线程池便会新增出等量的线程池处理任务，这很可能会很快耗尽系统的资源
		Executors.newCachedThreadPool();

		//单个线程线程池，只有一个线程的线程池，阻塞队列使用的是LinkedBlockingQueue,
		// 若有多余的任务提交到线程池中，则会被暂存到阻塞队列，待空闲时再去执行。按照先入先出的顺序执行任务
		Executors.newSingleThreadExecutor();

		//定时线程池，该线程池可用于周期性地去执行任务，通常用于周期性的同步数据。
		//scheduleAtFixedRate:是以固定的频率去执行任务，周期是指每次执行任务成功执行之间的间隔。
		//schedultWithFixedDelay:是以固定的延时去执行任务，延时是指上一次执行成功之后和下一次开始执行的之前的时间
		Executors.newScheduledThreadPool(1);


		//自定义线程池
		// 	corePoolSize:核心线程数	线程池初始化后的线程数
		//	maximumPoolSize：最大线程数	线程池最大的线程数
		//	keepAliveTime：空闲时间
		//	unit：时间单位
		//	workQueue：	阻塞队列
		//	handler: 拒绝策略
		//ThreadPoolExecutor(int corePoolSize,
		//                              int maximumPoolSize,
		//                              long keepAliveTime,
		//                              TimeUnit unit,
		//                              BlockingQueue<Runnable> workQueue,
		//                              RejectedExecutionHandler handler)



	}
}
