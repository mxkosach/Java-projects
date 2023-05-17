package by.bsu.lab3a._main;

import by.bsu.lab3a.action.TrainOperator;
import by.bsu.lab3a.entity.Train;
import by.bsu.lab3a.reader.HardCodeDataReader;

public class Main {
    public static void main(String[] args) {
        Train[] trains = HardCodeDataReader.generateAndGetTrain();
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
        TrainOperator trainOperator = new TrainOperator();
        trainOperator.printTrainByDestination(trains);
        trainOperator.printTrainByDestinationAndAfterHour(trains);
        trainOperator.printTrainByDestinationWithGeneralSeats(trains);


    }
}
