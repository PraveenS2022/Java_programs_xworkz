package com.xworkz.interfaces.inner.file;

public class UniversityImpli implements University {
    @Override
    public void conductExam() {
        System.out.println("University is conducting exams");
    }

    @Override
    public void publishResults() {
        System.out.println("University is publishing results");
    }

    @Override
    public void grantDegrees() {
        System.out.println("University is granting degrees");
    }
}
