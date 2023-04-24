package HW9;

import java.util.ArrayList;
import java.util.Random;

public class GeneratorCar {
    public static ArrayList<Car> carsGenerete
            (int amountCar,
             double mileageStart,
             double mileageFinished,
             double priceStart,
             double priceFinished,
             int yearStart,
             int yearEnd) {
        int count = 0;
        Random r = new Random();
        double randomPrice = 0.0;
        double randomMileage = 0.0;
        int randomYear = 0;
        int brandRandon = 0;
        ArrayList<Car> carsGenerated = new ArrayList<>();
        while (count++ < amountCar) {

            randomPrice = Math.round(priceStart + r.nextDouble(priceFinished - priceStart) * 100.0 / 100.0);
            randomMileage = Math.round(mileageStart + r.nextDouble(mileageFinished - mileageStart) * 100.0 / 100.0);
            randomYear = (int) Math.floor(Math.random() * (yearEnd - yearStart + 1) + yearStart);
            brandRandon = r.nextInt(Brand.values().length);
            Car randCar = new Car(Brand.values()[brandRandon], randomYear, randomMileage, randomPrice);
            carsGenerated.add(randCar);

        }
        return carsGenerated;
    }
}
