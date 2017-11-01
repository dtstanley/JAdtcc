package elevatorStatePattern;

public class ElevatorMachineDemo {
	
	static String buttonReq = "go"; //button identifies the floor requested
	int floor = 0; // floor where elevator is presently


	   public static void main(String[] args) {
	      Context context = new Context();

	      StartState startState = new StartState();
	      startState.doAction(context);

	      System.out.println(context.getState().toString());
	      
	
	    	  
	      IdleState idleState = new IdleState();
	      idleState.doAction(context);

	      System.out.println(context.getState().toString());
	      
	      AtBottomState atBottomState = new AtBottomState();
	      atBottomState.doAction(context);

	      System.out.println(context.getState().toString());
	      
	      AtTopState atTopState = new AtTopState();
	      atTopState.doAction(context);

		  System.out.println(context.getState().toString());
		      
	      GoingDownState goingDownState = new GoingDownState();
	      goingDownState.doAction(context);

	      System.out.println(context.getState().toString());
	      
	      GoingUpState goingUpState = new GoingUpState();
	      goingUpState.doAction(context);

	      System.out.println(context.getState().toString());
	      
	      while (buttonReq != "stop")
	      {
	    	  if (context.getState().equals(idleState)) //Idle?
	    	  {
	    		  
	    	  }
	    	  else if (context.getState().equals(goingUpState)) //Going Up?
	    	  {
	    		  
	    	  }
	    	  else if (context.getState().equals(goingDownState)) //Going Down?
	    	  {
	    		  
	    	  }
	    	  else if (context.getState().equals(atTopState)||context.getState().equals(atBottomState)) //At top or at bottom?
	    	  {
	    		  
	    	  }
	    	  else //Set state to Idle & set buttonReq  to stop or continue?
	    	  {
	    		 // Set state to Idle 
	    		  //& set buttonReq  to stop or continue?

	    	  }
	    	  
	      }
	      System.out.println("Process complete. Door will open. Goodbye.");
	   }
	}
