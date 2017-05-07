package com.owen.thread;

public class HelloThread extends Thread{

	private String threadName;
	public HelloThread(String name)
	{
		this.threadName = name;
	}
	
	@Override
	public void run()
	{
		System.out.println("Start thread " + this.threadName);
		System.out.println("End thread " + this.threadName);
	}
}
