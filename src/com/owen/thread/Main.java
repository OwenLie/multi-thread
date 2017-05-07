package com.owen.thread;

public class Main {

	public static void main(String[] args)
	{
		//create thread with class which extends from Thread
		Thread thread1 = new HelloThread("Owen");
		thread1.start();
	}
}
