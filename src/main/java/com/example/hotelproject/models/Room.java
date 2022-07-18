package com.example.hotelproject.models;

import java.time.LocalDate;

public class Room {

    private long roomID;
    private boolean reserved;
    private long price;

    private LocalDate enterDate;
    private LocalDate exitDate;

    public Room(long roomID, int price, LocalDate enterDate, LocalDate exitDate) {
        this.roomID = roomID;
        this.price = price;
        this.enterDate = enterDate;
        this.exitDate = exitDate;
        this.reserved = false;
    }
    public Room( long price, LocalDate enterDate, LocalDate exitDate) {
        this.price = price;
        this.enterDate = enterDate;
        this.exitDate = exitDate;
        this.reserved = false;
    }


    public Room(long roomID, int price) {
        this.roomID = roomID;
        this.price = price;
        this.reserved = false;
    }

    public LocalDate getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(LocalDate enterDate) {
        this.enterDate = enterDate;
    }

    public LocalDate getExitDate() {
        return exitDate;
    }

    public void setExitDate(LocalDate exitDate) {
        this.exitDate = exitDate;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
