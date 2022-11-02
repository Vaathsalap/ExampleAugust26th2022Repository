package com.sgtesting.practiceprograms;


class Sample implements Runnable
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
public class Demo1 {

	public static void main(String[] args) {
		Sample job=new Sample();
		Thread t1=new Thread(job);
		t1.start();

	}

}

