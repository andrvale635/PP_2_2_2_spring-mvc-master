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

    @GetMapping(value = "/cars")
    public String getCar(ModelMap model, @RequestParam(value = "count", required = false) Integer c){
        model.addAttribute("cars", carsServiceImp.getCar(c));
        return carsDAO.getCar();
    }
}
