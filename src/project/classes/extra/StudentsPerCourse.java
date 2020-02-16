package project.classes.extra;

import java.util.ArrayList;
import project.classes.Course;
import project.classes.Student;

public class StudentsPerCourse {

    public ArrayList<Student> listOfStudents;
    private Course course;
    private String firstNameScanner;
    private String lastNameScanner;
    private String courseScanner;

    public StudentsPerCourse(String firstNameScanner, String lastNameScanner, String courseScanner) {
        this.firstNameScanner = firstNameScanner;
        this.lastNameScanner = lastNameScanner;
        this.courseScanner = courseScanner;
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
    
    
    
   private ArrayList<StudentsPerCourse> StudentsPercourse = new ArrayList();

    public ArrayList<StudentsPerCourse> getStudentsPercourse() {
        return StudentsPercourse;
    }

    public void setStudentsPercourse(ArrayList<StudentsPerCourse> StudentsPercourse) {
        this.StudentsPercourse = StudentsPercourse;
    }

    @Override
    public String toString() {
        return "StudentsPerCourse{" + "firstNameScanner=" + firstNameScanner + ", lastNameScanner=" + lastNameScanner + ", courseScanner=" + courseScanner + '}'+"\n";
    }
    
    
    
    
    
    
   public StudentsPerCourse() {
    }
    
    Student s = new Student();

    public  void PrintStudentsPerJava(){
     s.createStudents();
        System.out.println("               Java students");
        for (int i = 0; i < 8; i++) {
            
        
        System.out.println(i+1+". "+s.listOfStudents.get(i).getFirstName()+", "+s.listOfStudents.get(i).getLastName() );
        }
    }
   public  void PrintStudentsPerC(){
     s.createStudents();
        System.out.println("               C# students");
        int j = 0;
        for (int i = 8; i < 10; i++) {
            
        j++;
        System.out.println(j+". "+s.listOfStudents.get(i).getFirstName()+", "+s.listOfStudents.get(i).getLastName() );
        }
    }
   
   public void PrintStudentsPerJavaC(){
   s.createStudents();
       System.out.println("                 Java & C# students");
       int k = 0;
       for (int i = 6; i < 9; i++) {
           k++;
           System.out.println(k+". "+s.listOfStudents.get(i).getFirstName()+" "+s.listOfStudents.get(i).getLastName());
       }
   }
  
     
}
