package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd(){
        People personList = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(null,null);
        personList.add(person);
        Assert.assertTrue(personList.contains(person));
    }

    @Test
    public void testRemove(){
        People personList = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(null,null);
        personList.add(person);
        Assert.assertTrue(personList.contains(person));
        personList.remove(person);
        Assert.assertFalse(personList.contains(person));

    }
    
    @Test
    public void testFindById(){
        People personList = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(0L,null);
        personList.add(person);
        Long id = person.getId();
        Assert.assertEquals(person, personList.findById(id));
    }

}
