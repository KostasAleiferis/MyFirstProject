/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.classes.extra;

import project.classes.Trainer;

/**
 *
 * @author kwsta
 */
public class TrainersPerCourse {
       private String firstNameScanner;
    private String lastNameScanner;
    private String courseScanner;

    public TrainersPerCourse(String firstNameScanner, String lastNameScanner, String courseScanner) {
        this.firstNameScanner = firstNameScanner;
        this.lastNameScanner = lastNameScanner;
        this.courseScanner = courseScanner;
    }

    public TrainersPerCourse() {
    }

    
    @Override
    public String toString() {
        return "TrainersPerCourse{" + "firstNameScanner=" + firstNameScanner + ", lastNameScanner=" + lastNameScanner + ", courseScanner=" + courseScanner + ", t=" + t + '}'+"\n";
    }
    
    
    Trainer t = new Trainer();
    public void printTrainersPerJava(){
        t.createTrainers();
        System.out.println("                            Java Trainers");
        System.out.println("1. "+t.listOfTrainers.get(0).getFirstName()+" "+t.listOfTrainers.get(0).getLastName());
        System.out.println("2. "+t.listOfTrainers.get(1).getFirstName()+" "+t.listOfTrainers.get(1).getLastName());
    }
    
    public void printTrainersPerC(){
        t.createTrainers();
        System.out.println("                             C# Trainers ");
        System.out.println("1. "+t.listOfTrainers.get(2).getFirstName()+" "+t.listOfTrainers.get(2).getLastName());
        System.out.println("2. "+t.listOfTrainers.get(3).getFirstName()+" "+t.listOfTrainers.get(3).getLastName());
    
    }

    public String getFirstNameScanner() {
        return firstNameScanner;
    }

    public void setFirstNameScanner(String firstNameScanner) {
        this.firstNameScanner = firstNameScanner;
    }

    public String getLastNameScanner() {
        return lastNameScanner;
    }

    public void setLastNameScanner(String lastNameScanner) {
        this.lastNameScanner = lastNameScanner;
    }

    public String getCourseScanner() {
        return courseScanner;
    }

    public void setCourseScanner(String courseScanner) {
        this.courseScanner = courseScanner;
    }

    public Trainer getT() {
        return t;
    }

    public void setT(Trainer t) {
        this.t = t;
    }
    
    
    
    
}
