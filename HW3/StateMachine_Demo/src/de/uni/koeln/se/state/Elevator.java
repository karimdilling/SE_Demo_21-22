package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
		System.out.println("*** Destination floor is: "+ dest_Floor);
		arrive_atFloor(dest_floor);


	}

	private void arrive_atFloor(int dest_floor) {
		if (current_Floor == dest_floor) {
			System.out.println("Current State " + State.current_state);
			System.out.println("*** Arrived at destination");
		} else if (current_Floor < dest_floor) {
			while(current_Floor < dest_floor) {
				State.current_state = State.Moving_up;
				System.out.println("*** Current state: " + State.current_state);
				current_Floor++;
				System.out.println("*** Current floor is " + current_Floor);
			}
			State.current_state = State.Idle;
			System.out.println("*** Current state: " + State.current_state);
			System.out.println("*** Arrived at destination");
		} else {
			while(current_Floor > dest_floor) {
				State.current_state = State.Moving_down;
				System.out.println("*** Current state: " + State.current_state);
				current_Floor--;
				System.out.println("*** Current floor is " + current_Floor);
			}
			State.current_state = State.Idle;
			System.out.println("*** Current state: " + State.current_state);
			System.out.println("*** Arrived at destination");
		}
	}

	
}
