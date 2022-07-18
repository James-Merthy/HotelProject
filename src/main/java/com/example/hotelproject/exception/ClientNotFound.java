package com.example.hotelproject.exception;

public class ClientNotFound extends RuntimeException{
    private int id;

    public ClientNotFound(int id) {
        super("le client d'id {"+ id+ "} n'a pas pu être trouvé");
        this.id = id;
    }
    public long getId(){
        return id;
    }
}
