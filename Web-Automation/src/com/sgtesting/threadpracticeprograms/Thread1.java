package com.sgtesting.threadpracticeprograms;

class MyThread3 implements Runnable
{
	public void run()
	{
		displayOddNumbers();
	}
	void displayOddNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==1)
			{
				System.out.println("Odd Number:"+i);
			}
		}
	}catch(Exception e)
		{
		e.printStackTrace();
		}
     }
}
public class Thread1 {

	public static void main(String[] args) {
		MyThread3 job=new MyThread3();
		Thread t1=new Thread(job);
		t1.start();
		

	}

}

