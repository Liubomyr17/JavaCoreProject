package com.softserve;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
class EmployeeInfo implements Serializable {

    int id;
    String lastName;
    String firstName;
    String fathersName;
    Date dateOfBirth;
    String position;
    String department;
    int roomNumber;
    long officeNumber;
    String email;
    float salary;
    Date dateOfEmployment;
    String notes;

    public EmployeeInfo(int id, String lastName, String firstName, String fathersName, Date dateOfBirth, String position, String department, int roomNumber, long officeNumber, String email, float salary, Date dateOfEmployment, String notes) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.department = department;
        this.roomNumber = roomNumber;
        this.officeNumber = officeNumber;
        this.email = email;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", roomNumber=" + roomNumber +
                ", officeNumber=" + officeNumber +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", dateOfEmployment=" + dateOfEmployment +
                ", notes='" + notes + '\'' +
                '}';
    }
}

public class EmpManagement {
    public static void main(String[] args) {

    }
}





