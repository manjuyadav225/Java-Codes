
public class ThreadOrderExecution {

	public static void main(String[] args) {
		Thread T1 = new Thread(() -> { System.out.println("Thread T1 is running"); } );
		
		Thread T2 = new Thread(() -> { System.out.println("Thread T2 is running"); } );
		
		Thread T3 = new Thread(() -> { System.out.println("Thread T3 is running"); } );
		
		try {
			
			T1.start();
			T1.join();
			
			T2.start();
			T2.join();
			
			T3.start();
			T3.join();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		catch(Exception e) {}
			
		
		}
	}


