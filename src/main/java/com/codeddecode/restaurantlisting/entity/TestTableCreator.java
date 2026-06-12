package com.codeddecode.restaurantlisting.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class TestTableCreator {
/*
    @Autowired
    private JdbcTemplate jdbc;

    @PostConstruct
    public void createTestTable() {
        System.out.println(">>> Creating test table manually...");
        jdbc.execute("CREATE TABLE IF NOT EXISTS db_check (id SERIAL PRIMARY KEY, msg VARCHAR(50));");
        jdbc.execute("INSERT INTO db_check (msg) VALUES ('hello from spring');");
    }*/
}