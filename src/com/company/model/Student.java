package com.company.model;

public class Student {
    private String name;
    private String lastName;
    private String studentId;

    public Student(String name, String lastname, String studentId) {
        this.setName(name);
        this.setLastName(lastname);
        this.setStudentId(studentId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
