package elevatorStatePattern;

public class ElevatorMachine {

	final static int idle = 0;
	final static int goingUp = 2;	// lower-floor
	final static int goingDown = 4; //higher-floor
	final static int atTop = 5;		//top-floor
	final static int atBottom = 1; 	//bottom-floor
	
	int state = idle;
	
	public ElevatorMachine()
	{
/*	idle = new idle();
	goingUp = new goingUp();
	goingDown = new goingDown();
	atTop = new atTop();
	atBottom = new atBottom();*/
	}
	
	public void goUp()
	{
		System.out.println("Going up now");
	}
	
	public void halt()
	{
		System.out.println("You have stopped the elevator");
	}
	
	public void goDown()
	{
		System.out.println("Going down now");
	}
	
	public void topLimitHit()
	{
		System.out.println("You've reached the top floor.");
	}
	
	public void bottomLimitHit()
	{
		System.out.println("You've reachted the bottom floor.");
	}
	
}
