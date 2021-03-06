package com.spartaglobal.JSON.StudentManager;

public class StudentFactory {
//    instaciate as we will be using it to whole class
    private String firstName;
    private String lastName;
    private String degree;
    private int age;

    public StudentFactory(String firstName, String lastName, String degree, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDegree() {
        return degree;
    }

    public int getAge() {
        return age;
    }

}
