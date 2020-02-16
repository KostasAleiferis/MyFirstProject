/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.classes.extra;

import project.classes.Assignment;

/**
 *
 * @author kwsta
 */
public class AssignmentPerCourse {
      private String titleScanner;
    private String courseScanner;

    public AssignmentPerCourse(String titleScanner, String courseScanner) {
        this.titleScanner = titleScanner;
        this.courseScanner = courseScanner;
    }

    
    
    public AssignmentPerCourse() {
    }

    @Override
    public String toString() {
        return "AssignmentPerCourse{" + "titleScanner=" + titleScanner + ", courseScanner=" + courseScanner + '}'+"\n";
    }
    
    
    
    

    Assignment a = new Assignment();

    public void printAssignmentsPerJava() {
        a.createAssignment();
        System.out.println("          Assignment per Java");
        System.out.println(a.listOfAssignments.get(0).getTitle());
        System.out.println(a.listOfAssignments.get(1).getTitle());
    }

    public void printAssignmentsPerC() {
        a.createAssignment();
        System.out.println("          Assignment per C");
        System.out.println(a.listOfAssignments.get(2).getTitle());
        System.out.println(a.listOfAssignments.get(3).getTitle());
    }

    public String getTitleScanner() {
        return titleScanner;
    }

    public void setTitleScanner(String titleScanner) {
        this.titleScanner = titleScanner;
    }

    public String getCourseScanner() {
        return courseScanner;
    }

    public void setCourseScanner(String courseScanner) {
        this.courseScanner = courseScanner;
    }

    public Assignment getA() {
        return a;
    }

    public void setA(Assignment a) {
        this.a = a;
    }
    
    
}
