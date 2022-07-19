package com.example.hotelproject.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false)
    private int clientID;
    @Column(name = "client_name", nullable = false)

    private String firstName;
    @Column(name = "client_surname", nullable = false)

    private String lastName;
    @Column(name = "birthDate", nullable = false)
    private LocalDate birthDate;

    @OneToMany(mappedBy = "client")
    private Set<Room> reservedRooms = new LinkedHashSet<>();

    public Client(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

}
