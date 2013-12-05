package yeah.cstriker1407.design_patterns.state;

public class LiftStates
{
	public static interface ILiftState
	{
		public void open();
		public void close();
		public void run();
		public void stop();
	}
	public static final ILiftState OpenState = new LiftOpen();
	public static final ILiftState CloseState = new LiftClose();
	public static final ILiftState RunState = new LiftRun();
	public static final ILiftState StopState = new LiftStop();
	
	public static ILiftState currentLiftState;
	
	
	
	public static void normal()
	{
		currentLiftState = OpenState;
		currentLiftState.open();
		currentLiftState.close();
		currentLiftState.run();
		currentLiftState.stop();
	}
	
	
	public static void test()
	{
		currentLiftState.open();
		currentLiftState.close();
		currentLiftState.open();
		currentLiftState.close();
		currentLiftState.open();
		currentLiftState.close();
		
		currentLiftState.close();
		currentLiftState.run();
		currentLiftState.stop();
		currentLiftState.run();
		currentLiftState.stop();
		currentLiftState.run();
		currentLiftState.stop();
	}
	
}



