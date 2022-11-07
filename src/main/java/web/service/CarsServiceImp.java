package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import web.dao.CarsDAOImpl;

@Service
public class CarsServiceImp implements CarsService{
    @Autowired
    CarsDAOImpl carsDAO;

    @Override
    public String getCar(ModelMap model, String c) {
        return carsDAO.getCar(model, c);
    }
}
