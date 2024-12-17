package web.config;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Chevrolet", "Malibu", 2017));
        cars.add(new Car("Toyota", "Camry", 2018));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2020));
        cars.add(new Car("Nissan", "Altima", 2021));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
