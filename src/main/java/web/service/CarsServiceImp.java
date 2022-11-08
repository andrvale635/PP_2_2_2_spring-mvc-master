package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import web.cars.Car;
import web.dao.CarsDAOImpl;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServiceImp implements CarsService{
    @Autowired
    private CarsDAOImpl carsDAO;

    private List<Car> list;

    public CarsServiceImp(){
        list = new ArrayList<>();
        list.add(new Car(1, "BMW", 12));
        list.add(new Car(2, "Nisan", 1));
        list.add(new Car(3, "Lada", 31));
        list.add(new Car(4, "Ford", 123));
        list.add(new Car(5, "LandRover", 67));
    }

/////////////////////////////////////////////////////// Version 1 ////////////////////////////////////////
//    @Override
//    public String getCar(ModelMap model, Integer c) {
//        if (c == null || c >= 5) {
//            return carsDAO.getCar(list, model);
//        } else {
//            List<Car> list1 = list.stream().limit(c).toList();
//            return carsDAO.getCar(list1, model);
//        }
//    }




/////////////////////////////////////////////////////// Version 2 ////////////////////////////////////////

    @Override
    public List<Car> getCar(Integer c) {
        if (c == null || c >= 5) {
            return list;
        } else {
            List<Car> list1 = list.stream().limit(c).toList();
            return list1;
        }
    }
}
