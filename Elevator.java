public class Elevator {
	
	private int currentFloor, floorsTravelled;
	
	public Elevator(int topFloor) {
		floor = 1;
		topFloor = topFloor;
	}
	
	public int getCurrentFloor() {
		return floor;
	}
	
	public int getFloorsTravelled() {
		return floorsTravelled;
	}
	
	public boolean goTo(int floor) {
		
	}
	
	public String toString() {
		System.out.println("Floor " + floor + " of " + topFloor);
	}
	
}
