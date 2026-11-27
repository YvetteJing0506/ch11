public class TestDuration {
    public static void main(String[] args) {
        Duration song = new Duration(0, 3, 45);
        Duration movie = new Duration(2, 5, 9);
        Duration odd = new Duration(0, 90, 75);
        System.out.println(song);
        System.out.println(movie);
        System.out.println(odd);
        System.out.println(odd.getTotalSeconds());
        Duration both = song.add(movie);
        System.out.println(both);
        System.out.println(song);
        song.increment(20);
        System.out.println(song);
        Duration a = new Duration(3600);
        Duration b = new Duration(0, 60, 0);
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}

