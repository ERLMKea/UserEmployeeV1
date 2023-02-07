package com.example.useremployeev1.config;

import com.example.useremployeev1.model.Employee;
import com.example.useremployeev1.model.User;
import com.example.useremployeev1.repository.EmployeeRepository;
import com.example.useremployeev1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        if (13>4) {

            User usr = new User();
            usr.setEmail("erik@gmail.com");
            usr.setPassword("xxx");
            userRepository.save(usr);

            Employee emp = new Employee();
            emp.setName("erik");
            emp.setBorn(LocalDateTime.of(2001, 9, 10, 10, 10));
            emp.setUser(usr);

            employeeRepository.save(emp);

        }
    }
}
