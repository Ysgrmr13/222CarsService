package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Car;
import web.config.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String listCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars;
        if (count != null) {
            cars = carService.getCars(count);
        } else {
            cars = carService.getCars(5); // По умолчанию возвращаем все машины
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
