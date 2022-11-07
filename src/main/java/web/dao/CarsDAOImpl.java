package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;

import web.cars.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDAOImpl implements CarsDAO {

    private List<Car> list = new ArrayList<>();

    public CarsDAOImpl(){
        list.add(new Car(1, "BMW", 12));
        list.add(new Car(2, "Nisan", 1));
        list.add(new Car(3, "Lada", 31));
        list.add(new Car(4, "Ford", 123));
        list.add(new Car(5, "LandRover", 67));
    }

    @Override
    public String getCar(ModelMap model, String c) {
        List<Car> vivod = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(c); i++) {
                vivod.add(list.get(i));
            }
        model.addAttribute("cars", vivod);
        return "cars";
    }

    public String getAllCars(ModelMap model){
        model.addAttribute("cars", list);
        return "cars";
    }
}
