This program is a text-based adventure game that utilizes an interactive world based upon user input to the console.
It reads the data from a text file name "Map.txt" and creates an array of rooms.
The user can move from room to room and interact with the world.

The text file has four elements per room:
1. roomID (unique identifier) assigned to each room (1-6)
2. checkedRoom (boolean value that determines if the room has been visited)
3. roomName (name of the room)
    a) 1 - Inside Safe House
    b) 2 - Outside Safe House
    c) 3 - Street
    d) 4 - Forest
    e) 5 - Abandoned Store
    f) 6 - Bridge
4. roomDescription (description of the room)

The user can move from room to room by typing in the direction they want to go.
The connections determine the possible pathways a player can take, and where they can navigate.
Room Connections are defined by the following and the map is displayed below
1. North
2. East
3. South
4. West

------------------------
|     x     |     x     |
| x   1  E  | W   6   x |
|     S     |     S     |
------------------------
|     N     |    N      |
| x   2  E  |    3    x |
|     S     |    S      |
------------------------
|     N     |    N      |
| x   4  E  |    5    x |
|     x     |    x      |
------------------------

