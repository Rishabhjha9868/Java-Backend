package com.rishabh.RishabhDemo.project.service;

import com.rishabh.RishabhDemo.project.model.Laptop;
import com.rishabh.RishabhDemo.project.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {
    @Autowired
    LaptopRepository laptopRepository;
    public void save(Laptop laptop){
        laptopRepository.save(laptop);
    }


    public boolean isGoodForPrograming(Laptop laptop) {
       return true;
    }
}
