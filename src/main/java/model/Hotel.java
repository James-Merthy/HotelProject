package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hotel {

    private int hihi;
    private int roomCounter;
    private String hotelName ;
    private ArrayList<Room> rooms ;

    // Le client + l'ID de la room déjà réservé.
    private HashMap<Client,Long> reservations ;

    public Hotel(String hotelName) {
        this.roomCounter=0;
        this.hotelName = hotelName;
        //#region this.rooms =  new ArrayList<Room>();
        this.rooms =  new ArrayList<>();
        rooms.add(new Room(1,100));
        rooms.add(new Room(2,110));
        rooms.add(new Room(3,120));
        rooms.add(new Room(4,90));
        rooms.add(new Room(5,130));
        //#endregion
        this.reservations = new HashMap<>();
    }

    public int getRoomCounter() {
        return roomCounter;
    }

    public void setRoomCounter(int roomCounter) {
        this.roomCounter = roomCounter;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public HashMap<Client, Long> getReservations() {
        return reservations;
    }

    public void setReservations(HashMap<Client, Long> reservations) {
        this.reservations = reservations;
    }
    public void makeReservation(Client client, long roomId){
        this.reservations.put(client,roomId);
    }
    public ArrayList<Room> getAvailableRooms(){
        ArrayList<Room> dispoRooms = new ArrayList<>();

        for (Room room : this.rooms) {
            if (this.reservations.containsValue(room.getRoomID())) {
                this.roomCounter++;
            } else {
                dispoRooms.add(room);
            }
        }


        return dispoRooms;
    }
}
