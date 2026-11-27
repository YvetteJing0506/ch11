public class TestElevator {
    public static void main(String[] args) {
        Elevator lift = new Elevator(12);
        System.out.println(lift);
        System.out.println(lift.goTo(9));
        System.out.println(lift.goTo(4));
        System.out.println(lift.goTo(13));
        System.out.println(lift.goTo(4));
        System.out.println(lift);
        System.out.println(lift.getFloorsTravelled());
        lift.goTo(1);
        System.out.println(lift.getCurrentFloor() + " " + 
                           lift.getFloorsTravelled());
    }
}

