package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {

    @Test
    public void test(){
        String[] names = "Leon,Jothi,Fred,David".split(",");
        List<String> listOfNames = Arrays.asList(names);
        for (Person person : Instructors.getInstance()) {
            String personName = person.getName();
            Assert.assertTrue(listOfNames.contains(personName));
        }
    }

}
