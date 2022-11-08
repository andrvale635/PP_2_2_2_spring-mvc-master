package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;

import web.cars.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDAOImpl implements CarsDAO {
    /////////////////////////////////////////////////////// Version 1 ////////////////////////////////////////
//    @Override
//    public String getCar(List<Car> list, ModelMap model) {
//        model.addAttribute("cars", list);
//        return "cars";
//    }


    /////////////////////////////////////////////////////// Version 3 ////////////////////////////////////////
    @Override
    public String getCar() {
        return "cars";
    }
}
