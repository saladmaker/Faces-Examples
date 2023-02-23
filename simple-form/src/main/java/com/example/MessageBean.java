package com.example;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped
@Named
public class MessageBean{
   private String message;
   public String getGreet(){
     return "hello "+message;
   }
   public void setMessage(final String message){
     this.message = message;
   }
   public String getMessage(){
     return message;
   }
   public void submit(){}

}
