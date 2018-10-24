/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.p111mil.common.ExampleSpring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.p111mil.common.ExampleSpring.model.Customer;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruben
 */
public class FileCustomerDAO implements ICustomerDAO {

    
    public void insert(Customer customer) {
        String str = customer.getName();
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write(str);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FileCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Customer findByCustomerId(int custId) {
        return new Customer(1, "pepe", 1);
    }

}
