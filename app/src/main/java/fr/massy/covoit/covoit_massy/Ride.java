package fr.massy.covoit.covoit_massy;

import java.util.ArrayList;

import exceptions.RideException;


public class Ride {

    private Time startTime;
    private int nbSeats;
    private ArrayList<User> passengers;
    private long isFull;
    private String startLocation;
    private String endLocation;
    private String comments;
    private User driver;

    public Ride(User driver, Time startTime, int nbSeats) {
        this.startTime = startTime;
        this.nbSeats = nbSeats;
        this.passengers = new ArrayList<User>();
        this.isFull = 0L;
        this.driver=driver;
        this.startLocation="Massy";
        this.endLocation="Centrale";
    }


    public void addPassenger(User user) {
        if (isFull == 1L) {
            try {
                throw new RideException("full");
            } catch (RideException e) {
                e.printStackTrace();
            }
        }
        else {
            passengers.add(user);
            if (passengers.size() == nbSeats) {
                isFull = 1L;
            }
        }
    }

    public void removePassenger(String email) {
        while(passengers.remove(email)) {};
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public int getNbSeats() {
        return nbSeats;
    }

    public void setNbSeats(int nbSeats) {
        this.nbSeats = nbSeats;
    }

    public ArrayList<User> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<User> passengers) {
        this.passengers = passengers;
    }

    public long isFull() {
        return isFull;
    }

    public void setFull(long foo) {
        isFull = foo;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    public User getDriver() {
        return driver;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void reverseRide() {
        String foo = startLocation;
        startLocation = endLocation;
        endLocation = foo;
    }

}