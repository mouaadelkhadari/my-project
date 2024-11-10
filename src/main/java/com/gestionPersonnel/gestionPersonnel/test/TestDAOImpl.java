package com.gestionPersonnel.gestionPersonnel.test;

import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl implements TestDAO{

    @Override
    public String message() {
        return "Operation completed successfully!";
    }
}
