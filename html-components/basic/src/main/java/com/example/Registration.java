package com.example;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.List;
import java.util.ArrayList;

@RequestScoped
@Named
public class Registration{
   private String userName;
   private String phoneNumber;
   private String email;
   private Sexe sexe;
   private boolean agreedToTerms = false;
   private String password;
   private List<String> topics = new ArrayList<>();
   public String submit(){
        return "result";    
   }
    public Sexe getSexe() {
        return sexe;
    }
    public void setSexe(Sexe Sexe) {
        this.sexe = Sexe;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public boolean isAgreedToTerms() {
        return agreedToTerms;
    }

    public void setAgreedToTerms(boolean agreedToTerms) {
        this.agreedToTerms = agreedToTerms;
    }
    public String getPassword(){
        return password;  
    }
    public void setPassword(final String password){
        this.password = password;
    }

}
