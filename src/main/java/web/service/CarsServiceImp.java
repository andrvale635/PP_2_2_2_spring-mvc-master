package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.cars.Car;
import web.dao.CarsDAOImpl;

import java.util.List;

@Service
public class CarsServiceImp implements CarsService {
    @Autowired
    private CarsDAOImpl carsDAO;

    @Override
    public List<Car> getCar(Integer c) {
        if (c == null || c >= 5) {
            return carsDAO.getCar();
        } else {
            List<Car> list1 = carsDAO.getCar().stream().limit(c).toList();
            return list1;
        }
    }
}
