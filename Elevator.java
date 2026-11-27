public class Elevator {
	
	private int now, topFloor, travelled;
	
	public Elevator(int topFloor) {
		now = 1;
		topFloor = topFloor;
		travelled = 0;
	}
	
	public int getCurrentFloor() {
		return now;
	}
	
	public int getFloorsTravelled() {
		return travelled;
	}
	
	public boolean goTo(int floor) {
		if (floor>=1 && floor<=topFloor && floor!=now) {
			travelled += Math.abs(now-floor);
			now = floor; 
			return true;
		} return false;
	}
	
	public String toString() {
		return "Floor " + now + " of " + topFloor;
	}
	
}
