package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;

import web.cars.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDAOImpl implements CarsDAO {
    @Override
    public String getCar(ModelMap model, String c) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 12));
        cars.add(new Car(2, "Nisan", 1));
        cars.add(new Car(3, "Lada", 31));
        cars.add(new Car(4, "Ford", 123));
        cars.add(new Car(5, "LandRover", 67));
        List<Car> vivod = new ArrayList<>();

        if (c == null || Integer.parseInt(c) >= cars.size()) {
            model.addAttribute("cars", cars);
        } else {
            for (int i = 0; i < Integer.parseInt(c); i++) {
                vivod.add(cars.get(i));
            }
            model.addAttribute("cars", vivod);
        }
        return "cars";

    }
}
