package elevatorStatePattern;

public interface State {
	public void doAction(Context context);
	
	public void goUp();
	public void halt();
	public void goDown();
	public void topLimitHit();
	public void bottomLimitHit();
	
}
