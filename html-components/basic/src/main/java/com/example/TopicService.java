package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.List;
import java.util.ArrayList;

@Named
@ApplicationScoped
public class TopicService{
    public static final List<String> TOPICS = 
        List.of("Java", "Jakarta EE", "Microprofile", "Helidon",
                "Quarkus", "Micronaut");
    public List<String> getAvailableTopics(){
        return new ArrayList<>(TOPICS);
    }
}
