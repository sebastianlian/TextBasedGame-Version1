import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//This class represents the map of the game. It contains an array of rooms and the current room.
//It also contains a method to retrieve the map from a text file.

public class Map {
    public static void main(String[] args) {
        File mapFile = new File("Map.txt"); //file containing map
        List<Room> allRooms = retrieveMap(mapFile); //retrieve map from file
        //startGame(allRooms);
    }

    public static List<Room> retrieveMap(File mapFile) {
        List<Room> allRooms = new ArrayList<>();

        int roomID;
        Room room;

        //try-with-resources block to read in map file
        try (BufferedReader br = new BufferedReader(new FileReader(mapFile))) {
            String line;
            while ((line = br.readLine()) != null) { //while there is still a line to read
                String[] tokens = line.split("~"); //split line into tokens
                //if (tokens.length == 8) {
                    roomID = Integer.parseInt(tokens[0]);
                    boolean checkedRoom = Boolean.parseBoolean(tokens[1]); //convert string to boolean
                    //String roomName = tokens[2];
                    String roomDescription = tokens[2];

                    String[] navigation = tokens[3].split(","); //split navigation into tokens
                    int northRoomID = Integer.parseInt(navigation[0]);
                    int eastRoomID = Integer.parseInt(navigation[1]);
                    int southRoomID = Integer.parseInt(navigation[2]);
                    int westRoomID = Integer.parseInt(navigation[3]);

                    room = new Room(roomID, checkedRoom, roomDescription, northRoomID, eastRoomID, southRoomID, westRoomID);
                    allRooms.add(room); //add room to list of rooms
                }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return allRooms;
    }
}