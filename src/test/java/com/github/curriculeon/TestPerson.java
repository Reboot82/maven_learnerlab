package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //given
        Long expectedId = Long.MAX_VALUE;
        String expectedName = "TalentPath";

        //when
        Person person = new Person(expectedId, expectedName);

        //then
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void testSetName(){
        //given
        String expectedName = "TalentPath";
        Person person = new Person(null,null);

        //when
        person.setName(expectedName);

        //then
        Assert.assertEquals(expectedName, person.getName());
    }

}
