import java.util.Arrays;
public class Duration {
	
	private int hours, minutes, seconds;
	
	public Duration(int hours, int minutes, int seconds) {
		this.seconds = seconds%60;
		this.minutes = (hours*3600+minutes*60+seconds)/60%60;
		this.hours = (hours*3600+minutes*60+seconds)/3600;
	}
	public Duration(int totalSeconds) {
		seconds = totalSeconds % 60;
		minutes = totalSeconds / 60;
		hours = totalSeconds / 3600;
	}
	public int getHours() {
		return hours;
	}
	public int getminutes() {
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
		int s = hours*3600+minutes*60+seconds+secs;
		seconds = s % 60;
		minutes = s / 60;
		hours = s / 3600;
	}
	public boolean equals(Duration other) {
		return (other.hours==hours && other.minutes==minutes && other.seconds==seconds);
	}
	public String toString() {
		int[] M = twoDigits(minutes);
		int[] S = twoDigits(seconds);
		return hours + ":" + M[0] + M[1] + ":" + S[0] + S[1];
	}
	private static int[] twoDigits(int n) {
		int[] N = new int[2];
		if (n >= 10) {
			N[0] = n % 10;
			N[1] = n / 10;
		} N[1] = n;
		return N;
	}
}
