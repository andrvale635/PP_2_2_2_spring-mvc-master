package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarsService;
import web.service.CarsServiceImp;


@Controller
public class CarsController {

    @Autowired
    private CarsService carsServiceImp = new CarsServiceImp();

    @GetMapping(value = "/cars")
    public String getCar(ModelMap model, @RequestParam(value = "count", required = false) Integer c) {
        model.addAttribute("cars", carsServiceImp.getCar(c));
        return "cars";
    }

}
