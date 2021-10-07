/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spdvi;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author merce
 */
public class User {
    
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthdDate;
    private String gender;
    private boolean alive;
    private int years;
    private String lifeStatus;

    public User(int id, String firstName, String lastName, LocalDate birthdDate, String gender, boolean alive) {
        
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdDate = birthdDate;
        this.gender = gender;
        this.alive = alive;
        
        if (alive) lifeStatus = "Alive";
        else lifeStatus = "Death";
        
        LocalDate ahora = LocalDate.now();
        Period period = Period.between(birthdDate, ahora);
        years = (int) period.getYears();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getBirthdDate() {
        return birthdDate;
    }

    public void setBirthdDate(LocalDate birthdDate) {
        this.birthdDate = birthdDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    @Override
    public String toString() {
        return id + ": " + lastName + ", " + firstName + " - " + years + " years old - " + gender + " - " + lifeStatus + "\ngit ";
    }
}
