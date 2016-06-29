package org.gradle;

import org.junit.Test;
import org.junit.Before;

import org.gradle.Person;
import org.gradle.PersonService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonTest{

    Person person;

    @Before public void setup(){
        person = new Person();
    }

    @Test public void testAge() {
        person.setAge(30);
        assertEquals(30, person.getAge());
    }


    @Test public void testSurname() {
        person.setSurname("Duke");
        assertEquals("Duke", person.getSurname());
    }

    @Test public void testPersonNotNull() {
        assertNotNull(PersonService.getPerson());
    }

    @Test public void testPersonEquals() {
        Person personTest1 = PersonService.getPerson();
        Person personTest2 = PersonService.getPerson();
        assertEquals(personTest1, personTest2);
    }

    @Test public void testPersonService() {
        PersonService personService = new PersonService();
        assertNotNull(personService);
    }
}
