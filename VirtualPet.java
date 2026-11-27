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
		this.hunger = hunger; 
		this.happiness = happiness;
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
		hunger = Math.max(0, hunger-3);
	}
	public void play() {
		happiness = Math.min(10, happiness+2);
		hunger = Math.min(10, hunger+1);
	}
	public boolean isHappy() {
		return happiness>=7 && hunger<=4;
	}
	public String toString() {
		return pet + " (hunger " + hunger + ", happiness " + happiness + ")";
	}
}
