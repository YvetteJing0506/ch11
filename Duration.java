import java.util.Arrays;
public class Duration {
	
	private int hours, minutes, seconds;
	
	public Duration(int hours, int minutes, int seconds) {
		this.seconds = seconds % 60;
		this.minutes = (hours*3600+minutes*60+seconds) / 60 % 60;
		this.hours = (hours*3600+minutes*60+seconds) / 3600;
	}
	public Duration(int totalSeconds) {
		seconds = totalSeconds % 60;
		minutes = totalSeconds / 60 % 60;
		hours = totalSeconds / 3600;
	}
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public int getTotalSeconds() {
		return seconds + minutes * 60 + hours * 3600;
	}
	public Duration add(Duration other) {
		int totalSec = 3600*(other.hours+hours)+60*(other.minutes+minutes)+other.seconds+seconds;
		Duration d = new Duration(totalSec);
		return d;
	}
	public void increment(int secs) {
		int total = getTotalSeconds()+secs;
		Duration d = new Duration(total);
		hours = d.hours;
		minutes = d.minutes;
		seconds = d.seconds;
	}
	public boolean equals(Duration other) {
		return (other.hours==hours && other.minutes==minutes && other.seconds==seconds);
	}
	public String toString() {
		return hours + ":" + twoDigits(minutes) + ":" + twoDigits(seconds);
	}
	private static String twoDigits(int n) {
		if (n<10) {
			return "0" + n;
		} return "" + n;
	}
}
