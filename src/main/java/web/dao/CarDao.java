package web.dao;

import web.config.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(int count);
}
