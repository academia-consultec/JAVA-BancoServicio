package com.consultec.academy.bancoservices;

import com.consultec.academy.bancoservices.bootstrap.InitDatabase;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.sql.Connection;

@ApplicationPath("/api/v1")
public class ApplicationPathMain extends Application {
    public ApplicationPathMain() throws ClassNotFoundException {
        InitDatabase.init();
    }
}