package web.dao;

import org.springframework.stereotype.Repository;

import web.cars.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDAOImpl implements CarsDAO {


    private List<Car> list;

    public CarsDAOImpl() {
        list = new ArrayList<>();
        list.add(new Car(1, "BMW", 12));
        list.add(new Car(2, "Nisan", 1));
        list.add(new Car(3, "Lada", 31));
        list.add(new Car(4, "Ford", 123));
        list.add(new Car(5, "LandRover", 67));
    }

    @Override
    public List<Car> getCar() {
        return list;
    }
}
