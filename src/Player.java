public class Player {
    private static int location; //retrieves player location

    public Player(int location) {
        this.location = location;
    }

    public static int getLocation() {
        return location;
    }

    public Room setLocation(int location) {
        this.location = location;
        return null;
    }
}//end Player