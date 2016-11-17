package org.gradle;

import org.gradle.Person;

public class PersonService{

    private static Person person;

    public static Person getPerson() {
        if(person == null){
            person = new Person();
        }
        return person;        
    }
}