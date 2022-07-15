package model;

public class Room {

    private long roomID;
    private boolean reserved;
    private int price;

    public Room(long roomID, int price) {
        this.roomID = roomID;
        this.price = price;
        this.reserved = false;
    }

    public long getRoomID() {
        return roomID;
    }

    public void setRoomID(long roomID) {
        this.roomID = roomID;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
