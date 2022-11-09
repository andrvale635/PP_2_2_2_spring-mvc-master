package web.service;

import org.springframework.ui.ModelMap;
import web.cars.Car;

import java.util.List;

public interface CarsService {
    public List<Car> getCar(Integer c);
}
