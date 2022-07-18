package com.example.hotelproject.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {

    private long yiyi;

    private long clientID;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    private ArrayList<Room> reservedRooms ;

    public Client(long id, String firstName, String lastName, LocalDate birthDate) {
        this.clientID = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.reservedRooms = new ArrayList<>();
    }
    public Client(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.reservedRooms = new ArrayList<>();
    }

    public Client() {

    }

    public ArrayList<Room> getClientRooms() {
        return reservedRooms;
    }

    public void setClientRooms(ArrayList<Room> clientRooms) {
        this.reservedRooms = clientRooms;
    }

    public long getClientID() {
        return clientID;
    }

    public void setClientID(long id) {
        this.clientID = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
