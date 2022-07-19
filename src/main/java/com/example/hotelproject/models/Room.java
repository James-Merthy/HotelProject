package com.example.hotelproject.models;

import java.time.LocalDate;
import lombok.*;
import org.hibernate.annotations.SQLInsert;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id", nullable = false )
    private int roomID;
    @Column(name = "reserved", nullable = false)
    private int reserved;
    @Column(name = "price", nullable = false)
    private int price;
    @Column(name = "enterDate", nullable = false)
    private LocalDate enterDate;
    @Column(name = "existDate", nullable = false)
    private LocalDate exitDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;



    public Room(int roomID, int price, LocalDate enterDate, LocalDate exitDate) {
        this.roomID = roomID;
        this.price = price;
        this.enterDate = enterDate;
        this.exitDate = exitDate;
        this.reserved = 0;
    }

    public Room(int price, LocalDate enterDate, LocalDate exitDate) {

        this.price = price;
        this.enterDate = enterDate;
        this.exitDate = exitDate;
        this.reserved = 0;

    }
    public Room(int roomID, int price) {
        this.roomID = roomID;
        this.price = price;
        this.reserved = 0;
    }

}