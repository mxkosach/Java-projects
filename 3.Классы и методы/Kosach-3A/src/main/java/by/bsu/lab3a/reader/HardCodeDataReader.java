package by.bsu.lab3a.reader;

import by.bsu.lab3a.entity.Train;

import java.time.LocalTime;

public class HardCodeDataReader {
    public static Train[] generateAndGetTrain() {
        int n = 10;
        Train[] trains = new Train[n];
        trains[0] = new Train("Брест", 150, LocalTime.of(10, 20), 50, 10, 100, 0);
        trains[1] = new Train("Минск", 240, LocalTime.of(17, 30), 50, 10, 100, 5);
        trains[2] = new Train("Москва", 970, LocalTime.of(5, 0), 50, 10, 0, 3);
        trains[3] = new Train("Киев", 108, LocalTime.of(10, 30), 50, 10, 75, 10);
        trains[4] = new Train("Адлер", 645, LocalTime.of(23, 50), 50, 10, 95, 8);
        trains[5] = new Train("Владивосток", 444, LocalTime.of(8, 45), 50, 10, 50, 6);
        trains[6] = new Train("Гомель", 821, LocalTime.of(16, 10), 50, 10, 80, 3);
        trains[7] = new Train("Вильнюс", 360, LocalTime.of(11, 55), 50, 10, 0, 0);
        trains[8] = new Train("Минск", 248, LocalTime.of(19, 25), 50, 10, 100, 0);
        trains[9] = new Train("Волковыск", 600, LocalTime.of(20, 30), 50, 10, 100, 0);
    return trains;
    }
}
