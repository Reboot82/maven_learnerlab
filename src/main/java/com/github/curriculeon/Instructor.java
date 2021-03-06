package com.github.curriculeon;


public class Instructor extends Person implements Teacher{


    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberofHours) {

        learner.learn(numberofHours);

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            learner.learn(numberOfHoursPerLearner);
        }

    }
}
