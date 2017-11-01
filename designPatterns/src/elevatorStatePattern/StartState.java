package elevatorStatePattern;

public class StartState implements State {

	   public void doAction(Context context) {
	      System.out.println("Elevator is in start state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Start State";
	   }

	@Override
	public void goUp() {
	      System.out.println("Elevator is going up.");
		
	}

	@Override
	public void halt() {
	      System.out.println("Elevator will remain in Idle.");
		
	}

	@Override
	public void goDown() {
	      System.out.println("Elevator is goiing down.");
		
	}

	@Override
	public void topLimitHit() {
	      System.out.println("Elevator has reached the top limit and can no longer go up. Elevator in Idle.");
		
	}

	@Override
	public void bottomLimitHit() {
	      System.out.println("Elevator has reached the bottom limit and can no longer go down. Elevator in Idle.");

		
	}
	}
