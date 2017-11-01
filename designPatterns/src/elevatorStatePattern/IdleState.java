package elevatorStatePattern;

public class IdleState implements State {
	

	   public void doAction(Context context) {
		      System.out.println("Elevator is in idle state");
		      context.setState(this);	
		   }

	@Override
	public void goUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void halt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void topLimitHit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bottomLimitHit() {
		// TODO Auto-generated method stub
		
	}

	public String toString()
	{
	return "Idle State";
	}
}
