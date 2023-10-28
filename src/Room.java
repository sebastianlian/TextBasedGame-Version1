/*
 * Room class keeps track of rooms object and their attributes
 * Getters and setters for each attribute
 */

public class Room {

    //attributes
    private int roomID;  //room number
    //private String roomName;    //room name
    private String roomDescription; //room description
    private boolean checkedRoom;    //room visited
    private int northRoomID; //room to the north
    private int eastRoomID;  //room to the east
    private int southRoomID; //room to the south
    private int westRoomID;  //room to the west

    //Room constructor with parameters
    public Room(int roomID, boolean checkedRoom, String roomDescription, int northRoomID, int eastRoomID, int southRoomID, int westRoomID) {
        this.roomID = roomID;
        //this.roomName = String.valueOf(roomName);
        this.roomDescription = roomDescription;
        this.checkedRoom = Boolean.parseBoolean(String.valueOf(checkedRoom));
        this.northRoomID = northRoomID;
        this.eastRoomID = eastRoomID;
        this.southRoomID = southRoomID;
        this.westRoomID = westRoomID;
    }//end constructor

    //Getters and setters
    public int getRoomID() {
        return roomID;
    }//end getRoomID

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }//end setRoomID

//    public String getRoomName() {
//        return roomName;
//    }//end getRoomName
//
//    public void setRoomName(String roomName) {
//        this.roomName = roomName;
//    }//end setRoomName

    public String getRoomDescription() {
        return roomDescription;
    }//end getRoomDescription

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }//end setRoomDescription

    public boolean getCheckedRoom() {
        return checkedRoom;
    }//end getRoomVisited

    public void setCheckedRoom(boolean checkedRoom) {
        this.checkedRoom = checkedRoom;
    }//end setRoomVisited

    public int getNorthRoomID() {
        return northRoomID;
    }//end getNorthRoomID

    public void setNorthRoomID(int northRoomID) {
        this.northRoomID = northRoomID;
    }//end setNorthRoomID

    public int getEastRoomID() {
        return eastRoomID;
    }//end getEastRoomID

    public void setEastRoomID(int eastRoomID) {
        this.eastRoomID = eastRoomID;
    }//end setEastRoomID

    public int getSouthRoomID() {
        return southRoomID;
    }//end getSouthRoomID

    public void setSouthRoomID(int southRoomID) {
        this.southRoomID = southRoomID;
    }//end setSouthRoomID

    public int getWestRoomID() {
        return westRoomID;
    }//end getWestRoomID

    public void setWestRoomID(int westRoomID) {
        this.westRoomID = westRoomID;
    }//end setWestRoomID

    //toString method
    public String toString() {
        return "Room ID: " + roomID + "\n" +
               // "Room Name: " + roomName + "\n" +
                "Room Description: " + roomDescription + "\n" +
                "Checked Room: " + checkedRoom + "\n" +
                "North Room ID: " + northRoomID + "\n" +
                "East Room ID: " + eastRoomID + "\n" +
                "South Room ID: " + southRoomID + "\n" +
                "West Room ID: " + westRoomID + "\n";
    }
}//end Room class