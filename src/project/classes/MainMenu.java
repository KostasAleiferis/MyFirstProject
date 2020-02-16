/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import project.classes.extra.StudentsPerCourse;
import java.util.ArrayList;
import java.util.Scanner;
import project.classes.extra.AssignmentPerCourse;
import project.classes.extra.AssignmentsPerStudent;
import project.classes.extra.TrainersPerCourse;

/**
 *
 * @author kwsta
 */
public class MainMenu {

    public ArrayList<Student> listOfStudents;

    public static int NumberException() {
        Scanner sc = new Scanner(System.in);
        // Scanner sc1 = new Scanner(System.in);

        while (true) {
            String optionString = sc.next();
            int option;
            try {
                option = Integer.parseInt(optionString);
                return option;

            } catch (NumberFormatException e) {
                System.out.println("Please write only numbers");
                System.out.println("Choose again");
            }

        }

    }

    public static void createMenu() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Welcome to the private school");
        
        System.out.println("Press number 1 to see the data of my school");
        System.out.println("Press number 2 to input the data of your school");
        int option;
        option = MainMenu.NumberException();  //ΜΕΘΟΔΟΣ ΓΙΑ ΚΑΤΑΧΩΡΗΣΗ ΜΟΝΟ ΑΡΙΘΜΩΝ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ

        while (option > 2 || option < 1) {
            System.out.println("Please choose only 1 or 2");
            option = MainMenu.NumberException();

        }

        switch (option) {
            case 1:
                System.out.println("Please read the data");
                System.out.println("Press 1 to see the list of students");
                System.out.println("Press 2 to see the list of courses");
                System.out.println("Press 3 to see the list of assignments");
                System.out.println("Press 4 to see the list of trainers");
                System.out.println("Press 5 to see the list of students per course");
                System.out.println("Press 6 to see the list of trainers per Course");
                System.out.println("Press 7 to see the list of assignments per Course");
                System.out.println("Press 8 to see the list of assignments per student");
                System.out.println("Press 9 to exit");
                option = MainMenu.NumberException();

                while (option > 9 || option < 1) {
                    System.out.println("Please choose a right option");
                    option = MainMenu.NumberException();

                }
                
                while (option > 0 && option < 9) {

                    switch (option) {
                        case 1:
                            Student s = new Student();
                            s.createStudents(); //ΜΕΘΟΔΟΣ ΠΟΥ ΦΤΙΑΧΝΕΙ ΤΟΥΣ ΜΑΘΗΤΕΣ ΜΟΥ ΣΤΗΝ ΚΛΑΣΗ STUDENT
                            System.out.println("");
                            System.out.println(s.listOfStudents);

                            break;
                        case 2:
                            Course c = new Course();
                            c.createCourses();
                            System.out.println("");
                            System.out.println(c.listOfCourses);
                            break;
                        case 3:
                            Assignment a = new Assignment();
                            a.createAssignment();
                            System.out.println("");
                            System.out.println(a.listOfAssignments);
                            break;
                        case 4:
                            Trainer t = new Trainer();
                            t.createTrainers();
                            System.out.println("");
                            System.out.println(t.listOfTrainers);
                            break;
                        case 5:

                            System.out.println("");
                            System.out.println("Press 1 to see students per java");
                            System.out.println("Press 2 to see students per C#");
                            System.out.println("Press 3 to see students per both");
                            System.out.println("Press other to go to the main menu");
                            option = MainMenu.NumberException();

                            while (option > 0 && option < 4) {
                                switch (option) {
                                    case 1:
                                        StudentsPerCourse spc = new StudentsPerCourse();
                                        System.out.println("");
                                        spc.PrintStudentsPerJava();
                                        break;
                                    case 2:
                                        StudentsPerCourse spc1 = new StudentsPerCourse();
                                        System.out.println("");
                                        spc1.PrintStudentsPerC();
                                        break;
                                    case 3:
                                        StudentsPerCourse spc3 = new StudentsPerCourse();
                                        System.out.println("");
                                        spc3.PrintStudentsPerJavaC();
                                        break;
                                }
                                System.out.println("Press 1 to see students per java");
                                System.out.println("Press 2 to see students per C#");
                                System.out.println("Press 3 to see students per Java & C#");
                                System.out.println("Press other to go to the main menu");
                                option = MainMenu.NumberException();

                            }
                            break;
                        case 6:

                            System.out.println("");
                            System.out.println("Press 1 to see trainers per java");
                            System.out.println("Press 2 to see trainers per C#");
                            System.out.println("Press other to go to the main menu");

                            option = MainMenu.NumberException();

                            while (option > 0 && option < 3) {
                                switch (option) {
                                    case 1:
                                        TrainersPerCourse tpc = new TrainersPerCourse();
                                        System.out.println("");
                                        tpc.printTrainersPerJava();
                                        break;
                                    case 2:
                                        TrainersPerCourse tpc1 = new TrainersPerCourse();
                                        System.out.println("");
                                        tpc1.printTrainersPerC();
                                        break;

                                }
                                System.out.println("");
                                System.out.println("Press 1 to see trainers per java");
                                System.out.println("Press 2 to see trainers per C#");
                                System.out.println("Press other to go to the main menu");
                                option = MainMenu.NumberException();

                            }
                            break;
                        case 7:
                            System.out.println("");
                            System.out.println("Press 1 to see assignments per java");
                            System.out.println("Press 2 to see assignments per C#");
                            System.out.println("Press other to go to the main menu");
                            option = MainMenu.NumberException();

                            while (option > 0 && option < 3) {
                                switch (option) {
                                    case 1:
                                        AssignmentPerCourse apc = new AssignmentPerCourse();
                                        System.out.println("");
                                        apc.printAssignmentsPerJava();
                                        break;
                                    case 2:
                                        AssignmentPerCourse apc1 = new AssignmentPerCourse();
                                        System.out.println("");
                                        apc1.printAssignmentsPerC();
                                        break;

                                }
                                System.out.println("");
                                System.out.println("Press 1 to see assignments per java");
                                System.out.println("Press 2 to see assignments per C#");
                                System.out.println("Press other to go to the main menu");

                                option = MainMenu.NumberException();

                            }
                            break;

                        case 8:
                            System.out.println("");
                            System.out.println("Press 1 to see students per project java");
                            System.out.println("Press 2 to see students per project C#");
                            System.out.println("Press other to go to the main menu");
                            option = MainMenu.NumberException();

                            while (option > 0 && option < 3) {
                                switch (option) {
                                    case 1:
                                        AssignmentsPerStudent aps = new AssignmentsPerStudent();
                                        System.out.println("");
                                        aps.printStudentPerProjectJavaPartAnB();
                                        break;
                                    case 2:
                                        AssignmentsPerStudent aps1 = new AssignmentsPerStudent();
                                        System.out.println("");
                                        aps1.printStudentPerProjectCPartAnB();
                                        break;

                                }
                                System.out.println("");
                                System.out.println("Press 1 to see students per project java");
                                System.out.println("Press 2 to see students per project C#");
                                System.out.println("Press other number to go to the main menu");
                                option = MainMenu.NumberException();

                            }
                            break;

                    }
                    System.out.println("Please read the data");
                    System.out.println("Press 1 to see the list of students");
                    System.out.println("Press 2 to see the list of courses");
                    System.out.println("Press 3 to see the list of assignments");
                    System.out.println("Press 4 to see the list of trainers");
                    System.out.println("Press 5 to see the list of students per course");
                    System.out.println("Press 6 to see the list of trainers per Course");
                    System.out.println("Press 7 to see the list of assignments per Course");
                    System.out.println("Press 8 to see the list of assignments per student");
                    System.out.println("Press 9 to exit");

                    option = MainMenu.NumberException();

                    while (option > 9 || option < 1) {
                        System.out.println("Please choose a right option");

                        option = MainMenu.NumberException();

                    }
                }
                System.out.println("Have a nice day!");
                break;
                
                
                
                //DATA POY ΠΛΗΚΤΡΟΛΟΓΕΙ Ο ΧΡΗΣΤΗΣ
            case 2:
                System.out.println("Let's put your data");
                System.out.println("");
                System.out.println("Please follow the instructions");

                
                //               SC.STUDENTS
                System.out.println("Create your students");
                ArrayList<Student> studentsByScanner = new ArrayList();
                System.out.println("Enter the details as the example");

                System.out.println("Kostas, Aleiferis, 26/11/1993, 2500");
                System.out.println("How many students would you like to create?");
                int numberOfStudents;
                while (true) {
                    System.out.println("Enter a number  ");
                    String input1 = sc.next();

                    int intInputValue1;
                    try {
                        intInputValue1 = Integer.parseInt(input1);//ΕΛΕΓΧΟΣ ΑΝ ΕΔΩΣΕ ΑΡΙΘΜΟ
                        numberOfStudents = intInputValue1;
                        for (int j = 0; j < Integer.parseInt(input1); j++) {
                            System.out.println("Write  first name");

                            String firstName = sc1.nextLine();


                            System.out.println("Write last name");
                            String lastName = sc1.nextLine();
                            System.out.println("Write the date of his/her birth ");
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                            LocalDate dateOfBirth;
                            while (true) {
                                String dateOfBirth1 = sc.next();
                                try {

                                    dateOfBirth = LocalDate.parse(dateOfBirth1, formatter);//ΕΛΕΓΧΟΣ ΑΝ ΕΔΩΣΕ ΣΤΗ ΣΩΣΤΗ ΜΟΡΦΗ ΤΗΝ ΗΜΕΡΟΜΗΝΙΑ
                                    break;
                                } catch (Exception e) {
                                    System.out.println("The format must be dd/mm/yyyy");
                                    System.out.println("Please try again");
                                }

                            }
                            double doublefee;
                            while (true) {
                                System.out.println("Write the tution fee ");
                                String fee = sc.next();
                                try {
                                    doublefee = Double.parseDouble(fee);

                                    break;
                                } catch (NumberFormatException ne) {
                                    System.out.println("This is not a number");
                                }

                            }

                            Student s1 = new Student(firstName, lastName, dateOfBirth, doublefee);

                            studentsByScanner.add(s1);
                            System.out.println("Student " + (j + 1) + " is completed ");

                        }
                        break;
                    } catch (NumberFormatException ne) {
                        System.out.println("This is not a number");
                    }
                }
                System.out.println(studentsByScanner);

                //               SC.COURSES
                System.out.println("Insert the courses");
                ArrayList<Course> coursesByScanner = new ArrayList();
                System.out.println("Enter the details as the example");
                Course c = new Course();
                c.createCourses();
                System.out.println(c.listOfCourses.get(0));
                System.out.println("How many courses would you like to create?");
                int numberOfCourses;
                while (true) {
                    System.out.println("Enter a number  ");
                    String input2 = sc.next();

                    int numberCourses;
                    try {
                        numberCourses = Integer.parseInt(input2);

                        numberOfCourses = numberCourses;
                        for (int j = 0; j < numberCourses; j++) {

                            System.out.println("Give the title of the course");
                            String title = sc1.nextLine();

                            System.out.println("Give the stream");
                            String stream = sc1.nextLine();
                            System.out.println("Give the type");
                            String type = sc1.nextLine();
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                            System.out.println("Give the start date of the course");

                            LocalDate startDate;
                            while (true) {
                                String startDate1 = sc.next();
                                try {

                                    startDate = LocalDate.parse(startDate1, formatter);
                                    break;
                                } catch (Exception e) {
                                    System.out.println("The format must be dd/mm/yyyy");
                                    System.out.println("Please try again");
                                }

                            }
                            System.out.println("Give the end date of the course");

                            LocalDate endDate;
                            while (true) {
                                String endDate1 = sc.next();
                                try {

                                    endDate = LocalDate.parse(endDate1, formatter);
                                    if (endDate.isAfter(startDate)) {   //ΕΛΕΓΧΟΣ ΓΙΑ endDate>startDate
                                        break;
                                    } else {
                                        System.out.println("End date must be older than start date");
                                        System.out.println("Please try again");
                                    }
                                } catch (Exception e) {
                                    System.out.println("The format must be dd/mm/yyyy");
                                    System.out.println("Please try again");
                                }

                            }
                            Course c1 = new Course(title, stream, type, startDate, endDate);

                            System.out.println("Course " + (j + 1) + " is completed");
                            coursesByScanner.add(c1);

                        }

                        break;
                    } catch (NumberFormatException ne) {
                        System.out.println("This is not a number");
                    }
                }
                System.out.println(coursesByScanner);

                //               SC.TRAINERS
                System.out.println("Insert the trainers");
                ArrayList<Trainer> trainersByScanner = new ArrayList();
                System.out.println("Enter the details as the example");
                System.out.println("Onoma , Epitheto, subject");
                System.out.println("How many trainers would you like to create?");
                while (true) {
                    System.out.println("Enter a number  ");
                    String input = sc.next();
                    int intInputValue = 0;
                    try {
                        intInputValue = Integer.parseInt(input);
                        for (int j = 0; j < Integer.parseInt(input); j++) {
                            System.out.println("Give the first name");
                            String firstName = sc1.nextLine();
                            System.out.println("Give the last name");
                            String lastName = sc1.nextLine();
                            System.out.println("Give the subject");
                            String subject = sc1.nextLine();
                            System.out.println("Trainer " + (j + 1) + " is completed");
                            Trainer t = new Trainer(firstName, lastName, subject);
                            trainersByScanner.add(t);

                        }
                        break;
                    } catch (NumberFormatException ne) {
                        System.out.println("This is not a number");
                    }
                }
                System.out.println(trainersByScanner);

                //SC.TRAINERS
                System.out.println("Insert the assignments");
                System.out.println("");
                ArrayList<Assignment> assignmentsByScanner = new ArrayList();
                System.out.println("Enter the details as the example");
                Assignment a = new Assignment();
                a.createAssignment();
                System.out.println(a.listOfAssignments.get(0));
                System.out.println("How many Assignments would you like to create?");
                while (true) {
                    System.out.println("Enter a number  ");
                    String input = sc.next();
                    int intInputValue = 0;
                    try {
                        intInputValue = Integer.parseInt(input);
                        for (int j = 0; j < Integer.parseInt(input); j++) {
                            System.out.println("Give the title");
                            String title = sc1.nextLine();
                            System.out.println("Give the description");
                            String description = sc1.nextLine();
                            System.out.println("Give the sub date of this assignment ");
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                            LocalDate subDate;

                            while (true) {
                                String subDate1 = sc.next();
                                try {

                                    subDate = LocalDate.parse(subDate1, formatter);

                                    break;
                                } catch (Exception e) {
                                    System.out.println("The format must be dd/mm/yyyy");
                                    System.out.println("Please try again");
                                }

                            }
                            double oralMark;
                            while (true) {
                                System.out.println("Give the oral mark of this assignment");
                                String oral = sc.next();
                                try {
                                    oralMark = Double.parseDouble(oral);

                                    break;
                                } catch (NumberFormatException ne) {
                                    System.out.println("This is not a number");
                                    System.out.println("Try again");
                                }

                            }

                            double totalMark;
                            while (true) {
                                System.out.println("Give the total mark of this assignment");
                                String total = sc.next();
                                try {
                                    totalMark = Double.parseDouble(total);

                                    break;
                                } catch (NumberFormatException ne) {
                                    System.out.println("This is not a number");
                                    System.out.println("Try again");
                                }

                            }

                            System.out.println("Assignment " + (j + 1) + " is completed");
                            Assignment a1 = new Assignment(title, description, subDate, oralMark, totalMark);
                            assignmentsByScanner.add(a1);
                        }
                        break;
                    } catch (NumberFormatException ne) {
                        System.out.println("This is not a number");
                    }
                }
                System.out.println(assignmentsByScanner);

                ArrayList<StudentsPerCourse> studentsPercourse = new ArrayList();
                ArrayList<StudentsPerCourse> studentsPerMorecourse = new ArrayList();

                //SC.STUDENTSPERCOURSE
                for (int i = 0; i < studentsByScanner.size(); i++) {
                    System.out.println("Does the student " + studentsByScanner.get(i).getFirstName() + ", " + studentsByScanner.get(i).getLastName() + " participate in one or more courses?");
                    System.out.println("1. Participates in one lesson, press one");
                    System.out.println("2. Participates in 2 or more lessons, press 2");
                    option = MainMenu.NumberException();
                    switch (option) {
                        case 1:
                            System.out.println("In which course does he/she participate in ?:" + studentsByScanner.get(i).getFirstName() + ", " + studentsByScanner.get(i).getLastName());

                            System.out.println("These are the courses, please choose a number");

                            for (int j = 0; j < coursesByScanner.size(); j++) {
                                System.out.println((j + 1) + ". " + coursesByScanner.get(j).getTitle());
                            }
                            int courseOption = MainMenu.NumberException();

                            if (courseOption > 0 && courseOption < (coursesByScanner.size() + 1)) {

                                for (int j = 0; j < coursesByScanner.size(); j++) {

                                    if (courseOption == (j + 1)) {

                                        StudentsPerCourse spc = new StudentsPerCourse(studentsByScanner.get(i).getFirstName(), studentsByScanner.get(i).getLastName(), coursesByScanner.get(j).getTitle());
                                        studentsPercourse.add(spc);
                                        System.out.println("Successfull entry");
                                        break;
                                    }

                                }

                            } else {
                                System.out.println("wrong choice, try again");
                                courseOption = MainMenu.NumberException();
                            }
                            break;
                        case 2:

                            System.out.println("In how many courses does he/she participate in?");
                            int x = MainMenu.NumberException();
                            while (true) {
                                if (x >= 1 && x <= coursesByScanner.size()) {
                                    for (int k = 0; k < x; k++) {

                                        System.out.println("In which course does he/she participate in ? : " + studentsByScanner.get(i).getFirstName() + ", " + studentsByScanner.get(i).getLastName());

                                        System.out.println("These are the courses, please choose a number ");

                                        for (int j = 0; j < coursesByScanner.size(); j++) {

                                            System.out.println((j + 1) + ". " + coursesByScanner.get(j).getTitle());

                                        }
                                        int courseOption1 = MainMenu.NumberException();
                                       

                                        if (courseOption1 > 0 && courseOption1 < (coursesByScanner.size() + 1)) {

                                            for (int j = 0; j < coursesByScanner.size(); j++) {

                                                if (courseOption1 == (j + 1)) {

                                                    StudentsPerCourse spc = new StudentsPerCourse(studentsByScanner.get(i).getFirstName(), studentsByScanner.get(i).getLastName(), coursesByScanner.get(j).getTitle());
                                                    studentsPerMorecourse.add(spc);
                                                    System.out.println("Successful entry ");
                                                    break;
                                                }

                                            }

                                        } else {
                                            System.out.println("wrong choice, try again");
                                            courseOption = MainMenu.NumberException();
                                        }
                                    }
                                    break;
                                } else {
                                    System.out.println("Give a right choice! try again");
                                    x = MainMenu.NumberException();
                                }
                            }
                            break;
                    }
                }
                System.out.println("Students per one Course");
                System.out.println(studentsPercourse);
                System.out.println(" ");
                System.out.println("Students per two or more Courses");
                System.out.println(studentsPerMorecourse);

                ArrayList<TrainersPerCourse> trainersPerCourse = new ArrayList();
                ArrayList<TrainersPerCourse> trainersPerMoreCourse = new ArrayList();

                //SC.TrainersPERCOURSE
                for (int i = 0; i < trainersByScanner.size(); i++) {
                    System.out.println("The trainer" + trainersByScanner.get(i).getFirstName() + ", " + trainersByScanner.get(i).getLastName() + " teaches in one or more courses?");
                    System.out.println("1. If he/she teaches in one lesson, press one");
                    System.out.println("2. If he/she teaches in 2 or more lessons, press 2");
                    option = MainMenu.NumberException();
                    switch (option) {
                        case 1:
                            System.out.println("In which course does he/she teach? :" + trainersByScanner.get(i).getFirstName() + ", " + trainersByScanner.get(i).getLastName());

                            System.out.println("These are the courses, please choose a number ");

                            for (int j = 0; j < coursesByScanner.size(); j++) {
                                System.out.println((j + 1) + ". " + coursesByScanner.get(j).getTitle());
                            }
                            int courseOption = MainMenu.NumberException();

                            if (courseOption > 0 && courseOption < (coursesByScanner.size() + 1)) {

                                for (int j = 0; j < coursesByScanner.size(); j++) {

                                    if (courseOption == (j + 1)) {

                                        TrainersPerCourse tpc11 = new TrainersPerCourse(trainersByScanner.get(i).getFirstName(), trainersByScanner.get(i).getLastName(), coursesByScanner.get(j).getTitle());
                                        trainersPerCourse.add(tpc11);
                                        System.out.println("Successful entry ");
                                        break;
                                    }

                                }

                            } else {
                                System.out.println("wrong choice, try again");
                                courseOption = MainMenu.NumberException();
                            }
                            break;
                        case 2:

                            System.out.println("In how many courses does he/she teach?");
                            int x = MainMenu.NumberException();
                            while (true) {
                                if (x >= 1 && x <= coursesByScanner.size()) {
                                    for (int k = 0; k < x; k++) {

                                        System.out.println("In which course does he/she teach :" + trainersByScanner.get(i).getFirstName() + ", " + trainersByScanner.get(i).getLastName());

                                        System.out.println("These are the courses, please choose a number  ");

                                        for (int j = 0; j < coursesByScanner.size(); j++) {

                                            System.out.println((j + 1) + ". " + coursesByScanner.get(j).getTitle());

                                        }
                                        int courseOption1 = MainMenu.NumberException();
                                        

                                        if (courseOption1 > 0 && courseOption1 < (coursesByScanner.size() + 1)) {

                                            for (int j = 0; j < coursesByScanner.size(); j++) {

                                                if (courseOption1 == (j + 1)) {

                                                    TrainersPerCourse tpc12 = new TrainersPerCourse(trainersByScanner.get(i).getFirstName(), trainersByScanner.get(i).getLastName(), coursesByScanner.get(j).getTitle());
                                                    trainersPerMoreCourse.add(tpc12);
                                                    System.out.println("Successful entry ");
                                                    break;
                                                }

                                            }

                                        } else {
                                            System.out.println("wrong choice, try again");
                                            courseOption = MainMenu.NumberException();
                                        }
                                    }
                                    break;
                                } else {
                                    System.out.println("Give a right choice! try again");
                                    x = MainMenu.NumberException();
                                }
                            }
                            break;
                    }
                }
                System.out.println("Trainers per one Course");
                System.out.println(trainersPerCourse);
                System.out.println(" ");
                System.out.println("Trainers per two or more Courses");
                System.out.println(trainersPerMoreCourse);

                ArrayList<AssignmentPerCourse> assignmentPerCourse = new ArrayList();
                ArrayList<AssignmentPerCourse> assignmentPerMoreCourse = new ArrayList();

                //SC.AssignmentPERCOURSE
                for (int i = 0; i < assignmentsByScanner.size(); i++) {
                    System.out.println(" Is the assignment " + assignmentsByScanner.get(i).getTitle() + ", " + "  included in one or more courses?");
                    System.out.println("1. If it is Included in one lesson, press one");
                    System.out.println("2. If it is Included in 2 or more lessons, press 2");
                    option = MainMenu.NumberException();
                    switch (option) {
                        case 1:
                            System.out.println("In which course is included in? :" + assignmentsByScanner.get(i).getTitle());

                            System.out.println("These are the courses, please choose a number ");

                            for (int j = 0; j < coursesByScanner.size(); j++) {
                                System.out.println((j + 1) + ". " + coursesByScanner.get(j).getTitle());
                            }
                            int courseOption = MainMenu.NumberException();

                            if (courseOption > 0 && courseOption < (coursesByScanner.size() + 1)) {

                                for (int j = 0; j < coursesByScanner.size(); j++) {

                                    if (courseOption == (j + 1)) {

                                        AssignmentPerCourse apc11 = new AssignmentPerCourse(assignmentsByScanner.get(i).getTitle(), coursesByScanner.get(j).getTitle());
                                        assignmentPerCourse.add(apc11);
                                        System.out.println("Successful");
                                        break;
                                    }

                                }

                            } else {
                                System.out.println("wrong choice, try again");
                                courseOption = MainMenu.NumberException();
                            }
                            break;
                        case 2:

                            System.out.println("In how many courses is it included?");
                            int x = MainMenu.NumberException();
                            while (true) {
                                if (x >= 1 && x <= coursesByScanner.size()) {
                                    for (int k = 0; k < x; k++) {

                                        System.out.println("In which course is included : " + assignmentsByScanner.get(i).getTitle());

                                            System.out.println("These are the courses, please choose a number ");

                                        for (int j = 0; j < coursesByScanner.size(); j++) {

                                            System.out.println((j + 1) + ". " + coursesByScanner.get(j).getTitle());

                                        }
                                        int courseOption1 = MainMenu.NumberException();
                                

                                        if (courseOption1 > 0 && courseOption1 < (coursesByScanner.size() + 1)) {

                                            for (int j = 0; j < coursesByScanner.size(); j++) {

                                                if (courseOption1 == (j + 1)) {

                                                    AssignmentPerCourse apc12 = new AssignmentPerCourse(assignmentsByScanner.get(i).getTitle(), coursesByScanner.get(j).getTitle());
                                                    assignmentPerMoreCourse.add(apc12);
                                                    System.out.println("Successful entry ");
                                                    break;
                                                }

                                            }

                                        } else {
                                            System.out.println("wrong choice, try again");
                                            courseOption = MainMenu.NumberException();
                                        }
                                    }
                                    break;
                                } else {
                                    System.out.println("Give a right choice! try again");
                                    x = MainMenu.NumberException();
                                }
                            }
                            break;
                    }
                }
                System.out.println("Assignments per one Course");
                System.out.println(assignmentPerCourse);
                System.out.println(" ");
                System.out.println("Assignments per two or more Courses");
                System.out.println(assignmentPerMoreCourse);

                ArrayList<AssignmentsPerStudent> studentsPerAssignment = new ArrayList();
                ArrayList<AssignmentsPerStudent> studentsPerMoreAssignment = new ArrayList();

                //SC.STUDENTSPERassignment
                for (int i = 0; i < studentsByScanner.size(); i++) {
                    System.out.println("Is he student " + studentsByScanner.get(i).getFirstName() + ", " + studentsByScanner.get(i).getLastName() + " participate in one or more assignments?");
                    System.out.println("1. If he/she Participates in one Assignment, press one");
                    System.out.println("2. If he/she Participates in 2 or more  Assignments, press 2");
                    option = MainMenu.NumberException();
                    switch (option) {
                        case 1:
                            System.out.println("In which assignment does he/she participate in :" + studentsByScanner.get(i).getFirstName() + ", " + studentsByScanner.get(i).getLastName());

                            System.out.println("These are the assignments, please choose a number ");

                            for (int j = 0; j < assignmentsByScanner.size(); j++) {
                                System.out.println((j + 1) + ". " + assignmentsByScanner.get(j).getTitle());
                            }
                            int courseOption = MainMenu.NumberException();

                            if (courseOption > 0 && courseOption < (assignmentsByScanner.size() + 1)) {

                                for (int j = 0; j < assignmentsByScanner.size(); j++) {

                                    if (courseOption == (j + 1)) {

                                        AssignmentsPerStudent aps11 = new AssignmentsPerStudent(studentsByScanner.get(i).getFirstName(), studentsByScanner.get(i).getLastName(), assignmentsByScanner.get(j).getTitle());
                                        studentsPerAssignment.add(aps11);
                                        System.out.println("Successful entry");
                                        break;
                                    }

                                }

                            } else {
                                System.out.println("Wrong choice, try again");
                                courseOption = MainMenu.NumberException();
                            }
                            break;
                        case 2:

                            System.out.println("In how many assignments does he/she participate in?");
                            int x = MainMenu.NumberException();
                            while (true) {
                                if (x >= 1 && x <= assignmentsByScanner.size()) {
                                    for (int k = 0; k < x; k++) {

                                        System.out.println("In which assignment does he/she participate in :" + studentsByScanner.get(i).getFirstName() + ", " + studentsByScanner.get(i).getLastName());

                                        System.out.println("These are the assignmnets, please choose a number  ");

                                        for (int j = 0; j < assignmentsByScanner.size(); j++) {

                                            System.out.println((j + 1) + ". " + assignmentsByScanner.get(j).getTitle());

                                        }
                                        int courseOption1 = MainMenu.NumberException();
                                        

                                        if (courseOption1 > 0 && courseOption1 < (assignmentsByScanner.size() + 1)) {

                                            for (int j = 0; j < assignmentsByScanner.size(); j++) {

                                                if (courseOption1 == (j + 1)) {

                                                    AssignmentsPerStudent spc = new AssignmentsPerStudent(studentsByScanner.get(i).getFirstName(), studentsByScanner.get(i).getLastName(), assignmentsByScanner.get(j).getTitle());
                                                    studentsPerMoreAssignment.add(spc);
                                                    System.out.println("Successful entry");
                                                    break;
                                                }

                                            }

                                        } else {
                                            System.out.println("wrong choice, try again");
                                            courseOption = MainMenu.NumberException();
                                        }
                                    }
                                    break;
                                } else {
                                    System.out.println("Give a right choice! try again");
                                    x = MainMenu.NumberException();
                                }
                            }
                            break;
                    }
                }
                System.out.println("Students per one Assignment");
                System.out.println(studentsPerAssignment);
                System.out.println(" ");
                System.out.println("Students per two or more Assignments");
                System.out.println(studentsPerMoreAssignment);
                System.out.println("");
                System.out.println("-----------------------------------------------");
                System.out.println("You have just completed your lists!");
                System.out.println("Press a number if you want to see a list");
                System.out.println("1. Students");
                System.out.println("2. Courses");
                System.out.println("3. Trainers");
                System.out.println("4. Assignments");
                System.out.println("5. Students per course");
                System.out.println("6. Trainers per course");
                System.out.println("7. Assignments per course");
                System.out.println("8. Assignments per student");
                System.out.println("9. EXIT");

                option = MainMenu.NumberException();
                while (option < 1 || option > 9) {
                    System.out.println("Please choose a right option");
                    option = MainMenu.NumberException();

                }
                while (option > 0 && option < 9) {
                    switch (option) {
                        case 1:
                            System.out.println(studentsByScanner);
                            break;
                        case 2:
                            System.out.println(coursesByScanner);
                            break;

                        case 3:
                            System.out.println(trainersByScanner);
                            break;
                        case 4:
                            System.out.println(assignmentsByScanner);
                            break;
                        case 5:
                            System.out.println("Students per course");
                            System.out.println("");
                            System.out.println(studentsPercourse);
                            System.out.println("");
                            System.out.println("");
                            System.out.println("Students per more courses");
                            System.out.println("");
                            System.out.println(studentsPerMorecourse);
                            break;
                        case 6:
                            System.out.println("Trainers per course");
                            System.out.println("");
                            System.out.println(trainersPerCourse);
                            System.out.println("");
                            System.out.println("Trainers per more courses");
                            System.out.println("");
                            System.out.println(trainersPerMoreCourse);
                            break;
                        case 7:
                            System.out.println("Assignments per course");
                            System.out.println("");
                            System.out.println(assignmentPerCourse);
                            System.out.println("");
                            System.out.println("Assignments per more courses");
                            System.out.println("");
                            System.out.println(assignmentPerMoreCourse);
                            break;
                        case 8:
                            System.out.println("Assignments per student");
                            System.out.println("");
                            System.out.println(studentsPerAssignment);
                            System.out.println("");
                            System.out.println("Assignments per more students");
                            System.out.println("");
                            System.out.println(studentsPerMoreAssignment);
                            break;

                    }
                    System.out.println("Press a number if you want to see a list");
                    System.out.println("1. Students");
                    System.out.println("2. Courses");
                    System.out.println("3. Trainers");
                    System.out.println("4. Assignments");
                    System.out.println("5. Students per course");
                    System.out.println("6. Trainers per course");
                    System.out.println("7. Assignments per course");
                    System.out.println("8. Assignments per student");
                    System.out.println("9. EXIT");
                    option = MainMenu.NumberException();
                    while (option < 1 || option > 9) {
                        System.out.println("Please choose a right option");
                        option = MainMenu.NumberException();
                    }
                    

                }
                System.out.println("Have a nice day");
        }
    }
}
