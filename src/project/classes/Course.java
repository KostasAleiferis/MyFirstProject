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
public class Course {

    private String title, type, stream;
    private LocalDate startDate, endDate;
    public ArrayList<Course> listOfCourses = new ArrayList();
    public ArrayList<Student> students;

    public Course(String title, String stream, String type, LocalDate start_date, LocalDate local_date) {
        this.title = title;
        this.type = type;
        this.stream = stream;
        this.startDate = start_date;
        this.endDate = local_date;
    }

    public Course(String title) {
        this.title = title;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", type=" + type + ", stream=" + stream + ", start_date=" + startDate + ", local_date=" + endDate + '}' + "\n";
    }

    public void createCourses() {
        Course c1 = new Course("Java", "bootcamp", "full time", LocalDate.of(2020, 01, 30), LocalDate.of(2020, 03, 30));
        Course c2 = new Course("C#", "bootcamp", "full time", LocalDate.of(2020, 01, 30), LocalDate.of(2020, 03, 30));
       
        listOfCourses.add(c1);
        listOfCourses.add(c2);
   

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public LocalDate getStart_date() {
        return startDate;
    }

    public void setStart_date(LocalDate start_date) {
        this.startDate = start_date;
    }

    public LocalDate getLocal_date() {
        return endDate;
    }

    public void setLocal_date(LocalDate local_date) {
        this.endDate = local_date;
    }

}
