package com.atguigu.day24;

/*
 * 	程序（Program）：
 * 	    为了完成某个任务，完成某个功能而选择某个编程语言（例如：C语言，Java语言，Python等）编写的一组指令的集合。
 * 	    这组集合是以静态的方法存在于电脑中。
 * 
 * 	进程（Process）：程序的一次运行。
 * 			进程是操作系统分配资源的最小单位。同一个进程是共享同一份内存等资源，不同进程之间是不共享内存资源。
 * 			如果两个进程之间要进行数据交换，比较复杂，可以通过“文件”、网络通讯等方式，成本高。
 * 
 * 	线程（Thread）：当某个进程需要同时完成多个功能时，那么可以采用多线程。
 * 			线程是进程的其中一条执行路径。换句话说，一个进程至少有一个线程，还可以有多个线程。
 * 			线程是CPU调度资源的最小单位。多个线程之间是有共享内存的，共享同一个进程的资源的。
 * 			因为CPU给每个线程分配的时间特别短，所以用户感觉不到，感觉像是同时运行一样。
 * 
 * 	JVM的运行时内存：方法区、堆、栈（虚拟机栈、本地方法栈）、程序计数器
 * 	其中：堆、方法区的内存是共享的，栈和程序计数器是每个线程独立。
 * 		堆：对象							-->实例变量，线程是共享的
 * 		方法区：类的信息、常量、静态等		-->常量，静态变量线程共享的
 *		栈：局部变量						-->局部变量是每个线程独立的 
 * 
 * 	JavaApplication：至少有一个main线程，但是后台（JVM）中海油一些其他的线程，
 * 			GC（垃圾回收器）、异常的监视和处理的线程。类加载......
 * 
 * 	Java要如何开启main以外的线程？
 * 	（1）继承Thread类
 * 	（2）实现Runnable接口
 * 
 */
public class TestThread {
	
	public static void main(String[] args) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
