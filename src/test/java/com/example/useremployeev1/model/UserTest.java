package com.example.useremployeev1.model;

import com.example.useremployeev1.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void testerik() {
        assertEquals(true, employeeRepository.findByName("erik").isPresent());
    }

    @Test
    void testvalidemail() {
        var obj = employeeRepository.findByName("erik").orElse(null);
        assertEquals(true, employeeRepository.findByName("erik").orElse(new Employee()).isValidEmail());
    }


}