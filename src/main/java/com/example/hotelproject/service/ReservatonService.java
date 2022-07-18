package com.example.hotelproject.service;

import com.example.hotelproject.models.Room;

import java.util.ArrayList;

public class ReservatonService {

    private static ReservatonService instance;

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
        this.roomList.add(new Room(1,100));
        this.roomList.add(new Room(2,110));
        this.roomList.add(new Room(3,120));
    }

    public ArrayList<Room> getAllReservation(){
        return new ArrayList<>(this.roomList);
    }
}
