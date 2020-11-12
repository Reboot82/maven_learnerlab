package com.github.curriculeon;


public class Instructors extends People<Instructor> {
    private static Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor instructor1 = new Instructor(0L, "Leon");
        Instructor instructor2 = new Instructor(1L, "Jothi");
        Instructor instructor3 = new Instructor(2L, "Fred");
        Instructor instructor4 = new Instructor(3L, "David");
        add(instructor1);
        add(instructor2);
        add(instructor3);
        add(instructor4);

    }

    public static Instructors getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }


    @Override
    public Instructor[] toArray() {
        Instructor[] arrayToBePopulated = new Instructor[0];
        Instructor[] populatedArray = personList.toArray(arrayToBePopulated);
        return populatedArray;
    }
}
