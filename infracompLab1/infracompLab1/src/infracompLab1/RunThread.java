package infracompLab1;

public class RunThread implements Runnable 
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
	
	public RunThread(boolean even, int maxx, int pid, int psleepTime)
	{
		isEven = even;
		max= maxx;
		id = pid;
		sleepTime = psleepTime;
	}
	
	public void runThread()
	{
		Thread t = new Thread( new RunThread(isEven, max, id, sleepTime));
		t.start();
	}
}
