/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.classes.extra;

import project.classes.Student;

/**
 *
 * @author kwsta
 */
public class AssignmentsPerStudent {
 private String firstNameScanner;
    private String lastNameScanner;
    private String assignmentScanner;

    public AssignmentsPerStudent(String firstNameScanner, String lastNameScanner, String assignmentScanner) {
        this.firstNameScanner = firstNameScanner;
        this.lastNameScanner = lastNameScanner;
        this.assignmentScanner = assignmentScanner;
    }

    public AssignmentsPerStudent() {
    }

    @Override
    public String toString() {
        return "AssignmentsPerStudent{" + "firstNameScanner=" + firstNameScanner + ", lastNameScanner=" + lastNameScanner + ", assignmentScanner=" + assignmentScanner + '}'+"\n";
    }
    
    
    
    
    StudentsPerCourse spc = new StudentsPerCourse();
    Student s = new Student();

    public void printStudentPerProjectJavaPartAnB() {
        System.out.println("      Students per project Java part A and B");
        spc.PrintStudentsPerJava();
    }

    public void printStudentPerProjectCPartAnB() {
        System.out.println("      Students per project C# part A and B");
        spc.PrintStudentsPerC();
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

    public String getAssignmentScanner() {
        return assignmentScanner;
    }

    public void setAssignmentScanner(String assignmentScanner) {
        this.assignmentScanner = assignmentScanner;
    }

    public StudentsPerCourse getSpc() {
        return spc;
    }

    public void setSpc(StudentsPerCourse spc) {
        this.spc = spc;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }
    
    

}
