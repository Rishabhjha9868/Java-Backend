package com.rishabh.RishabhDemo.project;

import com.rishabh.RishabhDemo.project.model.Alien;
import com.rishabh.RishabhDemo.project.model.Laptop;
import com.rishabh.RishabhDemo.project.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import static org.springframework.stereotype.Service.*;

@SpringBootApplication
public class
RishabhDemoProjectApplication {

	public static void main(String[] args) {

       ApplicationContext context= SpringApplication.run(RishabhDemoProjectApplication.class, args);

       LaptopService service = context.getBean(LaptopService.class);


       Laptop laptop = context.getBean(Laptop.class);
        service.save(laptop);

	}

}
