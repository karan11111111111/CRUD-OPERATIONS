package com.CRUD.demoCRUD.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "demo_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roll_no")
    private int rollNo;

    @Column(name = "name")
    private String name;

    @Column(name = "percentage")
    private float percentage;

    @Column(name = "branch")
    private String branch;
    // Constructors
    public Student() {
        // Default constructor
    }

    public Student(String name, float percentage, String branch) {
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    // Getters and setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Student [" +
                "rollNo=" + rollNo +
                ", name='" + name  +
                ", percentage=" + percentage +
                ", branch='" + branch  +
                "]";
    }
}
