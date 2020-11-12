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
        Student student = new Student(1L,"Charles");
        Double studyTime = 10.0;
        student.totalStudyTime = 2.0;
        Double fullST = studyTime + student.getTotalStudyTime();

        //when
        student.learn(studyTime);
        Double afterTime = student.getTotalStudyTime();

        //then
        Assert.assertEquals(fullST, afterTime);
    }

}
