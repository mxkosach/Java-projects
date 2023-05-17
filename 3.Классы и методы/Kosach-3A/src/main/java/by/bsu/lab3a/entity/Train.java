package by.bsu.lab3a.entity;

import by.bsu.lab3a.util.IdGenerator;

import java.time.LocalTime;

public class Train {
    private final long id;
    private String destination;
    private int trainNumber;
    private LocalTime departureTime;
    private int numberOfOpenCarriage;
    private int numberOfCompartments;
    private int numberOfGeneral;
    private int numberOfLux;

    public Train(long id) {
        this.id = id;
    }

    public Train(String destination, int trainNumber, LocalTime departureTime, int numberOfOpenCarriage, int numberOfCompartments, int numberOfGeneral, int numberOfLux) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.numberOfOpenCarriage = numberOfOpenCarriage;
        this.numberOfCompartments = numberOfCompartments;
        this.numberOfGeneral = numberOfGeneral;
        this.numberOfLux = numberOfLux;
        this.id = IdGenerator.getTrainId();
    }

    public Train(long id, String destination, int trainNumber, LocalTime departureTime, int numberOfOpenCarriage, int numberOfCompartments, int numberOfGeneral, int numberOfLux) {
        this.id = id;
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.numberOfOpenCarriage = numberOfOpenCarriage;
        this.numberOfCompartments = numberOfCompartments;
        this.numberOfGeneral = numberOfGeneral;
        this.numberOfLux = numberOfLux;
    }

    public long getId() {
        return id;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getNumberOfOpenCarriage() {
        return numberOfOpenCarriage;
    }

    public void setNumberOfOpenCarriage(int numberOfOpenCarriage) {
        this.numberOfOpenCarriage = numberOfOpenCarriage;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }

    public int getNumberOfGeneral() {
        return numberOfGeneral;
    }

    public void setNumberOfGeneral(int numberOfGeneral) {
        this.numberOfGeneral = numberOfGeneral;
    }

    public int getNumberOfLux() {
        return numberOfLux;
    }

    public void setNumberOfLux(int numberOfLux) {
        this.numberOfLux = numberOfLux;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                ", numberOfOpenCarriage=" + numberOfOpenCarriage +
                ", numberOfCompartments=" + numberOfCompartments +
                ", numberOfGeneral=" + numberOfGeneral +
                ", numberOfLux=" + numberOfLux +
                '}';
    }
}