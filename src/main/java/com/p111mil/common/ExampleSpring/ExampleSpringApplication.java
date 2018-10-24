package com.p111mil.common.ExampleSpring;

import com.p111mil.common.ExampleSpring.dao.ICustomerDAO;
import com.p111mil.common.ExampleSpring.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ExampleSpringApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ExampleSpringApplication.class, args);
        ApplicationContext context
                = new ClassPathXmlApplicationContext("Spring-Module.xml");

        ICustomerDAO customerDAO = (ICustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer(3, "mkyong", 28);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1);
    }
}
