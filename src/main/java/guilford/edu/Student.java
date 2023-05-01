package guilford.edu;

import java.util.Random;

public class Student {
    Random rand = new Random();

    // attributes
    private String name;
    private String email;
    private int gNumber;
    private int guilfordCredits;
    private int transferCredits;
    private int totalCredits;

    // constructor 
    public Student() {
        name = "Evan Wong";
        email = "ewong@guilford.edu";
        guilfordCredits = 90;
        this.transferCredits = 10;
        this.totalCredits = 0;

    }

    // constructor 
    public Student(String name, String email, int guilfordCredits, int transferCredits) {
        this.name = name;
        this.email = email;
        this.guilfordCredits = guilfordCredits;
        this.transferCredits = transferCredits;
        this.totalCredits = guilfordCredits + transferCredits;
    }

    // getters and setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters and setters

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getters and setters

    // getters and setters

    public int getGuilfordCredits() {
        return this.guilfordCredits;
    }

    public void setGuilfordCredits(int guilfordCredits) {
        this.guilfordCredits = guilfordCredits;
    }

    // getters and setters

    public int getTransferCredits() {
        return this.transferCredits;
    }

    public void setTransferCredits(int transferCredits) {
        this.transferCredits = transferCredits;
    }

    // getters and setters

    public int getTotalCredits() {
        return this.totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    // toString method
    @Override

    public String toString() {
        return "{" + " name='" + getName() + "'" + ", email='" + getEmail() + "'" + ", guilfordCredits='"
                + getGuilfordCredits() + "'" + ", transferCredits='" + getTransferCredits() + "'" + ", totalCredits='"
                + getTotalCredits() + "'" + "}";
    }

    // method that adds guilfordCredits and transferCredits to the total credits
    public void addCredits(int guilfordCredits, int transferCredits) {
        this.totalCredits = guilfordCredits + transferCredits;
    }   






}
