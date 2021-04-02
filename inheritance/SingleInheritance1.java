import java.util.Date;

import java.util.*;

class Persons {
    String name;
    Date dob;
    int mobileNo;

    void readData(String name, Date dob, int mobileNo) {
        this.name = name;
        this.dob = dob;
        this.mobileNo = mobileNo;
    }

    void printData() {
        System.out.println("Name : " + this.name);
        dob.printDate();
        System.out.println("Name : " + this.mobileNo);
    }

}

class Student extends Persons {
    String institutions;
    int[] qualif = new int[20];
    int rollNo;
    int[] marks = new int[5];

    void printBioData() {
        printData(); // inherited from Persons
        System.out.println("Institutions : " + this.institutions);
        System.out.println("Roll : " + this.rollNo);
        for (int i = 0; i < qualif.length; i++) {
            System.out.println("Marks : " + i + " : " + this.qualif[i]);
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Result : " + i + " : " + this.marks[i]);
        }
    }
}

class Employee extends Persons {
    int empNo;
    int[] salaryHistory = new int[12];
    String organisation;
    String designation;
    Date doj;

    void printSalary() {
        for (int i = 0; i < salaryHistory.length; i++) {
            System.out.println("Salary " + i + " : " + this.salaryHistory[i]);
        }
    }
}

public class SingleInheritance1 {
    public static void main(String[] args) {
        Persons P = new Person();
        // code with objects p..
        Student s = new Student[100];
        // code with objects s..
        Employee e = new Employee[50];
        // code with objects e..
    }
}
