package com.softserve;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
class EmployeeInfo implements Serializable {

    int id;
    String lastName;
    String firstName;
    String fathersName;
    String dateOfBirth;
    String position;
    String department;
    int roomNumber;
    long officeNumber;
    String email;
    float salary;
    String dateOfEmployment;
    String notes;

    public EmployeeInfo(int id, String lastName, String firstName, String fathersName, String dateOfBirth, String position, String department, int roomNumber, long officeNumber, String email, float salary, String dateOfEmployment, String notes) {
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
    static void display(ArrayList<EmployeeInfo> all) {
        System.out.println("\n--------------Employee List---------------\n");
        System.out.printf("%-10s%-15s%-10s%-20s%-10s%-15s%-10s%-20s%-10s%-15s%-10s%-20s%-10s%n",
                "ID", "LastName", "FirstName", "FathersName", "DateOfBirth", "Position", "Department", "RoomNumber",
                "OfficeNumber", "Email", "Salary", "DateOfEmployment", "Notes");
        for (EmployeeInfo e : all) {
            System.out.printf("%-5s%-20s%-10s%-15s%-10s%-5s%-20s%-10s%-15s%-10s%-5s%-20s%-10s",e.id,e.lastName,e.firstName,e.fathersName,
                    e.dateOfBirth,e.position,e.department,e.roomNumber,e.officeNumber,
                    e.email,e.salary,e.dateOfEmployment,e.notes);
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ParseException {
        int id;
        String lastName;
        String firstName;
        String fathersName;
        String dateOfBirth;
        String position;
        String department;
        int roomNumber;
        long officeNumber;
        String email;
        float salary;
        String dateOfEmployment;
        String notes;

        Scanner sc = new Scanner(System.in);
        System.out.println("dd-mm-yyyy"); dateOfBirth =new Scanner(System.in).nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        dateOfBirth = format.format(dateOfBirth);
        dateOfEmployment = new Scanner(System.in).nextLine();
        dateOfEmployment=format.format(dateOfEmployment);
        ArrayList<EmployeeInfo> all = new ArrayList<EmployeeInfo>();
        File file = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

      try {
        file = new File("N:/Solution3/file.txt");
        if(file.exists()) {
        fileInputStream = new FileInputStream(file);
        objectInputStream = new ObjectInputStream(fileInputStream);
        all = (ArrayList<EmployeeInfo>)objectInputStream.readObject();
        }}
        catch(Exception e) {
        System.out.println(e);
        }
      do {
          System.out.println("\n********* Welcome to the Employee Management System! **********\n");
          System.out.println("1). Add Employee to the DataBase\n" +
                  "2). Search for Employee\n" +
                  "3). Edit Employee details\n" +
                  "4). Delete Employee Details\n" +
                  "5). Display all Employees working in this company\n" +
                  "6). EXIT\n");
          System.out.println("Enter your choice, please: ");
          int number = sc.nextInt();

      switch (number) {
          case 1:
              System.out.println("\nEnter, please, the following details to ADD list:\n");
              System.out.println("Enter ID :");
              id = sc.nextInt();
              System.out.println("Enter Last Name :");
              lastName = sc.next();
              System.out.println("Enter First Name :");
              firstName = sc.next();
              System.out.println("Enter Father's Name :");
              fathersName = sc.next();
              System.out.println("Enter Date of Birth :");
              dateOfBirth = sc.next();
              System.out.println("Enter Position :");
              position = sc.next();
              System.out.println("Enter Department :");
              department = sc.next();
              System.out.println("Enter Room Number :");
              roomNumber = sc.nextInt();
              System.out.println("Enter Office Number :");
              officeNumber = sc.nextLong();
              System.out.println("Enter Email :");
              email = sc.next();
              System.out.println("Enter Salary :");
              salary = sc.nextFloat();
              System.out.println("Enter Date Of Deployment :");
              dateOfEmployment = sc.next();
              System.out.println("Enter Some Notes :");
              notes = sc.next();
              all.add(new EmployeeInfo(id, lastName, firstName, fathersName,
                      dateOfBirth, position, department, roomNumber, officeNumber,
                      email, salary, dateOfEmployment, notes));
              display(all);
              break;






      }
      }
        }}





