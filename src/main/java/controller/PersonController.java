/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import models.Person;
import services.PersonService;

/**
 *
 * @author osmar
 */
public class PersonController {
    
    public ArrayList<Person>index(){
        PersonService personservice = new PersonService();
        return personservice.getAll();
    }
     public Person show(int id) {
        PersonService personService = new PersonService();
        return personService.get(id);
        
    }
     public Person showbyemail(String email) {
        PersonService personService = new PersonService();
        return personService.getbyemail(email);
        
    }
     
  
        
    
}
