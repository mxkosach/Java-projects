package by.bsu.lab3a.action;

import by.bsu.lab3a.entity.Train;
import by.bsu.lab3a.reader.ConsoleReader;

public class TrainOperator {
    boolean flag = false;

    public void printTrainByDestination(Train train[]) {
        System.out.println("a) Список поездов, следующих до заданного пункта назначения\nInput the destination:");
        String destination = ConsoleReader.readStringFromConsole();
        for (int i = 0; i < train.length; i++) {
            if (train[i].getDestination().equals(destination)) {
                System.out.println(train[i]);
                flag = true;
            }
        }
        if (!flag)
            System.out.println("No such trains.");
    }

    public void printTrainByDestinationAndAfterHour(Train train[]) {
        System.out.println("b) Список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа\nInput the destination:");
        String destination = ConsoleReader.readStringFromConsole();
        System.out.println("Input the hour of arriving:");
        int hour = ConsoleReader.readNumberFromConsole();
        flag = false;
        for (int i = 0; i < train.length; i++) {
            if (train[i].getDestination().equals(destination) && train[i].getDepartureTime().getHour() >= hour) {
                System.out.println(train[i]);
                flag = true;
            }
        }
        if (!flag)
            System.out.println("No such trains.");
    }

    public void printTrainByDestinationWithGeneralSeats(Train train[]) {
        System.out.println("c) Список поездов, отправляющихся до заданного пункта назначения и имеющих общие места\nInput the destination:");
        String destination = ConsoleReader.readStringFromConsole();
        flag = false;
        for (int i = 0; i < train.length; i++) {
            if (train[i].getDestination().equals(destination) && train[i].getNumberOfGeneral() > 0) {
                System.out.println(train[i]);
                flag = true;
            }
        }
        if (!flag)
            System.out.println("No such trains.");
    }
}
