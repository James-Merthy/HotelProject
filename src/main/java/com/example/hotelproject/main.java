package com.example.hotelproject;

import com.example.hotelproject.models.Client;
import com.example.hotelproject.models.Room;
import com.example.hotelproject.service.ReservatonService;

import javax.persistence.*;
import javax.swing.text.html.parser.Entity;
import java.time.LocalDate;


public class main {

    public static void main(String[] args) throws Exception{
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hotel-jpa");
        EntityManager manager = factory.createEntityManager();


        //ReservatonService service = new ReservatonService();




        Client client1 = new Client("jean", "francois", LocalDate.of(1992,12,22));
        Client client2 = new Client("pierre", "paul", LocalDate.of(1992,12,22));
        Client client3 = new Client("max", "man", LocalDate.of(1992,12,22));

        Room room1 = new Room(2501, LocalDate.of(2022,07,22),  LocalDate.of(2022,07,23) );



        manager.getTransaction().begin();

        manager.merge(room1);
        manager.merge(client1);
        manager.merge(client2);
        manager.merge(client3);

        client1.getReservedRooms().add(room1);


        manager.getTransaction().commit();
        factory.close();



    }

}
