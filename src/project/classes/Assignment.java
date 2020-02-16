/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author kwsta
 */
public class Assignment {

    private String title, description;
    private LocalDate subDate;
    private double oralMark, totalMark;
    public ArrayList<Assignment> listOfAssignments = new ArrayList();

    public Assignment(String title, String description, LocalDate subDate, double oralMark, double totalMark) {
        this.title = title;
        this.description = description;
        this.subDate = subDate;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public Assignment() {
    }

    public void createAssignment() {
        Assignment a1 = new Assignment("Project Java Part A ", "description Java", LocalDate.of(2020, 05, 30), 30, 100);
        Assignment a2 = new Assignment("Project Java Part B ", "description Java", LocalDate.of(2020, 05, 30), 20, 100);
        Assignment a3 = new Assignment("Project C# Part A ", "description C#", LocalDate.of(2020, 05, 30), 30, 100);
        Assignment a4 = new Assignment("Project C# Part B ", "description C#", LocalDate.of(2020, 05, 30), 20, 100);
        listOfAssignments.add(a1);
        listOfAssignments.add(a2);
        listOfAssignments.add(a3);
        listOfAssignments.add(a4);
    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description + ", subDate=" + subDate + ", oralMark=" + oralMark + ", totalMark=" + totalMark + '}' + "\n";
    }

    public ArrayList<Assignment> getListOfAssignments() {
        return listOfAssignments;
    }

    public void setListOfAssignments(ArrayList<Assignment> listOfAssignments) {
        this.listOfAssignments = listOfAssignments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDate() {
        return subDate;
    }

    public void setSubDate(LocalDate subDate) {
        this.subDate = subDate;
    }

    public double getOralMark() {
        return oralMark;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

}
