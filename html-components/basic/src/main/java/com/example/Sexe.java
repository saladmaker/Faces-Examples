package com.example;

import jakarta.inject.Named;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.context.ApplicationScoped;

public enum Sexe{
    MALE("Male"),
    FEMALE("Female"),
    ;
    private String label;
    private Sexe(final String label){
        this.label = label;    
    }
    public String getLabel(){
        return label;    
    }
    

}
