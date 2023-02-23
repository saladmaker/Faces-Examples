package com.example;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class MessageBean implements Serializable{
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
   public String next(){
       return "confirm";
   }
   public String edit(){
       return "index";
   }
   public String submit(){
       return "result";
   }

}
