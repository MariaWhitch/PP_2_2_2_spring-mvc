package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList;
        {
            carList = new ArrayList<>();
            carList.add(new Car("Mazda", "6", "black"));
            carList.add(new Car("Volvo", "S", "gray"));
            carList.add(new Car("Mercedes", "R", "blue"));
            carList.add(new Car("BMW", "320i", "dark"));
            carList.add(new Car("Opel", "Astra", "white"));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
        }
    }





