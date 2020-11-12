package com.github.curriculeon;


public class Students extends People<Student>{
    private static final Students INSTANCE = new Students();

    private Students(){
        Student student1 = new Student(0L, "JC Avalo");
        Student student2 = new Student(1L, "Brandt Campbell");
        Student student3 = new Student(2L, "Brian Loveless");
        Student student4 = new Student(3L, "Neely Mann");
        Student student5 = new Student(4L, "Trevor Taylor");
        Student student6 = new Student(5L, "Michal Terranova");
        add(student1);
        add(student2);
        add(student3);
        add(student4);
        add(student5);
        add(student6);

    }

    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        Student[] arrayToBePopulated = new Student[0];
        Student[] populatedArray = personList.toArray(arrayToBePopulated);
        return populatedArray;
    }
}
