package web.dao;

import org.springframework.stereotype.Repository;
import web.config.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("Chevrolet", "Malibu", 2017));
        cars.add(new Car("Toyota", "Camry", 2018));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2020));
        cars.add(new Car("Nissan", "Altima", 2021));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
