package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import web.dao.CarsDAOImpl;

@Service
public class CarsServiceImp implements CarsService{
    @Autowired
    private CarsDAOImpl carsDAO;

    @Override
    public String getCar(ModelMap model, String c) {
        if (c == null || Integer.parseInt(c) >= 5) {
            return carsDAO.getAllCars(model);
        } else {
            return carsDAO.getCar(model, c);
        }
    }
}
