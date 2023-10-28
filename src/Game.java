import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Player player; //retrieves player location
    private static List<Room> rooms; //retrieves all rooms


    public Game(List<Room> allRooms) {
        player = new Player(1); // set to first room
        rooms = allRooms; //set to all rooms
    }//end constructor

    public void startGame() { //start game
        Scanner in = new Scanner(System.in); //scanner for user input

        System.out.println("Welcome to the game! This game is set in a dystopian future where you fighting for survival.");

        //while loop to keep game running
        while (true) {
            Room currentRoom = rooms.get(Player.getLocation() - 1);
            System.out.println("You are in " + currentRoom.getRoomDescription());

            if (currentRoom.getCheckedRoom()) { //if room has been checked
                System.out.println("This room looks familiar...");
            } else {
                currentRoom.setCheckedRoom(true);
            }//end if-else

            System.out.println("Which direction would you like to go? (N, E, S, W, or QUIT to exit.");
            String navigation = in.nextLine();

            if (navigation.equals("QUIT")) {
                System.out.println("See you next time!");
                break;
            }

            //switch statement to move player
            switch (navigation) {
                case "N", "n" -> move(player, currentRoom.getNorthRoomID());
                case "E", "e" -> move(player, currentRoom.getEastRoomID());
                case "S", "s" -> move(player, currentRoom.getSouthRoomID());
                case "W", "w" -> move(player, currentRoom.getWestRoomID());
                default -> System.out.println("Woah! You cannot go that way.");
            }//end switch
        }//end while
    }//end startGame

    //method to move player
    private void move(Player player, int nextRoom) {
        if (nextRoom != 0) {
            player.setLocation(nextRoom);
        } else {
            System.out.println("You cannot go that way.");
        }//end move
    }//end Game

    public static void main(String[] args) {
        // Create an instance of the Map class
        Map map = new Map();

        // Retrieve the map from the Map class
        List<Room> allRooms = map.retrieveMap(new File("Map.txt"));

        // Create an instance of the Game class and start the game with the retrieved map
        Game game = new Game(allRooms);
        game.startGame();
    }//end main
}//end Game