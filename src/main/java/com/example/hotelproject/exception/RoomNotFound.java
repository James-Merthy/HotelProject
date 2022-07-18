package com.example.hotelproject.exception;

public class RoomNotFound extends RuntimeException{
    private int id;

    public RoomNotFound(int id) {
        super("la room d'id {"+ id+ "} n'a pas pu être trouvé");
        this.id = id;
    }
    public long getId(){
        return id;
    }
}
