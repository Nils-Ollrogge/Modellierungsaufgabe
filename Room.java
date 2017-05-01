public class Room {
    
    private static int roomCount;             //total number of created rooms
    
    private int ID;                           //ID of this room
    private ArrayList<int> adjacentRooms;     //array of IDs of all adjacent rooms
    private HashMap<String, Putable> content; //HashMap of Objects/Living things in this room
    private String name;
    private int floor;
    
    

    /*  ++++++++++ CONSTRUCTORS ++++++++++  */

    
    public Room(String name) {
        
        ID = roomCount;
        roomCount++;
        content = new HashMap<>();
        this.name = name;
        
    }
    
    public Room(String name, HashMap<String, Putable> content) {
        
        Room(name);
        
        for (Putable item: content) {
            
            this.place(item);   
            
        }
        
    }
    
    

     /*  ++++++++++  GETTER  ++++++++++  */

    
    public int getRoomID() {
        
        return this.roomID;
        
    }
    
    public Room[] getAdjacents() {
        
        return this.adjacentRooms;
        
    }
    
    public String getName() {
        
        return this.name;
        
    }
    
    public int countRooms() {
        
        return this.roomCount;
        
    }
    
    
    /*  ++++++++++ SETTER ++++++++++ */
    
    public void setName(String name) {
        
        this.name = name;
    
    }
    
    public void addAdjacent(Room newAdjacent) {
    
        if (!this.adjacentRooms.contains(newAdjacent.ID)) {
            this.adjacentRooms.add(newAdjacent.ID);
        }
    
    }
    
    public void removeAdjacent(Room delAdjacent) {
    
        if (this.adjacentRooms.contains(delAdjacent.ID)) {
            this.adjacentRooms.remove(delAdjacent.ID);
        }
    
    }
    
    
    /*  ++++++++++ INTERACTION ++++++++++ */
    
    public void place(Putable item) {
        
        this.content.put(item.name, item);
        
    }
    
    public void takeOut(Putable item) {
        
        this.content.remove(item.name, item);
        
    }
    
    private void enter() {
        System.out.println(this.name + " betreten.");
    }
    
    private void leave() {
        System.out.println(this.name + " verlassen.");
    }
    
    public goTo(Room nextRoom) {
    
        if (adjcentRooms.contains(nextRoom.ID)) {
            
            if (nextRoom is AccessRoom) {
            
                System.out.println("Der Raum ist gesichert. Für den Zugang wird das Passwort benötigt!");                
            
            } else {
            
                this.leave();
                nextRoom.enter();
            
            }
        
        } else {
        
            System.out.println("Du kannst diesen Raum nicht von hier aus betreten. Die beiden Räume sind nicht benachbart.");
        
        }
    
    }
    
    public goTo(Room nextRoom, String key) {
    
        if (adjcentRooms.contains(nextRoom.ID)) {
            
            if (nextRoom is AccessRoom) {
            
                if (nextRoom.keyPad.getAccess(key)) {
                    
                    this.leave();
                    nextRoom.enter(key);
                
                } else {
                
                    System.out.println("Zugang verweigert. Falsches Passwort.");
                
                }
            
            } else {
            
                this.leave();
                nextRoom.enter();
            
            }
        
        } else {
        
            System.out.println("Du kannst diesen Raum nicht von hier aus betreten. Die beiden Räume sind nicht benachbart.");
        
        }
    
    }
    
}
