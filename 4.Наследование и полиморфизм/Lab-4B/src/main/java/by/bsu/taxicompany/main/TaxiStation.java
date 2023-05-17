package by.bsu.taxicompany.main;

import by.bsu.taxicompany.carhierarchy.Car;

import java.io.IOException;
import java.util.List;

/**
 * 10.	Таксопарк. Определить иерархию легковых автомобилей.
 * Создать таксопарк. Посчитать стоимость автопарка.+
 * Провести сортировку автомобилей парка по расходу топлива.+
 * Найти автомобиль в компании, соответствующий
 * заданному диапазону параметров скорости.
 */
public class TaxiStation {
    List<Car> carPool;

    String fileAddress;

    public TaxiStation(String fileAddress) throws IOException {
        this.fileAddress = fileAddress;

        this.carPool = new CarBuilder().createCars(fileAddress);;
    }



    public List<Car> getCarPool() {
        return carPool;
    }
}
