package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import web.cars.Car;
import web.dao.CarsDAOImpl;
import web.service.CarsServiceImp;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    @Autowired
    private CarsServiceImp carsServiceImp;

    @Autowired
    private CarsDAOImpl carsDAO;

//    private List<Car> list;
//
//    public CarsController(){
//        list = new ArrayList<>();
//        list.add(new Car(1, "BMW", 12));
//        list.add(new Car(2, "Nisan", 1));
//        list.add(new Car(3, "Lada", 31));
//        list.add(new Car(4, "Ford", 123));
//        list.add(new Car(5, "LandRover", 67));
//    }


/////////////////////////////////////////////////////// Version 1 ////////////////////////////////////////
//    @GetMapping(value = "/cars")
//    public String getCar(ModelMap model, @RequestParam(value = "count", required = false) Integer c){
//        return carsServiceImp.getCar(model, c);
//    }


    /////////////////////////////////////////////////////// Version 2 ////////////////////////////////////////
//    @GetMapping(value = "/cars")
//    public String getCar(ModelMap model, @RequestParam(value = "count", required = false) Integer c){
//        model.addAttribute("cars", carsServiceImp.getCar(c));
//        return "cars";
//    }

    /////////////////////////////////////////////////////// Version 3 ////////////////////////////////////////
    @GetMapping(value = "/cars")
    public String getCar(ModelMap model, @RequestParam(value = "count", required = false) Integer c){
        model.addAttribute("cars", carsServiceImp.getCar(c));
        return carsDAO.getCar();
    }
}
