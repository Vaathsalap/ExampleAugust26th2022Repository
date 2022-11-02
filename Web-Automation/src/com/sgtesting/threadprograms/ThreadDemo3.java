package com.sgtesting.threadprograms;
class MyThread2 implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	synchronized void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
			{
				System.out.println(Thread.currentThread().getName()+"Displays Even Number:"+i);
			}
			}
		}catch(Exception e)
	{
		e.printStackTrace();
	}
   }
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		MyThread2 job=new MyThread2();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		
		t1.setName("alpha");
		t2.setName("omega");
		
		t1.start();
		t2.start();

	}

}

