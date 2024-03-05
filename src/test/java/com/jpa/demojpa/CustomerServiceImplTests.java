package com.jpa.demojpa;

import com.jpa.demojpa.dao.CustomerRepository;
import com.jpa.demojpa.entity.Customer;
import com.jpa.demojpa.service.CustomerService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CustomerServiceImplTests {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;

    @BeforeAll
    public void initialiseTestData(){

    }
    @BeforeEach
    public void initialiseEachTestData(){

    }
    @AfterEach
    public void cleanAfterEachTestData(){

    }
    @Test
    @DisplayName(value = "add customer should create a cart")
    public void addCustomerTest(){

        Customer customer = new Customer("Ford","name@gmail.com","password123",null,null);
        customer = this.customerService.addCustomer(customer);
        Assertions.assertNotNull(customer);
        Assertions.assertNotNull(customer.getCart());
        this.customerRepository.delete(customer);
    }

    @AfterAll
    public void cleanAllTestData(){

    }
}
