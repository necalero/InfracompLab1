package infracompLab1;

public class ExtendThread extends Thread
{
	private int id;
	private boolean isEven;
	private int max;
	private int sleepTime;
	
	public void run()
	{
		int start = 0;
		if(!isEven)
		{
			start = 1;
		}
		for (int i = start; i<=max; i+=2)
		{
			System.out.println("Thread "+id+": "+i);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ExtendThread(boolean even, int maxx, int pid, int pSleepTime)
	{
		isEven = even;
		max= maxx;
		id = pid;
		sleepTime = pSleepTime;
	}
	
	public void runThread()
	{
		ExtendThread t = new ExtendThread(isEven, max, id, sleepTime);
		t.start();
	}
}
