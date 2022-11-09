package web.dao;

import org.springframework.ui.ModelMap;
import web.cars.Car;

import java.util.List;


public interface CarsDAO {
//    public String getCar(List<Car> list, ModelMap model);
    public List<Car> getCar();
//    public String getAllCars(List<Car> list,ModelMap model);
}
