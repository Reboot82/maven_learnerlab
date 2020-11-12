package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(null,null);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(null, null);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(null, null);
        Student student = new Student(null, null);
        student.totalStudyTime = 0.0;
        Double studyTime = 5.0;
        Double preStudyTime = student.getTotalStudyTime();
        Double expected = preStudyTime + studyTime;

        //when
        instructor.teach(student, studyTime);
        Double actual = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(null, null);
        Student student1 = new Student(1l, "Charles");
        Student student2 = new Student(2l, "Beth");
        Student student3 = new Student(3l, "Steve");
        student1.totalStudyTime = 0.0;
        student2.totalStudyTime = 0.0;
        student3.totalStudyTime = 0.0;
        Learner[] students = new Learner[]{student1,student2,student3};
        Double numberOfHours = 6.0;
        Double hoursPerStudent = numberOfHours/students.length;

        //when
        instructor.lecture(students, numberOfHours);

        //then
        Assert.assertEquals(hoursPerStudent, students[0].getTotalStudyTime());
    }

}
