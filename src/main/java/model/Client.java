package model;

import java.time.LocalDate;

public class Client {
    private long clientID;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Client(long id, String firstName, String lastName, LocalDate birthDate) {
        this.clientID = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
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
