package car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        for (Car car : cars) {
            report.append(getCarReport(car));
            report.append("\n");
        }

        return report.toString();
    }

    private String getCarReport(Car car) {
        return car.getName() + " : " + (int) car.getChargeQuantity() + "리터";
    }
}
