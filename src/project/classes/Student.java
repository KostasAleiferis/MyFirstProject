/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.classes;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author kwsta
 */
public class Student {

    private String firstName, lastName;
    private LocalDate dateOfBirth;
    private double tuitionFees;
    public ArrayList<Student> listOfStudents = new ArrayList();
   private String course ;
   private Student student;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, double tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }
//  PARADEIGMA META TO SVINO
    public Student(String firstName, String lastName, double tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tuitionFees = tuitionFees;
    }

    public Student() {
    
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, double tuitionFees, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        this.course = course;
    }

 
Course c =new Course();
    
    

    public void createStudents() {
        Student s1 = new Student("Kostas", "Aleiferis", LocalDate.of(1993, 11, 26), 2500,"Java");

        Student s2 = new Student("Fabio", "Cannavaro", LocalDate.of(1992, 12, 12), 2250,"Java");
        Student s3 = new Student("Francesco", "Totti", LocalDate.of(1991, 7, 13), 2500,"Java");
        Student s4 = new Student("Rui", "Costa", LocalDate.of(1990, 4, 15), 2250,"Java");
        Student s5 = new Student("Ronaldo", "Fenomeno", LocalDate.of(1990, 9, 16), 2150,"Java");
        Student s6 = new Student("Gabriel", "Batistuta", LocalDate.of(1992, 8, 18), 2250,"Java");
        Student s7 = new Student("Diego", "Maradona", LocalDate.of(1993, 5, 18), 2500,"Java & C#");
        Student s8 = new Student("Giourkas", "Seitaridis", LocalDate.of(1994, 4, 26), 2150,"Java & C#");
        Student s9 = new Student("Antonis", "Fotsis", LocalDate.of(1990, 1, 2), 2250,"C#");
        Student s10 = new Student("Giovanni", "El Mago", LocalDate.of(1991, 2, 5), 2500,"C#");
        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s3);
        listOfStudents.add(s4);
        listOfStudents.add(s5);
        listOfStudents.add(s6);
        listOfStudents.add(s7);
        listOfStudents.add(s8);
        listOfStudents.add(s9);
        listOfStudents.add(s10);
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", tuitionFees=" + tuitionFees + '}'+ "\n";
    }
     
      
    

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    

}
