/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.classes;

import java.util.ArrayList;

/**
 *
 * @author kwsta
 */
public class Trainer {

    private String firstName;
    private String lastName, subject;
    public ArrayList<Trainer> listOfTrainers = new ArrayList();

    public Trainer(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public Trainer() {
    }

    public void createTrainers() {
        Trainer t1 = new Trainer("Thodoris ", "Papaloukas", "Java");
        Trainer t2 = new Trainer("Dimitris ", "Diamantidis", "Java");
        Trainer t3 = new Trainer("Nikos ", "Pappas", "C#");
        Trainer t4 = new Trainer("Mike ", "Batist", "C#");
        listOfTrainers.add(t1);
        listOfTrainers.add(t2);
        listOfTrainers.add(t3);
        listOfTrainers.add(t4);

    }

    @Override
    public String toString() {
        return "Trainer{" + "firstName=" + firstName + ", lastName=" + lastName + ", subject=" + subject + '}'+ "\n";
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
