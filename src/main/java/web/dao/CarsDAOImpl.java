package web.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CarsDAOImpl implements CarsDAO {

    @Override
    public String getCar() {
        return "cars";
    }
}
