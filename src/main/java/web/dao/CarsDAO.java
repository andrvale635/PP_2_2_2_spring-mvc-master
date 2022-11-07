package web.dao;

import org.springframework.ui.ModelMap;


public interface CarsDAO {
    public String getCar(ModelMap model, String c);
    public String getAllCars(ModelMap model);
}
