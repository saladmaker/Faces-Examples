package com.example;

import jakarta.inject.Named;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
@Named
public class Web{
    @Produces
    public static Sexe[] sexes(){
        return Sexe.values();
    }
}
