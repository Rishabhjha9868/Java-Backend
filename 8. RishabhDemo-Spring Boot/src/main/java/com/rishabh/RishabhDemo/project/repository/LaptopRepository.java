package com.rishabh.RishabhDemo.project.repository;

import com.rishabh.RishabhDemo.project.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop){
        System.out.println("Saved Successfully:)");
    }
}
