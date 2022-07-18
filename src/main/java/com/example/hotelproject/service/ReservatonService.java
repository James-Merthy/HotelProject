package com.example.hotelproject.service;

import com.example.hotelproject.models.Room;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReservatonService {

    private static ReservatonService instance;
    private int lastID;
    private final ArrayList<Room> roomList = new ArrayList<>();

    public static ReservatonService getInstance(){
        if(instance == null){
            instance = new ReservatonService();
            return instance;
        }
        else{
            return instance;
        }
    }
    private ReservatonService(){
        this.roomList.add(new Room(1,100,
                LocalDate.of(2022,2,10),
                LocalDate.of(2022,2,15)));
        this.roomList.add(new Room(2,110,
                LocalDate.of(2022,2,14),
                LocalDate.of(2022,2,19)));
        this.roomList.add(new Room(3,120,
                LocalDate.of(2022,2,18),
                LocalDate.of(2022,2,28)));
        this.lastID=3;
    }

    public ArrayList<Room> getAllReservation(){
        return new ArrayList<>(this.roomList);
    }
    public long insert(Room toInsert){
        toInsert.setRoomID(++this.lastID);
        roomList.add(toInsert);
        return toInsert.getRoomID();
    }
}
