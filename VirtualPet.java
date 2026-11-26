public class VirtualPet {
	
	private String pet; 
	private int hunger, happiness;
	public VirtualPet(String name) {
		pet = name;
		hunger = 5;
		happiness = 5;
	}
	public VirtualPet(String name, int hunger, int happiness) {
		pet = name; 
		hunger = hunger; 
		happiness = happiness;
	}
	public String getName() {
		return pet;
	}
	public int getHunger() {
		return hunger;
	}
	public int getHappiness() {
		return happiness;
	}
	public void feed() {
		if (hunger>2) {
			hunger-=3;
		} hunger=0;
	}
	public void play() {
		if (happiness<9) {
			happiness+=2;
		} happiness=10;
		if (hunger<10) {
			hunger++;
		} hunger=10;
	}
	public boolean isHappy() {
		if (happiness>=7 && hunger<=4) {
			return true;
		} return false;
	} 
	public String toString() {
		return pet + " (hunger " + hunger + ", happiness " + happiness + ")";
	}
}
