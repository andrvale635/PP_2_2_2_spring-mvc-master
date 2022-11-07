package web.service;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

public interface CarsService {
    public String getCar(ModelMap model, @RequestParam(value = "count", required = false) String c);
}
