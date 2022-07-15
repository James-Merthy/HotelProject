package com.example.hotelproject.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String hotelName ;
    private ArrayList<Room> allRooms ;
    private ArrayList<Client> allClients;
    // Le client + l'ID de la room déjà réservé.

    public Hotel(String hotelName) {

        this.hotelName = hotelName;
        //#region this.rooms =  new ArrayList<Room>();
        this.allRooms =  new ArrayList<>();
        allRooms.add(new Room(1,100));
        allRooms.add(new Room(2,110));
        allRooms.add(new Room(3,120));
        allRooms.add(new Room(4,90));
        allRooms.add(new Room(5,130));
        //#endregion
        this.allClients = new ArrayList<>();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public ArrayList<Room> getAllRooms() {
        return allRooms;
    }

    public void setAllRooms(ArrayList<Room> allRooms) {
        this.allRooms = allRooms;
    }

    public ArrayList<Client> getAllClients() {
        return allClients;
    }

    public void setAllClients(ArrayList<Client> allClients) {
        this.allClients = allClients;
    }

    public ArrayList<Room> getAvailableRooms(){
        ArrayList<Room> availableRooms = new ArrayList<>();
        for (Client clients : allClients){
            for ( Room rooms : clients.getClientRooms()){
                if(!rooms.isReserved()){
                    availableRooms.add(rooms);
                }
            }
        }
        return availableRooms;
    }
}
