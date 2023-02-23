package com.example;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;

@RequestScoped
@Named
public class MessageBean{
   // inject the current faces context 
   @Inject
   FacesContext facesContext;
   private String message;
   public void setMessage(final String message){
     this.message = message;
   }
   public String getMessage(){
     return message;
   }
   public String submit(){
        // put parameter for the next request.
       facesContext.getExternalContext().getFlash().put("message", this.message);
        // redirect to result page.       
       return "result?faces-redirect=true";
   }

}
