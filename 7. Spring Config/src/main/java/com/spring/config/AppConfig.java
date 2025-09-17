package com.spring.config;

import com.spring.NewStudent;
import com.spring.School;
import com.spring.Student;
import com.spring.TopperStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan("com.spring")
public class AppConfig {



//    @Bean()
//    public Student student(@Qualifier("newStudent")   @Autowired School school){
//        Student obj = new Student();
//        obj.setMarks(50);
//        obj.setName("Rishabh Jha");
//        obj.setrNo(12);
////        obj.setSchool(topperStudent());
//        obj.setSchool(topperStudent());
//        return obj;
//
//    }
//
////    @Bean(name = {"com1","topperStudent","classTopper"})
////    @Scope("prototype")
//    @Bean
//    @Primary
//    public TopperStudent topperStudent(){
//        return new TopperStudent();
//    }
//
//    @Bean
//    public NewStudent newStudent(){
//        return new NewStudent();
//    }

}
