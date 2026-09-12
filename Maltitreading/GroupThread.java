class Thread1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			if(Thread.currentThread().isInterrupted())
			{
				System.out.println(Thread.currentThread().getName()+" interrupted, stopping");
				return;
			}
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+" interrupted while sleeping");
				Thread.currentThread().interrupt(); // restore interrupt status
				return;
			}
		}
	}
}

class GroupThread
{
	public static void main(String s[])
	{
		ThreadGroup tg=new ThreadGroup("rr");
		Thread1 t1=new Thread1();
		Thread t3=new Thread(tg,t1,"thread1");
		Thread t4=new Thread(tg,t1,"thread2");
		Thread t5=new Thread(tg,t1,"thread3");
		t3.start();
		t4.start();
		t5.start();

		try{
			Thread.sleep(5000);
		}catch(Exception e){ }

		System.out.println(Thread.currentThread().getName());

		// interrupt() instead of stop()
		tg.interrupt();
	}
}

/*tg.stop() → tg.interrupt(), which calls interrupt() on every thread in the group — 
the safe, still-supported way to signal threads to stop.
Inside run(), the loop now checks isInterrupted() at the top of each 
iteration and also catches InterruptedException from Thread.sleep(),
 exiting cleanly instead of being forcibly killed mid-execution.
This means each thread finishes gracefully rather than being torn down 
at an arbitrary point (which is exactly the kind of corruption risk that 
got stop() deprecated in the first place).*/