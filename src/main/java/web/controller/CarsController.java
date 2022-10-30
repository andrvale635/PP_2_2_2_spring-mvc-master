package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String getCar(ModelMap model, @RequestParam(value = "count", required = false) String c){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1,"BMW",12));
        cars.add(new Car(2,"Nisan",1));
        cars.add(new Car(3,"Lada",31));
        cars.add(new Car(4,"Ford",123));
        cars.add(new Car(5,"LandRover",67));
        List<Car> vivod = new ArrayList<>();

        if (c == null || Integer.parseInt(c) >= cars.size()){
            model.addAttribute("cars",cars);
        } else {
            for (int i = 0; i < Integer.parseInt(c); i++){
                vivod.add(cars.get(i));
            }
            model.addAttribute("cars",vivod);
        }
        return "cars";
    }
}

class Car {
    private int id;
    private String model;
    private int series;

    public Car(int id, String model, int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}