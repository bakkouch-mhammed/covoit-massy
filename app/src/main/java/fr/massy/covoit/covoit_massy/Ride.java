package fr.massy.covoit.covoit_massy;

import java.util.ArrayList;

import exceptions.RideException;


public class Ride {

    private Time startTime;
    private int nbSeats;
    private ArrayList<User> passengers;
    private boolean isFull;
    private String startLocation;
    private String endLocation;
    private String comments;

    public Ride(Time startTime, int nbSeats) {
        this.startTime = startTime;
        this.nbSeats = nbSeats;
    }


    public void addPassenger(User user) {
        if (isFull) {
            try {
                throw new RideException("full");
            } catch (RideException e) {
                e.printStackTrace();
            }
        }
        else {
            passengers.add(user);
            if (passengers.size() == nbSeats) {
                isFull = true;
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

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
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