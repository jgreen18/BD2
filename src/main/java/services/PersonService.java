/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import models.Person;

/**
 *
 * @author osmar
 */
public class PersonService {
    public String [] []arrayPersons = {
        {"1", "Norma","norma@gmail.com"},
        {"2", "Elias", "elias@gmail.com"},
        {"3", "Casandra", "casandra@gmail.com"},
        {"4", "Juan", "juan@gmail.com"}
    };    
    
   public ArrayList<Person> getAll() {
        ArrayList <Person> persons = new ArrayList<>();
        for (String[] arrayPerson : arrayPersons) {
            Person person = new Person();
            person.setId(Integer.parseInt(arrayPerson[0]));
            person.setNombre(arrayPerson[1]);
            person.setEmail(arrayPerson[2]);
            persons.add(person);
        }
        return persons;
    }
   public Person get(int id) {
        Person person = null;
        for (String[] arrayPerson : arrayPersons) {
            if(id == Integer.parseInt(arrayPerson[0])) {
                person = new Person();
                person.setId(Integer.parseInt(arrayPerson[0]));
                person.setNombre(arrayPerson[1]);
                person.setEmail(arrayPerson[2]);
                break;
            }
        }
        return person;
        
    }
   public Person getbyemail(String email) {
        Person person = null;
        for (String[] arrayPerson : arrayPersons) {
            if(email == arrayPerson[2]) {
                person = new Person();
                person.setId(Integer.parseInt(arrayPerson[0]));
                person.setNombre(arrayPerson[1]);
                person.setEmail(arrayPerson[2]);
                break;
            }
        }
        return person;
        
    }
 
            
}
