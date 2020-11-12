package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {

    @Test
    public void test(){
        String[] names = "JC Avalo,Brandt Campbell,Brian Loveless,Neely Mann,Trevor Taylor,Michal Terranova".split(",");
        List<String> listOfNames = Arrays.asList(names);
        for (Person person : Students.getInstance()) {
            String personName = person.getName();
            Assert.assertTrue(listOfNames.contains(personName));
        }
    }

}
