package com.example.iivote;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Personn {
    @Id
    @GeneratedValue
    private Long id;
    private String userNem;
    private String email;
    private int phoneNumber;

    public Personn(String userNem, String email, int phoneNumber) {
        this.userNem = userNem;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//    We made an empty Constructor because SPRINGBOOT likes it this way.
    public Personn() {

    }

    public String getUserNem() {
        return userNem;
    }

    public void setUserNem(String userNem) {
        this.userNem = userNem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Personn{" +
                "id=" + id +
                ", userNem='" + userNem + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
