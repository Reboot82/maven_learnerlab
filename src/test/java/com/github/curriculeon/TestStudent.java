package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //given
        Student student = new Student(null,null);

        //when

        //then
        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance(){
        //given
        Student student = new Student(null,null);

        //when

        //then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //given
        Student student = new Student(null,null);
        Double studyTime = 10.0;

        //when
        student.learn(studyTime);

        //then
        Assert.assertEquals();
    }

}
